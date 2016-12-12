package com.yufei.model;

import java.util.Date;

/**
 * Created by pc on 2016-12-09.
 */
public class Test {

    private int id;
    private String content;
    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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
                ", content='" + content + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
