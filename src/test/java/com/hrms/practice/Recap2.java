package com.hrms.practice;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Recap2 {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void recapDB() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ohrm_nationality");
        ResultSetMetaData rsMetaData = rs.getMetaData();

        List<Map<String, String>> listData = new ArrayList<>();
        Map<String, String> mapData;

        while (rs.next()) {
            mapData = new LinkedHashMap<>();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                mapData.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());

            }
            listData.add(mapData);
        }
        System.out.println(listData);
        for (Map<String, String> list : listData) {
            System.out.println(list);
        }

        rs.close();
        st.close();
        conn.close();
    }
}
