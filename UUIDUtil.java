package com.mqmqm.utils;

import java.util.Calendar;
import java.util.UUID;

/**
 * @Author: MrsmMiao
 * @DateTime: 2021/5/5 19:43
 * @Description: UUID工具类
 */
public class UUIDUtil {
    /**
     * 创建UUID
    * */
    public String createUUID(){
        String uuid = UUID.randomUUID().toString().replace("-", "");
        return uuid;
    }
    /**
     * 创建订单号
     * */
    public String createOrderID(){
        long timeInMillis = Calendar.getInstance().getTimeInMillis();//获取当前的时间戳  13位
        String orderID = createUUID()+timeInMillis;
        return orderID;
    }
}
