package com.yun.service;

import com.yun.dao.StudentsMapper;
import com.yun.entity.Students;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author yanghaiwen
 * @Description:
 * @date 2020/4/316:49
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Resource
    private StudentsMapper studentsMapper;
    @Override
    public int deleteByPrimaryKey(Long id) {
        return studentsMapper.deleteByPrimaryKey(id);
    }

    @Override
    public int insert(Students record) {
        return studentsMapper.insert(record);
    }

    @Override
    public Students selectByPrimaryKey(Long id) {
        return studentsMapper.selectByPrimaryKey(id);
    }

    @Override
    public List<Students> selectAll() {
        return studentsMapper.selectAll();
    }

    @Override
    public int updateByPrimaryKey(Students record) {
        return studentsMapper.updateByPrimaryKey(record);
    }
}
