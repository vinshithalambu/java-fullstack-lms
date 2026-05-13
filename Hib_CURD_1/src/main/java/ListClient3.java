import java.util.*;
import org.hibernate.Query;
import org.hibernate.Session;

public class ListClient3 {
 public static void main(String[] args)
 throws Exception
 {
  Session s=HSFactory.getSession();
  Query q =s.createQuery("From Course");
  List<Course> courses=q.list();
  //to print list- there are 4 ways
  //1.using size() and get()
  int size=courses.size();
  for(int i=0;i<size;i++)
  {
   Course c1=(Course)courses.get(i);
   System.out.println(c1);
  }
  System.out.println("**************************");
  //2.using Iterator
  Iterator<Course> iter=courses.iterator();
  while(iter.hasNext())
  {
   Course c1=iter.next();
   System.out.println(c1);
  }
  System.out.println("************************");
  //3.for each
  for(Course c1:courses)
   System.out.println(c1);
  System.out.println("************************");
  //4. using Stream
  courses.stream().forEach(System.out::println);
 }
}