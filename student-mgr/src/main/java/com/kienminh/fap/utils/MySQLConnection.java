package com.kienminh.fap.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class MySQLConnection {
        public static void main(String[] args) {
            Connection conn = null;
            try {
                String dbURL = "jdbc:mysql://localhost:3306/BookStore?useSSL=false&serverTimezone=UTC";
                String user = "root"; // hoặc tài khoản khác của bạn
                String pass = "your_password"; // thay bằng mật khẩu thật

                // Nếu dùng JDBC cũ, có thể cần dòng sau:
                // Class.forName("com.mysql.cj.jdbc.Driver");

                conn = DriverManager.getConnection(dbURL, user, pass);
                System.out.println("Connected to MySQL database successfully!");
            } catch (SQLException ex) {
                ex.printStackTrace();
            } finally {
                try {
                    if (conn != null && !conn.isClosed()) {
                        conn.close();
                    }
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
    }


