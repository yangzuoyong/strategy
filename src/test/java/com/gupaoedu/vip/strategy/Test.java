package com.gupaoedu.vip.strategy;

import com.gupaoedu.vip.strategy.pay.Order;
import com.gupaoedu.vip.strategy.pay.payport.PayStrategy;
import com.gupaoedu.vip.strategy.promotion.PromotionActivity;
import com.gupaoedu.vip.strategy.promotion.PromotionStrategyFactory;

public class Test {
    public static void main(String[] args) {
        Order order=new Order("1","201903161645",635.45);
        //开始支付，选择微信支付、支付宝、银联卡、京东白条、财付通
        //每个渠道它支付的具体算法是不一样的
        //基本算法固定的

        //这个值是在支付的时候才决定用哪个值
        System.out.println(order.pay(PayStrategy.ALI_PAY));

        //拼团优惠 测试
        String promotionKey = PromotionStrategyFactory.PromotionKey.GROUPBUY.getKey();
        PromotionActivity promotionActivity = new PromotionActivity(
                PromotionStrategyFactory.getPromotionStrategy(promotionKey));
        promotionActivity.execute();
    }
}
