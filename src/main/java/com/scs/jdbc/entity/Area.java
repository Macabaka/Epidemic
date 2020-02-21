package com.scs.jdbc.entity;

import java.sql.Timestamp;

/**
 * @author Jack
 * @Date: 2020/2/18 20:08
 * @Description:
 */
public class Area {

    private String provinceName;
    private String provinceEnglishName;
    private String provinceZipCode;
    private String cityName;
    private String cityEnglishName;
    private String cityZipCode;
    private Integer provinceConfirmedCount;
    private Integer provinceSuspectedCount;
    private Integer provinceCuredCount;
    private Integer provinceDeadCount;
    private Integer cityConfirmedCount;
    private Integer citySuspectedCount;
    private Integer cityCuredCount;
    private Integer cityDeadCount;
    private Timestamp updateTime;

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
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

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCityEnglishName() {
        return cityEnglishName;
    }

    public void setCityEnglishName(String cityEnglishName) {
        this.cityEnglishName = cityEnglishName;
    }

    public String getCityZipCode() {
        return cityZipCode;
    }

    public void setCityZipCode(String cityZipCode) {
        this.cityZipCode = cityZipCode;
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

    public Integer getCityConfirmedCount() {
        return cityConfirmedCount;
    }

    public void setCityConfirmedCount(Integer cityConfirmedCount) {
        this.cityConfirmedCount = cityConfirmedCount;
    }

    public Integer getCitySuspectedCount() {
        return citySuspectedCount;
    }

    public void setCitySuspectedCount(Integer citySuspectedCount) {
        this.citySuspectedCount = citySuspectedCount;
    }

    public Integer getCityCuredCount() {
        return cityCuredCount;
    }

    public void setCityCuredCount(Integer cityCuredCount) {
        this.cityCuredCount = cityCuredCount;
    }

    public Integer getCityDeadCount() {
        return cityDeadCount;
    }

    public void setCityDeadCount(Integer cityDeadCount) {
        this.cityDeadCount = cityDeadCount;
    }

    public Timestamp getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Timestamp updateTime) {
        this.updateTime = updateTime;
    }
}
