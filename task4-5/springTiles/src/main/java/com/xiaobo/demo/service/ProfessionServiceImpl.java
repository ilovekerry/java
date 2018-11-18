package com.xiaobo.demo.service;

import com.xiaobo.demo.dao.ProfessionMapper;
import com.xiaobo.demo.pojo.Profession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Service
public class ProfessionServiceImpl implements ProfessionService {
    @Autowired
    private ProfessionMapper professionMapper;
    @Autowired
    private Profession profession;
    @Override
    public List<Profession> selectByDevelopmentDirection(Profession profession){
        return professionMapper.selectByDevelopmentDirection(profession);
    }
}
