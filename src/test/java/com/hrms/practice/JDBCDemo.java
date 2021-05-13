package com.hrms.practice;

import org.junit.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class JDBCDemo {

    String dbUsername = "syntax_hrm";
    String dbPassword = "syntaxhrm123";
    //jdbc:mysql://hostname:port/db name
    String dbUrl = "jdbc:mysql://3.237.189.167:3306/syntaxhrm_mysql";

    @Test
    public void newConnection() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("DB Connection is successful");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from hs_hr_employees");
        rs.next();
        String firstname = rs.getString("emp_firstname");// column name
        System.out.println(firstname);
        rs.next();
        String firstname2 = rs.getObject("emp_firstname").toString();
        System.out.println(firstname2);
        while (rs.next()) { // next() = will return us a boolean value
            String allData = rs.getObject("emp_firstname").toString();
            System.out.println(allData);

        }

        // we need to close all the doors/connections
        rs.close();
        st.close();
        conn.close();
        // if we do not close connection, there might be leakage of data
    }

    @Test
    public void listTask() throws SQLException {
        Connection conn = DriverManager.getConnection(dbUrl, dbUsername, dbPassword);
        System.out.println("Connection is successful");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select * from ohrm_nationality");
        List<String> nationalities = new ArrayList<>();
        while(rs.next()) {
            String nationality = rs.getObject("name").toString();
            nationalities.add(nationality);

        }
        System.out.println(nationalities); // printing in one line
        for (String nat: nationalities) {
            System.out.println(nat); //printing one by one
                    }
        System.out.println(nationalities.size());
    }


}
