package cn.luo.web.entity.sbss;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/27 15:18
 * @note
 */
public class BaseEntity {
    public static final int UPLOAD = 1;
    public static final int NOT_UPLOAD = 0;
    private String uuid;
    private String edit_type;
    private String edit_time;
    private String edit_user;
    private String is_upload;
    private String token;

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public String getEdit_type() {
        return edit_type;
    }

    public void setEdit_type(String edit_type) {
        this.edit_type = edit_type;
    }

    public String getEdit_time() {
        return edit_time;
    }

    public void setEdit_time(String edit_time) {
        this.edit_time = edit_time;
    }

    public String getEdit_user() {
        return edit_user;
    }

    public void setEdit_user(String edit_user) {
        this.edit_user = edit_user;
    }

    public String getIs_upload() {
        return is_upload;
    }

    public void setIs_upload(String is_upload) {
        this.is_upload = is_upload;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
