package com.company;
import java.sql.*;
public class Model {
    Connection conn;
    public Model() throws ClassNotFoundException,SQLException {

        try
        {
            String strClassName = "com.mysql.jdbc.Driver";
            String dbName= "cas6";
            String login= "root";
            String strUrl = "jdbc:mysql://localhost:3306/" + dbName + "?useSSL=false";
            Class.forName(strClassName);
            this.conn= DriverManager.getConnection(strUrl,login,"");
            System.out.println("ok");
        }
        catch(ClassNotFoundException e){
            System.err.println("Driver non chargé !");
        }
        catch(SQLException e){
            System.out.println("impossible d'accéder à la bdd");
        }
    }

    public String  authentification(String login,String password) throws SQLException {
        String strQuery="SELECT nom  FROM login WHERE login = ? AND password= ? ;";
        PreparedStatement loginUser=conn.prepareStatement(strQuery);
        loginUser.setString(1,login);
        loginUser.setString(2,password);
        ResultSet rsLogin=loginUser.executeQuery();
        if(rsLogin.next()==true){
            System.out.println("connecter");
            return "connecter";
        }
        else{
            System.out.println("login ou mot de passe incorrect");
            return "pas bon login pass";
        }

        }
        public String inscription(String login,String password,String nom)throws SQLException{
        String strQuery="INSERT INTO `login` (`id`, `login`, `password`, `nom`) VALUES (NULL, ?, ?, ?);";
        PreparedStatement insertUser=conn.prepareStatement(strQuery);
        insertUser.setString(1,login);
        insertUser.setString(2,password);
        insertUser.setString(3,nom);
        insertUser.executeUpdate();
        return "inscription terminé";

        }




}
