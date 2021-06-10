package me.tj.common;

import lombok.Builder;
import lombok.Data;

/**
 * @author LTJ
 * @version 1.0
 * @date 2021/6/10 17:23
 */
@Data
@Builder
public class HttpResult {
    public static final Integer SUCESS=200;
    public static final Integer FAIL=400;

    private Integer code;
    private String msg;
    private Object data;
}
