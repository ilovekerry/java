package com.xiaobo.demo.service;

import com.xiaobo.demo.pojo.Profession;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ProfessionService {
    public List<Profession> selectByDevelopmentDirection(Profession profession);
}
