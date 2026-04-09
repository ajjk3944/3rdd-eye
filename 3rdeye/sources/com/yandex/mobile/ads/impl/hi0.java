package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class hi0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f28227a = new AtomicLong();

    public static final long a() {
        return f28227a.getAndIncrement();
    }
}
