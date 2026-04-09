package com.yandex.mobile.ads.impl;

import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.List;
import org.json.JSONArray;

@h9.e(c = "com.monetization.ads.base.mediation.bidding.NetworksHeaderBiddingDataLoader$loadNetworksBiddingData$2", f = "NetworksHeaderBiddingDataLoader.kt", l = {32}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class ad1 extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super JSONArray>, Object> {

    /* renamed from: b, reason: collision with root package name */
    int f24621b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ bd1 f24622c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Context f24623d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ vy1 f24624e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ List<zy0> f24625f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ad1(bd1 bd1Var, Context context, vy1 vy1Var, List<zy0> list, InterfaceC4347e<? super ad1> interfaceC4347e) {
        super(2, interfaceC4347e);
        this.f24622c = bd1Var;
        this.f24623d = context;
        this.f24624e = vy1Var;
        this.f24625f = list;
    }

    @Override // h9.AbstractC4424a
    public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
        return new ad1(this.f24622c, this.f24623d, this.f24624e, this.f24625f, interfaceC4347e);
    }

    @Override // p9.p
    public final Object invoke(A9.E e4, InterfaceC4347e<? super JSONArray> interfaceC4347e) {
        return ((ad1) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
    }

    @Override // h9.AbstractC4424a
    public final Object invokeSuspend(Object obj) {
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        int i = this.f24621b;
        if (i != 0) {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            b9.n.b(obj);
            return obj;
        }
        b9.n.b(obj);
        bd1 bd1Var = this.f24622c;
        Context context = this.f24623d;
        vy1 vy1Var = this.f24624e;
        List<zy0> list = this.f24625f;
        this.f24621b = 1;
        Object objA = bd1Var.a(context, vy1Var, (List<zy0>) list, (InterfaceC4347e<? super JSONArray>) this);
        return objA == aVar ? aVar : objA;
    }
}
