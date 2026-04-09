package com.yandex.mobile.ads.impl;

import java.util.List;

/* loaded from: classes3.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    private om0 f31834a;

    public final om0 a() {
        return this.f31834a;
    }

    public final void b() {
        this.f31834a = null;
    }

    public final void a(o70 instreamAdView, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(instreamAdView, "instreamAdView");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        this.f31834a = new om0(instreamAdView, friendlyOverlays);
    }
}
