import java.util.*;

import org.hibernate.Query;
import org.hibernate.Session;

public class ListClass4 {

  public static void main(String[] args)throws Exception {
     Session s=HSFactory.getSession();
     Query q = s.createQuery("FROM clas");
     List<clas> classes = q.list();
     for(clas c:classes) {
       System.out.println(c);
       Map<String,Teacher> map = c.getTeacherTimings();
       Set<String> timings = map.keySet();
       for(String timing:timings) {
         Teacher t=map.get(timing);
         System.out.println("\t"+timing+"|"+t);
       }
     }
  }

}