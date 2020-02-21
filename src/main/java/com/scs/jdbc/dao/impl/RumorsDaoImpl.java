package com.scs.jdbc.dao.impl;

import com.scs.jdbc.dao.RumorsDao;
import com.scs.jdbc.entity.Rumors;
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
public class RumorsDaoImpl implements RumorsDao {
    private static Connection connection = Dbutil.getConnection();

    public static void main(String[] args) {
        try {
            new RumorsDaoImpl().getAllRumors();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public List<Rumors> getAllRumors() throws SQLException {
        String sql = " SELECT * FROM t_rumors ";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);
        ResultSet resultSet =  preparedStatement.executeQuery();
        List<Rumors> rumorsList = new ArrayList<>();
        while (resultSet.next()){
            Rumors rumors = new Rumors();
            rumors.setId(resultSet.getString("_id"));
            rumors.setBody(resultSet.getString("body"));
            rumors.setAloneId(resultSet.getInt("id"));
            rumors.setMainSummary(resultSet.getString("mainSummary"));
            rumors.setRumorType(resultSet.getInt("rumorType"));
            rumors.setSourceUrl(resultSet.getString("sourceUrl"));
            rumors.setSummary(resultSet.getString("summary"));
            rumors.setTitle(resultSet.getString("title"));
            rumors.setCrawlTime(resultSet.getTimestamp("crawlTime"));
            rumorsList.add(rumors);
        }
        return rumorsList;
    }
}
