package com.yufei.query;

import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by pc on 2016-12-09.
 */
public class TestSolrQuery extends SolrQuery {
    
    private int id;
    private String title;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuery(){
        StringBuffer sb = new StringBuffer();
        sb.append("title:" + title);
        if(id != 0){
            sb.append(" AND id:" + id);
        }
        super.setQuery(sb.toString());
    }
}
