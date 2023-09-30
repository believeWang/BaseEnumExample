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
public enum Sex implements CommonTypeEnum {
  F(1, "FEMALE"),
  M(2, "MALE");

  private final Integer type;
  private final String label;

  @JsonCreator(mode = Mode.DELEGATING)
  public static Sex fromLabel(String label) {
    return EnumUtil.getEnumFromLabel(label, Sex.class);
  }
}
