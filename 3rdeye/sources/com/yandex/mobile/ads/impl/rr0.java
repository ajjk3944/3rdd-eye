package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class rr0 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicLong f32767a = new AtomicLong();

    public static long a() {
        return f32767a.getAndIncrement();
    }
}
