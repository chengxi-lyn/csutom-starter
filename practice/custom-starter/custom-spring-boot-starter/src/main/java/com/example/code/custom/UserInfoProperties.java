package com.example.code.custom;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("spring.user.custom")
public class UserInfoProperties {
    /*
     * 用户名
     */
    private String name = "zhangsan";
    /*
     * 密码
     */
    private String password = "123456";
    /*
     * 地址
     */
    private String address = "beijing";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "UserInfoProperties{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
