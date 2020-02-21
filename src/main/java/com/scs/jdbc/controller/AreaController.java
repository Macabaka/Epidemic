package com.scs.jdbc.controller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.scs.jdbc.factory.ServiceFactory;
import com.scs.jdbc.service.AreaService;
import com.scs.jdbc.util.Result;

/**
 * @author Jack
 * @Date: 2020/2/21 13:14
 * @Description:
 */
public class AreaController {
    private AreaService areaService = ServiceFactory.getAreaServiceInstance();

    public static void main(String[] args) {
        new AreaController().getAllArea();
    }

    void getAllArea(){
        Gson gson  = new GsonBuilder().create();
        Result result = areaService.getAllArea();
        System.out.println(gson.toJson(result));
    }

}
