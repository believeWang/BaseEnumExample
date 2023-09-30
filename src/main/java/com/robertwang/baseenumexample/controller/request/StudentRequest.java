package com.robertwang.baseenumexample.controller.request;

import com.robertwang.baseenumexample.common.enums.CollegeYear;
import com.robertwang.baseenumexample.common.enums.Sex;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentRequest {

  private Sex sex;
  private CollegeYear collegeYear;
  private String name;
  private String identifyKey;
  private Integer age;


}
