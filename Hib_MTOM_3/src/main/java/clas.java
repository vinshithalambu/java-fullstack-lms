import java.util.Map;

public class clas {
 private int cid;
 private String cname;
 private Map<String, Teacher> teacherTimings;
 public clas() {
  super();
  // TODO Auto-generated constructor stub
 }
 public clas(int cid, String cname, Map<String, Teacher> teacherTimings) {
  super();
  this.cid = cid;
  this.cname = cname;
  this.teacherTimings = teacherTimings;
 }
 public int getCid() {
  return cid;
 }
 public void setCid(int cid) {
  this.cid = cid;
 }
 public String getCname() {
  return cname;
 }
 public void setCname(String cname) {
  this.cname = cname;
 }
 public Map<String, Teacher> getTeacherTimings() {
  return teacherTimings;
 }
 public void setTeacherTimings(Map<String, Teacher> teacherTimings) {
  this.teacherTimings = teacherTimings;
 }
 @Override
 public int hashCode() {
  final int prime = 31;
  int result = 1;
  result = prime * result + cid;
  result = prime * result + ((cname == null) ? 0 : cname.hashCode());
  result = prime * result + ((teacherTimings == null) ? 0 : teacherTimings.hashCode());
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
  clas other = (clas) obj;
  if (cid != other.cid)
   return false;
  if (cname == null) {
   if (other.cname != null)
    return false;
  } else if (!cname.equals(other.cname))
   return false;
  if (teacherTimings == null) {
   if (other.teacherTimings != null)
    return false;
  } else if (!teacherTimings.equals(other.teacherTimings))
   return false;
  return true;
 }
 @Override
 public String toString() {
  return cid + " " + cname;
 }
 
}