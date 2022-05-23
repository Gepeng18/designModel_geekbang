package com.design.u056_观察者模式_上.register.B;

import com.design.u056_观察者模式_上.register.PromotionService;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
