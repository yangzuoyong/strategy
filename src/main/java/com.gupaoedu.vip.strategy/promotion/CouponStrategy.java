package com.gupaoedu.vip.strategy.promotion;

/**
 * 优惠券
 */
public class CouponStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券,总价格直接减优惠券面值抵扣");
    }
}
