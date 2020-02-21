package com.scs.jdbc.service.impl;

import com.scs.jdbc.dao.NewsDao;
import com.scs.jdbc.domain.vo.NewsVo;
import com.scs.jdbc.entity.News;
import com.scs.jdbc.factory.DaoFactory;
import com.scs.jdbc.service.NewsService;
import com.scs.jdbc.util.Result;
import com.scs.jdbc.util.ResultCode;

import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 13:11
 * @Description:
 */
public class NewsServiceImpl implements NewsService {
    private  NewsDao newsDao = DaoFactory.getNewsDaoInstance();

    @Override
    public Result getAllNewsVo() {
        List<NewsVo> newsVoList=null;
        try {
            newsVoList = newsDao.getAllNewsVo();
        } catch (SQLException e) {
            System.out.println("获取newsvo出错");
        }
        if(newsVoList!=null){
            return Result.success(newsVoList);
        }else{
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }

    }

    @Override
    public Result getAllNews() {
        List<News> newsList = null;
        try {
            newsList = newsDao.getAllNew();
        } catch (SQLException e) {
            e.printStackTrace();
        }if(newsList!=null){
            return Result.success(newsList);
        }else{
            return Result.failure(ResultCode.RESULT_CODE_DATA_NONE);
        }

    }
}
