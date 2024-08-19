
package com.dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import com.entity.User;

public class UserDAO {
    private Connection conn;
    
    public UserDAO(Connection conn){
        super();
        this.conn=conn;
    }
    public boolean register(User u){
        boolean f=false;
       try{
           String sql="insert into user_dtls(full_name,email,phone,password) values(?,?,?,?)";
           
           PreparedStatement ps=conn.prepareStatement(sql);
           ps.setString(1,u.getFullName());
           ps.setString(2,u.getEmail());
           ps.setString(3,u.getPhone());
           ps.setString(4,u.getPassword());
           
         int i=  ps.executeUpdate();
         
         if(i==1){
             f=true;
         }
           
       } 
        catch(Exception e){
            e.printStackTrace();
        }
        return f;
    }
    
}
