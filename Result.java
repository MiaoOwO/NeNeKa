package com.mqmqm.utils;

import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author: MrsmMiao
 * @DateTime: 2021/5/22 0:28
 * @Description: 结果类
 */

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Result {
    /**
     * 返回内容
     *
     **/
    @ApiModelProperty("返回内容")
    private Object data;
    /**
     * 返回信息
     */
    @ApiModelProperty("返回信息")
    private Object message;
    /**
     * 状态信息
     * 200 - 成功
     * 204 - 无内容
     * 401 - 非法的（未登录，未授权）
     * 403 - 禁止
     * 404 - 未找到
     * 406
     * 500 - 错误
     */
    @ApiModelProperty("状态的信息码")
    private Integer code;

    @Override
    public String toString() {
        return "{" +
                "data=" + data +
                ", message=" + message +
                ", code=" + code +
                '}';
    }
}