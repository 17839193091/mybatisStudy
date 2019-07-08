package com.learn.chapter4.po;

import com.learn.chapter4.enums.SexEnum;

import java.util.List;

/**
 * 描述:
 * 学生bean
 * id int(20) not null auto_increment comment '编号',
 * cname varchar(60) not null comment '学生姓名',
 * sex tinyint(4) not null comment '性别',
 * selfcard_no int(20) not null comment '学生证号',
 * note varchar(1024) comment '备注',
 *
 * @author hudongfei
 * @create 2019-07-06 21:31
 */
public class StudentBean {
    private Integer id;
    private String cname;
    private SexEnum sex;
    private Integer selfcardNo;
    private String note;
    private StudentSelfcardBean studentSelfcard;
    private List<StudentLectureBean> studentLectureList;

    public List<StudentLectureBean> getStudentLectureList() {
        return studentLectureList;
    }

    @Override
    public String toString() {
        return "StudentBean{" +
                "id=" + id +
                ", cname='" + cname + '\'' +
                ", sex=" + sex +
                ", selfcardNo=" + selfcardNo +
                ", note='" + note + '\'' +
                ", studentSelfcard=" + studentSelfcard +
                ", studentLectureList=" + studentLectureList +
                '}';
    }

    public void setStudentLectureList(List<StudentLectureBean> studentLectureList) {
        this.studentLectureList = studentLectureList;
    }

    public SexEnum getSex() {
        return sex;
    }

    public void setSex(SexEnum sex) {
        this.sex = sex;
    }


    public StudentSelfcardBean getStudentSelfcard() {
        return studentSelfcard;
    }

    public void setStudentSelfcard(StudentSelfcardBean studentSelfcard) {
        this.studentSelfcard = studentSelfcard;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }

    public Integer getSelfcardNo() {
        return selfcardNo;
    }

    public void setSelfcardNo(Integer selfcardNo) {
        this.selfcardNo = selfcardNo;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

}
