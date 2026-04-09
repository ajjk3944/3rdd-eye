package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import c9.C2092m;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.List;

@h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworksMediationDataInternal$asyncAdaptersResults$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class jk1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super List<? extends A9.L<? extends bk1>>>, Object> {

    /* renamed from: b, reason: collision with root package name */
    private /* synthetic */ Object f29182b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<uz0> f29183c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ lk1 f29184d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f29185e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ vy1 f29186f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ long f29187g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jk1(long j4, Context context, vy1 vy1Var, lk1 lk1Var, List list, InterfaceC4347e interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f29183c = list;
        this.f29184d = lk1Var;
        this.f29185e = context;
        this.f29186f = vy1Var;
        this.f29187g = j4;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        List<uz0> list = this.f29183c;
        lk1 lk1Var = this.f29184d;
        jk1 jk1Var = new jk1(this.f29187g, this.f29185e, this.f29186f, lk1Var, list, interfaceC4347e);
        jk1Var.f29182b = obj;
        return jk1Var;
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super List<? extends A9.L<? extends bk1>>> interfaceC4347e) {
        return ((jk1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        b9.n.b(obj);
        A9.E e4 = (A9.E) this.f29182b;
        List<uz0> list = this.f29183c;
        lk1 lk1Var = this.f29184d;
        Context context = this.f29185e;
        vy1 vy1Var = this.f29186f;
        long j4 = this.f29187g;
        ArrayList arrayList = new ArrayList(C2092m.T(list, 10));
        for (uz0 uz0Var : list) {
            lk1Var.getClass();
            arrayList.add(C0575f.b(e4, null, new gk1(lk1Var, uz0Var, context, j4, vy1Var, null), 3));
        }
        return arrayList;
    }
}
