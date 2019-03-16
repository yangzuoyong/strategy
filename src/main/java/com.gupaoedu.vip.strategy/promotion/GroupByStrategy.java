package com.gupaoedu.vip.strategy.promotion;

/**
 * 拼团优惠
 */
public class GroupByStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团优惠，满2人成团，全团享受团购价");
    }
}
