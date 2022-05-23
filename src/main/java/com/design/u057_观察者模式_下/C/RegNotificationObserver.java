package com.design.u057_观察者模式_下.C;

import com.google.common.eventbus.Subscribe;

public class RegNotificationObserver implements RegObserver {
    private NotificationService notificationService;

    @Override
    @Subscribe
    public void handleRegSuccess(long userId) {
        notificationService.sendInboxMessage(userId, "Welcome...");
    }
}
