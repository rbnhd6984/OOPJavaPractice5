package practice5.service;

import practice5.model.Teacher;
import practice5.model.User;

import java.util.List;

public interface ServiceTeacher {
    Teacher create(User user);
    List<Teacher> read();
}
