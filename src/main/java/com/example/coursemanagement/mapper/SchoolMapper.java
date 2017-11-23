package com.example.coursemanagement.mapper;

import com.example.coursemanagement.entity.School;
import org.springframework.stereotype.Component;

import java.math.BigInteger;

/**
 * @Author: guiyu
 * @Description:
 * @Data: Created in 2017/11/23
 */
@Component
public interface SchoolMapper {
    /**
     *
     * @param id
     * @return
     */
    School getSchoolById(BigInteger id);
}
