package com.gupaoedu.vip.strategy.pay.payport;

import com.gupaoedu.vip.strategy.pay.MsgResult;

/**
 * 支付渠道
 * Created by GP12713
 */
public abstract class Payment {
    /**
     * 支付类型
     */
    public abstract String getName();

    /**
     * 查询余额
     */
    protected abstract double queryBalance(String uid);

    /**
     * 扣款支付
     */
    public MsgResult pay(String uid, double amount) {
        return this.queryBalance(uid) < amount ?
                new MsgResult(500, "支付失败", "余额不足") :
                new MsgResult(200, "支付成功", String.format("支付金额：%s", amount));
    }
}
