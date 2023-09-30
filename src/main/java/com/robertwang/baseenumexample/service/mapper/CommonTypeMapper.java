package com.robertwang.baseenumexample.service.mapper;

import static org.mapstruct.MappingConstants.ComponentModel.SPRING;

import com.robertwang.baseenumexample.common.CommonTypeEnum;
import com.robertwang.baseenumexample.common.EnumUtil;
import org.mapstruct.Mapper;
import org.mapstruct.TargetType;

@Mapper(componentModel = SPRING)
public interface CommonTypeMapper {

  default <E extends CommonTypeEnum> E toEnum(Integer type, @TargetType Class<E> clazz) {
    return EnumUtil.getEnumFromType(type, clazz);
  }

  default <E extends CommonTypeEnum> E toEnum(String label, @TargetType Class<E> clazz) {
    return EnumUtil.getEnumFromLabel(label, clazz);
  }

  default <E extends CommonTypeEnum> Integer toType(E e) {
    return e.getType();
  }

  default <E extends CommonTypeEnum> String toLable(E e) {
    return e.getLabel();
  }
}
