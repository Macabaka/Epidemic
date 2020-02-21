package com.scs.jdbc.dao.impl;

import com.scs.jdbc.dao.NewsDao;
import com.scs.jdbc.domain.vo.NewsVo;
import com.scs.jdbc.entity.News;
import com.scs.jdbc.util.Dbutil;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 12:48
 * @Description:
 */
public class NewsDaoImpl implements NewsDao {
    private Connection connection = Dbutil.getConnection();

    /**
     * news表和area表联查
     * @return List<NewsVo>
     */
    @Override
    public List<NewsVo> getAllNewsVo() throws SQLException{
        String sql = " SELECT  a.provinceName,a.body,b.provinceEnglishName,b.province_zipCode,b.province_suspectedCount,b.province_confirmedCount,b.province_curedCount,b.province_deadCount,a.title\n" +
                "FROM t_news a\n" +
                "LEFT JOIN t_area b\n" +
                "ON a.provinceName = b.provinceName\n" +
                "GROUP BY provinceName\n" +
                "ORDER BY b.province_deadCount DESC\n" +
                "LIMIT 10 ";
        PreparedStatement preparedStatement = null;
        List<NewsVo> newsVoList = new ArrayList<>();
            preparedStatement = connection.prepareStatement(sql);
            ResultSet resultSet =  preparedStatement.executeQuery();
            while(resultSet.next()){
                NewsVo newsVo = new NewsVo();
                newsVo.setProvinceName(resultSet.getString("provinceName"));
                newsVo.setBody(resultSet.getString("body"));
                newsVo.setProvinceEnglishName(resultSet.getString("provinceEnglishName"));
                newsVo.setProvinceZipCode(resultSet.getString("province_zipCode"));
                newsVo.setProvinceSuspectedCount(resultSet.getInt("province_suspectedCount"));
                newsVo.setProvinceConfirmedCount(resultSet.getInt("province_confirmedCount"));
                newsVo.setProvinceCuredCount(resultSet.getInt("province_curedCount"));
                newsVo.setProvinceDeadCount(resultSet.getInt("province_deadCount"));
                newsVo.setTitle(resultSet.getString("title"));
                newsVoList.add(newsVo);
            }
        return newsVoList;
    }

    public static void main(String[] args) {
        try {
            new NewsDaoImpl().getAllNew();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<News> getAllNew() throws SQLException {
        String sql = " SELECT * FROM t_news ";
        List<News> newsList = new ArrayList<>();
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet=preparedStatement.executeQuery();
        while (resultSet.next()){
            News news = new News();
            news.setId(resultSet.getString("_id"));
            news.setAloneId(resultSet.getInt("id"));
            news.setPubDate(resultSet.getString("pubDate"));
            news.setTitle(resultSet.getString("title"));
            news.setSummary(resultSet.getString("summary"));
            news.setInfoSource(resultSet.getString("infoSource"));
            news.setSourceUrl(resultSet.getString("sourceUrl"));
            news.setProvinceId(resultSet.getInt("provinceId"));
            news.setProvinceName(resultSet.getString("provinceName"));
            news.setCreateTime(resultSet.getString("createTime"));
            news.setModifyTime(resultSet.getString("modifyTime"));
            news.setEntryWay(resultSet.getString("entryWay"));
            news.setAdoptType(resultSet.getString("adoptType"));
            news.setInfoType(resultSet.getString("infoType"));
            news.setDataInfoState(resultSet.getString("dataInfoState"));
            news.setDataInfoOperator(resultSet.getString("dataInfoOperator"));
            news.setDataInfoTime(resultSet.getString("dataInfoTime"));
            news.setCrawlTime(resultSet.getString("crawlTime"));
            news.setBody(resultSet.getString("body"));
            newsList.add(news);
        }
        return newsList;
    }
}
