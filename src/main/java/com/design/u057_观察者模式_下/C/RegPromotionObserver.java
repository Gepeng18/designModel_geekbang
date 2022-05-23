package com.design.u057_观察者模式_下.C;

import com.design.u056_观察者模式_上.register.PromotionService;
import com.google.common.eventbus.Subscribe;

public class RegPromotionObserver implements RegObserver {
    private PromotionService promotionService; // 依赖注入

    @Override
    @Subscribe
    public void handleRegSuccess(long userId) {
        promotionService.issueNewUserExperienceCash(userId);
    }
}
