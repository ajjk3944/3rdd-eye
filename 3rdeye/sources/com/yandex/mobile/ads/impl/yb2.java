package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;
import com.yandex.mobile.ads.impl.rb2;
import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class yb2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f35697a;

    /* renamed from: b, reason: collision with root package name */
    private final C4198s4 f35698b;

    /* renamed from: c, reason: collision with root package name */
    private final rb2 f35699c;

    /* renamed from: d, reason: collision with root package name */
    private final o92 f35700d;

    /* renamed from: e, reason: collision with root package name */
    private final A9.E f35701e;

    /* renamed from: f, reason: collision with root package name */
    private final jv1 f35702f;

    /* renamed from: g, reason: collision with root package name */
    private final gb2 f35703g;

    /* renamed from: h, reason: collision with root package name */
    private final Context f35704h;
    private final LinkedHashSet i;

    public /* synthetic */ yb2(Context context, C4072a3 c4072a3, C4198s4 c4198s4) {
        rb2 rb2VarA = rb2.a.a(context);
        o92 o92Var = new o92(c4072a3, c4198s4);
        A9.E eA = lu.a();
        jv1 jv1Var = new jv1(context, c4072a3.q(), eA, c4198s4, null, null, 524272);
        gb2 gb2Var = new gb2();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, c4198s4, rb2VarA, o92Var, eA, jv1Var, gb2Var, applicationContext);
    }

    public static final void a(yb2 yb2Var, cc ccVar, j50 j50Var) {
        yb2Var.f35697a.a(ccVar);
        yb2Var.f35697a.a(j50Var);
    }

    public final void a(u92 configuration, sn0 requestConfigurationParametersProvider, Object requestTag, x92 requestListener) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        ub2 ub2Var = new ub2(this, configuration, requestConfigurationParametersProvider, requestListener, requestTag);
        vb2 vb2Var = new vb2(requestListener);
        if (this.i.contains(requestTag)) {
            ub2Var.invoke();
        } else {
            C0575f.e(this.f35701e, null, null, new tb2(this, requestTag, ub2Var, vb2Var, null), 3);
        }
    }

    public yb2(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, rb2 videoAdLoadNetwork, o92 vastDataRequestListenerFactory, A9.E coroutineScope, jv1 sdkInitializer, gb2 videoAdErrorProvider, Context applicationContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(videoAdLoadNetwork, "videoAdLoadNetwork");
        kotlin.jvm.internal.l.f(vastDataRequestListenerFactory, "vastDataRequestListenerFactory");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(sdkInitializer, "sdkInitializer");
        kotlin.jvm.internal.l.f(videoAdErrorProvider, "videoAdErrorProvider");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        this.f35697a = adConfiguration;
        this.f35698b = adLoadingPhasesManager;
        this.f35699c = videoAdLoadNetwork;
        this.f35700d = vastDataRequestListenerFactory;
        this.f35701e = coroutineScope;
        this.f35702f = sdkInitializer;
        this.f35703g = videoAdErrorProvider;
        this.f35704h = applicationContext;
        this.i = new LinkedHashSet();
    }

    public final void a(bi2 configuration, Object requestTag, fm0 requestListener) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestTag, "requestTag");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        wb2 wb2Var = new wb2(this, requestListener, configuration, requestTag);
        xb2 xb2Var = new xb2(requestListener);
        if (this.i.contains(requestTag)) {
            wb2Var.invoke();
        } else {
            C0575f.e(this.f35701e, null, null, new tb2(this, requestTag, wb2Var, xb2Var, null), 3);
        }
    }
}
