package practice5.model;

public class Teacher extends User {
    private Integer teacherID;
    private String subject;

    public Teacher(Integer age, String name, String subject) {
        super(age, name);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", subject='" + subject + '\'' +
                ", teacherID=" + teacherID +'}';
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }
}
