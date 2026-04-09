package com.mbridge.msdk.config.component.common.util;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes3.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final CountDownLatch f13291a = new CountDownLatch(1);

    /* renamed from: b, reason: collision with root package name */
    private final AtomicReference<T> f13292b = new AtomicReference<>();

    /* renamed from: c, reason: collision with root package name */
    private final AtomicBoolean f13293c = new AtomicBoolean(false);

    public T a(long j10) throws InterruptedException {
        if (this.f13291a.await(j10, TimeUnit.MILLISECONDS)) {
            return this.f13292b.get();
        }
        return null;
    }

    public boolean a(T t10) {
        if (!this.f13293c.compareAndSet(false, true)) {
            return false;
        }
        this.f13292b.set(t10);
        this.f13291a.countDown();
        return true;
    }
}
