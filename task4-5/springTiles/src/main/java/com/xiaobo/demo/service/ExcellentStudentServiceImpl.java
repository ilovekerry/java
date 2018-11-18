package com.xiaobo.demo.service;

import com.xiaobo.demo.dao.ExcellentStudentMapper;
import com.xiaobo.demo.pojo.ExcellentStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class ExcellentStudentServiceImpl implements ExcellentStudentService {
    @Autowired
    private ExcellentStudentMapper excellentStudentMapper;
    @Override
    public ExcellentStudent get(Integer id){
        return excellentStudentMapper.selectByPrimaryKey(id);
    }
    @Override
    public List<ExcellentStudent> selectBySalary(Map<String,Object> pageData){
        return excellentStudentMapper.selectBySalary(pageData);
    }
}
