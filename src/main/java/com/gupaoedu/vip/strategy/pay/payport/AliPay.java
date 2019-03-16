package com.gupaoedu.vip.strategy.pay.payport;

/**
 * 支付宝
 */
public class AliPay extends Payment {
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 800;
    }
}
