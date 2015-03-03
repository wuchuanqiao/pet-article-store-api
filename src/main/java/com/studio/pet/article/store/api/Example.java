package com.studio.pet.article.store.api;

import com.google.common.collect.Lists;
import com.studio.pet.article.store.api.bean.ApiArticle;
import com.studio.pet.article.store.api.bean.ApiUser;
import com.studio.pet.article.store.api.bean.base.ApiQuery;
import com.studio.pet.article.store.api.bean.base.ApiQuery.Operation;
import com.studio.pet.article.store.api.bean.base.ApiResponse;
import com.studio.pet.article.store.api.service.ArticleReaderRemote;

import javax.xml.ws.Response;
import java.util.List;


/**
 * Created by chuanqiao.wu on 2015/3/4.
 */
public class Example {
    public static void main(String[] args) {
        ApiQuery query = ApiQuery.news(1001)
                .and("author", new ApiUser())
                .and("title", "Angel wings", Operation.EQUAL)
                .and("content", "his name is MCD", Operation.LIKE)
                .and("id", Lists.newArrayList(), Operation.EQUAL, Operation.IN)
                .and("type", Lists.newArrayList(), Operation.EQUAL, Operation.OUT)
                .and("comments", Lists.newArrayList(), Operation.LIKE, Operation.IN)
                .and("", "", Operation.LIKE, Operation.OUT);

        ArticleReaderRemote reader = null;
        ApiResponse<List<ApiArticle>> response = reader.queryArticle("pet-article-confirm-provider", query);

        if (response.isRet()) {
            List<ApiArticle> articles = response.getData();
            System.out.println(articles);
        } else {
            ApiResponse.ApiError error = response.getError();
            System.out.println(error.getMessage());
            throw new RuntimeException(error.getThrowable());
        }
    }
}
