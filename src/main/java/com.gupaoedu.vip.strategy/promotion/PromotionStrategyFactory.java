package com.gupaoedu.vip.strategy.promotion;

import java.util.HashMap;
import java.util.Map;

public class PromotionStrategyFactory {
    private static Map<String, PromotionStrategy> PROMOTION_STRATEGY_MAP =  new HashMap<>();
    static {
        PROMOTION_STRATEGY_MAP.put(PromotionKey.COUPON.getKey(), new CouponStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.CASHBACK.getKey(), new CashbackStrategy());
        PROMOTION_STRATEGY_MAP.put(PromotionKey.GROUPBUY.getKey(), new GroupByStrategy());
    }
    private PromotionStrategyFactory(){}
    public static PromotionStrategy getPromotionStrategy(String promotion){
        return  null==PROMOTION_STRATEGY_MAP.get(promotion) ? new EmptyStrategy():PROMOTION_STRATEGY_MAP.get(promotion);
    }
    public enum PromotionKey{

        COUPON("COUPON","优惠券"),

        CASHBACK("CASHBACK","返现"),

        GROUPBUY("GROUPBUY","团购");

        private String key;
        private String value;

        PromotionKey(String key, String value) {
            this.key = key;
            this.value = value;
        }

        public String getKey() {
            return key;
        }

        public void setKey(String key) {
            this.key = key;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }
}
