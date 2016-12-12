package com.yufei.solr;

import com.yufei.model.Test;
import com.yufei.query.TestSolrQuery;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.apache.solr.common.SolrDocument;
import org.apache.solr.common.SolrDocumentList;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by pc on 2016-12-09.
 */
public class TestSolr {

    public List<Test> getData() {
        List<Test> list = null;
        try {
            String solrServerUrl = "http://127.0.0.1:8983/solr";
            HttpSolrClient client = new HttpSolrClient.Builder(solrServerUrl).build();
            TestSolrQuery query = new TestSolrQuery();
            query.setId(1);
            query.addSort("id", SolrQuery.ORDER.desc);
            query.setQuery();
            query.setRows(Integer.MAX_VALUE);
            SolrDocumentList results = null;
            QueryResponse response = client.query("test", query);
            if(response != null){
                results = response.getResults();
            }
            if (results != null && results.size() > 0) {
                list = new ArrayList<Test>();
                for(int i = 0;i<results.size();i++){
                    SolrDocument doc = results.get(i);
                    Test item = new Test();
                    item.setId(Integer.valueOf((String) doc.getFieldValue("id")));
                    item.setContent((String) doc.getFieldValue("content"));
                    item.setCreateTime((Date) doc.getFieldValue("createTime"));
                    list.add(item);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static void main(String[] args) {
        List<Test> list = new TestSolr().getData();
        System.out.println(list);
        System.out.println(10);
    }

}
