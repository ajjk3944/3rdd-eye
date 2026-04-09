package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class xd2 {

    /* renamed from: a, reason: collision with root package name */
    private final ce2 f35259a;

    /* renamed from: b, reason: collision with root package name */
    private final oj1 f35260b;

    public xd2(oj1 positionProviderHolder, ce2 videoDurationHolder) {
        kotlin.jvm.internal.l.f(videoDurationHolder, "videoDurationHolder");
        kotlin.jvm.internal.l.f(positionProviderHolder, "positionProviderHolder");
        this.f35259a = videoDurationHolder;
        this.f35260b = positionProviderHolder;
    }

    public final boolean a() {
        long jA = this.f35259a.a();
        if (jA == -9223372036854775807L) {
            return false;
        }
        ji1 ji1VarB = this.f35260b.b();
        return (ji1VarB != null ? ji1VarB.a() : -1L) + 1000 >= jA;
    }
}
