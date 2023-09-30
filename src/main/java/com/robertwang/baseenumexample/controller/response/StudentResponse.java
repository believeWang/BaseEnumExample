package com.robertwang.baseenumexample.controller.response;

import com.robertwang.baseenumexample.common.enums.CollegeYear;
import com.robertwang.baseenumexample.common.enums.Sex;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class StudentResponse {

  private Sex sex;
  private CollegeYear collegeYear;
  private String name;


}
