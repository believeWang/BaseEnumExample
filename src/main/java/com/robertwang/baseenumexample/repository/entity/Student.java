package com.robertwang.baseenumexample.repository.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table
@Getter
@Setter
public class Student {
  private Integer sex;
  private String collegeYear;
  private String name;
  private Integer age;
  private String identifyKey;
  @Id
  @GeneratedValue
  private Integer id;
}
