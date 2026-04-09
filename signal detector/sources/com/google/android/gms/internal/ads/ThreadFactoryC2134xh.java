package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.google.android.gms.internal.ads.xh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ThreadFactoryC2134xh implements ThreadFactory {

    /* renamed from: a, reason: collision with root package name */
    public final AtomicInteger f17616a = new AtomicInteger(1);

    /* renamed from: b, reason: collision with root package name */
    public final int f17617b;

    @Override // java.util.concurrent.ThreadFactory
    public final Thread newThread(Runnable runnable) {
        int andIncrement = this.f17616a.getAndIncrement();
        return new C2080wh(this, runnable, A.f.i(andIncrement, "AdWorker(WebViewStartup) #", new StringBuilder(String.valueOf(andIncrement).length() + 26)), runnable);
    }
}
