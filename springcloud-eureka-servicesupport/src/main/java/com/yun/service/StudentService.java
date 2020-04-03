package com.yun.service;

import com.yun.entity.Students;

import java.util.List;

/**
 * @author yanghaiwen
 * @Description:
 * @date 2020/4/316:49
 */
public interface StudentService {
    int deleteByPrimaryKey(Long id);

    int insert(Students record);

    Students selectByPrimaryKey(Long id);

    List<Students> selectAll();

    int updateByPrimaryKey(Students record);
}
