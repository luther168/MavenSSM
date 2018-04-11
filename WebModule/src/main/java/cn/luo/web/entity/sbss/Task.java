package cn.luo.web.entity.sbss;

import java.io.Serializable;

/**
 * AUTHOR:       Luo
 * VERSION:      V1.0
 * DESCRIPTION:  description
 * CREATE TIME:        2018/3/15 11:07
 * NOTE:
 */
public class Task implements Serializable {
    // [{"processDefinitionId":"event:2:8daa57dd1e75467494c47fd708e9dd5f",
    // "executionId":"5a21e6d746d843c4b0480bbd6af9a31c",
    // "address":"测试地址",
    // "id":10,
    // "title":"测试标题123",
    // "content":"测试内容",
    // "taskId":"824849dbae494a1586fae88204cfb4bb",
    // "eventDate":1520994389000,
    // "rgsx":"工程施工造成房屋建筑受损，影响安全居住和使用"},
    // {"processDefinitionId":"event:2:8daa57dd1e75467494c47fd708e9dd5f","executionId":"5d0f50b6148f44718234849b837f342b","address":"测试地址","id":11,"title":"测试标题123","content":"测试内容","taskId":"6980fecf093f4fe29b16e4ed9dd637f7","eventDate":1520994404000,"rgsx":"工程施工造成房屋建筑受损，影响安全居住和使用"},{"processDefinitionId":"event:2:8daa57dd1e75467494c47fd708e9dd5f","executionId":"34154e51a4364426a06b0ec18a1bcc83","address":null,"id":2,"title":"测试标题","content":"测试内容","taskId":"03ae3fad20fd493eb98f7b1c4522a940","eventDate":null,"rgsx":null}]
    private String processDefinitionId;
    private String executionId;
    private String address;
    private int id;
    private String title;
    private String content;
    private String taskId;
    private long eventDate;
    private String rgsx;

    public String getProcessDefinitionId() {
        return processDefinitionId;
    }

    public void setProcessDefinitionId(String processDefinitionId) {
        this.processDefinitionId = processDefinitionId;
    }

    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getTaskId() {
        return taskId;
    }

    public void setTaskId(String taskId) {
        this.taskId = taskId;
    }

    public long getEventDate() {
        return eventDate;
    }

    public void setEventDate(long eventDate) {
        this.eventDate = eventDate;
    }

    public String getRgsx() {
        return rgsx;
    }

    public void setRgsx(String rgsx) {
        this.rgsx = rgsx;
    }
}
