package com.yandex.mobile.ads.impl;

import A9.C0583j;
import A9.InterfaceC0581i;
import android.content.Context;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener;
import com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetcher;
import com.monetization.ads.mediation.base.prefetch.model.MediatedPrefetchAdapterData;
import f9.InterfaceC4347e;
import java.util.HashMap;

/* loaded from: classes3.dex */
public final class dk1 {

    /* renamed from: a, reason: collision with root package name */
    private final ck1 f26214a;

    public static final class a implements MediatedAdapterPrefetchListener {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ zy0 f26216b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ InterfaceC0581i<bk1> f26217c;

        public a(zy0 zy0Var, C0583j c0583j) {
            this.f26216b = zy0Var;
            this.f26217c = c0583j;
        }

        @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
        public final void onPrefetchFailed(Integer num, String str) {
            ck1 ck1Var = dk1.this.f26214a;
            String adapter = this.f26216b.e();
            ck1Var.getClass();
            kotlin.jvm.internal.l.f(adapter, "adapter");
            bk1 bk1Var = new bk1(adapter, null, null, new mk1(nk1.f30924d, str, num), null);
            if (this.f26217c.isActive()) {
                this.f26217c.resumeWith(bk1Var);
            }
        }

        @Override // com.monetization.ads.mediation.base.prefetch.MediatedAdapterPrefetchListener
        public final void onPrefetched(MediatedPrefetchAdapterData mediatedPrefetchAdapterData) {
            kotlin.jvm.internal.l.f(mediatedPrefetchAdapterData, "mediatedPrefetchAdapterData");
            ck1 ck1Var = dk1.this.f26214a;
            String adapter = this.f26216b.e();
            ck1Var.getClass();
            kotlin.jvm.internal.l.f(adapter, "adapter");
            bk1 bk1Var = new bk1(adapter, new fk1(mediatedPrefetchAdapterData.getNetworkWinner().getNetworkName(), mediatedPrefetchAdapterData.getNetworkWinner().getNetworkAdUnit()), new ok1(mediatedPrefetchAdapterData.getRevenue().getValue()), new mk1(nk1.f30923c, null, null), mediatedPrefetchAdapterData.getNetworkAdInfo());
            if (this.f26217c.isActive()) {
                this.f26217c.resumeWith(bk1Var);
            }
        }
    }

    public /* synthetic */ dk1() {
        this(new ck1());
    }

    public final Object a(Context context, vy1 vy1Var, zy0 zy0Var, MediatedAdapterPrefetcher mediatedAdapterPrefetcher, InterfaceC4347e<? super bk1> interfaceC4347e) {
        C0583j c0583j = new C0583j(1, com.google.gson.internal.c.r(interfaceC4347e));
        c0583j.s();
        try {
            Context contextA = C4146l0.a();
            if (contextA != null) {
                context = contextA;
            }
            HashMap map = new HashMap(zy0Var.i());
            if (vy1Var != null) {
                map.put("width", String.valueOf(vy1Var.getWidth()));
                map.put("height", String.valueOf(vy1Var.getHeight()));
            }
            mediatedAdapterPrefetcher.prefetchAd(context, map, new a(zy0Var, c0583j));
        } catch (Exception unused) {
            if (c0583j.isActive()) {
                mediatedAdapterPrefetcher.onInvalidate();
                ck1 ck1Var = this.f26214a;
                String adapter = zy0Var.e();
                ck1Var.getClass();
                kotlin.jvm.internal.l.f(adapter, "adapter");
                c0583j.resumeWith(new bk1(adapter, null, null, new mk1(nk1.f30924d, null, null), null));
            }
        }
        Object objR = c0583j.r();
        g9.a aVar = g9.a.COROUTINE_SUSPENDED;
        return objR;
    }

    public dk1(ck1 prefetchedMediationInfoFactory) {
        kotlin.jvm.internal.l.f(prefetchedMediationInfoFactory, "prefetchedMediationInfoFactory");
        this.f26214a = prefetchedMediationInfoFactory;
    }
}
