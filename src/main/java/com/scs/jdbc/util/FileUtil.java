package com.scs.jdbc.util;

import com.scs.jdbc.entity.Area;
import com.scs.jdbc.entity.News;
import com.scs.jdbc.entity.Overall;
import com.scs.jdbc.entity.Rumors;

import java.io.*;
import java.sql.Timestamp;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Jack
 * @Date: 2020/2/18 16:40
 * @Description:
 */
public class FileUtil {
    private static SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
    private static SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private static FileUtil fileUtil = null;
    public static void main(String[] args) {
//        List<Area> areaList = new FileUtil().getAreaFile();
//        for(Area area:areaList){
//            System.out.println(area.getUpdateTime());
//        }

//        List<News> newsList = new FileUtil().getNewsFile();
//        System.out.println(newsList.size());
//        for(News news:newsList){
//            System.out.println(news.getCrawlTime());
//        }

//        List<Overall> overallList = new FileUtil().getOverallFile();
//        for(Overall overall:overallList){
//            System.out.println(overall.getUpdateTime());
//        }

//        List<Rumors> rumorsList =new FileUtil().getRumorsFile();
//        for (Rumors rumors : rumorsList) {
//            System.out.println(rumors.getCrawlTime());
//        }

        //使用迭代器进行遍历
//        Iterator iterator = areaList.iterator();
//        while (iterator.hasNext()){
//            System.out.println(iterator.next());
//        }
//        getAreaFile();
    }

//单例模式，双重加锁
    public static FileUtil getInstance(){
        if(fileUtil==null){
            synchronized (FileUtil.class){
                if(fileUtil==null){
                    fileUtil = new FileUtil();
                }
            }
        }
        return fileUtil;
    }

    /**
     * 获取DXYArea.csv文件的数据
     *
     * @return list
     */
    public  List<Area> getAreaFile() {
        List<Area> areaList = new ArrayList<>();
        String path = "E:\\study\\maven\\csv\\DXYArea.csv";
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                Area area = new Area();
                String[] content = line.split(",");
                area.setProvinceName(content[0]);
                area.setProvinceEnglishName(content[1]);
                area.setProvinceZipCode(content[2]);
                area.setCityName(content[3]);
                area.setCityEnglishName(content[4]);
                area.setCityZipCode(content[5]);
                if (content[6].matches("^[0-9]*$") && !"".equals(content[6])) {
                    area.setProvinceConfirmedCount(Integer.valueOf(content[6]));
                }else{
                    area.setProvinceConfirmedCount(0);
                }
                if (content[7].matches("^[0-9]*$") && !"".equals(content[7])) {
                    area.setProvinceSuspectedCount(Integer.valueOf(content[7]));
                }else{
                    area.setProvinceSuspectedCount(0);
                }
                if (content[8].matches("^[0-9]*$") && !"".equals(content[8])) {
                    area.setProvinceCuredCount(Integer.valueOf(content[8]));
                }else{
                    area.setProvinceCuredCount(0);
                }


                if (content[8].matches("^[0-9]*$") && !"".equals(content[8])) {
                    area.setProvinceDeadCount(Integer.valueOf(content[9]));
                }else{
                    area.setProvinceDeadCount(0);
                }


                if (content[10].matches("^[0-9]*$") && !"".equals(content[10])) {
                    area.setCityConfirmedCount(Integer.valueOf(content[10]));
                }else{
                    area.setCityConfirmedCount(0);
                }


                if (content[11].matches("^[0-9]*$") && !"".equals(content[11])) {
                    area.setCitySuspectedCount(Integer.valueOf(content[11]));
                }else{
                    area.setCitySuspectedCount(0);
                }


                if (content[12].matches("^[0-9]*$") && !"".equals(content[12])) {
                    area.setCityCuredCount(Integer.valueOf(content[12]));
                }else{
                    area.setCityCuredCount(0);
                }


                if (content[13].matches("^[0-9]*$") && !"".equals(content[13])) {
                    area.setCityDeadCount(Integer.valueOf(content[13]));
                }else{
                    area.setCityDeadCount(0);
                }
                try {
                    area.setUpdateTime(new Timestamp(format.parse(content[14]).getTime()) );
                } catch (ParseException e) {
                    System.out.println("area表日期格式转换错误");
                }
                areaList.add(area);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return areaList;
    }

    /**
     * 获取DXYNews.csv文件的数据
     *
     * @return List
     */
    public  List<News> getNewsFile() {
        List<News> newsList = new ArrayList<>();
        String path = "E:\\study\\maven\\csv\\DXYNews.csv";
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] content = line.split(",");

                    if (content.length == 19) {
                        News news = new News();
                        news.setId(content[0]);
                        if (content[1].matches("^[0-9]*$") && !"".equals(content[1])) {
                            news.setAloneId(Integer.valueOf(content[1]));
                        }else{
                            news.setAloneId(0);
                        }
                        news.setTitle(content[3]);
                        news.setSummary(content[4]);
                        news.setInfoSource(content[5]);
                        news.setSourceUrl(content[6]);
                        if (content[7].matches("^[0-9]*$") && !"".equals(content[7])) {
                            news.setProvinceId(Integer.valueOf(content[7]));
                        }else{
                            news.setProvinceId(0);
                        }
                        news.setProvinceName(content[8]);
                        news.setEntryWay(content[11]);
                        news.setAdoptType(content[12]);
                        news.setInfoType(content[13]);
                        news.setDataInfoState(content[14]);
                        news.setDataInfoOperator(content[15]);
                        news.setBody(content[18]);
                            news.setPubDate(content[2]);
                            news.setCreateTime(content[9]);
                            news.setModifyTime(content[10]);
                            news.setDataInfoTime(content[16]);
                            news.setCrawlTime(content[17]);
                        newsList.add(news);

                }


            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return newsList;
    }

    /**
     * 获取DXYOverall.csv文件的数据
     *
     * @return List
     */
    public  List<Overall> getOverallFile() {
        List<Overall> overallList = new ArrayList<>();
        String path = "E:\\study\\maven\\csv\\DXYOverall.csv";
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] content = line.split(",");
                if (content.length == 34) {
                    Overall overall = new Overall();
                    overall.setId(content[0]);
                    overall.setInfectSource(content[1]);
                    overall.setPassWay(content[2]);
                    overall.setDailyPic(content[3]);
                    overall.setDailyPics(content[4]);
                    overall.setSummary(content[5]);
                    if (content[6].matches("^[0-9]*$") && !"".equals(content[6])) {
                        overall.setCountRemark(Integer.valueOf(content[6]));
                    }else{
                        overall.setCountRemark(0);
                    }

                    if (content[7].matches("^[0-9]*$") && !"".equals(content[7])) {
                        overall.setCurrentConfirmedCount(Integer.valueOf(content[7]));
                    }else{
                        overall.setCurrentConfirmedCount(0);
                    }

                    if (content[8].matches("^[0-9]*$") && !"".equals(content[8])) {
                        overall.setConfirmedCount(Integer.valueOf(content[8]));
                    }else{
                        overall.setConfirmedCount(0);
                    }

                    if (content[9].matches("^[0-9]*$") && !"".equals(content[9])) {
                        overall.setSuspectedCount(Integer.valueOf(content[9]));
                    }else{
                        overall.setSuspectedCount(0);
                    }

                    if (content[10].matches("^[0-9]*$") && !"".equals(content[10])) {
                        overall.setCuredCount(Integer.valueOf(content[10]));
                    }else{
                        overall.setCuredCount(0);
                    }

                    if (content[11].matches("^[0-9]*$") && !"".equals(content[11])) {
                        overall.setDeadCount(Integer.valueOf(content[11]));
                    }else{
                        overall.setDeadCount(0);
                    }

                    if (content[12].matches("^[0-9]*$") && !"".equals(content[12])) {
                        overall.setSeriousCount(Integer.valueOf(content[12]));
                    }else{
                        overall.setSeriousCount(0);
                    }

                    if (content[13].matches("^[0-9]*$") && !"".equals(content[13])) {
                        overall.setSuspectedIncr(Integer.valueOf(content[13]));
                    }else{
                        overall.setSuspectedIncr(0);
                    }

                    if (content[14].matches("^[0-9]*$") && !"".equals(content[14])) {
                        overall.setCurrentConfirmedIncr(Integer.valueOf(content[14]));
                    }else{
                        overall.setCurrentConfirmedIncr(0);
                    }

                    if (content[15].matches("^[0-9]*$") && !"".equals(content[15])) {
                        overall.setConfirmedIncr(Integer.valueOf(content[15]));
                    }else{
                        overall.setConfirmedIncr(0);
                    }

                    if (content[16].matches("^[0-9]*$") && !"".equals(content[16])) {
                        overall.setCuredIncr(Integer.valueOf(content[16]));
                    }else{
                        overall.setCuredIncr(0);
                    }

                    if (content[17].matches("^[0-9]*$") && !"".equals(content[17])) {
                        overall.setDeadIncr(Integer.valueOf(content[17]));
                    }else{
                        overall.setDeadIncr(0);
                    }

                    if (content[18].matches("^[0-9]*$") && !"".equals(content[18])) {
                        overall.setSeriousIncr(Integer.valueOf(content[18]));
                    }else{
                        overall.setSeriousIncr(0);
                    }

                    overall.setVirus(content[19]);
                    overall.setRemark1(content[20]);
                    overall.setRemark2(content[21]);
                    overall.setRemark3(content[22]);
                    overall.setRemark4(content[23]);
                    overall.setRemark5(content[24]);
                    overall.setNote1(content[25]);
                    overall.setNote2(content[26]);
                    overall.setNote3(content[27]);
                    overall.setGeneralRemark(content[28]);
                    overall.setAbroadRemark(content[29]);
                    overall.setMarquee(content[30]);
                    overall.setQuanguoTrendChart(content[31]);
                    overall.setHbFeiHbTrendChart(content[32]);
                    try {
                        overall.setUpdateTime(new Timestamp(format.parse(content[33]).getTime()));
                    } catch (ParseException e) {
                        System.out.println("日期格式转换出错");
                    }
                    overallList.add(overall);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return overallList;
    }

    /**
     * 获取DXYRumors.csv文件的数据
     *
     * @return List
     */
    public  List<Rumors> getRumorsFile() {
        List<Rumors> rumorsList = new ArrayList<>();
        String path = "E:\\study\\maven\\csv\\DXYRumors.csv";
        String line = "";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(path));
            while ((line = bufferedReader.readLine()) != null) {
                String[] content = line.split(",");
                if (content.length == 9) {
                    Rumors rumors = new Rumors();
                    rumors.setId(content[0]);
                    rumors.setBody(content[1]);
                    if (content[2].matches("^[0-9]*$") && !"".equals(content[2])) {
                        rumors.setAloneId(Integer.valueOf(content[2]));
                    }else{
                        rumors.setAloneId(0);
                    }
                    rumors.setMainSummary(content[3]);
                    if (content[4].matches("^[0-9]*$") && !"".equals(content[4])) {
                        rumors.setRumorType(Integer.valueOf(content[4]));
                    }else{
                        rumors.setRumorType(0);
                    }
                    rumors.setSourceUrl(content[5]);
                    rumors.setSummary(content[6]);
                    rumors.setTitle(content[7]);
                    try {
                        rumors.setCrawlTime(new Timestamp(format.parse(content[8]).getTime()));
                    } catch (ParseException e) {
                        System.out.println("时间转换错误");
                    }
                    rumorsList.add(rumors);
                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return rumorsList;
    }


}
