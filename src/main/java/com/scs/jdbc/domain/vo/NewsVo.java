package com.scs.jdbc.domain.vo;

/**
 * @author Jack
 * @Date: 2020/2/21 12:34
 * @Description:
 */
public class NewsVo {
    private String provinceName;
    private String  Body;
    private String provinceEnglishName;
    private String provinceZipCode;
    private Integer provinceConfirmedCount;
    private Integer provinceSuspectedCount;
    private Integer provinceCuredCount;
    private Integer provinceDeadCount;
    private  String title;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getBody() {
        return Body;
    }

    public void setBody(String body) {
        Body = body;
    }

    public String getProvinceEnglishName() {
        return provinceEnglishName;
    }

    public void setProvinceEnglishName(String provinceEnglishName) {
        this.provinceEnglishName = provinceEnglishName;
    }

    public String getProvinceZipCode() {
        return provinceZipCode;
    }

    public void setProvinceZipCode(String provinceZipCode) {
        this.provinceZipCode = provinceZipCode;
    }

    public Integer getProvinceConfirmedCount() {
        return provinceConfirmedCount;
    }

    public void setProvinceConfirmedCount(Integer provinceConfirmedCount) {
        this.provinceConfirmedCount = provinceConfirmedCount;
    }

    public Integer getProvinceSuspectedCount() {
        return provinceSuspectedCount;
    }

    public void setProvinceSuspectedCount(Integer provinceSuspectedCount) {
        this.provinceSuspectedCount = provinceSuspectedCount;
    }

    public Integer getProvinceCuredCount() {
        return provinceCuredCount;
    }

    public void setProvinceCuredCount(Integer provinceCuredCount) {
        this.provinceCuredCount = provinceCuredCount;
    }

    public Integer getProvinceDeadCount() {
        return provinceDeadCount;
    }

    public void setProvinceDeadCount(Integer provinceDeadCount) {
        this.provinceDeadCount = provinceDeadCount;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
