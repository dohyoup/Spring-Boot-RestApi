package com.study.domain.delete;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface DeleteMapper {
   int deleteById(String userId);
}
