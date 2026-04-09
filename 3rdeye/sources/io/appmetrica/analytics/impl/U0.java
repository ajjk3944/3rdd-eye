package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.ecommerce.ECommerceEvent;

/* loaded from: classes3.dex */
public final class U0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ECommerceEvent f40216a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40217b;

    public U0(C4859p1 c4859p1, ECommerceEvent eCommerceEvent) {
        this.f40217b = c4859p1;
        this.f40216a = eCommerceEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40217b).reportECommerce(this.f40216a);
    }
}
