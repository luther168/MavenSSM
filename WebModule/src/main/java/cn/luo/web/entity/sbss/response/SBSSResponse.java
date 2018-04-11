package cn.luo.web.entity.sbss.response;

import cn.luo.web.entity.sbss.HttpStatus;

import java.io.Serializable;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/27 19:31
 * @note
 */
public class SBSSResponse implements Serializable {
    private String code;
    private String message;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public boolean isSuccess() {
        return code.equals(HttpStatus.SUCCESS);
    }
}
