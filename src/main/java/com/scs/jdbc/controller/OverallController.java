package com.scs.jdbc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.service.OverallService;
import com.scs.jdbc.util.Result;

/**
 * @author Jack
 * @Date: 2020/2/21 16:03
 * @Description:
 */
public class OverallController {
    private OverallService overallService = ServiceFactory.getOverallServiceInstance();

    public static void main(String[] args) {
        new OverallController().getAllOverall();
    }

    void getAllOverall(){
        Result result = overallService.getAllOverall();
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(result));
    }
}
