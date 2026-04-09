package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class u40 {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f17083a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f17084b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f17085c = true;

    public u40(ex exVar, ScheduledExecutorService scheduledExecutorService, pr0 pr0Var) {
        this.f17083a = exVar;
        this.f17084b = scheduledExecutorService;
    }
}
