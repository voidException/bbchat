package org.smile.bbchat;

/**
 * Created by aihaitao on 13/9/2017.
 */

public class UserLoginVo {
    private String  userEmail;
    private String  userPassword;


    public UserLoginVo(String email, String pass){
        this.userEmail=email;
        this.userPassword=pass;
    }


    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public String getUserEmail() {
        return userEmail;
    }
    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }
}
