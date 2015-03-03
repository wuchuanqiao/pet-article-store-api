package com.studio.pet.article.store.api.bean;

import java.io.Serializable;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public class ApiQuery implements Serializable {
    private long version;
    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    public ApiQuery andEqual(String key,Object value){
        return this;
    }

    public ApiQuery andLike(String key,Object value){
        return this;
    }

    public ApiQuery orEqual(String key,Object value){
        return this;
    }

    public ApiQuery orLike(String key,Object value, Object ... aa){
        return this;
    }

    public static ApiQuery news(int version) {
        ApiQuery query = new ApiQuery();
        query.setVersion(version);
        return query;
    }
}
