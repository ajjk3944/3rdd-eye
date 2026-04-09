package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes3.dex */
public final class S0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f40081a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40082b;

    public S0(C4859p1 c4859p1, Revenue revenue) {
        this.f40082b = c4859p1;
        this.f40081a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40082b).reportRevenue(this.f40081a);
    }
}
