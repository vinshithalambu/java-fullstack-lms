import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HSFactory {
  static Session s;
  public static Session getSession() {
    try {
      if(s==null) {
        Configuration cfg=new Configuration();
        cfg.configure("/hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        s=sf.openSession();
      }
    } catch(Exception e) {
      e.printStackTrace();
    }
    return s;
  }
}