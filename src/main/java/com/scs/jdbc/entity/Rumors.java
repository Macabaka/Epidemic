package com.scs.jdbc.entity;
import java.sql.Timestamp;
/**
 * @author Jack
 * @Date: 2020/2/18 20:09
 * @Description:
 */
public class Rumors {
//    自带id
    private String Id;
    private String  body;
    private Integer aloneId;
    private String mainSummary;
    private Integer rumorType;
    private String sourceUrl;
    private String summary;
    private String title;
    private Timestamp crawlTime;

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public Integer getAloneId() {
        return aloneId;
    }

    public void setAloneId(Integer aloneId) {
        this.aloneId = aloneId;
    }

    public String getMainSummary() {
        return mainSummary;
    }

    public void setMainSummary(String mainSummary) {
        this.mainSummary = mainSummary;
    }

    public Integer getRumorType() {
        return rumorType;
    }

    public void setRumorType(Integer rumorType) {
        this.rumorType = rumorType;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Timestamp getCrawlTime() {
        return crawlTime;
    }

    public void setCrawlTime(Timestamp crawlTime) {
        this.crawlTime = crawlTime;
    }
}
