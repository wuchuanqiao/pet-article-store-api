package com.studio.pet.article.store.api.bean.exception;

import java.io.Serializable;

/**
 * Created by chuanqiao.wu on 2015/3/2.
 */
public class ApiError implements Serializable{
    private String message;
    private int code;
    private Throwable throwable;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Throwable getThrowable() {
        return throwable;
    }

    public void setThrowable(Throwable throwable) {
        this.throwable = throwable;
    }
}
