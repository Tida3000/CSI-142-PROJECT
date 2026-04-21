package model;

public class User {
    private String name;
    private String studentId;
    
    public User(String name, String studentId) {
        this.name = name;
        this.studentId = studentId;
    }
    
    public String getName() {
        return name;
    }
    
    public String getStudentId() {
        return studentId;
    }
    
    @Override
    public String toString() {
        return name + " (" + studentId + ")";
    }
}
