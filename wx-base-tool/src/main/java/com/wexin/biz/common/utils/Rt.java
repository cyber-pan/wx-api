package com.wexin.biz.common.utils;

import io.swagger.models.auth.In;
import lombok.Data;

/**
 * @author cyber.pan
 * @Classname Rt
 * @Description
 * @Date 2023/4/18 21:38
 */
@Data
public class Rt<T> {

    private T data;

    private Integer code;

    private String message;

    private static final Integer SUCCESS = 0;


    public static Rt error(int code, String msg) {
        Rt<Void> r = new Rt<>();
        r.setCode(code);
        r.setMessage(msg);
        return r;
    }

    public static Rt ok(String msg) {
        Rt<Void> r = new Rt<>();
        r.setCode(SUCCESS);
        r.setMessage(msg);
        return r;
    }

    public static Rt ok() {
        Rt<Void> r = new Rt<>();
        r.setCode(SUCCESS);
        return r;
    }

    public static <T> Rt<T> ok(T object) {
        Rt<T> r = new Rt<T>();
        r.setData(object);
        r.setCode(SUCCESS);
        return r;
    }

    public static <T> Rt<T> ok(T object, String message) {
        Rt<T> r = new Rt<T>();
        r.setData(object);
        r.setCode(SUCCESS);
        r.setMessage(message);
        return r;
    }


}
