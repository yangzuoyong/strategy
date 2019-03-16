package com.gupaoedu.vip.strategy.pay;

import com.gupaoedu.vip.strategy.pay.payport.PayStrategy;
import com.gupaoedu.vip.strategy.pay.payport.Payment;

public class Order {
    private String uid;
    private String orderId;
    private Double amount;

    public Order(String uid, String orderId, Double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }
    /**
     * 完美地解决了switch的过程，不需要在代码逻辑中写switch了
     *  更不需要写if  else if
     */
    public MsgResult pay() {
        return pay(PayStrategy.DEFAULT_PAY);
    }

    public MsgResult pay(String payKey) {
        Payment payment = PayStrategy.get(payKey);
        System.out.println(String.format("欢迎使用：%s", payment.getName()));
        System.out.println(String.format("本次消费金额：%s，开始扣款...", amount));
        return payment.pay(uid, amount);
    }
}
