package com.zylm.service.common;

/**
 * @ClassName Response
 * @Description Response类
 * @Author zy
 * @Date 2023/11/2 15:43
 * @Version 1.0
 */
public class Response<T> {

    /**
     * 接口响应代码
     */
    private int code = 200;

    /**
     * 接口访问信息
     */
    private String message = "Success";

    private T data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Response{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
