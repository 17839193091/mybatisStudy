package com.learn.chapter4.po;

/**
 * 描述:
 * id         int(20) auto_increment comment '编号'  primary key,
 * student_id varchar(60)   not null comment '学生编号',
 * check_data varchar(60)   not null comment '检查日期',
 * heart      varchar(60)   not null comment '心',
 * liver      varchar(60)   not null comment '肝',
 * spleen     varchar(60)   not null comment '脾',
 * lung       varchar(60)   not null comment '肺',
 * kidney     varchar(60)   not null comment '肾',
 * prostate   varchar(60)   not null comment '前列腺',
 * note       varchar(1024) null comment '备注'
 *
 * @author hudongfei
 * @create 2019-07-08 11:57
 */
public class StudentHealthMaleBean {
    private Integer id;
    private String studentId;
    private String checkData;
    private String heart;
    private String liver;
    private String spleen;
    private String lung;
    private String kidney;
    private String prostate;
    private String note;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getCheckData() {
        return checkData;
    }

    public void setCheckData(String checkData) {
        this.checkData = checkData;
    }

    public String getHeart() {
        return heart;
    }

    public void setHeart(String heart) {
        this.heart = heart;
    }

    public String getLiver() {
        return liver;
    }

    public void setLiver(String liver) {
        this.liver = liver;
    }

    public String getSpleen() {
        return spleen;
    }

    public void setSpleen(String spleen) {
        this.spleen = spleen;
    }

    public String getLung() {
        return lung;
    }

    public void setLung(String lung) {
        this.lung = lung;
    }

    public String getKidney() {
        return kidney;
    }

    public void setKidney(String kidney) {
        this.kidney = kidney;
    }

    public String getProstate() {
        return prostate;
    }

    public void setProstate(String prostate) {
        this.prostate = prostate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    @Override
    public String toString() {
        return "StudentHealthMaleBean{" +
                "id=" + id +
                ", studentId='" + studentId + '\'' +
                ", checkData='" + checkData + '\'' +
                ", heart='" + heart + '\'' +
                ", liver='" + liver + '\'' +
                ", spleen='" + spleen + '\'' +
                ", lung='" + lung + '\'' +
                ", kidney='" + kidney + '\'' +
                ", prostate='" + prostate + '\'' +
                ", note='" + note + '\'' +
                '}';
    }
}
