package com.example;


import org.springframework.boot.context.properties.ConfigurationProperties;


@ConfigurationProperties(prefix = "user")
public class MyUserProperties {
    private Integer id=100;
    private String userName="test";
    private String email="111@163.com";
    private String password="123456";

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
