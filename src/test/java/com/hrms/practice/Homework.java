package com.hrms.practice;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Homework {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void assignment() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Connection is successful");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select *  from ohrm_location;");
        ResultSetMetaData rsMetaData = rs.getMetaData();

        List<Map<String, String>> dataList = new ArrayList<>();
        Map<String, String> mapRow;
        while (rs.next()) {
            mapRow = new LinkedHashMap<>();
            for (int i = 1; i <= rsMetaData.getColumnCount(); i++) {
                mapRow.put(rsMetaData.getColumnName(i), rs.getObject(i).toString());
            }
            dataList.add(mapRow);
        }
        System.out.println(dataList);
        for (Map<String, String> data : dataList) {
            System.out.println(data);
        }
        rs.close();
        st.close();
        conn.close();

    }

}
