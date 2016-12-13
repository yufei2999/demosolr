package com.yufei.model;

import org.apache.solr.client.solrj.beans.Field;

import java.util.Date;

/**
 * Created by pc on 2016-12-09.
 */
public class Test {

    @Field("id")
    private Integer id;
    @Field("title")
    private String title;
    @Field("content")
    private String content;
    @Field("createTime")
    private Date createTime;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
