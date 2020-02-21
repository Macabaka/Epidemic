package com.scs.jdbc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.service.NewsService;
import com.scs.jdbc.util.Result;

/**
 * @author Jack
 * @Date: 2020/2/21 13:13
 * @Description:
 */
public class NewsController {
    private NewsService newsService = ServiceFactory.getNewsServiceInstance();

    public static void main(String[] args) {
//        new NewsController().getAllNewsVo();
        new NewsController().getAllNews();
    }
    void getAllNewsVo(){
        Result result = newsService.getAllNewsVo();
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(result));
    }

    void getAllNews(){
        Result result = newsService.getAllNews();
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(result));
    }
}
