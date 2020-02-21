package com.scs.jdbc.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author Jack
 * @Date: 2020/2/17 16:40
 * @Description:
 */
public class ConfigUtil {
    private static Properties properties;

    /**
     * 初始化配置文件，static代码块只在类初始化时执行一次
     * @return Properties
     */
    static{
        properties = new Properties();
        //加载配置文件
        InputStream ins = ConfigUtil.class.getClassLoader().getResourceAsStream("db-config.properties");
        //设置断言，如果不满足，直接抛出异常
        assert ins != null;
        try {
            properties.load(ins);
        } catch (IOException e) {
            e.printStackTrace();
        }
        }

    /**
     * 对外方法
     * @return Properties
     */
    public static Properties getInstance(){
        return properties;
    }

    //双重检测
//    public  static  Properties getInstance(){
//        if(properties==null){
//            synchronized (ConfigUtil.class){
//                if(properties==null){
//                    properties=new Properties();
//                }
//            }
//        }
//        return properties;
//    }
}
