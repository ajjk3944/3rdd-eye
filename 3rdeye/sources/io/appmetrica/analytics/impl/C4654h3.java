package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.billinginterface.internal.ProductInfo;
import io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable;

/* renamed from: io.appmetrica.analytics.impl.h3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4654h3 extends SafeRunnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ProductInfo f40987a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4680i3 f40988b;

    public C4654h3(C4680i3 c4680i3, ProductInfo productInfo) {
        this.f40988b = c4680i3;
        this.f40987a = productInfo;
    }

    @Override // io.appmetrica.analytics.coreutils.internal.executors.SafeRunnable
    public final void runSafety() {
        ((C4940s5) this.f40988b.f41033a).a(C4683i6.a(new Rf(this.f40987a)));
    }
}
