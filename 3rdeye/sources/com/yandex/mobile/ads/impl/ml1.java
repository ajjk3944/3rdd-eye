package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import com.yandex.mobile.ads.impl.wh1;

/* loaded from: classes3.dex */
public final class ml1 implements vl1, ri1 {

    /* renamed from: a, reason: collision with root package name */
    private final vl1 f30433a;

    /* renamed from: b, reason: collision with root package name */
    private wh1 f30434b;

    /* renamed from: c, reason: collision with root package name */
    private ib0 f30435c;

    public ml1(vl1 progressProvider) {
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        this.f30433a = progressProvider;
        this.f30434b = wh1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.vl1
    public final wh1 a() {
        vl1 vl1Var = this.f30435c;
        if (vl1Var == null) {
            vl1Var = this.f30433a;
        }
        wh1 wh1VarA = vl1Var.a();
        this.f30434b = wh1VarA;
        return wh1VarA;
    }

    @Override // com.yandex.mobile.ads.impl.ri1
    public final void a(Player player) {
        this.f30435c = player == null ? new ib0(this.f30434b) : null;
    }
}
