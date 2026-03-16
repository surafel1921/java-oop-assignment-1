public class Student {

    // These are hidden (private) → this is encapsulation
    private String name;
    private int studentId;

    // Constructor – used to create a new student
    public Student(String name, int studentId) {
        this.name = name;
        this.studentId = studentId;
    }

    // Getters – allow others to read the values
    public String getName() {
        return name;
    }

    public int getStudentId() {
        return studentId;
    }

    // Setters – allow others to change the values
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}