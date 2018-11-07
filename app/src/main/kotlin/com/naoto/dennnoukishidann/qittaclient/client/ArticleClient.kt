package com.dennnoukishidann.qittaclientnew.client

import com.dennnoukishidann.qittaclientnew.model.Article
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by gotounaoto on 2018/11/04.
 */
interface ArticleClient {

    @GET("/api/v2/items")
    fun search(@Query("query") query: String): Observable<List<Article>>
}