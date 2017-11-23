package com.example.coursemanagement.Service;

import com.example.coursemanagement.entity.School;
import com.example.coursemanagement.mapper.SchoolMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/23
 */
@Service
public class SchoolService {
    @Autowired
    private SchoolMapper schoolMapper;

    /**
     * 按照学校的Id去查找
     * @param id
     * @return
     */
    public School getSchool(BigInteger id){
        School school = schoolMapper.getSchoolById(id);
        return school;
    }

}
