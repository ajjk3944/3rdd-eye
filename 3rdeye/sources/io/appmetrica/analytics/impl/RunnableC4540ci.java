package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* renamed from: io.appmetrica.analytics.impl.ci, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4540ci implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f40633a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40634b;

    public RunnableC4540ci(C4927ri c4927ri, ECommerceEvent eCommerceEvent) {
        this.f40634b = c4927ri;
        this.f40633a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40634b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportECommerce(this.f40633a);
    }
}
