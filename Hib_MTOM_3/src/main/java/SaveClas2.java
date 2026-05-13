import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class SaveClas2 {

  public static void main(String[] args) throws Exception {
    Session s=HSFactory.getSession();
    Transaction t=s.beginTransaction();
    try {
      Teacher t1=(Teacher)s.load(Teacher.class, 1);
      Teacher t2=(Teacher)s.load(Teacher.class, 2);
      Teacher t3=(Teacher)s.load(Teacher.class, 3);
      Teacher t4=(Teacher)s.load(Teacher.class, 4);
      Teacher t5=(Teacher)s.load(Teacher.class, 5);
      Teacher t6=(Teacher)s.load(Teacher.class, 6);
       
      Map<String, Teacher> map1=new HashMap<String, Teacher>();
      map1.put("8-8:45", t1);
      map1.put("8:45-9:30", t2);
      map1.put("9:30-10:15", t3);
      map1.put("10:30-11:15", t4);
      map1.put("11:15-12:00", t5);
      map1.put("12:00-12:45", t6);
      clas c1=new clas(1, "1st class", map1);
      s.save(c1);
      
      Map<String, Teacher> map2=new HashMap<String, Teacher>();
      map2.put("8-8:45", t2);
      map2.put("8:45-9:30", t1);
      map2.put("9:30-10:15", t4);
      map2.put("10:30-11:15", t3);
      map2.put("11:15-12:00", t6);
      map2.put("12:00-12:45", t5);
      clas c2 = new clas(2, "2nd class", map2);
      s.save(c2);
      
      Map<String, Teacher> map3=new HashMap<String, Teacher>();
      map3.put("8-8:45", t3);
      map3.put("8:45-9:30", t4);
      map3.put("9:30-10:15", t1);
      map3.put("10:30-11:15", t2);
      map3.put("11:15-12:00", t5);
      map3.put("12:00-12:45", t6);
      clas c3 = new clas(3, "3rd class", map3);
      s.save(c3);

      Map<String, Teacher> map4=new HashMap<String, Teacher>();
      map4.put("8-8:45", t4);
      map4.put("8:45-9:30", t3);
      map4.put("9:30-10:15", t2);
      map4.put("10:30-11:15", t1);
      map4.put("11:15-12:00", t6);
      map4.put("12:00-12:45", t5);
      clas c4 = new clas(4, "4th class", map4);
      s.save(c4);
      
      Map<String, Teacher> map5=new HashMap<String, Teacher>();
      map5.put("8-8:45", t5);
      map5.put("8:45-9:30", t6);
      map5.put("9:30-10:15", t1);
      map5.put("10:30-11:15", t2);
      map5.put("11:15-12:00", t3);
      map5.put("12:00-12:45", t4);
      clas c5 = new clas(5, "5th class", map5);
      s.save(c5);
      
      Map<String, Teacher> map6=new HashMap<String, Teacher>();
      map6.put("8-8:45", t6);
      map6.put("8:45-9:30", t5);
      map6.put("9:30-10:15", t2);
      map6.put("10:30-11:15", t1);
      map6.put("11:15-12:00", t4);
      map6.put("12:00-12:45", t3);
      clas c6 = new clas(6, "6th class", map6);
      s.save(c6);
      
      s.flush(); // all objects are converted into INSERT commands and executes all SQL commands on DB
      t.commit(); // con.commit(); makes DB changes permanent

      System.out.println("TX Success");
    } catch(Exception e) {
      t.rollback();
      System.out.println("TX Failed");
      e.printStackTrace();
    }
  }
}