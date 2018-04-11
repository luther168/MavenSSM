package cn.luo.web.entity.sbss.response;

import cn.luo.web.entity.sbss.DataEvent;

import java.util.List;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/27 19:38
 * @note
 */
public class GetEventListResponse extends SBSSResponse {
    private List<DataEvent> eventList;

    public List<DataEvent> getEventList() {
        return eventList;
    }

    public void setEventList(List<DataEvent> eventList) {
        this.eventList = eventList;
    }
}
