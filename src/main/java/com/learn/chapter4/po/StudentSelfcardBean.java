package com.learn.chapter4.po;

import java.util.Date;

/**
 * 描述:
 *      学生身份证
 *      id int(20) not null auto_increment comment '编号',
 *     student_id int(20) not null comment '学生编号',
 *     native varchar(60) not null comment '籍贯',
 *     issue_date date not null comment '发证日期',
 *     end_date date not null comment '结束日期',
 *     note varchar(1024) comment '备注',
 * @author hudongfei
 * @create 2019-07-06 21:31
 */
public class StudentSelfcardBean {
    private Integer id;
    private Integer studentId;
    private String native1;
    private Date issueDate;
    private Date endDate;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getStudentId() {
        return studentId;
    }

    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    public String getNative1() {
        return native1;
    }

    public void setNative1(String native1) {
        this.native1 = native1;
    }

    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentSelfcardBean{" +
                "id=" + id +
                ", studentId=" + studentId +
                ", native1='" + native1 + '\'' +
                ", issueDate=" + issueDate +
                ", endDate=" + endDate +
                ", note='" + note + '\'' +
                '}';
    }
}
