package DBConnect;
import java.sql.*;
public class dbConnect {
        //public String url = "localhost";
        private String url = "172.16.20.180";
        private String ourl = "orcl.ictc.kln.ac.lk";
        private String oport = "1521"; //8889
        private String port = "3306";
        private String database = "hacklnjava";
        private String user = "admin";
        private String password = "stcs";//root
        private String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        Connection conn = null;

        //Function to Connect to DB
        public void Connect2DB()
        {
            String DB_URL = "jdbc:mysql://"+url+":"+port+"/"+database;
            Statement dbstmt=null;
            try {
                conn = DriverManager.getConnection(DB_URL,user,password);//Connect
                //dbstmt = conn.createStatement();
                System.out.println("Connected");
            }
            catch (SQLException se)
            {
                se.printStackTrace();
            }
            //return dbstmt;
        }


    public Statement Conn2DB() {
        String DB_URL = "jdbc:mysql://" + url + ":" + port + "/" + database;
        Statement dbstmt = null;
        try {
            conn = DriverManager.getConnection(DB_URL, user, password);//Connect
            dbstmt = conn.createStatement();
            System.out.println("Connected");
        } catch (SQLException se) {
            se.printStackTrace();
        }
        return dbstmt;
    }

    public void conn2DB()
    {

    }


    public void closeDB()
    {
        try
        {
            conn.close();
        }
        catch(SQLException se)
        {
            se.printStackTrace();
        }
    }

}
