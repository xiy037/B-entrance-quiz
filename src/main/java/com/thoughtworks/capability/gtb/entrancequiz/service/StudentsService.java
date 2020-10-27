package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Group;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.GroupRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentsRepository;

import java.util.List;

public class StudentsService {

    static private StudentsRepository studentsRepository = new StudentsRepository();
    static private GroupRepository groupRepository = new GroupRepository();

    static public List<Student> getAllStudents() {
        return studentsRepository.students;
    }

    static public Student addNewStudent(String name) {
        int id = getAllStudents().size() + 1;
        Student student = new Student(id, name);
        studentsRepository.students.add(student);
        return student;
    }


    public static List<Group> getStudentGroup() { return groupRepository.studentsGroups; }

    public static void addStudentGroup(List<Group> studentGroup) {
        groupRepository.setStudentsGroups(studentGroup);
    }


}
