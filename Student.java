public class Student {
    private int rollNo;
    private String Name;
    private int age;
    private String grade;
    private int[] marks;

    public Student(int rollNo,String Name,int age,String grade,int[] marks ){
        this.rollNo = rollNo;
        this.Name = Name;
        this.age = age;
        this.grade = grade;
        this.marks = marks;
    }
    public int getRollNo(){return rollNo; }
    public String getName(){return Name;}
    public int getAge(){return age;}
    public String getGrade(){return grade;}
    public int[] getMarks(){return marks;}

    public void setRollNo(int rollno){this.rollNo = rollno;}
    public void setName(String Name){this.Name = Name;}
    public void setAge(int age){this.age = age;}
    public void setGrade(String grade){this.grade = grade; }
    public void setMarks(int[] marks){this.marks = marks;}

    public int getTotalMarks(){
        int total = 0;
        for (int mark : marks) total += mark;
        return total;
    }

    @Override
    public String toString()  {
        return "Roll No: " + rollNo + ", Name: " + Name +
                ", Age: " + age + ", Grade: " + grade +
                ", Marks: " + marks[0] + ", " + marks[1] + ", " + marks[2] +
                ", Total: " + getTotalMarks();
    }
}
