import configuration.MySQLConfiguration;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class App {

    public static void  main (String[] args) throws SQLException,ClassNotFoundException{
        selectAnalista();
    }
        public static void insertAnalista() throws SQLException,ClassNotFoundException{

            MySQLConfiguration mysqlConfig = new MySQLConfiguration();
            Connection con = mysqlConfig.getMysqlConnection();

            String commandSql = "{call insert_analista(?,?,?,?,?,?)}";
            CallableStatement cs = con.prepareCall(commandSql);
            cs.setString(1,"Sergio");
            cs.setString(2,"Perez");
            cs.setString(3,"Torres");
            cs.setString(4,"2000-01-01");
            cs.setString(5,"Eduardo@isil.edu");
            cs.setString(6,"Analista");

            ResultSet resultSet = mysqlConfig.getResultSet(cs);
            while (resultSet.next()){
                System.out.println(resultSet.getString(1)+ " "+
                        resultSet.getString(2)+ " "+
                        resultSet.getString(3)+ " "+
                        resultSet.getString(4)+ " "+
                        resultSet.getString(5)+ " "+
                        resultSet.getString(6)+ " "+
                        resultSet.getString(7)+ " "


                );
            }

    }

    public static void selectAnalista() throws SQLException,ClassNotFoundException{

        MySQLConfiguration mysqlConfig = new MySQLConfiguration();
        Connection con = mysqlConfig.getMysqlConnection();

        String commandSql = "{call select_analista(?)}";
        CallableStatement cs = con.prepareCall(commandSql);
        cs.setString(1,"EOLAN@GMAIL.COM");


        ResultSet resultSet = mysqlConfig.getResultSet(cs);
        while (resultSet.next()){
            System.out.println(resultSet.getString(1)+ " "+
                    resultSet.getString(2)+ " "+
                    resultSet.getString(3)+ " "+
                    resultSet.getString(4)+ " "+
                    resultSet.getString(5)+ " "+
                    resultSet.getString(6)+ " "+
                    resultSet.getString(7)+ " "


            );
        }

    }
}
