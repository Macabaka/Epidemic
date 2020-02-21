package com.scs.jdbc.factory;

import com.scs.jdbc.service.AreaService;
import com.scs.jdbc.service.NewsService;
import com.scs.jdbc.service.OverallService;
import com.scs.jdbc.service.RumorsService;
import com.scs.jdbc.service.impl.AreaServiceImpl;
import com.scs.jdbc.service.impl.NewsServiceImpl;
import com.scs.jdbc.service.impl.OverallServiceImpl;
import com.scs.jdbc.service.impl.RumorsServiceImpl;

/**
 * @author Jack
 * @Date: 2020/2/18 16:11
 * @Description:
 */
public class ServiceFactory {

    public static NewsService getNewsServiceInstance(){
        return new NewsServiceImpl();
    }

    public static AreaService getAreaServiceInstance(){
        return new AreaServiceImpl();
    }

    public static OverallService getOverallServiceInstance(){
        return new OverallServiceImpl();
    }

    public static RumorsService getRumorsServiceInstance(){
        return new RumorsServiceImpl();
    }
}
