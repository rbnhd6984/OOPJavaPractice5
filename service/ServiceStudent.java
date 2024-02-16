package practice5.service;

import practice5.model.Student;
import practice5.model.User;

import java.util.List;


public interface ServiceStudent {
    Student create(User user);
    List<Student> read();
}
