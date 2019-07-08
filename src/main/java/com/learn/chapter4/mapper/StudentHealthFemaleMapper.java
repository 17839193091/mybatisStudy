package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentHealthFemaleBean;

import java.util.List;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-08 12:04
 */
public interface StudentHealthFemaleMapper {
    List<StudentHealthFemaleBean> findStudentHealthFemaleByStuId(Integer id);
}
