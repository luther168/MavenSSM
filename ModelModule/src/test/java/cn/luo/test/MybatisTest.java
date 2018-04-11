package cn.luo.test;

import cn.luo.mybatis.DBHelper;
import cn.luo.mybatis.dao.entity.UserInfo;
import cn.luo.utils.ConvertUtils;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MybatisTest {

    private DBHelper dbHelper = DBHelper.getInstance();

    @Test
    public void select() {
        List<Map<String, Object>> list = dbHelper.select("data_user_info");
        List<UserInfo> userInfoList = new ArrayList<>();
        for (Map<String, Object> map : list){
            try {
                UserInfo userInfo = (UserInfo) ConvertUtils.mapToBean(map, UserInfo.class);
                userInfoList.add(userInfo);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(userInfoList);
    }
}
