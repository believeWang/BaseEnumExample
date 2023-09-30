package com.robertwang.baseenumexample.common;

import com.fasterxml.jackson.annotation.JsonValue;

public interface CommonTypeEnum {

  @JsonValue
  default String getLabel() {
    return null;
  }

  default Integer getType() {
    return null;
  }
}
