package com.alibaba.druid.bvt.sql.mysql.select;

import com.alibaba.druid.sql.MysqlTest;
import com.alibaba.druid.sql.ast.SQLStatement;
import com.alibaba.druid.sql.ast.statement.SQLSelectStatement;
import com.alibaba.druid.sql.dialect.mysql.parser.MySqlStatementParser;

import java.util.List;

public class MySqlSelectTest_193_ibatis extends MysqlTest {
    public void test_0() throws Exception {
        String sql = "select a from x where a in (${x})";

//        System.out.println(sql);

        MySqlStatementParser parser = new MySqlStatementParser(sql);
        List<SQLStatement> statementList = parser.parseStatementList();
        SQLSelectStatement stmt = (SQLSelectStatement) statementList.get(0);

        assertEquals(1, statementList.size());

        assertEquals("SELECT a\n" +
                "FROM x\n" +
                "WHERE a IN (${x})", stmt.toString());
    }
}