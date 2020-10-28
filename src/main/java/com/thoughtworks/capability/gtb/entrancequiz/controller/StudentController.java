package com.thoughtworks.capability.gtb.entrancequiz.controller;

import com.thoughtworks.capability.gtb.entrancequiz.entity.Group;
import com.thoughtworks.capability.gtb.entrancequiz.entity.Student;
import com.thoughtworks.capability.gtb.entrancequiz.service.StudentsService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
public class StudentController {

    // TODO GTB-知识点: - 违反Restful实践, url不合理
    @GetMapping("/all")
    public ResponseEntity<List<Student>> getAllStudents() {
        // TODO GTB-知识点: - 应该使用依赖注入注入Service示例
        List<Student> students = StudentsService.getAllStudents();
        if (students.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(students, HttpStatus.OK);
    }

    @PostMapping("/newStudent/{name}")
    // TODO GTB-知识点: - 违反Restful实践, Post请求成功后应该返回201
    public ResponseEntity<Student> addNewStudent(@PathVariable String name) {
        Student result = StudentsService.addNewStudent(name);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }

    @GetMapping("/group")
    public ResponseEntity<List<Group>> getStudentGroup() {
        List<Group> studentGroup = StudentsService.getStudentGroup();
        if (studentGroup.isEmpty()) {
            return new ResponseEntity<>(null, HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(studentGroup, HttpStatus.OK);
    }

    @PostMapping("/newGroups")
    public void addStudentGroup(@RequestBody List<Group> studentGroup) {
        StudentsService.addStudentGroup(studentGroup);
    }
}
