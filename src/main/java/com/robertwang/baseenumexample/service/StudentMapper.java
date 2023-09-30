package com.robertwang.baseenumexample.service;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import com.robertwang.baseenumexample.controller.request.StudentRequest;
import com.robertwang.baseenumexample.controller.response.StudentResponse;
import com.robertwang.baseenumexample.repository.entity.Student;
import com.robertwang.baseenumexample.service.mapper.CommonTypeMapper;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = SPRING, uses = CommonTypeMapper.class)
public interface StudentMapper {

  List<StudentResponse> toResponse(List<Student> students);

  Student toStudent(StudentRequest request);
}
