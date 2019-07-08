package com.learn.chapter4.po;

import java.util.List;

/**
 * 描述:
 *     女学生bean
 * @author hudongfei
 * @create 2019-07-08 11:56
 */
public class FemaleStudentBean extends StudentBean{
    private List<StudentHealthFemaleBean> studentHealthFemaleList = null;

    public List<StudentHealthFemaleBean> getStudentHealthFemaleList() {
        return studentHealthFemaleList;
    }

    public void setStudentHealthFemaleList(List<StudentHealthFemaleBean> studentHealthFemaleList) {
        this.studentHealthFemaleList = studentHealthFemaleList;
    }

    @Override
    public String toString() {
        return "FemaleStudentBean{" +
                "studentHealthFemaleList=" + studentHealthFemaleList +
                '}';
    }
}
