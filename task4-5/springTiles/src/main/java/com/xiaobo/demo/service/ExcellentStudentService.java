package com.xiaobo.demo.service;

import com.xiaobo.demo.pojo.ExcellentStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface ExcellentStudentService {
    public ExcellentStudent get(Integer id);
    public List<ExcellentStudent> selectBySalary(Map<String,Object> pageData);
}
