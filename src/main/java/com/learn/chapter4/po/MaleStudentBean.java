package com.learn.chapter4.po;

import java.util.List;

/**
 * 描述:
 *      男学生bean
 * @author hudongfei
 * @create 2019-07-08 11:54
 */
public class MaleStudentBean extends StudentBean {
    private List<StudentHealthMaleBean> studentHealthMaleList = null;

    public List<StudentHealthMaleBean> getStudentHealthMaleList() {
        return studentHealthMaleList;
    }

    public void setStudentHealthMaleList(List<StudentHealthMaleBean> studentHealthMaleList) {
        this.studentHealthMaleList = studentHealthMaleList;
    }

    @Override
    public String toString() {
        return "MaleStudentBean{" +
                "studentHealthMaleList=" + studentHealthMaleList +
                '}';
    }
}
