package com.thoughtworks.capability.gtb.entrancequiz.repository;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Group;

import java.util.ArrayList;
import java.util.List;

public class GroupRepository {

    public List<Group> studentsGroups = new ArrayList<>();
    private StudentsRepository studentsRepository = new StudentsRepository();

    {
        Group studentGroup1 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup1);

        Group studentGroup2 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup2);

        Group studentGroup3 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup3);

        Group studentGroup4 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup4);

        Group studentGroup5 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup5);

        Group studentGroup6 = new Group(studentsRepository.students.subList(0, 3));
        studentsGroups.add(studentGroup6);
    }

    public void setStudentsGroups(List<Group> studentsGroups) {
        this.studentsGroups = studentsGroups;
    }
}
