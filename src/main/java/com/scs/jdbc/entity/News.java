package com.scs.jdbc.entity;



/**
 * @author Jack
 * @Date: 2020/2/18 20:08
 * @Description:
 */
public class News {
//    自带id
    private String Id;
    private Integer aloneId;
    private String pubDate;
    private String title;
    private String summary;
    private String infoSource;
    private String sourceUrl;
    private Integer provinceId;
    private String provinceName;
    private String createTime;
    private String modifyTime;
    private String entryWay;
    private String adoptType;
    private String infoType;
    private String dataInfoState;
    private String dataInfoOperator;
    private String dataInfoTime;
    private String  crawlTime;
    private String body;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public Integer getAloneId() {
        return aloneId;
    }

    public void setAloneId(Integer aloneId) {
        this.aloneId = aloneId;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getInfoSource() {
        return infoSource;
    }

    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    public String getProvinceName() {
        return provinceName;
    }

    public void setProvinceName(String provinceName) {
        this.provinceName = provinceName;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getModifyTime() {
        return modifyTime;
    }

    public void setModifyTime(String modifyTime) {
        this.modifyTime = modifyTime;
    }

    public String getEntryWay() {
        return entryWay;
    }

    public void setEntryWay(String entryWay) {
        this.entryWay = entryWay;
    }

    public String getAdoptType() {
        return adoptType;
    }

    public void setAdoptType(String adoptType) {
        this.adoptType = adoptType;
    }

    public String getInfoType() {
        return infoType;
    }

    public void setInfoType(String infoType) {
        this.infoType = infoType;
    }

    public String getDataInfoState() {
        return dataInfoState;
    }

    public void setDataInfoState(String dataInfoState) {
        this.dataInfoState = dataInfoState;
    }

    public String getDataInfoOperator() {
        return dataInfoOperator;
    }

    public void setDataInfoOperator(String dataInfoOperator) {
        this.dataInfoOperator = dataInfoOperator;
    }

    public String getDataInfoTime() {
        return dataInfoTime;
    }

    public void setDataInfoTime(String dataInfoTime) {
        this.dataInfoTime = dataInfoTime;
    }

    public String getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(String crawlTime) {
        this.crawlTime = crawlTime;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
