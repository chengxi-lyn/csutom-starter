package com.example.code.custom;

public class UserTemplate {

    private UserInfoProperties userInfoProperties;

    public UserTemplate(UserInfoProperties userInfoProperties){
        this.userInfoProperties = userInfoProperties;
    }
    public String getUserInfoProperties(){
        return userInfoProperties.toString();
    }
}
