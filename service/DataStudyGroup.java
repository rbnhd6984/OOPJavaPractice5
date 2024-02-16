package practice5.service;

import practice5.model.Student;
import practice5.model.StudyGroup;
import practice5.model.Teacher;

import java.util.ArrayList;
import java.util.List;

public class DataStudyGroup implements ServiceStudyGroup {

    List<StudyGroup> studyGroupList = new ArrayList<>();

    @Override
    public StudyGroup create(Teacher teacher, List<Student> students) {
        StudyGroup studyGroup = new StudyGroup(teacher, students);
        studyGroup.setGroupID(studyGroupList.size() + 1);
        studyGroupList.add(studyGroup);
        return studyGroup;
    }

    @Override
    public List<StudyGroup> read() {
        return studyGroupList;
    }
}
