package com.elvis.exception;

import java.io.Serializable;

/**
 * @Author JackRen
 * @Date 2019/07/17 上午10:59
 *
 * @description 通用系统异常
 */
public class CommonSysException extends RuntimeException implements Serializable {

    private com.elvis.exception.ExpCodeEnum codeEnum;

    public CommonSysException(com.elvis.exception.ExpCodeEnum codeEnum) {
        super(codeEnum.getMessage());
        this.codeEnum = codeEnum;
    }

    public CommonSysException() {

    }
}
