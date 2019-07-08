package com.learn.chapter4.enums;

/**
 * 描述:
 *  男女枚举类
 * @author hudongfei
 * @create 2019-07-01 17:49
 */
public enum SexEnum {
    MALE(1,"男"),FEMALE(2,"女");
    private int id;
    private String name;
    private SexEnum(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static SexEnum getSex(int id) {
        if (id == 1) {
            return MALE;
        } else if (id == 2) {
            return FEMALE;
        }
        return null;
    }
}
