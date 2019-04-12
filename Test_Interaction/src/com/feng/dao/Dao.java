package com.feng.dao;
import java.sql.*;

public class Dao
{
    /**
     * 数据库的连接
     */
    //驱动程序名
    static String driver ="com.mysql.cj.jdbc.Driver";
    //URL指向要访问的数据库名
    static String url ="jdbc:mysql://localhost:3306/struggling";
    //用户名
    static String username ="root";
    //密码
    static String password ="admin";
    //声明Connection对象
    static Connection conn = null;
    //声明Statement对象
    static Statement stmt = null;



    public static Connection getUserInformation()
    {
        String userid = null;
        String userpwd = null;
        try
        {
            //加载驱动程序
            Class.forName(driver);
            //getConnection()方法，链接数据库
            conn = DriverManager.getConnection(url,username,password);
            //创建Statement类对象，用来执行SQL语句
            stmt = conn.createStatement();
            //要执行的SQL语句
            String sql = "SELECT * FROM user_number";
            //ResultSet类，用来存放获取的结果集
            ResultSet rs = stmt.executeQuery(sql);


            while (rs.next()){
                userid = rs.getString("userid");
                userpwd = rs.getString("userpwd");
                System.out.println(userid + "\t" + userpwd);
            }
            rs.close();
            conn.close();
        }
        catch (ClassNotFoundException e)
        {
            e.printStackTrace();
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        finally {
            System.out.println("数据库书库获取成功");
        }
        return conn;
    }
}