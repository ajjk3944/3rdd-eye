package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class q00 implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f15180a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f15181b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f15180a.getAndIncrement();
        return new com.facebook.ads.internal.dynamicloading.a(this, runnable, d.h.q(andIncrement, "AdWorker(WebViewStartup) #", new StringBuilder(String.valueOf(andIncrement).length() + 26)), runnable);
    }
}
