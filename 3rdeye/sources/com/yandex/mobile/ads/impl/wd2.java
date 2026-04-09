package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class wd2 {

    /* renamed from: a, reason: collision with root package name */
    private final be2 f34913a;

    /* renamed from: b, reason: collision with root package name */
    private final nj1 f34914b;

    public wd2(nj1 positionProviderHolder, be2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        this.f34913a = videoDurationHolder;
        this.f34914b = positionProviderHolder;
    }

    public final boolean a() {
        long jA = this.f34913a.a();
        if (jA == -9223372036854775807L) {
            return false;
        }
        ii1 ii1VarB = this.f34914b.b();
        return (ii1VarB != null ? ii1VarB.a() : -1L) + 1000 >= jA;
    }
}
