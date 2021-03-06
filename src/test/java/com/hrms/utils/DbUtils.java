package com.hrms.utils;

import java.sql.*;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class DbUtils {

    private static Connection conn;

    private static Statement st;
    private static ResultSet rset;

    public static Connection getConnection() {

        try {
            conn = DriverManager.getConnection(ConfigsReader.getPropertyValue("dbUrl"));

            ConfigsReader.getPropertyValue("dbUsername");
            ConfigsReader.getPropertyValue("dbPassword");

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static ResultSet getResultSet(String query) {

        try {
            st = getConnection().createStatement();
            rset = st.executeQuery(query);
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return rset;

    }

    public static List<Map<String, String>> getDbDataIntoList(String query) {

        List<Map<String, String>> dbList = new ArrayList<>();
        Map<String, String> map;

        try {
            ResultSetMetaData rsetMData = getResultSet(query).getMetaData();

            while (rset.next()) { // loops through all rows
                map = new LinkedHashMap<>();

                for (int c = 1; c <=rsetMData.getColumnCount(); c++) { // loops through each column of the row
                    map.put(rsetMData.getColumnName(c), rset.getString(c));
                }

                dbList.add(map);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return dbList;
    }
}


