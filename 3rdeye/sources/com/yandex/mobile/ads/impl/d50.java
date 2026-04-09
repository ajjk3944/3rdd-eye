package com.yandex.mobile.ads.impl;

import androidx.recyclerview.widget.RecyclerView;
import f9.InterfaceC4347e;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class d50 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f25954a;

    /* renamed from: b, reason: collision with root package name */
    private final nj f25955b;

    /* renamed from: c, reason: collision with root package name */
    private final p9 f25956c;

    /* renamed from: d, reason: collision with root package name */
    private final bd1 f25957d;

    @h9.e(c = "com.monetization.ads.base.mediation.bidding.EncodedHeaderBiddingDataLoader", f = "EncodedHeaderBiddingDataLoader.kt", l = {35, 44}, m = "loadEncodedBiddingData")
    public static final class a extends h9.c {

        /* renamed from: b, reason: collision with root package name */
        d50 f25958b;

        /* renamed from: c, reason: collision with root package name */
        /* synthetic */ Object f25959c;

        /* renamed from: e, reason: collision with root package name */
        int f25961e;

        public a(InterfaceC4347e<? super a> interfaceC4347e) {
            super(interfaceC4347e);
        }

        @Override // h9.AbstractC4424a
        public final Object invokeSuspend(Object obj) {
            this.f25959c = obj;
            this.f25961e |= RecyclerView.UNDEFINED_DURATION;
            return d50.this.a(null, this);
        }
    }

    public d50(C4072a3 adConfiguration, zk biddingSettings, nj base64Encoder, p9 adUnitIdHeaderBiddingSettingsProvider, ux0 mediatedAdapterReporter, bd1 networksHeaderBiddingDataLoader) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(biddingSettings, "biddingSettings");
        kotlin.jvm.internal.l.f(base64Encoder, "base64Encoder");
        kotlin.jvm.internal.l.f(adUnitIdHeaderBiddingSettingsProvider, "adUnitIdHeaderBiddingSettingsProvider");
        kotlin.jvm.internal.l.f(mediatedAdapterReporter, "mediatedAdapterReporter");
        kotlin.jvm.internal.l.f(networksHeaderBiddingDataLoader, "networksHeaderBiddingDataLoader");
        this.f25954a = adConfiguration;
        this.f25955b = base64Encoder;
        this.f25956c = adUnitIdHeaderBiddingSettingsProvider;
        this.f25957d = networksHeaderBiddingDataLoader;
    }

    private final String a(JSONArray jSONArray) throws JSONException {
        if (jSONArray == null || jSONArray.length() <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("networks", jSONArray);
            nj njVar = this.f25955b;
            String string = jSONObject.toString();
            kotlin.jvm.internal.l.e(string, "toString(...)");
            njVar.getClass();
            return nj.a(string);
        } catch (JSONException unused) {
            fp0.c(new Object[0]);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(android.content.Context r12, f9.InterfaceC4347e<? super java.lang.String> r13) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.yandex.mobile.ads.impl.d50.a
            if (r0 == 0) goto L13
            r0 = r13
            com.yandex.mobile.ads.impl.d50$a r0 = (com.yandex.mobile.ads.impl.d50.a) r0
            int r1 = r0.f25961e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f25961e = r1
            goto L18
        L13:
            com.yandex.mobile.ads.impl.d50$a r0 = new com.yandex.mobile.ads.impl.d50$a
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f25959c
            g9.a r1 = g9.a.COROUTINE_SUSPENDED
            int r2 = r0.f25961e
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3b
            if (r2 == r4) goto L35
            if (r2 != r3) goto L2d
            com.yandex.mobile.ads.impl.d50 r12 = r0.f25958b
            b9.n.b(r13)
            goto Lb2
        L2d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L35:
            com.yandex.mobile.ads.impl.d50 r12 = r0.f25958b
            b9.n.b(r13)
            goto L83
        L3b:
            b9.n.b(r13)
            com.yandex.mobile.ads.impl.a3 r13 = r11.f25954a
            java.lang.String r13 = r13.c()
            com.yandex.mobile.ads.impl.p9 r2 = r11.f25956c
            com.yandex.mobile.ads.impl.n9 r13 = r2.a(r13)
            r2 = 0
            if (r13 == 0) goto Lb9
            java.util.List r9 = r13.f()
            com.yandex.mobile.ads.impl.a3 r13 = r11.f25954a
            com.yandex.mobile.ads.impl.ns r13 = r13.b()
            com.yandex.mobile.ads.impl.ns r5 = com.yandex.mobile.ads.impl.ns.f30988d
            if (r13 != r5) goto L91
            com.yandex.mobile.ads.impl.a3 r13 = r11.f25954a
            com.yandex.mobile.ads.impl.vy1 r8 = r13.r()
            if (r8 == 0) goto L8a
            com.yandex.mobile.ads.impl.bd1 r6 = r11.f25957d
            r0.f25958b = r11
            r0.f25961e = r4
            r6.getClass()
            I9.c r13 = A9.U.f211a
            B9.g r13 = F9.q.f1782a
            B9.g r13 = r13.R0()
            com.yandex.mobile.ads.impl.ad1 r5 = new com.yandex.mobile.ads.impl.ad1
            r10 = 0
            r7 = r12
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = A9.C0575f.h(r13, r5, r0)
            if (r13 != r1) goto L82
            goto Lb0
        L82:
            r12 = r11
        L83:
            org.json.JSONArray r13 = (org.json.JSONArray) r13
            java.lang.String r12 = r12.a(r13)
            return r12
        L8a:
            r12 = 0
            java.lang.Object[] r12 = new java.lang.Object[r12]
            com.yandex.mobile.ads.impl.fp0.b(r12)
            return r2
        L91:
            r7 = r12
            com.yandex.mobile.ads.impl.bd1 r6 = r11.f25957d
            r0.f25958b = r11
            r0.f25961e = r3
            r6.getClass()
            I9.c r12 = A9.U.f211a
            B9.g r12 = F9.q.f1782a
            B9.g r12 = r12.R0()
            com.yandex.mobile.ads.impl.ad1 r5 = new com.yandex.mobile.ads.impl.ad1
            r10 = 0
            r8 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            java.lang.Object r13 = A9.C0575f.h(r12, r5, r0)
            if (r13 != r1) goto Lb1
        Lb0:
            return r1
        Lb1:
            r12 = r11
        Lb2:
            org.json.JSONArray r13 = (org.json.JSONArray) r13
            java.lang.String r12 = r12.a(r13)
            return r12
        Lb9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.d50.a(android.content.Context, f9.e):java.lang.Object");
    }
}
