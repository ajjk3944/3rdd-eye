package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class rb2 {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f32583b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static volatile rb2 f32584c;

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f32585d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final cq1 f32586a;

    public static final class a {
        public static rb2 a(Context context) {
            rb2 rb2Var;
            kotlin.jvm.internal.l.f(context, "context");
            rb2 rb2Var2 = rb2.f32584c;
            if (rb2Var2 != null) {
                return rb2Var2;
            }
            synchronized (rb2.f32583b) {
                rb2Var = rb2.f32584c;
                if (rb2Var == null) {
                    rb2Var = new rb2(uk2.a(context, 1));
                    rb2.f32584c = rb2Var;
                }
            }
            return rb2Var;
        }
    }

    public rb2(cq1 requestQueue) {
        kotlin.jvm.internal.l.f(requestQueue, "requestQueue");
        this.f32586a = requestQueue;
    }

    public final void a(Context context, C4072a3 adConfiguration, u92 requestConfiguration, v92 requestConfigurationParametersProvider, Object requestTag, n92 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        this.f32586a.a(new w92(new ca2()).a(context, adConfiguration, requestConfiguration, requestConfigurationParametersProvider, requestTag, requestListener));
    }

    public final void a(Context context, C4072a3 adConfiguration, v92 requestConfigurationParametersProvider, za2 wrapperAd, ad2 reportParametersProvider, dk2 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(wrapperAd, "wrapperAd");
        kotlin.jvm.internal.l.f(reportParametersProvider, "reportParametersProvider");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        this.f32586a.a(new lk2(new ca2(), new en0()).a(context, adConfiguration, requestConfigurationParametersProvider, wrapperAd, reportParametersProvider, requestListener));
    }

    public final void a(Context context, C4072a3 adConfiguration, bi2 requestConfiguration, Object requestTag, di2 requestListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(requestConfiguration, "requestConfiguration");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        n7 n7Var = new n7();
        ei2 ei2Var = new ei2();
        vp1 vp1Var = new vp1();
        this.f32586a.a(new ci2(n7Var, ei2Var, vp1Var, new bq(vp1Var), new f50(), new zw1()).a(context, adConfiguration, requestConfiguration, requestTag, requestListener));
    }
}
