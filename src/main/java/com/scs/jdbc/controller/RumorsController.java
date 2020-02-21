package com.scs.jdbc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.service.RumorsService;
import com.scs.jdbc.util.Result;

/**
 * @author Jack
 * @Date: 2020/2/21 16:03
 * @Description:
 */
public class RumorsController {
    private static RumorsService   rumorsService = ServiceFactory.getRumorsServiceInstance();

    public static void main(String[] args) {
        new RumorsController().getAllRumors();
    }

    void getAllRumors(){
        Result result = rumorsService.getAllRumors();
        Gson gson = new GsonBuilder().create();
        System.out.println(gson.toJson(result));
    }
}
