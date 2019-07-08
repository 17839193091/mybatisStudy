package com.learn.chapter4.mapper;

import com.learn.chapter4.po.StudentSelfcardBean;

/**
 * 描述:
 *
 * @author hudongfei
 * @create 2019-07-06 21:44
 */
public interface StudentSelfcardMapper {
    StudentSelfcardBean findStudentSelfcardByStudentId(Integer studentId);
}
