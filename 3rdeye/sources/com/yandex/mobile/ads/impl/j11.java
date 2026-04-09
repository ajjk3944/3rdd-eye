package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class j11 {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicBoolean f28915a = new AtomicBoolean(false);

    public static final void a() {
        if (f28915a.compareAndSet(false, true)) {
            uo0.b("Yandex Mobile Ads 7.14.0 initialized successfully", new Object[0]);
        }
    }
}
