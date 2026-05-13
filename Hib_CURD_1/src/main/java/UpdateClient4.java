import org.hibernate.Session;
import org.hibernate.Transaction;

public class UpdateClient4 {
  public static void main(String args[]) throws Exception {
    Session s = HSFactory.getSession();
    Transaction t = s.beginTransaction();
    //how to update the already existing "Core java" course object with cid
    try {
      Course c1 = s.load(Course.class, new Integer(1));
      c1.setCcontent("Typecasting, OOPs");
      s.update(c1);
      s.flush();
      t.commit();
      System.out.println("Course updated");
    }catch(Exception e) {
      t.rollback();
      e.printStackTrace();
      System.err.println("Update failed");
    }
    s.close();
  }
}