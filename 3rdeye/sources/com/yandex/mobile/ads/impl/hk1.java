package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;

@h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationData$2", f = "PrefetchedMediationNetworksDataLoader.kt", l = {44}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class hk1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super zj1>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f28240b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ lk1 f28241c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f28242d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vy1 f28243e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<uz0> f28244f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f28245g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hk1(long j4, Context context, vy1 vy1Var, lk1 lk1Var, List list, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f28241c = lk1Var;
        this.f28242d = context;
        this.f28243e = vy1Var;
        this.f28244f = list;
        this.f28245g = j4;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        lk1 lk1Var = this.f28241c;
        return new hk1(this.f28245g, this.f28242d, this.f28243e, lk1Var, this.f28244f, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super zj1> interfaceC4347e) {
        return ((hk1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f28240b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        lk1 lk1Var = this.f28241c;
        Context context = this.f28242d;
        vy1 vy1Var = this.f28243e;
        List<uz0> list = this.f28244f;
        long j4 = this.f28245g;
        this.f28240b = 1;
        Object objA = lk1.a(j4, context, vy1Var, lk1Var, list, this);
        return objA == aVar ? aVar : objA;
    }
}
