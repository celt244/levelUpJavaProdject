package web.dto;

import java.io.Serializable;

/**
 * Created by java on 16.05.2017.
 */
public class TargetData implements Serializable{

    private String email;
    private String UserName;

    public TargetData() {
    }

    public TargetData(String email, String UserName) {
        this.email = email;
        this.UserName = UserName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String userName) {
        this.UserName = userName;
    }
}
