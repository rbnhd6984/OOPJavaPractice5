package practice5.service;

import practice5.model.Teacher;
import practice5.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataTeacher {

    List<Teacher> listTeachers = new ArrayList<>();


    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherID(listTeachers.size() + 1);
        listTeachers.add(teacher);
        return teacher;
    }


    public List<Teacher> read() {
        return listTeachers;
    }
}
