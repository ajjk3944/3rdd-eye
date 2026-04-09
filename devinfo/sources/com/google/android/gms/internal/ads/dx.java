package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledThreadPoolExecutor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dx extends ScheduledThreadPoolExecutor implements AutoCloseable {
    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() throws InterruptedException {
        a3.a.f(this);
    }
}
