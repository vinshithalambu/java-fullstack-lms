import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class SaveClient1 {
  public static void main(String rags[]) throws Exception {
    Configuration cfg=new Configuration();
    cfg.configure("./hibernate.cfg.xml");
    SessionFactory sf=cfg.buildSessionFactory();
    Session s=sf.openSession();
    Transaction t=s.beginTransaction();
    try {
      Course c1=new Course(1, "Core Java", "OOPs", 60);
      Course c2=new Course(2, "Adv Java", "JDBC,Servlets,JSP", 60);
      Course c3=new Course(3, "Hibernate", "ORM Relationships", 30);
      Course c4=new Course(4, "Spring", "IoC, AOP, Web MVC", 60);
      Course c5=new Course(5, "Spring Boot", "MS, Cloud", 60);
      
      s.save(c1); s.save(c2); s.save(c3); s.save(c4); s.save(c5);
      s.flush();
      t.commit();
      System.out.println("Courses added");
    } catch(Exception e) {
      t.rollback();
      System.err.println("TX failed");
      e.printStackTrace();
    }
  }
}