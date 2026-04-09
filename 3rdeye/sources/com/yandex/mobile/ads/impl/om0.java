package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class om0 {

    /* renamed from: c, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f31437c = {fa.a(om0.class, "view", "getView()Lcom/monetization/ads/instream/view/ExtendedInstreamAdView;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final List<kb2> f31438a;

    /* renamed from: b, reason: collision with root package name */
    private final ao1 f31439b;

    public om0(o70 instreamAdView, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        this.f31438a = friendlyOverlays;
        this.f31439b = bo1.a(instreamAdView);
    }

    public final List<kb2> a() {
        return this.f31438a;
    }

    public final o70 b() {
        return (o70) this.f31439b.getValue(this, f31437c[0]);
    }
}
