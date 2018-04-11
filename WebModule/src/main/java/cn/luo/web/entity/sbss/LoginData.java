package cn.luo.web.entity.sbss;

import java.io.Serializable;

public class LoginData implements Serializable {

    private String token;

    public LoginData() {
        this.token = "";
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
