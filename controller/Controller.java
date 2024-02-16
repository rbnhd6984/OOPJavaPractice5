package practice5.controller;

import practice5.model.Student;
import practice5.model.StudyGroup;
import practice5.model.Teacher;
import practice5.model.User;
import practice5.service.DataStudent;
import practice5.service.DataStudyGroup;
import practice5.service.DataTeacher;
import practice5.view.GroupView;
import practice5.view.StudentView;

import java.util.ArrayList;
import java.util.List;

public class Controller {

    private DataStudent dataStudent;
    private DataTeacher dataTeacher;
    private StudentView studentView;
    private DataStudyGroup dataStudyGroup;
    private GroupView groupView;

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        studentView = new StudentView();
        dataStudyGroup = new DataStudyGroup();
        groupView = new GroupView();
    }


    public void start() {
        User u1 = new Student(30, "Григорий", 4.45);
        User u3 = new Student(23, "Дмитрий", 4.8);
        User u2 = new Teacher(40, "Лариса Ивановна", "Math");
        User u4 = new Student(25, "Анастасия", 4.9);
        User u5 = new Student(22, "Пётр", 4.7);
        User u6 = new Teacher(45, "Cay Horstmann", "Java");

        List<Student> studentList1 = new ArrayList<>();
        studentList1.add(createStudent(u1));
        studentList1.add(createStudent(u3));
        List<Student> studentList2 = new ArrayList<>();
        studentList2.add(createStudent(u4));
        studentList2.add(createStudent(u5));

        createStudyGroup(createTeacher(u2), studentList1);
        createStudyGroup(createTeacher(u6), studentList2);

        List<StudyGroup> groupList = dataStudyGroup.read();
        groupView.printGroup(groupList);
    }

    public Student createStudent(User user) {
        return dataStudent.create(user);
    }

    public Teacher createTeacher(User user) {
        return dataTeacher.create(user);
    }

    public StudyGroup createStudyGroup(User teacher, List<Student> students) {
        return dataStudyGroup.create((Teacher) teacher, students);
    }
}
