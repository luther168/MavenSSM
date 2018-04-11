package cn.luo.web.controller.sbss;

import cn.luo.web.entity.sbss.response.LoginResponse;
import cn.luo.web.utils.LogUtils;
import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.serializer.SimplePropertyPreFilter;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BuildingApiController {

    @ResponseBody
    @RequestMapping(value = "app/admin/building/save_building.jhtml", method = RequestMethod.POST)
    public String saveBuilding(String username, String password) {
        LogUtils.d(username + " " + password);
//        LoginData data = new LoginData();
//        CommonResponse<LoginData> response = new CommonResponse<>();
//        response.setData(data);
        LoginResponse response = new LoginResponse();
        response.setSswg("");
        response.setToken("token");
        response.setCode("200");
        response.setMessage("");
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
        filter.getExcludes().add("success");
        String jsonStr = JSON.toJSONString(response, filter);
        LogUtils.d(jsonStr);
        return jsonStr;
    }

    @ResponseBody
    @RequestMapping(value = "app/admin/building/save_safety.jhtml", method = RequestMethod.POST)
    public String saveBuildingSafety(String username, String password) {
        LogUtils.d(username + " " + password);
//        LoginData data = new LoginData();
//        CommonResponse<LoginData> response = new CommonResponse<>();
//        response.setData(data);
        LoginResponse response = new LoginResponse();
        response.setSswg("");
        response.setToken("token");
        response.setCode("200");
        response.setMessage("");
        SimplePropertyPreFilter filter = new SimplePropertyPreFilter();
        filter.getExcludes().add("success");
        String jsonStr = JSON.toJSONString(response, filter);
        LogUtils.d(jsonStr);
        return jsonStr;
    }
}
