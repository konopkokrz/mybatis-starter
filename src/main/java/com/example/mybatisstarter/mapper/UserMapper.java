package com.example.mybatisstarter.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<String> getUserIds();
}
