package com.techatpark.scubebird.crawler.oracle;

import com.techatpark.scubebird.core.model.DaoProject;
import com.techatpark.scubebird.core.exception.ScubeException;
import com.techatpark.scubebird.core.model.Schema;
import org.junit.jupiter.api.Test;

import java.sql.SQLException;
import java.util.Arrays;

class OracleCrawlerTest {

    @Test
    void testGetSchema() throws ScubeException, SQLException {
        DaoProject daoProject = new DaoProject();

        daoProject.setName("SMITHJ");
        daoProject.setUrl("jdbc:oracle:thin:@localhost:51521:xe");
        daoProject.setUserName("SYSTEM");
        daoProject.setPassword("test123");
        daoProject.setSchemaName("SMITHJ");
        daoProject.setTablePatterns(Arrays.asList("actor","film_actor"));

        OracleCrawler oracleCrawler = new OracleCrawler(daoProject);
        Schema schema = oracleCrawler.getSchema();
        System.out.printf("schema");
    }
}
