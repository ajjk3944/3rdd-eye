package com.yandex.mobile.ads.impl;

import b9.C1992A;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class wb2 extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ yb2 f34874b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ xp1<xh2> f34875c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ bi2 f34876d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f34877e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wb2(yb2 yb2Var, fm0 fm0Var, bi2 bi2Var, Object obj) {
        super(0);
        this.f34874b = yb2Var;
        this.f34875c = fm0Var;
        this.f34876d = bi2Var;
        this.f34877e = obj;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        di2 di2Var = new di2(this.f34874b.f35698b, this.f34875c);
        C4198s4 c4198s4 = this.f34874b.f35698b;
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32474x;
        uj.a(c4198s4, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f34874b.f35699c.a(this.f34874b.f35704h, this.f34874b.f35697a, this.f34876d, this.f34877e, di2Var);
        return C1992A.f18074a;
    }
}
