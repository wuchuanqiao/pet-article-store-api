package com.studio.pet.article.store.api.bean;

import com.studio.pet.article.store.api.bean.base.ApiBase;

import java.io.Serializable;

/**
 * Created by chuanqiao.wu on 2015/3/3.
 */
public class ApiUser extends ApiBase implements Serializable{
    private String nickname;
    private String username;
    private String password;

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
