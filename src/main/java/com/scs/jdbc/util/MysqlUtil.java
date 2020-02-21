package com.scs.jdbc.util;

import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 * @author Jack
 * @Date: 2020/2/17 16:39
 * @Description:
 */
public class MysqlUtil {

    /**
     * 创建数据库
     */
//    public static void getCreateLibrary(){
//        String sql = " CREATE DATABASE epidemic ";
//        System.out.println(sql);
//        try {
//            PreparedStatement preparedStatement = Dbutil.getConnection().prepareStatement(sql);
//            preparedStatement.executeUpdate();
//        } catch (SQLException e) {
//            System.out.println("数据库创建失败");
//        }
//    }

    /**
     * 创建地区表
     */
    public  void getArea(){
        String sql = "CREATE TABLE `t_area`  (\n" +
                "  `provinceName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '省份名称',\n" +
                "  `provinceEnglishName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '省份英文名称',\n" +
                "  `province_zipCode` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '省份编码',\n" +
                "  `cityName` varchar(20) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '城市名称',\n" +
                "  `cityEnglishName` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '城市英文名称',\n" +
                "  `city_zipCode` varchar(80) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '城市编码',\n" +
                "  `province_confirmedCount` int(10) NULL DEFAULT NULL COMMENT '省份确诊人数',\n" +
                "  `province_suspectedCount` int(10) NULL DEFAULT NULL COMMENT '省份疑似患病人数',\n" +
                "  `province_curedCount` int(10) NULL DEFAULT NULL COMMENT '省份治愈人数',\n" +
                "  `province_deadCount` int(10) NULL DEFAULT NULL COMMENT '省份死亡人数',\n" +
                "  `city_confirmedCount` int(10) NULL DEFAULT NULL COMMENT '城市确诊人数',\n" +
                "  `city_suspectedCount` int(10) NULL DEFAULT NULL COMMENT '城市疑似患病人数',\n" +
                "  `city_curedCount` int(10) NULL DEFAULT NULL COMMENT '城市治愈人数',\n" +
                "  `city_deadCount` int(12) NULL DEFAULT NULL COMMENT '城市死亡人数',\n" +
                "  `updateTime` timestamp(0) NOT NULL DEFAULT CURRENT_TIMESTAMP(0) ON UPDATE CURRENT_TIMESTAMP(0) COMMENT '更新时间'\n" +
                ") ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;";
        try {
            PreparedStatement preparedStatement = Dbutil.getConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("数据库创建失败");
        }
    }

    /**
     * 创建新闻表
     */
    public  void getNews(){
        String sql = "CREATE TABLE `t_news`  (\n" +
                "  `_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,\n" +
                "  `id` int(10) NOT NULL COMMENT '主键',\n" +
                "  `pubDate` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '发表日期',\n" +
                "  `title` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL COMMENT '文章标题',\n" +
                "  `summary` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '主要内容',\n" +
                "  `infoSource` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '发表来源',\n" +
                "  `sourceUrl` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '网站链接',\n" +
                "  `provinceId` int(10) NULL DEFAULT NULL COMMENT '省份id',\n" +
                "  `provinceName` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '省份名称',\n" +
                "  `createTime` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '创建时间',\n" +
                "  `modifyTime` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '修改时间',\n" +
                "  `entryWay` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `adoptType` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `infoType` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `dataInfoState` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `dataInfoOperator` varchar(10) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `dataInfoTime` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `crawlTime` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `body` text CHARACTER SET utf8 COLLATE utf8_bin NULL\n" +
                ") ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;";
        try {
            PreparedStatement preparedStatement = Dbutil.getConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("数据库创建失败");
        }
    }

    /**
     * 创建overall表
     */
    public  void getOverall(){
        String sql = "CREATE TABLE `t_overall`  (\n" +
                "  `_id` varchar(30) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,\n" +
                "  `infectSource` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '感染因素',\n" +
                "  `passWay` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '感染途径',\n" +
                "  `dailyPic` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '日常照片',\n" +
                "  `dailyPics` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '日常照片',\n" +
                "  `summary` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '主要内容',\n" +
                "  `countRemark` int(10) NULL DEFAULT NULL COMMENT '谈论次数',\n" +
                "  `currentConfirmedCount` int(10) NULL DEFAULT NULL COMMENT '当前确诊人数',\n" +
                "  `confirmedCount` int(10) NULL DEFAULT NULL COMMENT '确诊人数',\n" +
                "  `suspectedCount` int(10) NULL DEFAULT NULL COMMENT '疑似患病人数',\n" +
                "  `curedCount` int(10) NULL DEFAULT NULL COMMENT '治愈人数',\n" +
                "  `deadCount` int(10) NULL DEFAULT NULL COMMENT '死亡人数',\n" +
                "  `seriousCount` int(10) NULL DEFAULT NULL COMMENT '严重人数',\n" +
                "  `suspectedIncr` int(10) NULL DEFAULT NULL COMMENT '疑似患病人数增长量',\n" +
                "  `currentConfirmedIncr` int(10) NULL DEFAULT NULL COMMENT '当前确诊人数增长量',\n" +
                "  `confirmedIncr` int(10) NULL DEFAULT NULL COMMENT '确诊人数增长量',\n" +
                "  `curedIncr` int(10) NULL DEFAULT NULL COMMENT '治愈人数增长量',\n" +
                "  `deadIncr` int(10) NULL DEFAULT NULL COMMENT '死亡人数增长量',\n" +
                "  `seriousIncr` int(10) NULL DEFAULT NULL COMMENT '严重人数增长量',\n" +
                "  `virus` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '病毒',\n" +
                "  `remark1` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '易感人群',\n" +
                "  `remark2` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '潜伏期',\n" +
                "  `remark3` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '宿主',\n" +
                "  `remark4` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `remark5` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `note1` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '病毒英文名',\n" +
                "  `note2` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '传播源',\n" +
                "  `note3` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '传播途径',\n" +
                "  `generalRemark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '普遍标记',\n" +
                "  `abroadRemark` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL,\n" +
                "  `marquee` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '物资',\n" +
                "  `quanguoTrendChart` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '全国走势图',\n" +
                "  `hbFeiHbTrendChart` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '湖北数据走势图',\n" +
                "  `updateTime` date NULL DEFAULT NULL COMMENT '更新时间',\n" +
                "  PRIMARY KEY (`_id`) USING BTREE\n" +
                ") ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;";
        try {
            PreparedStatement preparedStatement = Dbutil.getConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("overall表创建失败");
        }
    }

    /**
     * 创建谣言表
     */
    public  void getRumors(){
        String sql = "CREATE TABLE `t_rumors`  (\n" +
                "  `_id` varchar(50) CHARACTER SET utf8 COLLATE utf8_bin NOT NULL,\n" +
                "  `body` text CHARACTER SET utf8 COLLATE utf8_bin NULL COMMENT '主要内容',\n" +
                "  `id` int(10) NOT NULL,\n" +
                "  `mainSummary` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '回应',\n" +
                "  `rumorType` int(10) NULL DEFAULT NULL COMMENT '谣言类型',\n" +
                "  `sourceUrl` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '谣言链接',\n" +
                "  `summary` varchar(255) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '摘要信息',\n" +
                "  `title` varchar(100) CHARACTER SET utf8 COLLATE utf8_bin NULL DEFAULT NULL COMMENT '谣言标题',\n" +
                "  `crawlTime` timestamp(0) NULL DEFAULT NULL COMMENT '更新时间'\n" +
                ") ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_bin ROW_FORMAT = Dynamic;";
        try {
            PreparedStatement preparedStatement = Dbutil.getConnection().prepareStatement(sql);
            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            System.out.println("rumors表创建失败");
        }
    }
}
