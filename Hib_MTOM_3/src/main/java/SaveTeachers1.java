import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveTeachers1 {

  public static void main(String[] args) throws Exception {
    Session session=HSFactory.getSession();
    Transaction tx=session.beginTransaction();
    
    try {
      Teacher t1=new Teacher(1, "ABC", "English", null);
      Teacher t2=new Teacher(2, "XYZ", "Telugu", null);
      Teacher t3=new Teacher(3, "LMN", "Hindi", null);
      Teacher t4=new Teacher(4, "PQR", "Social", null);
      Teacher t5=new Teacher(5, "UVW", "Science", null);
      Teacher t6=new Teacher(6, "MNO", "Maths", null);
      session.save(t1); session.save(t2); session.save(t3); 
      session.save(t4); session.save(t5); session.save(t6); 
      session.flush();
      tx.commit();
      System.out.println("TX Success");
    } catch(Exception e) {
      tx.rollback();
      System.out.println("TX Failed");      
      e.printStackTrace();
    }

  }

}