package com.yandex.mobile.ads.impl;

import A9.C0585k;
import android.content.Context;
import b9.C1992A;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import f9.InterfaceC4347e;

@h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworkMediationDataAsync$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {78}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class gk1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super bk1>, Object> {

    /* renamed from: b, reason: collision with root package name */
    zy0 f27786b;

    /* renamed from: c, reason: collision with root package name */
    MediatedAdapterPrefetcher f27787c;

    /* renamed from: d, reason: collision with root package name */
    int f27788d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ lk1 f27789e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ uz0 f27790f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ Context f27791g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ long f27792h;
    final /* synthetic */ vy1 i;

    @h9.e(c = "com.monetization.ads.base.mediation.prefetch.PrefetchedMediationNetworksDataLoader$loadNetworkMediationDataAsync$1$1", f = "PrefetchedMediationNetworksDataLoader.kt", l = {79}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super bk1>, Object> {

        /* renamed from: b, reason: collision with root package name */
        int f27793b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ lk1 f27794c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Context f27795d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ vy1 f27796e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ zy0 f27797f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ MediatedAdapterPrefetcher f27798g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(lk1 lk1Var, Context context, vy1 vy1Var, zy0 zy0Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f27794c = lk1Var;
            this.f27795d = context;
            this.f27796e = vy1Var;
            this.f27797f = zy0Var;
            this.f27798g = mediatedAdapterPrefetcher;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return new a(this.f27794c, this.f27795d, this.f27796e, this.f27797f, this.f27798g, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super bk1> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            int i = this.f27793b;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                b9.n.b(obj);
                return obj;
            }
            b9.n.b(obj);
            dk1 dk1Var = this.f27794c.f30022b;
            Context context = this.f27795d;
            vy1 vy1Var = this.f27796e;
            zy0 zy0Var = this.f27797f;
            MediatedAdapterPrefetcher mediatedAdapterPrefetcher = this.f27798g;
            this.f27793b = 1;
            Object objA = dk1Var.a(context, vy1Var, zy0Var, mediatedAdapterPrefetcher, this);
            return objA == aVar ? aVar : objA;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gk1(lk1 lk1Var, uz0 uz0Var, Context context, long j4, vy1 vy1Var, InterfaceC4347e<? super gk1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f27789e = lk1Var;
        this.f27790f = uz0Var;
        this.f27791g = context;
        this.f27792h = j4;
        this.i = vy1Var;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new gk1(this.f27789e, this.f27790f, this.f27791g, this.f27792h, this.i, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super bk1> interfaceC4347e) {
        return ((gk1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) throws Throwable {
        Throwable th;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher;
        zy0 zy0Var;
        MediatedAdapterPrefetcher mediatedAdapterPrefetcher2;
        zy0 zy0Var2;
        bk1 bk1Var;
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        ?? r12 = this.f27788d;
        try {
            if (r12 == 0) {
                b9.n.b(obj);
                ek1 ek1Var = this.f27789e.f30023c;
                uz0 mediationPrefetchNetwork = this.f27790f;
                ek1Var.getClass();
                kotlin.jvm.internal.l.f(mediationPrefetchNetwork, "mediationPrefetchNetwork");
                zy0Var = new zy0(mediationPrefetchNetwork.d(), mediationPrefetchNetwork.e(), null, null, null, null, null);
                Object objA = this.f27789e.f30021a.a(this.f27791g, zy0Var, (Class<Object>) com.monetization.ads.mediation.base.a.class);
                mediatedAdapterPrefetcher = objA instanceof MediatedAdapterPrefetcher ? (MediatedAdapterPrefetcher) objA : null;
                if (mediatedAdapterPrefetcher == null) {
                    return null;
                }
                try {
                    try {
                        long j4 = this.f27792h;
                        try {
                            a aVar2 = new a(this.f27789e, this.f27791g, this.i, zy0Var, mediatedAdapterPrefetcher, null);
                            zy0Var = zy0Var;
                            this.f27786b = zy0Var;
                            this.f27787c = mediatedAdapterPrefetcher;
                            this.f27788d = 1;
                            obj = C0585k.b(j4, aVar2, this);
                            if (obj == aVar) {
                                return aVar;
                            }
                            zy0Var2 = zy0Var;
                            mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                        } catch (Exception unused) {
                            zy0Var = zy0Var;
                            mediatedAdapterPrefetcher2 = mediatedAdapterPrefetcher;
                            ck1 ck1Var = this.f27789e.f30024d;
                            String adapter = zy0Var.e();
                            ck1Var.getClass();
                            kotlin.jvm.internal.l.f(adapter, "adapter");
                            bk1Var = new bk1(adapter, null, null, new mk1(nk1.f30924d, null, null), null);
                            mediatedAdapterPrefetcher2.onInvalidate();
                            return bk1Var;
                        }
                    } catch (Exception unused2) {
                    }
                } catch (Throwable th2) {
                    th = th2;
                    mediatedAdapterPrefetcher.onInvalidate();
                    throw th;
                }
            } else {
                if (r12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mediatedAdapterPrefetcher2 = this.f27787c;
                zy0Var2 = this.f27786b;
                try {
                    b9.n.b(obj);
                } catch (Exception unused3) {
                    zy0Var = zy0Var2;
                    ck1 ck1Var2 = this.f27789e.f30024d;
                    String adapter2 = zy0Var.e();
                    ck1Var2.getClass();
                    kotlin.jvm.internal.l.f(adapter2, "adapter");
                    bk1Var = new bk1(adapter2, null, null, new mk1(nk1.f30924d, null, null), null);
                    mediatedAdapterPrefetcher2.onInvalidate();
                    return bk1Var;
                }
            }
            bk1Var = (bk1) obj;
            mediatedAdapterPrefetcher2.onInvalidate();
            return bk1Var;
        } catch (Throwable th3) {
            th = th3;
            mediatedAdapterPrefetcher = r12;
        }
    }
}
