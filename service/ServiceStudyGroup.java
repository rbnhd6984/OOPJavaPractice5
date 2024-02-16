package practice5.service;

import practice5.model.Student;
import practice5.model.StudyGroup;
import practice5.model.Teacher;

import java.util.List;

public interface ServiceStudyGroup {
    StudyGroup create(Teacher teacher, List<Student> students);
    List<StudyGroup> read();
}
