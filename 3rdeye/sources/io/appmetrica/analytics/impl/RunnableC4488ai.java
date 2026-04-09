package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ai, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4488ai implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f40525a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40526b;

    public RunnableC4488ai(C4927ri c4927ri, AdRevenue adRevenue) {
        this.f40526b = c4927ri;
        this.f40525a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40526b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportAdRevenue(this.f40525a);
    }
}
