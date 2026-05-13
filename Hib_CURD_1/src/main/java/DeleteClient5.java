// DeleteClient5.java
import org.hibernate.Session;
import org.hibernate.Transaction;

public class DeleteClient5 {
  public static void main(String[] args) throws Exception {
    Session s=HSFactory.getSession();
    Transaction t=s.beginTransaction();
    try {
      // insert
      // Course c1=new Course(6, "Dummy", "Dummy Mummy", 10);
      // s.save(c1);
      
      // delete
      Course c1=(Course)s.load(Course.class, new Integer(6));
      s.delete(c1);
      s.flush();
      t.commit();
      System.out.println("TX Success");    
    } catch(Exception e) {
      t.rollback();
      System.out.println("TX Failed");
      e.printStackTrace();
    }
  }
}