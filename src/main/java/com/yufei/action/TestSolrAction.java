package com.yufei.action;

import com.yufei.model.Test;
import org.apache.solr.client.solrj.SolrQuery;
import org.apache.solr.client.solrj.impl.HttpSolrClient;
import org.apache.solr.client.solrj.response.QueryResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by pc on 2016-12-13.
 */
@Controller
@RequestMapping(value = "/test")
public class TestSolrAction {

    private static final Logger logger = LoggerFactory.getLogger(TestSolrAction.class);

    @Autowired
    private HttpSolrClient httpSolr;

    @RequestMapping(value = "/list")
    public String testList(Model model) {

        SolrQuery sq = new SolrQuery();
        //sq.set("q", "title:\"国家\"");
        sq.setQuery("title:人民");
        sq.setStart(0);
        sq.setRows(10);

        try {
            QueryResponse response = httpSolr.query("test", sq);
            List<Test> list = response.getBeans(Test.class);
            logger.info("总共查询到：" + response.getResults().getNumFound() + "条记录");
            logger.info("查询时间：" + response.getQTime() + "毫秒");
            logger.info(list.toString());
            model.addAttribute("list", list);
        } catch (Exception e) {
            logger.error("test list error");
        }
        return "test";
    }

}
