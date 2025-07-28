public interface StudentServices {
    void addStudent(Student s);
    void viewallStudents();
    Student getStudentByRollNo(int rollNo);
    boolean deleteStudent(int rollNo);
    boolean updateStudent(int rollNo , String field , String newValue);
    Student getTopper();


}
