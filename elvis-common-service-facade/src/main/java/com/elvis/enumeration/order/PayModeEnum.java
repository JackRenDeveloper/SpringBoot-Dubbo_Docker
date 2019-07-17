package com.elvis.enumeration.order;

import com.elvis.enumeration.BaseEnum;

/**
 * @Author JackRen
 * @Date 2019/07/17 上午10:59
 *
 * @description 支付方式枚举
 */
public enum PayModeEnum implements BaseEnum {

    ALIPAY(1,"支付宝"),
    WECHAT(2,"微信支付"),
    UNIONPAY(3,"银联支付"),
    ;

    private int code;
    private String msg;

    PayModeEnum(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public int getCode() {
        return code;
    }

    @Override
    public String getMsg() {
        return msg;
    }
}
