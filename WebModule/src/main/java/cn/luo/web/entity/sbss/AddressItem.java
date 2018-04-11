package cn.luo.web.entity.sbss;

/**
 * Created by gsp on 2017-08-05.
 */

public class AddressItem {
    private int id;
    private String address;
    private String address_src;
    private String qx;//区县
    private String jd;//街道
    private String pcs;//派出所
    private String jw;
    private String wg;
    private String jlx;
    private String mp;
    private String dz;
    private float x;
    private float y;
    private String edit_type;
    private String xz;
    private String czqk;

    public void setComplete(int complete) {
        this.complete = complete;
    }

    public int isComplete() {
        return complete;
    }

    private int complete=-1;
//    public AddressItem(String address) {
//        this.address = address;
//    }
    public AddressItem(String address,String src) {
        this.address = address;
        this.address_src=src;
    }
    public AddressItem(String address,String src,int id) {
        this.address = address;
        this.address_src=src;
        this.id=id;
    }
    public AddressItem(String address,String src,String editType) {
        this.address = address;
        this.address_src=src;
        this.edit_type=editType;
    }

    public AddressItem() {
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public String getAddressSrc() {
        return address_src;
    }
    @Override
    public String toString(){
        if(this.mp==null){
            return address;
        }else {
            return mp;
        }
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setAddressSrc(String addressSrc) {
        this.address_src = addressSrc;
    }

    public void setAddress_src(String address_src) {
        this.address_src = address_src;
    }

    public void setQx(String qx) {
        this.qx = qx;
    }

    public void setJd(String jd) {
        this.jd = jd;
    }

    public void setPcs(String pcs) {
        this.pcs = pcs;
    }

    public void setJw(String jw) {
        this.jw = jw;
    }

    public void setWg(String wg) {
        this.wg = wg;
    }

    public void setJlx(String jlx) {
        this.jlx = jlx;
    }

    public void setMp(String mp) {
        this.mp = mp;
    }

    public void setDz(String dz) {
        this.dz = dz;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setEdit_type(String edit_type) {
        this.edit_type = edit_type;
    }

    public int getId(){
        return id;
    }
    public String getQx() {
        return qx;
    }

    public String getJd() {
        return jd;
    }

    public String getPcs() {
        return pcs;
    }

    public String getJw() {
        return jw;
    }

    public String getWg() {
        return wg;
    }

    public String getJlx() {
        return jlx;
    }

    public String getMp() {
        return mp;
    }

    public String getDz() {
        return dz;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
    public String getEdit_type(){
        return  edit_type;
    }

    public String getXz() {
        return xz;
    }

    public void setXz(String xz) {
        this.xz = xz;
    }

    public String getCzqk() {
        return czqk;
    }

    public void setCzqk(String czqk) {
        this.czqk = czqk;
    }
}
