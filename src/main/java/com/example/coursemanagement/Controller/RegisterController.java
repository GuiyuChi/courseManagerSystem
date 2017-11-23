package com.example.coursemanagement.Controller;

import com.example.coursemanagement.Service.SchoolService;
import com.example.coursemanagement.entity.School;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigInteger;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/23
 */
@RestController
public class RegisterController {
    @Autowired
    private SchoolService schoolService;

    @GetMapping("/school/{id}")
    public School select(@PathVariable("id") BigInteger id){
        School school = schoolService.getSchool(id);
        return school;
    }
}
