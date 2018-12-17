package student;

public class Student {
    private int ID;
    private String name;
    private String sex;
    private int age;
    private String grade;
	  private String className;
 	private int Cmark;
 	private int Jmark;
 	private int Smark;
 	/*private String CPlus;
 	private String Java;
 	private String SQ;*/
	int summark;
	public Student(){
		ID=0;
		name="0";
		sex="0";
		age=0;
		grade="0";
		className="0";
		Cmark=0;
		Jmark=0;
		Smark=0;
	}
	
    public void setID(int ID) {
  	  this.ID=ID;
    }
    public int getID() {
  	  return ID;
    }
    public void setName(String name) {
  	  this.name=name;
    }
    public String getName() {
  	  return name;
    }
    public void setSex(String sex) {
    	this.sex=sex;
    }
    public String getSex() {
    	return sex;
    }
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGrade() {
		return grade;
	}
	public void setGrade(String grade) {
		this.grade = grade;
	}
	public String getClassName() {
		return className;
	}
	public void setClassName(String className) {
		this.className = className;
	}
	/*public void setCPlus(String a) {
		this.CPlus=a;
	}
	public void setJava(String a) {
		this.Java=a;
	}
	public void setSQ(String a) {
		this.SQ=a;
	}*/
	public void setCPlusmark(int Cmark) {
		this.Cmark=Cmark;
	}
	public void setJavamark(int Jmark) {
		this.Jmark=Jmark;
	}
	public void setSQmark(int Smark) {
		this.Smark=Smark;
	}
	public int getCPlusmark() {
		return Cmark;
	}
	public int getJavamark() {
		return Jmark;
	}
	public int getSQmark() {
		return Smark;
	}
	public int getSum() {
		return summark=Cmark+Jmark+Smark;
	}
}
