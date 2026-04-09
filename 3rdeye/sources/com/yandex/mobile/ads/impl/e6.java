package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;

/* loaded from: classes3.dex */
public final class e6 implements ul1 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f26683a;

    /* renamed from: b, reason: collision with root package name */
    private final oi1 f26684b;

    /* renamed from: c, reason: collision with root package name */
    private final v60 f26685c;

    public e6(c9 adStateHolder, mi1 playerStateController, oi1 playerStateHolder, v60 playerProvider) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        this.f26683a = adStateHolder;
        this.f26684b = playerStateHolder;
        this.f26685c = playerProvider;
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    public final xh1 a() {
        tn0 tn0VarD;
        Player playerA;
        vi1 vi1VarC = this.f26683a.c();
        if (vi1VarC == null || (tn0VarD = vi1VarC.d()) == null) {
            return xh1.f35317c;
        }
        return (im0.f28742b == this.f26683a.a(tn0VarD) || !this.f26684b.c() || (playerA = this.f26685c.a()) == null) ? xh1.f35317c : new xh1(playerA.getCurrentPosition(), playerA.getDuration());
    }
}
