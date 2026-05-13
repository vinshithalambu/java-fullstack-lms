import java.util.*;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class GetClas3 {

  public static void main(String[] args) {
     Session s=HSFactory.getSession();
     Object o = s.get(clas.class,1);
     if(o==null) {
       System.out.println("Clas not found");
     }else {
       clas c1 = (clas)o;
       System.out.println(c1);
       Map<String, Teacher> map = c1.getTeacherTimings();
       Set<String> keys = map.keySet();
       for(String timing:keys) {
         Teacher t  = (Teacher)map.get(timing);
         System.out.println(timing+" "+t);
          }
     }  
     }
}
  

