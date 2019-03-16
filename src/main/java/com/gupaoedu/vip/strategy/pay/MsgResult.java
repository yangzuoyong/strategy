package com.gupaoedu.vip.strategy.pay;

/**
 * 支付完成以后的状态
 */
public class MsgResult {
    private Integer code;
    private Object data;
    private String msg;

    public MsgResult(Integer code, String msg, Object data) {
        this.code = code;
        this.data = data;
        this.msg = msg;
    }

    @Override
    public String toString() {
        return ("支付状态：[" + code + "]," + msg + ",交易详情：" + data);
    }
}
