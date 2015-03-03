package com.studio.pet.article.store.api;

import com.studio.pet.article.store.api.bean.ApiArticle;
import com.studio.pet.article.store.api.bean.ApiQuery;
import com.studio.pet.article.store.api.service.ReaderRemote;

import java.util.List;

/**
 * Created by chuanqiao.wu on 2015/3/2.
 */
public class Main {
    public static void main(String[] args) {
        ApiQuery query = ApiQuery.news(1).
                andEqual("", "").
                andLike("", "").
                orEqual("", "").
                orLike("", "");

        ReaderRemote readerRemote = null;
        List<ApiArticle> articles = readerRemote.query(query).getData();
    }
}
