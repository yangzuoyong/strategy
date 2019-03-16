package com.gupaoedu.vip.strategy.promotion;

/**
 * 优惠活动
 * GP12713
 */
public class PromotionActivity {
    private PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy) {
        this.promotionStrategy = promotionStrategy;
    }
    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
