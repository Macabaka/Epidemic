package com.scs.jdbc.dao.impl;

import com.scs.jdbc.dao.FileDao;
import com.scs.jdbc.entity.Area;
import com.scs.jdbc.entity.News;
import com.scs.jdbc.entity.Overall;
import com.scs.jdbc.entity.Rumors;
import com.scs.jdbc.util.Dbutil;
import com.scs.jdbc.util.FileUtil;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/18 16:08
 * @Description:
 */
public class FileDaoImpl implements FileDao {
    private static Connection connection = Dbutil.getConnection();
    private static FileUtil fileUtil = FileUtil.getInstance();

    public static void main(String[] args) {
        new FileDaoImpl().insertRumorsMessage();
        new FileDaoImpl().insertNewsMessage();
        new FileDaoImpl().insertOverallMessage();
        new FileDaoImpl().insertAreaMessage();
    }

    @Override
    public  void insertAreaMessage() {
        List<Area> areaList = fileUtil.getAreaFile();
        String sql = " INSERT INTO t_area VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)  ";
        try {
            for(Area area :areaList){
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,area.getProvinceName());
                preparedStatement.setString(2,area.getProvinceEnglishName());
                preparedStatement.setString(3,area.getProvinceZipCode());
                preparedStatement.setString(4,area.getCityName());
                preparedStatement.setString(5,area.getCityEnglishName());
                preparedStatement.setString(6,area.getCityZipCode());
                preparedStatement.setInt(7,area.getProvinceConfirmedCount());
                preparedStatement.setInt(8,area.getProvinceSuspectedCount());
                preparedStatement.setInt(9,area.getProvinceCuredCount());
                preparedStatement.setInt(10,area.getProvinceDeadCount());
                preparedStatement.setInt(11,area.getCityConfirmedCount());
                preparedStatement.setInt(12,area.getCitySuspectedCount());
                preparedStatement.setInt(13,area.getCityCuredCount());
                preparedStatement.setInt(14,area.getCityDeadCount());
                preparedStatement.setString(15, String.valueOf(area.getUpdateTime()));
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }
    }

    @Override
    public void insertNewsMessage()  {
        List<News> newsList = fileUtil.getNewsFile();
        String sql = " INSERT INTO t_news VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        try {
            for(News news :newsList){
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,news.getId());
                preparedStatement.setInt(2,news.getAloneId());
                preparedStatement.setString(3, String.valueOf(news.getPubDate()));
                preparedStatement.setString(4,news.getTitle());
                preparedStatement.setString(5,news.getSummary());
                preparedStatement.setString(6,news.getInfoSource());
                preparedStatement.setString(7,news.getSourceUrl());
                if(news.getProvinceId()!=null){
                    preparedStatement.setInt(8,news.getProvinceId());
                }else{
                    preparedStatement.setInt(8,0);
                }
                preparedStatement.setString(9,news.getProvinceName());
                preparedStatement.setString(10, String.valueOf(news.getCreateTime()));
                preparedStatement.setString(11, String.valueOf(news.getModifyTime()));
                preparedStatement.setString(12,news.getEntryWay());
                preparedStatement.setString(13,news.getAdoptType());
                preparedStatement.setString(14,news.getInfoType());
                preparedStatement.setString(15,news.getDataInfoState());
                preparedStatement.setString(16,news.getDataInfoOperator());
                preparedStatement.setString(17, String.valueOf(news.getDataInfoTime()));
                preparedStatement.setString(18, String.valueOf(news.getCrawlTime()));
                preparedStatement.setString(19,news.getBody());
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void insertOverallMessage() {

        String sql = " INSERT INTO t_overall VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?) ";
        List<Overall> overallList= fileUtil.getOverallFile();
        PreparedStatement preparedStatement= null;
        try {
            for(Overall overall:overallList){
                preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,overall.getId());
                preparedStatement.setString(2,overall.getInfectSource());
                preparedStatement.setString(3,overall.getPassWay());
                preparedStatement.setString(4,overall.getDailyPic());
                preparedStatement.setString(5,overall.getDailyPics());
                preparedStatement.setString(6,overall.getSummary());
                preparedStatement.setInt(7,overall.getCountRemark());
                preparedStatement.setInt(8,overall.getCurrentConfirmedCount());
                preparedStatement.setInt(9,overall.getConfirmedCount());
                preparedStatement.setInt(10,overall.getSuspectedCount());
                preparedStatement.setInt(11,overall.getCuredCount());
                preparedStatement.setInt(12,overall.getDeadCount());
                preparedStatement.setInt(13,overall.getSeriousCount());
                preparedStatement.setInt(14,overall.getSuspectedIncr());
                preparedStatement.setInt(15,overall.getCurrentConfirmedIncr());
                preparedStatement.setInt(16,overall.getConfirmedIncr());
                preparedStatement.setInt(17,overall.getCuredIncr());
                preparedStatement.setInt(18,overall.getDeadIncr());
                preparedStatement.setInt(19,overall.getSeriousIncr());
                preparedStatement.setString(20,overall.getVirus());
                preparedStatement.setString(21,overall.getRemark1());
                preparedStatement.setString(22,overall.getRemark2());
                preparedStatement.setString(23,overall.getRemark3());
                preparedStatement.setString(24,overall.getRemark4());
                preparedStatement.setString(25,overall.getRemark5());
                preparedStatement.setString(26,overall.getNote1());
                preparedStatement.setString(27,overall.getNote2());
                preparedStatement.setString(28,overall.getNote3());
                preparedStatement.setString(29,overall.getGeneralRemark());
                preparedStatement.setString(30,overall.getAbroadRemark());
                preparedStatement.setString(31,overall.getMarquee());
                preparedStatement.setString(32,overall.getQuanguoTrendChart());
                preparedStatement.setString(33,overall.getHbFeiHbTrendChart());
                preparedStatement.setString(34, String.valueOf(overall.getUpdateTime()));
                preparedStatement.executeUpdate();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }

    }

    @Override
    public void insertRumorsMessage() {
        String sql = " INSERT INTO t_rumors VALUES (?,?,?,?,?,?,?,?,?) ";
        List<Rumors> rumorsList = fileUtil.getRumorsFile();
        try {
            for(Rumors rumor :rumorsList){
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,rumor.getId());
                preparedStatement.setString(2,rumor.getBody());
                preparedStatement.setInt(3,rumor.getAloneId());
                preparedStatement.setString(4,rumor.getMainSummary());
                preparedStatement.setInt(5,rumor.getRumorType());
                preparedStatement.setString(6,rumor.getSourceUrl());
                preparedStatement.setString(7,rumor.getSourceUrl());
                preparedStatement.setString(8,rumor.getTitle());
                preparedStatement.setString(9, String.valueOf(rumor.getCrawlTime()));
                preparedStatement.executeUpdate();
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }finally {

        }

    }


//
//    @Override
//    public void insertAreaMessage() {
//        String sql = " \n" +
//                "load data infile 'E:\\\\study\\\\maven\\\\csv\\\\DXYArea.csv' \n" +
//                "into table `t_area`\n" +
//                "fields terminated by ',' optionally enclosed by '\"' escaped by '\"' \n" +
//                "lines terminated by '\\n' ";
//        PreparedStatement preparedStatement = null;
//        try {
//            preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }finally {
//            Dbutil.close(preparedStatement);
//        }
//    }
//
//    @Override
//    public void insertNewsMessage() throws SQLException{
//        String sql = " load data infile 'E:\\\\study\\\\maven\\\\csv\\\\DXYNews.csv' \n" +
//                "into table `t_news`\n" +
//                "fields terminated by ',' optionally enclosed by '\"' escaped by '\"' \n" +
//                "lines terminated by '\\n'\n ";
//        PreparedStatement preparedStatement = null;
//        preparedStatement = connection.prepareStatement(sql);
//        preparedStatement.executeUpdate();
//    }
//
//    @Override
//    public void insertOverallMessage() {
//        String sql = "load data infile 'E:\\\\study\\\\maven\\\\csv\\\\DXYOverall.csv' \n" +
//                "into table `t_rumors`\n" +
//                "fields terminated by ',' optionally enclosed by '\"' escaped by '\"' \n" +
//                "lines terminated by '\\n'";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
//
//    @Override
//    public void insertRumorsMessage() {
//        String sql = " load data infile 'E:\\\\study\\\\maven\\\\csv\\\\DXYRumors.csv' \n" +
//                "into table `t_overall`\n" +
//                "fields terminated by ',' optionally enclosed by '\"' escaped by '\"' \n" +
//                "lines terminated by '\\n' ";
//        try {
//            PreparedStatement preparedStatement = connection.prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }
//
//    }
}
