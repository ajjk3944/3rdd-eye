package com.yandex.mobile.ads.impl;

import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public final class jr {

    /* renamed from: a, reason: collision with root package name */
    private final wn1 f29265a;

    public jr() {
        this(TimeUnit.MINUTES);
    }

    public final wn1 a() {
        return this.f29265a;
    }

    public jr(wn1 delegate) {
        kotlin.jvm.internal.l.f(delegate, "delegate");
        this.f29265a = delegate;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public jr(TimeUnit timeUnit) {
        this(new wn1(z32.f36157h, timeUnit));
        kotlin.jvm.internal.l.f(timeUnit, "timeUnit");
    }
}
