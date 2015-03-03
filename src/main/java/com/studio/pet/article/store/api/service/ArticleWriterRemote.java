package com.studio.pet.article.store.api.service;

import com.studio.pet.article.store.api.bean.ApiArticle;
import com.studio.pet.article.store.api.bean.base.ApiQuery;
import com.studio.pet.article.store.api.bean.base.ApiResponse;

import java.util.List;
import java.util.Set;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public interface ArticleWriterRemote {

    ApiResponse<Long> save(ApiArticle article);

    ApiResponse<Set<Long>> save(List<ApiArticle> article);

    ApiResponse<Set<ApiArticle>> delete(ApiQuery query);

    ApiResponse<Set<Long>> up(ApiQuery query, ApiArticle article);

}
