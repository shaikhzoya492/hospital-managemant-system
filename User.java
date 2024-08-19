
package com.entity;

public class User {
    private int id;
    private String fullName;
    private String email;
    private String phone;
    private String password;
            
    public User (String fullName, String email,String phone, String password) {

super();

this.fullName=fullName;
this.email = email;
this.phone= phone;
this.password = password;

}

public int getId() {

return id;

}

public void setId(int id) {

this.id = id;

}

public String getFullName() {

return fullName;

}

public void setFullName (String fullName) {

this.fullName = fullName;

}

public String getEmail() {

return email;

}

public void setEmail(String email) {

this.email = email;

}
public String getPhone() {

return phone;

}

public void setPhone (String phone) {

this.phone = phone;

}

public String getPassword() {

return password;

}
public void setPassword(String password) {

this.password=password;

}
}
