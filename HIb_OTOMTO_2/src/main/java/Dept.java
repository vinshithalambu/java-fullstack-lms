import java.util.List;

public class Dept {

	
		  private int deptno;
		  private String deptname;
		  private String location;
		  public int getDeptno() {
			return deptno;
		}
		public void setDeptno(int deptno) {
			this.deptno = deptno;
		}
		public String getDeptname() {
			return deptname;
		}
		public void setDeptname(String deptname) {
			this.deptname = deptname;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public List<Emp> getEmpList() {
			return empList;
		}
		public void setEmpList(List<Emp> empList) {
			this.empList = empList;
		}
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((deptname == null) ? 0 : deptname.hashCode());
			result = prime * result + deptno;
			result = prime * result + ((location == null) ? 0 : location.hashCode());
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
			Dept other = (Dept) obj;
			if (deptname == null) {
				if (other.deptname != null)
					return false;
			} else if (!deptname.equals(other.deptname))
				return false;
			if (deptno != other.deptno)
				return false;
			if (location == null) {
				if (other.location != null)
					return false;
			} else if (!location.equals(other.location))
				return false;
			return true;
		}
		 @Override
		  public String toString() {
		    return deptno+" "+deptname+" "+location;
		  }
		public Dept(int deptno, String deptname, String location, List<Emp> empList) {
			super();
			this.deptno = deptno;
			this.deptname = deptname;
			this.location = location;
			this.empList = empList;
		}
		public Dept() {
			super();
			// TODO Auto-generated constructor stub
		}
		private List<Emp> empList;

	

}
