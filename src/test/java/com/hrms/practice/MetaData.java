package com.hrms.practice;

import org.junit.Test;

import java.sql.*;

public class MetaData {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void dbMetaData() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        DatabaseMetaData dbMetaData = conn.getMetaData();
        String driverName = dbMetaData.getDriverName();
        String productVersion = dbMetaData.getDatabaseProductVersion();
        System.out.println("driver name is : " + driverName);
        System.out.println("product version is : " + productVersion);
        conn.close();

    }

    @Test
    public void resultSetMetaData() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from hs_hr_employees\n" +
                "where employee_id = 12766");
        ResultSetMetaData resultSetMetaData = rs.getMetaData();
        int columnsCount = resultSetMetaData.getColumnCount();
        System.out.println("The count of column is : " + columnsCount);
        String firstColumnName = resultSetMetaData.getColumnName(1);
        System.out.println("The name of the first column is : " + firstColumnName);

        for (int i = 1; i <= columnsCount; i++) {
            String allColumnNames = resultSetMetaData.getColumnName(i);
            System.out.println("Name of the column is : " + allColumnNames);
        }

        rs.close();
        st.close();
        conn.close();
    }

}
