package io.appmetrica.analytics.impl;

import java.util.concurrent.TimeUnit;

/* renamed from: io.appmetrica.analytics.impl.s0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4935s0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4961t0 f41595a;

    public RunnableC4935s0(C4961t0 c4961t0) {
        this.f41595a = c4961t0;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C5065x4.l().f42014c.a().executeDelayed(new RunnableC4910r1(this.f41595a.f41660a), TimeUnit.SECONDS.toMillis(5L));
    }
}
