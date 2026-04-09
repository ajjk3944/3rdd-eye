package com.google.firebase.crashlytics.internal.common;

import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private final AtomicInteger f38750a = new AtomicInteger();

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f38751b = new AtomicInteger();

    public void a() {
        this.f38751b.getAndIncrement();
    }

    public void b() {
        this.f38750a.getAndIncrement();
    }

    public void c() {
        this.f38751b.set(0);
    }
}
