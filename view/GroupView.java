package practice5.view;

import practice5.model.StudyGroup;

import java.util.List;

public class GroupView {


    public void printGroup(List<StudyGroup> groupList) {
        for (StudyGroup group : groupList) {
            System.out.println("Группа " + group.getGroupID()+ " " + group);
        }
    }
}
