package configuration;

import java.sql.*;

public class MySQLConfiguration {

    public String host = "localhost";
    public String port ="3306";
    public String user ="root";
    public String pass ="root";
    public String db= "Requerimiento";
    public String classDriver ="com.mysql.cj.jdbc.Driver";
    public String url= "jdbc:mysql://localhost:3306/"+db;

    public Connection getMysqlConnection() throws ClassNotFoundException, SQLException {
        Class.forName(classDriver);
        //String url = "jdbc:mysql//" +host+":"+port+"/"+db+"?user="+user+"&password="+pass;

        return DriverManager.getConnection(url, user,user);
    }

    public ResultSet getResultSet(CallableStatement callableStatement) throws SQLException{
        return  callableStatement.executeQuery();

    }
}
