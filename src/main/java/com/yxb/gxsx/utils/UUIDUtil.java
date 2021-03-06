package com.yxb.gxsx.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * @author YinXuBai
 * @date 2022-01-31 15:15.
 */
public class UUIDUtil {

    /**
     * 获取一个UUID值
     *
     * @return UUID值[String]
     */
    public String getUUID() {
        return UUID.randomUUID().toString().replaceAll("-", "").substring(0,10);
    }

    /**
     * 获取多个UUID值
     *
     * @param number 所需个数
     * @return UUID集合
     */
    public List<String> getUUID(Integer number) {
        List<String> list = new ArrayList<>();
        while (0 <= (number--)) {
            list.add(getUUID());
        }
        return list;
    }
}
