import org.hibernate.Session;

public class GetClient2 {
  public static void main(String args[]) {
    Session s = HSFactory.getSession();
    Object o = s.get(Course.class, new Integer(1));
    //with the pk if the record is found, returns object
    //if pk is not found, returns null
    if(o!=null) {
      Course cl = (Course)o;
      System.out.println(cl);
    }else {
      System.out.println("Record not found");
    }
    s.close();
  }
}