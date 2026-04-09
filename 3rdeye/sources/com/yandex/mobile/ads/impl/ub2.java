package com.yandex.mobile.ads.impl;

import b9.C1992A;
import p9.InterfaceC5480a;

/* loaded from: classes3.dex */
final class ub2 extends kotlin.jvm.internal.m implements InterfaceC5480a<C1992A> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ yb2 f34018b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ u92 f34019c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ v92 f34020d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ xp1<m92> f34021e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ Object f34022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ub2(yb2 yb2Var, u92 u92Var, sn0 sn0Var, x92 x92Var, Object obj) {
        super(0);
        this.f34018b = yb2Var;
        this.f34019c = u92Var;
        this.f34020d = sn0Var;
        this.f34021e = x92Var;
        this.f34022f = obj;
    }

    @Override // p9.InterfaceC5480a
    public final C1992A invoke() {
        n92 n92VarA = this.f34018b.f35700d.a(this.f34018b.f35704h, this.f34019c, this.f34020d, this.f34021e);
        this.f34018b.f35698b.a(EnumC4191r4.f32471u, this.f34019c);
        this.f34018b.f35699c.a(this.f34018b.f35704h, this.f34018b.f35697a, this.f34019c, this.f34020d, this.f34022f, n92VarA);
        return C1992A.f18074a;
    }
}
