package com.thoughtworks.capability.gtb.entrancequiz.entity;

import java.util.List;

public class Group {
    private List<Student> studentList;

    public Group(List<Student> studentList) {
        this.studentList = studentList;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}
