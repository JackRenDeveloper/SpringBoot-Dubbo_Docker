package com.elvis.exception;

import java.io.Serializable;

/**
 * @Author JackRen
 * @Date 2019/07/17 上午10:59
 * 通用业务异常（由异常状态码区分不同的业务异常）
 */
public class CommonBizException extends RuntimeException implements Serializable {
    private com.elvis.exception.ExpCodeEnum codeEnum;

    public CommonBizException(com.elvis.exception.ExpCodeEnum codeEnum){
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonBizException(){}

    public ExpCodeEnum getCodeEnum() {
        return codeEnum;
    }
}
