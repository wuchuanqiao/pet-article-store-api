package com.studio.pet.article.store.api.bean.base;

import java.io.Serializable;
import java.util.List;

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

    public static enum Operation {
        EQUAL, LIKE, IN, OUT
    }

    public ApiQuery and(String key, Object value, Operation... operation) {
        return this;
    }

    public ApiQuery or(String key, Object value, Operation... operation) {
        return this;
    }

    public static ApiQuery news(long version) {
        return new ApiQuery(version);
    }

    private ApiQuery(long version) {
        this.version = version;
    }
}
