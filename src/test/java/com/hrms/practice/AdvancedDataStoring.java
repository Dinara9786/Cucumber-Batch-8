package com.hrms.practice;

import org.junit.Test;

import java.sql.*;
import java.util.*;

public class AdvancedDataStoring {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void advancedStuff() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id, name, country_code from ohrm_location");

        List<Map<String, String>> listData = new ArrayList<>();
        Map<String, String> mapData;
        while (rs.next()) {
            mapData = new LinkedHashMap<>();
            mapData.put("id", rs.getObject("id").toString());
            mapData.put("Name", rs.getObject("name").toString());
            mapData.put("country_code", rs.getObject("country_code").toString());
            listData.add(mapData);
        }
        System.out.println(listData);
//        for (Map<String, String> data : listData) {
//            System.out.println(data);
//        }
        rs.close();
        st.close();
        conn.close();

    }

    @Test
    public void anotherTest() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ohrm_job_title");
        ResultSetMetaData rsMetadata = rs.getMetaData();
        List<Map<String, String>> listData = new ArrayList<>();
        Map<String, String> mapData;

        while (rs.next()) {
            mapData = new LinkedHashMap<>();
            for (int i = 1; i <= rsMetadata.getColumnCount(); i++) {
                String colName = rsMetadata.getColumnName(i);
                String value = rs.getObject(i).toString();
                mapData.put(colName, value);
            }
            listData.add(mapData);
        }

        System.out.println(listData);
        rs.close();
        st.close();
        conn.close();

    }


// display the information from nationality table
// but display id as nationality id name as nationality name


    @Test
    public void nationality() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ohrm_nationality;");

        List<Map<String, String>> listData = new ArrayList<>();
        Map<String, String> mapData;
        while (rs.next()) {
            mapData = new LinkedHashMap<>();
            mapData.put("nationality_id", rs.getObject("id").toString());
            mapData.put("nationality_Name", rs.getObject("name").toString());
            listData.add(mapData);
        }
        System.out.println(listData);
        for (Map<String, String> nationality : listData) {
            System.out.println(nationality);

        }
        rs.close();
        st.close();
        conn.close();
    }
}