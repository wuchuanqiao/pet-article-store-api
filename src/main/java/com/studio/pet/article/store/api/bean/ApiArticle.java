package com.studio.pet.article.store.api.bean;


import com.studio.tc.store.api.bean.ApiBase;

import java.io.Serializable;
import java.util.List;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public class ApiArticle extends ApiBase implements Serializable {
    private ApiType type;
    private String title;
    private String content;
    private ApiUser author;
    private List<String> keys;
    private String cover;
    private List<String> images;
    private List<ApiArticle> comments;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public List<String> getKeys() {
        return keys;
    }

    public void setKeys(List<String> keys) {
        this.keys = keys;
    }

    public ApiType getType() {
        return type;
    }

    public void setType(ApiType type) {
        this.type = type;
    }

    public String getCover() {
        return cover;
    }

    public void setCover(String cover) {
        this.cover = cover;
    }

    public ApiUser getAuthor() {
        return author;
    }

    public void setAuthor(ApiUser author) {
        this.author = author;
    }

    public List<String> getImages() {
        return images;
    }

    public List<ApiArticle> getComments() {
        return comments;
    }

    public void setComments(List<ApiArticle> comments) {
        this.comments = comments;
    }

    public void setImages(List<String> images) {
        this.images = images;
    }

    public static enum ApiType {

    }
}
