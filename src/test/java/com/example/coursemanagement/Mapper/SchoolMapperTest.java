package com.example.coursemanagement.Mapper;

import com.example.coursemanagement.entity.School;
import com.example.coursemanagement.mapper.SchoolMapper;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigInteger;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/23
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class SchoolMapperTest {
    @Autowired
    private SchoolMapper schoolMapper;

    @Test
    public void testSchoolMapperTest(){
        School resultSchool = schoolMapper.getSchoolById(new BigInteger("1"));
        System.out.println("获得学校的信息为"+"id:"+resultSchool.getId());
        System.out.println("name:"+resultSchool.getSchoolName());
        System.out.println("address:"+resultSchool.getAddress());
        return;
    }
}
