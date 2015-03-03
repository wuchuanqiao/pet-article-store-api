package com.studio.pet.article.store.api.bean.base;

import com.studio.pet.article.store.api.bean.exception.ApiError;

import java.io.Serializable;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public class ApiResponse<T> implements Serializable {
    private boolean ret;
    private ApiError error;
    private T data;

    public boolean isRet() {
        return ret;
    }

    public void setRet(boolean ret) {
        this.ret = ret;
    }

    public ApiError getError() {
        return error;
    }

    public void setError(ApiError error) {
        this.error = error;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
