package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentBean;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-07 15:28
 */
public interface StudentMapper {
    StudentBean getStudent(Integer id);
}
