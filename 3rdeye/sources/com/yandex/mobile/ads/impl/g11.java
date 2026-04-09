package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.core.provider.MobileAdsProvider$initializeStabilityTrackers$1", f = "MobileAdsProvider.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class g11 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super C1992A>, Object> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f27518b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ vu1 f27519c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g11(Context context, vu1 vu1Var, InterfaceC4347e<? super g11> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f27518b = context;
        this.f27519c = vu1Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new g11(this.f27518b, this.f27519c, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super C1992A> interfaceC4347e) {
        return new g11(this.f27518b, this.f27519c, interfaceC4347e).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        t72.a(this.f27518b, this.f27519c.c());
        wd.a(this.f27518b, this.f27519c.c());
        return C1992A.f18074a;
    }
}
