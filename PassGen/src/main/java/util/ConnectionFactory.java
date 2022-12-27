package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionFactory {
    public static final String DRIVER = "com.mysql.cj.jdbc.Driver";
    public static final String URL = "jdbc:mysql://localhost:3306/passgen";
    public static final String USR = "root";
    public static final String PASS = "";
    
    public static Connection getConnection(){
        Connection c = null;
        try{
            Class.forName(DRIVER);
            c = DriverManager.getConnection(URL,USR, PASS);
        }catch(ClassNotFoundException e){
            System.err.println("Driver não foi encontrado!");
        }catch(SQLException sqle){
            System.err.println("A conexão falhou!" + sqle);
        }
        return c;
    }
    public static void closeConnection (Connection c){
        try{
            if(c != null)
                c.close();
        }catch(SQLException sqle){
            System.err.println("Falha ao fechar a conexão!" + sqle);
        }
    }
    public static void closeConnection (Connection c, Statement s){
        try{
            if(c != null)
                c.close();
            if(s != null)
                s.close();
        }catch(SQLException sqle){
            System.err.println("Falha ao fechar a conexão!" + sqle);
        }
    }
}
