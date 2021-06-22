package com.mqmqm.utils;

import java.util.regex.Pattern;

/**
 * @Author: MrsmMiao
 * @DateTime: 2021/4/22 10:53
 * @Description: 验证数据类
 */
public class CheckingUtil {
    /**正则表达式邮箱**/
    public static final String REGUALR_MAIL="^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-z0-9A-Z]{2,}$";
    /**正则表达式手机**/
    public static final String REGUALR_MOBILE="^((17[0-9])|(14[0-9])|(13[0-9])|(15[^4,\\D])|(18[0,5-9]))\\d{8}$";
    public static boolean isEmail(String email){
        /**
         * @Author: MrsmMiao
         * @Description: 验证邮箱
         * @DateTime: 2021/04/22 11:27
         * @Params: [mail]
         * @Return boolean
         */
        return Pattern.matches(REGUALR_MAIL,email);
    }
    public static boolean isMobile(String mobile){
        /**
         * @Author: MrsmMiao
         * @Description: 验证手机号码
         * @DateTime: 2021/04/22 11:27
         * @Params: [mobile]
         * @Return boolean
         */
        return Pattern.matches(REGUALR_MOBILE,mobile);
    }
}
