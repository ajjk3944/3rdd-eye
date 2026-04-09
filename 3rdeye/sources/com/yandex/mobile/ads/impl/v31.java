package com.yandex.mobile.ads.impl;

import java.util.concurrent.ThreadFactory;

/* loaded from: classes3.dex */
public final class v31 implements ThreadFactory {

    /* renamed from: b, reason: collision with root package name */
    private static final String f34327b = "YandexAds.UrlTracker";

    /* renamed from: c, reason: collision with root package name */
    public static final String f34328c = "YandexAds.BaseController";

    /* renamed from: d, reason: collision with root package name */
    public static final String f34329d = "YandexAds.AdvertisingId";

    /* renamed from: a, reason: collision with root package name */
    private final String f34330a;

    public v31(String threadName) {
        kotlin.jvm.internal.l.f(threadName, "threadName");
        this.f34330a = threadName;
    }

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        kotlin.jvm.internal.l.f(runnable, "runnable");
        return new Thread(runnable, this.f34330a);
    }
}
