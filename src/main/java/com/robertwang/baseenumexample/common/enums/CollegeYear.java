package com.robertwang.baseenumexample.common.enums;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonCreator.Mode;
import com.robertwang.baseenumexample.common.CommonTypeEnum;
import com.robertwang.baseenumexample.common.EnumUtil;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor(access = AccessLevel.PRIVATE)
public enum CollegeYear implements CommonTypeEnum {
  FRESHMAN(1, "Freshman"), // 大一
  SOPHOMORE(2, "Sophomore"), // 大二
  JUNIOR(3, "Junior"), // 大三
  SENIOR(4, "Senior"); // 大四

  private final Integer type;
  private final String label;

  @JsonCreator(mode = Mode.DELEGATING)
  public static CollegeYear fromLabel(String label) {
    return EnumUtil.getEnumFromLabel(label, CollegeYear.class);
  }
}
