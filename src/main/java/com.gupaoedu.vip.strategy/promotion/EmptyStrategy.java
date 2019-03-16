package com.gupaoedu.vip.strategy.promotion;

/**
 * 无优惠
 */
public class EmptyStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("暂无无促销活动");
    }
}
