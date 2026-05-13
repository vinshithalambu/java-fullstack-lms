import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveClient1 {

  public static void main(String[] args) throws Exception {
    Session s=HSFactory.getSession();
    Transaction t=s.beginTransaction();
    try {
      // create one dept, many emp objects and associate them
      Emp e1=new Emp(0,"ABC",50000.00,"Designer",null);
      Emp e2=new Emp(0,"XYZ",75000.00,"Developer",null);
      Emp e3=new Emp(0,"LMN",100000.00,"Sr Developer",null);
      List<Emp> empList=new ArrayList<Emp>();
      empList.add(e1); empList.add(e2); empList.add(e3);
      Dept d1=new Dept(0, "Admin", "Dundigal", empList);
      s.save(d1);
      s.flush();
      t.commit();
      System.out.println("TX Success");
    } catch(Exception e) {
      t.rollback();
      System.err.println("TX Failed");
      e.printStackTrace();
    }
  }
}