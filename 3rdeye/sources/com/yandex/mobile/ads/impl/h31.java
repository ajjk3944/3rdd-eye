package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class h31 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakReference<Q1.f> f28089a;

    public h31(Q1.f viewPager) {
        kotlin.jvm.internal.l.f(viewPager, "viewPager");
        this.f28089a = new WeakReference<>(viewPager);
    }

    public final void a() {
        Q1.f fVar = this.f28089a.get();
        if (fVar != null) {
            fVar.d(fVar.getCurrentItem() + 1, true);
        }
    }

    public final void b() {
        Q1.f fVar = this.f28089a.get();
        if (fVar != null) {
            fVar.d(fVar.getCurrentItem() - 1, true);
        }
    }
}
