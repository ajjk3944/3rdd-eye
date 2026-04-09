package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.Revenue;

/* loaded from: classes3.dex */
public final class Zh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Revenue f40479a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40480b;

    public Zh(C4927ri c4927ri, Revenue revenue) {
        this.f40480b = c4927ri;
        this.f40479a = revenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40480b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportRevenue(this.f40479a);
    }
}
