package com.yandex.mobile.ads.impl;

import c9.C2097r;
import com.yandex.mobile.ads.impl.nn0;

/* loaded from: classes3.dex */
public final class k10 {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f29463a;

    public /* synthetic */ k10(C4078b2 c4078b2) {
        this(c4078b2, nn0.a.a());
    }

    public final boolean a() {
        return this.f29463a;
    }

    public k10(C4078b2 adBreak, nn0 instreamSettings) {
        kotlin.jvm.internal.l.f(adBreak, "adBreak");
        kotlin.jvm.internal.l.f(instreamSettings, "instreamSettings");
        this.f29463a = C2097r.k0(instreamSettings.c(), adBreak.c());
    }
}
