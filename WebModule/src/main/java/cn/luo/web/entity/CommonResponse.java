package cn.luo.web.entity;

import java.io.Serializable;

public class CommonResponse<T> implements Serializable {

    public static final int CODE_SERVER_HAS_NOT_HANDLED = 509;

    private int code;
    private String message;
    private T data;

    public CommonResponse() {
        this.code = CODE_SERVER_HAS_NOT_HANDLED;
        this.message = "服务器未及时处理";
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
