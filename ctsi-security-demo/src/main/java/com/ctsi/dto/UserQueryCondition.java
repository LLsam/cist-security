package com.ctsi.dto;

/**
 * Created by llsam on 2018/5/14.
 */
public class UserQueryCondition {
    private  String userName;
    private String age;
    private String ageTo;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAgeTo() {
        return ageTo;
    }

    public void setAgeTo(String ageTo) {
        this.ageTo = ageTo;
    }


}
