package com.yandex.mobile.ads.impl;

import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class yk {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicBoolean f35846a = new AtomicBoolean(false);

    public final boolean a() {
        return this.f35846a.get();
    }

    public final void b() {
        this.f35846a.set(true);
    }
}
