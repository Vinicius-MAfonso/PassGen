package controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import model.Password;
import util.ConnectionFactory;

public class PasswordController {
    public void save(Password pass){
        String sql = "INSERT INTO passwords(password) values (?)";
        PreparedStatement statement = null;
        Connection connection = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            statement.setString(1, pass.getPassword().toString());
            statement.execute();
        }catch(SQLException sqle){
            System.err.println("Erro ao salvar o projeto!"+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
    }
    public List<Password> getAll(){
        List<Password> list = new ArrayList<>();
        String sql = "SELECT * FROM passwords";
        PreparedStatement statement = null;
        Connection connection = null;
        ResultSet set = null;
        try{
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(sql);
            set = statement.executeQuery();
            while(set.next()){
                Password pass = new Password();
                pass.setId(set.getInt(1));
                pass.setPassword(set.getString(2));
                list.add(pass);
            }
        }catch(SQLException sqle){
            System.err.println("Erro ao recuperar os dados!"+sqle);
        }finally{
            ConnectionFactory.closeConnection(connection, statement);
        }
        return list;
    }
}
