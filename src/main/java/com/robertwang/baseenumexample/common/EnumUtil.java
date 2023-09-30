package com.robertwang.baseenumexample.common;

public class EnumUtil {
  private EnumUtil() {}

  public static <E extends CommonTypeEnum> E getEnumFromType(Integer type, Class<E> clazz) {
    if (type == null) return null;

    for (E enumConstant : clazz.getEnumConstants()) {
      if (enumConstant.getType().equals(type)) {
        return enumConstant;
      }
    }
    return null;
  }

  public static <E extends CommonTypeEnum> E getEnumFromLabel(String label, Class<E> clazz) {
    if (label == null) return null;

    for (E enumConstant : clazz.getEnumConstants()) {
      if (enumConstant.getLabel().equals(label)) {
        return enumConstant;
      }
    }
    return null;
  }
}
