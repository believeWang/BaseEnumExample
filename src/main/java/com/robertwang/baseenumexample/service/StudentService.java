package com.robertwang.baseenumexample.service;

import com.robertwang.baseenumexample.controller.request.StudentRequest;
import com.robertwang.baseenumexample.controller.response.StudentResponse;
import com.robertwang.baseenumexample.repository.StudentRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class StudentService {
  private final StudentRepository studentRepository;
  private final StudentMapper mapper;

  public List<StudentResponse> getAllStudent() {
    return mapper.toResponse(studentRepository.findAll());

  }

  public void saveStudent(StudentRequest request) {

    studentRepository.save(mapper.toStudent(request));
  }
}
