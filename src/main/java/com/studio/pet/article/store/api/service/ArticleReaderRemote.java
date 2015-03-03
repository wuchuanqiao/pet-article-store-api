package com.studio.pet.article.store.api.service;

import com.studio.pet.article.store.api.bean.ApiArticle;
import com.studio.pet.article.store.api.bean.base.ApiQuery;
import com.studio.pet.article.store.api.bean.base.ApiResponse;

import java.util.List;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public interface ArticleReaderRemote {
    ApiResponse<List<ApiArticle>> queryArticle(String appId, ApiQuery query);

    ApiResponse<Integer> countArticle(String appId, ApiQuery query);
}
