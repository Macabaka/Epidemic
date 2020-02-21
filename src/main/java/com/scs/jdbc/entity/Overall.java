package com.scs.jdbc.entity;
import java.sql.Timestamp;

/**
 * @author Jack
 * @Date: 2020/2/18 20:09
 * @Description:
 */
public class Overall {
    private String Id;
    private String infectSource;
    private String passWay;
    private String dailyPic;
    private String dailyPics;
    private String summary;
    private Integer  countRemark;
    private Integer currentConfirmedCount;
    private Integer confirmedCount;
    private Integer suspectedCount;
    private Integer curedCount;
    private Integer deadCount;
    private Integer seriousCount;
    private Integer suspectedIncr;
    private Integer currentConfirmedIncr;
    private Integer confirmedIncr;
    private Integer curedIncr;
    private Integer deadIncr;
    private Integer seriousIncr;
    private String virus;
    private String remark1;
    private String remark2;
    private String remark3;
    private String remark4;
    private String remark5;
    private String note1;
    private String note2;
    private String note3;
    private String generalRemark;
    private String abroadRemark;
    private String marquee;
    private String quanguoTrendChart;
    private String hbFeiHbTrendChart;
    private Timestamp updateTime;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getInfectSource() {
        return infectSource;
    }

    public void setInfectSource(String infectSource) {
        this.infectSource = infectSource;
    }

    public String getPassWay() {
        return passWay;
    }

    public void setPassWay(String passWay) {
        this.passWay = passWay;
    }

    public String getDailyPic() {
        return dailyPic;
    }

    public void setDailyPic(String dailyPic) {
        this.dailyPic = dailyPic;
    }

    public String getDailyPics() {
        return dailyPics;
    }

    public void setDailyPics(String dailyPics) {
        this.dailyPics = dailyPics;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Integer getCountRemark() {
        return countRemark;
    }

    public void setCountRemark(Integer countRemark) {
        this.countRemark = countRemark;
    }

    public Integer getCurrentConfirmedCount() {
        return currentConfirmedCount;
    }

    public void setCurrentConfirmedCount(Integer currentConfirmedCount) {
        this.currentConfirmedCount = currentConfirmedCount;
    }

    public Integer getConfirmedCount() {
        return confirmedCount;
    }

    public void setConfirmedCount(Integer confirmedCount) {
        this.confirmedCount = confirmedCount;
    }

    public Integer getSuspectedCount() {
        return suspectedCount;
    }

    public void setSuspectedCount(Integer suspectedCount) {
        this.suspectedCount = suspectedCount;
    }

    public Integer getCuredCount() {
        return curedCount;
    }

    public void setCuredCount(Integer curedCount) {
        this.curedCount = curedCount;
    }

    public Integer getDeadCount() {
        return deadCount;
    }

    public void setDeadCount(Integer deadCount) {
        this.deadCount = deadCount;
    }

    public Integer getSeriousCount() {
        return seriousCount;
    }

    public void setSeriousCount(Integer seriousCount) {
        this.seriousCount = seriousCount;
    }

    public Integer getSuspectedIncr() {
        return suspectedIncr;
    }

    public void setSuspectedIncr(Integer suspectedIncr) {
        this.suspectedIncr = suspectedIncr;
    }

    public Integer getCurrentConfirmedIncr() {
        return currentConfirmedIncr;
    }

    public void setCurrentConfirmedIncr(Integer currentConfirmedIncr) {
        this.currentConfirmedIncr = currentConfirmedIncr;
    }

    public Integer getConfirmedIncr() {
        return confirmedIncr;
    }

    public void setConfirmedIncr(Integer confirmedIncr) {
        this.confirmedIncr = confirmedIncr;
    }

    public Integer getCuredIncr() {
        return curedIncr;
    }

    public void setCuredIncr(Integer curedIncr) {
        this.curedIncr = curedIncr;
    }

    public Integer getDeadIncr() {
        return deadIncr;
    }

    public void setDeadIncr(Integer deadIncr) {
        this.deadIncr = deadIncr;
    }

    public Integer getSeriousIncr() {
        return seriousIncr;
    }

    public void setSeriousIncr(Integer seriousIncr) {
        this.seriousIncr = seriousIncr;
    }

    public String getVirus() {
        return virus;
    }

    public void setVirus(String virus) {
        this.virus = virus;
    }

    public String getRemark1() {
        return remark1;
    }

    public void setRemark1(String remark1) {
        this.remark1 = remark1;
    }

    public String getRemark2() {
        return remark2;
    }

    public void setRemark2(String remark2) {
        this.remark2 = remark2;
    }

    public String getRemark3() {
        return remark3;
    }

    public void setRemark3(String remark3) {
        this.remark3 = remark3;
    }

    public String getRemark4() {
        return remark4;
    }

    public void setRemark4(String remark4) {
        this.remark4 = remark4;
    }

    public String getRemark5() {
        return remark5;
    }

    public void setRemark5(String remark5) {
        this.remark5 = remark5;
    }

    public String getNote1() {
        return note1;
    }

    public void setNote1(String note1) {
        this.note1 = note1;
    }

    public String getNote2() {
        return note2;
    }

    public void setNote2(String note2) {
        this.note2 = note2;
    }

    public String getNote3() {
        return note3;
    }

    public void setNote3(String note3) {
        this.note3 = note3;
    }

    public String getGeneralRemark() {
        return generalRemark;
    }

    public void setGeneralRemark(String generalRemark) {
        this.generalRemark = generalRemark;
    }

    public String getAbroadRemark() {
        return abroadRemark;
    }

    public void setAbroadRemark(String abroadRemark) {
        this.abroadRemark = abroadRemark;
    }

    public String getMarquee() {
        return marquee;
    }

    public void setMarquee(String marquee) {
        this.marquee = marquee;
    }

    public String getQuanguoTrendChart() {
        return quanguoTrendChart;
    }

    public void setQuanguoTrendChart(String quanguoTrendChart) {
        this.quanguoTrendChart = quanguoTrendChart;
    }

    public String getHbFeiHbTrendChart() {
        return hbFeiHbTrendChart;
    }

    public void setHbFeiHbTrendChart(String hbFeiHbTrendChart) {
        this.hbFeiHbTrendChart = hbFeiHbTrendChart;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
