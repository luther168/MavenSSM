package cn.luo.web.entity.sbss.response;

import cn.luo.web.entity.sbss.AddressItem;

import java.util.List;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/27 19:38
 * @note
 */
public class GetAddressListResponse extends SBSSResponse {
    private List<AddressItem> addressList;

    public List<AddressItem> getAddressList() {
        return addressList;
    }

    public void setAddressList(List<AddressItem> addressList) {
        this.addressList = addressList;
    }
}
