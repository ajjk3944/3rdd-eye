package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;

/* loaded from: classes3.dex */
public final class f6 implements vl1 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f27207a;

    /* renamed from: b, reason: collision with root package name */
    private final pi1 f27208b;

    /* renamed from: c, reason: collision with root package name */
    private final w60 f27209c;

    public f6(d9 adStateHolder, ni1 playerStateController, pi1 playerStateHolder, w60 playerProvider) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f27207a = adStateHolder;
        this.f27208b = playerStateHolder;
        this.f27209c = playerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    public final wh1 a() {
        tn0 tn0VarD;
        Player playerA;
        wi1 wi1VarC = this.f27207a.c();
        if (wi1VarC == null || (tn0VarD = wi1VarC.d()) == null) {
            return wh1.f34972c;
        }
        return (jm0.f29209b == this.f27207a.a(tn0VarD) || !this.f27208b.c() || (playerA = this.f27209c.a()) == null) ? wh1.f34972c : new wh1(playerA.getCurrentPosition(), playerA.getDuration());
    }
}
