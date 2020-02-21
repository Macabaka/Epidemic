package com.scs.jdbc.dao.impl;

import com.scs.jdbc.dao.OverallDao;
import com.scs.jdbc.entity.Overall;
import com.scs.jdbc.util.Dbutil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/21 15:00
 * @Description:
 */
public class OverallDaoImpl  implements OverallDao {
    private  static Connection connection = Dbutil.getConnection();

    public static void main(String[] args) {
        try {
            new OverallDaoImpl().getAllOverall();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    @Override
    public List<Overall> getAllOverall() throws SQLException {
        String sql = " SELECT * FROM t_overall ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet  resultSet = preparedStatement.executeQuery();
        List<Overall> overallList = new ArrayList<>();
        while(resultSet.next()){
            Overall overall = new Overall();
            overall.setId(resultSet.getString("_id"));
            overall.setInfectSource(resultSet.getString("infectSource"));
            overall.setPassWay(resultSet.getString("passWay"));
            overall.setDailyPic(resultSet.getString("dailyPic"));
            overall.setDailyPics(resultSet.getString("dailyPics"));
            overall.setSummary(resultSet.getString("summary"));
            overall.setCountRemark(resultSet.getInt("countRemark"));
            overall.setCurrentConfirmedCount(resultSet.getInt("currentConfirmedCount"));
            overall.setConfirmedCount(resultSet.getInt("confirmedCount"));
            overall.setSuspectedCount(resultSet.getInt("suspectedCount"));
            overall.setCuredCount(resultSet.getInt("curedCount"));
            overall.setDeadCount(resultSet.getInt("deadCount"));
            overall.setSeriousCount(resultSet.getInt("seriousCount"));
            overall.setSuspectedIncr(resultSet.getInt("suspectedIncr"));
            overall.setCurrentConfirmedIncr(resultSet.getInt("currentConfirmedIncr"));
            overall.setConfirmedIncr(resultSet.getInt("confirmedIncr"));
            overall.setCuredIncr(resultSet.getInt("curedIncr"));
            overall.setDeadIncr(resultSet.getInt("deadIncr"));
            overall.setSeriousIncr(resultSet.getInt("seriousIncr"));
            overall.setVirus(resultSet.getString("virus"));
            overall.setRemark1(resultSet.getString("remark1"));
            overall.setRemark2(resultSet.getString("remark2"));
            overall.setRemark3(resultSet.getString("remark3"));
            overall.setRemark4(resultSet.getString("remark4"));
            overall.setRemark5(resultSet.getString("remark5"));
            overall.setNote1(resultSet.getString("note1"));
            overall.setNote2(resultSet.getString("note2"));
            overall.setNote3(resultSet.getString("note3"));
            overall.setGeneralRemark(resultSet.getString("generalRemark"));
            overall.setAbroadRemark(resultSet.getString("abroadRemark"));
            overall.setMarquee(resultSet.getString("marquee"));
            overall.setQuanguoTrendChart(resultSet.getString("quanguoTrendChart"));
            overall.setHbFeiHbTrendChart(resultSet.getString("hbFeiHbTrendChart"));
            overall.setUpdateTime(resultSet.getTimestamp("updateTime"));
            overallList.add(overall);
        }
        return overallList;
    }
}
