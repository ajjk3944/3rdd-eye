package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* renamed from: com.google.android.gms.internal.ads.xj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2136xj {

    /* renamed from: a, reason: collision with root package name */
    public final Executor f17621a;

    /* renamed from: b, reason: collision with root package name */
    public final ScheduledExecutorService f17622b;

    /* renamed from: c, reason: collision with root package name */
    public volatile boolean f17623c = true;

    public C2136xj(C0623Mf c0623Mf, ScheduledExecutorService scheduledExecutorService, Ju ju) {
        this.f17621a = c0623Mf;
        this.f17622b = scheduledExecutorService;
    }
}
