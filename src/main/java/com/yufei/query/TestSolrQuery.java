package com.yufei.query;

import org.apache.solr.client.solrj.SolrQuery;

/**
 * Created by pc on 2016-12-09.
 */
public class TestSolrQuery extends SolrQuery {
    
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setQuery(){
        StringBuffer sb = new StringBuffer();
        sb.append("id:" + id);
        /*if(StringUtils.isNotBlank(content)){
            para.append(" AND content:" + content);
        }*/
        super.setQuery(sb.toString());
    }
}
