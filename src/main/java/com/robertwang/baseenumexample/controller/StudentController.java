package com.robertwang.baseenumexample.controller;

import com.robertwang.baseenumexample.controller.request.StudentRequest;
import com.robertwang.baseenumexample.controller.response.StudentResponse;
import com.robertwang.baseenumexample.service.StudentService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class StudentController {

  private final StudentService studentService;

  @GetMapping
  public ResponseEntity<List<StudentResponse>> getAllStudents() {
    return ResponseEntity.ok(studentService.getAllStudent());
  }
  @PostMapping
  public ResponseEntity<Void> insertStudent(StudentRequest request) {
    studentService.saveStudent(request);
    return ResponseEntity.noContent().build();
  }
}
