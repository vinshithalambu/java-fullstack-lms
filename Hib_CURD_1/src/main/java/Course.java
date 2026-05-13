
public class Course {
 private int cid;
 private String cname;
 private String ccontent;
 private int duration;
 public Course() {
  super();
  // TODO Auto-generated constructor stub
 }
 public Course(int cid, String cname, String ccontent, int duration) {
  super();
  this.cid = cid;
  this.cname = cname;
  this.ccontent = ccontent;
  this.duration = duration;
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
 public String getCcontent() {
  return ccontent;
 }
 public void setCcontent(String ccontent) {
  this.ccontent = ccontent;
 }
 public int getDuration() {
  return duration;
 }
 public void setDuration(int duration) {
  this.duration = duration;
 }
 @Override
 public String toString() {
  return "Course [cid=" + cid + ", cname=" + cname + ", ccontent=" + ccontent + ", duration=" + duration + "]";
 }
 
}