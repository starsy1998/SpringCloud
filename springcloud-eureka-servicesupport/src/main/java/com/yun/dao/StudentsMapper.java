package com.yun.dao;

import com.yun.entity.Students;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface StudentsMapper {
    int deleteByPrimaryKey(Long id);

    int insert(Students record);

    Students selectByPrimaryKey(Long id);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);
}