package com.thoughtworks.capability.gtb.entrancequiz.service;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Group;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.repository.GroupRepository;
import com.thoughtworks.capability.gtb.entrancequiz.repository.StudentsRepository;

import java.util.List;

public class StudentsService {

    static private StudentsRepository studentsRepository = new StudentsRepository();
    static private GroupRepository groupRepository = new GroupRepository();

    // TODO GTB-知识点: - Service的方法应该定义成实例方法
    static public List<Student> getAllStudents() {
        return studentsRepository.students;
    }

    static public Student addNewStudent(String name) {
        // TODO GTB-工程实践: - 计算id的方式不够健壮，可以使用字段保存最大id
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
