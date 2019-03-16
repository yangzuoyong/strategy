package com.gupaoedu.vip.strategy.pay.payport;

public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 600;
    }
}
