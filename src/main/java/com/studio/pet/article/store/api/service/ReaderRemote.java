package com.studio.pet.article.store.api.service;

import com.studio.pet.article.store.api.bean.ApiArticle;
import com.studio.pet.article.store.api.bean.ApiQuery;
import com.studio.pet.article.store.api.bean.base.ApiResponse;

import java.util.List;

/**
 * Created by chuanqiao.wu on 2015/3/1.
 */
public interface ReaderRemote {
    ApiResponse<List<ApiArticle>> query(ApiQuery query);
}
