package com.yandex.mobile.ads.impl;

import R9.AbstractC1564a;
import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;

/* loaded from: classes3.dex */
public final class e50 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f26673a;

    /* renamed from: b, reason: collision with root package name */
    private final q9 f26674b;

    /* renamed from: c, reason: collision with root package name */
    private final lk1 f26675c;

    /* renamed from: d, reason: collision with root package name */
    private final AbstractC1564a f26676d;

    @h9.e(c = "com.monetization.ads.base.mediation.prefetch.EncodedPrefetchedMediationDataLoader", f = "EncodedPrefetchedMediationDataLoader.kt", l = {33}, m = "loadEncodedPrefetchedMediationData")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        e50 f26677b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f26678c;

        /* renamed from: e, reason: collision with root package name */
        int f26680e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f26678c = obj;
            this.f26680e |= RecyclerView.UNDEFINED_DURATION;
            return e50.this.a(null, this);
        }
    }

    public e50(C4072a3 adConfiguration, zk biddingSettings, q9 adUnitIdMediationPrefetchSettingsProvider, ux0 mediatedAdapterReporter, lk1 prefetchedMediationNetworksDataLoader, AbstractC1564a jsonEncoder) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(biddingSettings, "biddingSettings");
        kotlin.jvm.internal.l.f(adUnitIdMediationPrefetchSettingsProvider, "adUnitIdMediationPrefetchSettingsProvider");
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(prefetchedMediationNetworksDataLoader, "prefetchedMediationNetworksDataLoader");
        kotlin.jvm.internal.l.f(jsonEncoder, "jsonEncoder");
        this.f26673a = adConfiguration;
        this.f26674b = adUnitIdMediationPrefetchSettingsProvider;
        this.f26675c = prefetchedMediationNetworksDataLoader;
        this.f26676d = jsonEncoder;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r11, f9.InterfaceC4347e<? super java.lang.String> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof com.yandex.mobile.ads.impl.e50.a
            if (r0 == 0) goto L13
            r0 = r12
            com.yandex.mobile.ads.impl.e50$a r0 = (com.yandex.mobile.ads.impl.e50.a) r0
            int r1 = r0.f26680e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f26680e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.e50$a r0 = new com.yandex.mobile.ads.impl.e50$a
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f26678c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f26680e
            r3 = 1
            if (r2 == 0) goto L31
            if (r2 != r3) goto L29
            com.yandex.mobile.ads.impl.e50 r11 = r0.f26677b
            b9.n.b(r12)
            goto L73
        L29:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L31:
            b9.n.b(r12)
            com.yandex.mobile.ads.impl.a3 r12 = r10.f26673a
            java.lang.String r12 = r12.c()
            com.yandex.mobile.ads.impl.q9 r2 = r10.f26674b
            com.yandex.mobile.ads.impl.tz0 r12 = r2.a(r12)
            if (r12 != 0) goto L44
            r11 = 0
            return r11
        L44:
            java.util.List r8 = r12.b()
            long r4 = r12.a()
            com.yandex.mobile.ads.impl.a3 r12 = r10.f26673a
            com.yandex.mobile.ads.impl.vy1 r6 = r12.r()
            com.yandex.mobile.ads.impl.lk1 r7 = r10.f26675c
            r0.f26677b = r10
            r0.f26680e = r3
            r7.getClass()
            I9.c r12 = A9.U.f211a
            B9.g r12 = F9.q.f1782a
            B9.g r12 = r12.R0()
            com.yandex.mobile.ads.impl.hk1 r2 = new com.yandex.mobile.ads.impl.hk1
            r9 = 0
            r3 = r4
            r5 = r11
            r2.<init>(r3, r5, r6, r7, r8, r9)
            java.lang.Object r12 = A9.C0575f.h(r12, r2, r0)
            if (r12 != r1) goto L72
            return r1
        L72:
            r11 = r10
        L73:
            com.yandex.mobile.ads.impl.zj1 r12 = (com.yandex.mobile.ads.impl.zj1) r12
            R9.a r11 = r11.f26676d
            r11.getClass()
            com.yandex.mobile.ads.impl.zj1$b r0 = com.yandex.mobile.ads.impl.zj1.Companion
            M9.b r0 = r0.serializer()
            java.lang.String r11 = r11.b(r0, r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.e50.a(android.content.Context, f9.e):java.lang.Object");
    }
}
