package com.hrms.practice;

import org.junit.Test;

import java.sql.*;

public class Recap {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void recap() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from hs_hr_emp_skill");
        DatabaseMetaData dbMetadata = conn.getMetaData();
        String dbName = dbMetadata.getDatabaseProductName();
        System.out.println("Name of database is : " + dbName);
        ResultSetMetaData rsMetadata = rs.getMetaData();
        int colCount = rsMetadata.getColumnCount();
        System.out.println(colCount);

        for (int i = 1; i <= colCount; i++) {
            String colName = rsMetadata.getColumnName(i);
            System.out.println("Column Name is : " + i + " " + colName);

        }

        while (rs.next()) {
            String empNumber = rs.getObject("emp_number").toString();
            String skillID = rs.getObject("skill_id").toString();
            System.out.println(empNumber + " : " + skillID);
        }
        rs.close();
        st.close();
        conn.close();
    }
}
