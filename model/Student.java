package practice5.model;

public class Student extends User {
    private Integer studentID;
    private Double average;

    public Student(Integer age, String name, Double average) {
        super(age, name);
        this.average = average;
    }

    @Override
    public String toString() {
        return '{' +
                "name='" + name + '\'' +
                ", age=" + age +
                ", average=" + average +
                ", studentID=" + studentID +
                '}';
    }

    public void setStudentID(Integer studentID) {
        this.studentID = studentID;
    }
}
