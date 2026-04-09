package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* renamed from: io.appmetrica.analytics.impl.ii, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4694ii implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f41084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f41085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41086c;

    public RunnableC4694ii(C4927ri c4927ri, AdRevenue adRevenue, boolean z10) {
        this.f41086c = c4927ri;
        this.f41084a = adRevenue;
        this.f41085b = z10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41086c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportAdRevenue(this.f41084a, this.f41085b);
    }
}
