package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import com.yandex.mobile.ads.impl.xh1;

/* loaded from: classes3.dex */
public final class ll1 implements ul1, qi1 {

    /* renamed from: a, reason: collision with root package name */
    private final ul1 f30034a;

    /* renamed from: b, reason: collision with root package name */
    private xh1 f30035b;

    /* renamed from: c, reason: collision with root package name */
    private hb0 f30036c;

    public ll1(ul1 progressProvider) {
        kotlin.jvm.internal.l.f(progressProvider, "progressProvider");
        this.f30034a = progressProvider;
        this.f30035b = xh1.a.a();
    }

    @Override // com.yandex.mobile.ads.impl.ul1
    public final xh1 a() {
        ul1 ul1Var = this.f30036c;
        if (ul1Var == null) {
            ul1Var = this.f30034a;
        }
        xh1 xh1VarA = ul1Var.a();
        this.f30035b = xh1VarA;
        return xh1VarA;
    }

    @Override // com.yandex.mobile.ads.impl.qi1
    public final void a(Player player) {
        this.f30036c = player == null ? new hb0(this.f30035b) : null;
    }
}
