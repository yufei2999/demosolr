package com.yufei.solr;

import com.yufei.model.Test;
import com.yufei.query.TestSolrQuery;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by pc on 2016-12-09.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:*.xml")
public class TestSolr {

    @org.junit.Test
    public void getData() {
        try {
            String solrServerUrl = "http://127.0.0.1:8983/solr";
            HttpSolrClient client = new HttpSolrClient.Builder(solrServerUrl).build();
            TestSolrQuery query = new TestSolrQuery();
            //query.setId(3);
            query.setTitle("人民");
            query.addSort("createTime", SolrQuery.ORDER.desc);
            query.setQuery();
            query.setRows(Integer.MAX_VALUE);
            QueryResponse response = client.query("test", query);
            List<Test> list = response.getBeans(Test.class);
            System.out.println(list);
            /*
            SolrDocumentList results = null;
            if(response != null){
                results = response.getResults();
            }
            if (results != null && results.size() > 0) {
                list = new ArrayList<Test>();
                for(int i = 0;i<results.size();i++){
                    SolrDocument doc = results.get(i);
                    Test item = new Test();
                    item.setId(Integer.valueOf((String) doc.getFieldValue("id")));
                    item.setTitle((String) doc.getFieldValue("title"));
                    item.setContent((String) doc.getFieldValue("content"));
                    item.setCreateTime((Date) doc.getFieldValue("createTime"));
                    list.add(item);
                }
            }*/
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
