package cn.luo.web.entity.sbss;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/25 20:38
 * @note
 */
public class DataEvent extends BaseEntity {

    public final static int SAVE_LOCAL = 0;     // is_upload=0
    public final static int SOLVED_LOCAL = 1;   // is_upload=1,solved=1
    public final static int REPORT = 2;         // is_upload=1,solved=0
    public static final int UNSOLVED = 0;
    public static final int SOLVED = 1;

    private String fssj;
    private String sjmc;
    private String sjms;
    private String sjrs;
    private String gjc;
    private String sjlx;
    private String fsxc;
    private String wgy;
    private String sswg;
    private String tp;
    private String solved;
    private String id;
    private String sfqy;

    public String getFssj() {
        return fssj;
    }

    public void setFssj(String fssj) {
        this.fssj = fssj;
    }

    public String getSjmc() {
        return sjmc;
    }

    public void setSjmc(String sjmc) {
        this.sjmc = sjmc;
    }

    public String getSjms() {
        return sjms;
    }

    public void setSjms(String sjms) {
        this.sjms = sjms;
    }

    public String getSjrs() {
        return sjrs;
    }

    public void setSjrs(String sjrs) {
        this.sjrs = sjrs;
    }

    public String getGjc() {
        return gjc;
    }

    public void setGjc(String gjc) {
        this.gjc = gjc;
    }

    public String getSjlx() {
        return sjlx;
    }

    public void setSjlx(String sjlx) {
        this.sjlx = sjlx;
    }

    public String getFsxc() {
        return fsxc;
    }

    public void setFsxc(String fsxc) {
        this.fsxc = fsxc;
    }

    public String getWgy() {
        return wgy;
    }

    public void setWgy(String wgy) {
        this.wgy = wgy;
    }

    public String getSswg() {
        return sswg;
    }

    public void setSswg(String sswg) {
        this.sswg = sswg;
    }

    public String getTp() {
        return tp;
    }

    public void setTp(String tp) {
        this.tp = tp;
    }

    public String getSolved() {
        return solved;
    }

    public void setSolved(String solved) {
        this.solved = solved;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public String getSfqy() {
        return sfqy;
    }

    public void setSfqy(String sfqy) {
        this.sfqy = sfqy;
    }
}
