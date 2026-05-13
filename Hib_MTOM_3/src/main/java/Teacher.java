import java.util.Map;

public class Teacher {
	private int tid;
	  private String tname;
	  private String subject;
	  private Map<String,clas> clasTimings;
	  public String toString() {
	    return tid+" "+tname+" "+subject;
	  }
	public Teacher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Teacher(int tid, String tname, String subject, Map<String, clas> clasTimings) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.subject = subject;
		this.clasTimings = clasTimings;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		result = prime * result + tid;
		result = prime * result + ((tname == null) ? 0 : tname.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Teacher other = (Teacher) obj;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		if (tid != other.tid)
			return false;
		if (tname == null) {
			if (other.tname != null)
				return false;
		} else if (!tname.equals(other.tname))
			return false;
		return true;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public Map<String, clas> getClasTimings() {
		return clasTimings;
	}
	public void setClasTimings(Map<String, clas> clasTimings) {
		this.clasTimings = clasTimings;
	}

}
