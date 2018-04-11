package cn.luo.web.entity.sbss.response;

import cn.luo.web.entity.sbss.Task;

import java.util.List;

/**
 * @author Luo
 * @version V1.0
 * @description description
 * @createTime 2018/1/27 19:38
 * @note
 */
public class GetTaskListResponse extends SBSSResponse {
    private List<Task> mapList;

    public List<Task> getMapList() {
        return mapList;
    }

    public void setMapList(List<Task> mapList) {
        this.mapList = mapList;
    }
}
