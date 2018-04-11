package cn.luo.web.entity.sbss.response;

import java.io.Serializable;

/**
 * AUTHOR:       Luo
 * VERSION:      V1.0
 * DESCRIPTION:  description
 * CREATE TIME:        2018/1/20 17:40
 * NOTE:
 */
public class LoginResponse extends SBSSResponse implements Serializable {
    private String token;
    private String sswg;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getSswg() {
        return sswg;
    }

    public void setSswg(String sswg) {
        this.sswg = sswg;
    }
}
