package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentLectureBean;

import java.util.List;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-07 17:32
 */
public interface StudentLectureMapper {
    List<StudentLectureBean> findStudentLectureByStudentId(int id);
}
