package com.scs.jdbc.util;


import java.sql.*;
import java.util.Properties;

/**
 * @author Jack
 * @Date: 2020/2/17 14:58
 * @Description:
 */
public class Dbutil {
    private Dbutil(){}
    private static Properties properties;

    static{
        properties = ConfigUtil.getInstance();
        try {
            Class.forName(properties.getProperty("jdbc.driverClassName"));
        } catch (ClassNotFoundException e) {
            System.out.println("数据库驱动未找到");
        }
    }

    /**
     *获得数据库的连接
     * @return connection
     */
    public static Connection getConnection(){
        Connection connection =null;
        try {
            connection = DriverManager.getConnection(properties.getProperty("jdbc.url"),properties.getProperty("jdbc.username")
                    ,properties.getProperty("jdbc.password"));
        } catch (SQLException e) {
            System.out.println("数据库连接失败");
        }
        return connection;
    }

    /**
     * 关闭数据库连接connection
     * @param connection 连接池的对象
     */
    public static void close(Connection connection){
        if(connection!=null){
            try {
                connection.close();
            } catch (SQLException e) {
                System.out.println("数据库连接关闭失败");
            }
        }
    }

    /**
     * 关闭数据库preparedStatement
     * @param preparedStatement
     */
    public static void close(PreparedStatement preparedStatement){
        if(preparedStatement!=null){
            try {
                preparedStatement.close();
            } catch (SQLException e) {
                System.out.println("数据库statement关闭失败");
            }
        }
    }

    /**
     * 关闭数据库resultSet
     * @param resultSet
     */
    public static void close(ResultSet resultSet){
        if(resultSet!=null){
            try {
                resultSet.close();
            } catch (SQLException e) {
                System.out.println("数据库resultSet关闭失败");
            }
        }
    }

    /**
     * 同时关闭数据库connection，preparedStatement
     * @param connection
     * @param preparedStatement
     */
    public static void close(Connection connection,PreparedStatement preparedStatement){
        close(connection);
        close(preparedStatement);
    }

    /**
     * 同时关闭数据库connection，resultSet
     * @param connection
     * @param resultSet
     */
    public static void close(Connection connection,ResultSet resultSet){
        close(connection);
        close(resultSet);
    }

    /**
     * 同时关闭数据库preparedStatement，resultSet
     * @param preparedStatement
     * @param resultSet
     */
    public static void close(PreparedStatement preparedStatement,ResultSet resultSet){
        close(preparedStatement);
        close(resultSet);
    }

    public static void main(String[] args) {

    }
}
