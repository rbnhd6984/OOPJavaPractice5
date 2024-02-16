package practice5.model;

import java.util.List;

public class StudyGroup {
    private Teacher teacher;
    private List<Student> students;
    private int groupID;


    public StudyGroup(Teacher teacher, List<Student> students) {
        this.teacher = teacher;
        this.students = students;
    }

    public void setGroupID(int groupID) {
        this.groupID = groupID;
    }

    @Override
    public String toString() {
        return "- {" + teacher +
                ", students=" + students +
                ", groupID=" + groupID +
                '}';
    }

    public int getGroupID() {
        return groupID;
    }
}
