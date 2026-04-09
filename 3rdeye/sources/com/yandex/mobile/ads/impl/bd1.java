package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import b9.C1992A;
import f9.InterfaceC4347e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class bd1 {

    /* renamed from: a, reason: collision with root package name */
    private final dz0 f25235a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f25236b;

    @h9.e(c = "com.monetization.ads.base.mediation.bidding.NetworksHeaderBiddingDataLoader$loadNetworksBiddingDataInternal$3", f = "NetworksHeaderBiddingDataLoader.kt", l = {}, m = "invokeSuspend")
    public static final class a extends h9.i implements p9.p<A9.E, InterfaceC4347e<? super JSONArray>, Object> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ CountDownLatch f25238c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ArrayList<JSONObject> f25239d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ yk f25240e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(CountDownLatch countDownLatch, ArrayList<JSONObject> arrayList, yk ykVar, InterfaceC4347e<? super a> interfaceC4347e) {
            super(2, interfaceC4347e);
            this.f25238c = countDownLatch;
            this.f25239d = arrayList;
            this.f25240e = ykVar;
        }

        @Override // h9.AbstractC4424a
        public final InterfaceC4347e<C1992A> create(Object obj, InterfaceC4347e<?> interfaceC4347e) {
            return bd1.this.new a(this.f25238c, this.f25239d, this.f25240e, interfaceC4347e);
        }

        @Override // p9.p
        public final Object invoke(A9.E e4, InterfaceC4347e<? super JSONArray> interfaceC4347e) {
            return ((a) create(e4, interfaceC4347e)).invokeSuspend(C1992A.f18074a);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            g9.a aVar = g9.a.COROUTINE_SUSPENDED;
            b9.n.b(obj);
            return bd1.a(bd1.this, this.f25238c, this.f25239d, this.f25240e);
        }
    }

    public /* synthetic */ bd1(ux0 ux0Var) {
        this(ux0Var, new dz0(ux0Var));
    }

    public static final JSONArray a(bd1 bd1Var, CountDownLatch countDownLatch, ArrayList arrayList, yk ykVar) {
        JSONArray jSONArray;
        bd1Var.getClass();
        try {
            if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                fp0.b(new Object[0]);
            }
            ykVar.b();
            synchronized (bd1Var.f25236b) {
                jSONArray = new JSONArray((Collection) arrayList);
            }
            return jSONArray;
        } catch (InterruptedException unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    public bd1(ux0 mediatedAdapterReporter, dz0 mediationNetworkBiddingDataLoader) {
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(mediationNetworkBiddingDataLoader, "mediationNetworkBiddingDataLoader");
        this.f25235a = mediationNetworkBiddingDataLoader;
        this.f25236b = new Object();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object a(Context context, vy1 vy1Var, List<zy0> list, InterfaceC4347e<? super JSONArray> interfaceC4347e) {
        ArrayList arrayList = new ArrayList(list.size());
        CountDownLatch countDownLatch = new CountDownLatch(list.size());
        yk ykVar = new yk();
        Iterator<zy0> it = list.iterator();
        while (it.hasNext()) {
            yk ykVar2 = ykVar;
            this.f25235a.a(context, vy1Var, it.next(), ykVar2, new com.applovin.impl.A0(this, countDownLatch, arrayList));
            ykVar = ykVar2;
        }
        return C0575f.h(A9.U.f212b, new a(countDownLatch, arrayList, ykVar, null), interfaceC4347e);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bd1 this$0, CountDownLatch resultsCollectingLatch, ArrayList networksBiddingDataList, JSONObject jSONObject) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(resultsCollectingLatch, "$resultsCollectingLatch");
        kotlin.jvm.internal.l.f(networksBiddingDataList, "$networksBiddingDataList");
        if (jSONObject != null) {
            synchronized (this$0.f25236b) {
                networksBiddingDataList.add(jSONObject);
            }
        }
        resultsCollectingLatch.countDown();
    }
}
