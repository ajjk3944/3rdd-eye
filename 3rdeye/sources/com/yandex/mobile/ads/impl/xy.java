package com.yandex.mobile.ads.impl;

import b9.C2001h;
import b9.InterfaceC2000g;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class xy {

    /* renamed from: a, reason: collision with root package name */
    private final TimeUnit f35539a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC2000g f35540b;

    public xy(TimeUnit timeUnit) {
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
        this.f35539a = timeUnit;
        this.f35540b = C2001h.b(new wy(this));
    }

    public static final /* synthetic */ long a(xy xyVar) {
        xyVar.getClass();
        return 1L;
    }

    public final long a() {
        return ((Number) this.f35540b.getValue()).longValue();
    }
}
