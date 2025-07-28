import java.util.*;

public class StudentServicesIMPL implements StudentServices {
    HashMap<Integer,Student> studentmap = new HashMap<>();

    @Override
    public void addStudent(Student s) {
        studentmap.put(s.getRollNo(),s);
    }

    @Override
    public void viewallStudents() {
        if(studentmap.isEmpty()){
            System.out.println("There are no students in the system");
        }
            for(Student s:studentmap.values()){
                System.out.println(s);
            }
    }

    public Student getStudentByRollNo(int rollNo){
        return studentmap.get(rollNo);
    }

    public boolean deleteStudent(int roll){
        return studentmap.remove(roll) != null;
    }

    public boolean updateStudent(int rollNo, String field ,String newValue){

        Student s = studentmap.get(rollNo);
        if(s == null) return false;

        switch(field.toLowerCase()){
            case "name" : {
                s.setName(newValue);
                break;
            }
            case "age" :{
                s.setAge(Integer.parseInt(newValue));
                break;
            }
            case "grade" :{
                s.setGrade(newValue);
                break;
            }
            case "marks" :{
                Scanner sc = new Scanner(System.in);
                int[] newmarks = new int[3];
                for(int i = 0; i< 3 ;i++){
                    newmarks[i] = sc.nextInt();
                }
                s.setMarks(newmarks);
                break;
            }
            default: return false;

        }
        return true;
    }
    public Student getTopper(){
        Student topper = null;
        int highestTotal = -1;

        for (Student student : studentmap.values()) {
            int total = student.getTotalMarks();
            if (total > highestTotal) {
                highestTotal = total;
                topper = student;
            }
        }

        return topper;
    }

}
