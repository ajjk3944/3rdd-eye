package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class sb2 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f32930a;

    /* renamed from: b, reason: collision with root package name */
    private final yb2 f32931b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f32932c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f32933d;

    public /* synthetic */ sb2(Context context, C4072a3 c4072a3, C4198s4 c4198s4) {
        yb2 yb2Var = new yb2(context, c4072a3, c4198s4);
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, c4198s4, yb2Var, applicationContext);
    }

    public final void a(u92 configuration, sn0 requestConfigurationParametersProvider, r92 requestListener) {
        kotlin.jvm.internal.l.f(configuration, "configuration");
        kotlin.jvm.internal.l.f(requestConfigurationParametersProvider, "requestConfigurationParametersProvider");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        Context context = this.f32932c;
        vu1 vu1VarQ = this.f32930a.q();
        ym2 ym2VarA = vu1VarQ.a();
        this.f32931b.a(configuration, requestConfigurationParametersProvider, this.f32933d, new x92(context, vu1VarQ, requestListener, new da2(context, ym2VarA, ym2VarA.a(context))));
    }

    public sb2(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, yb2 videoAdLoaderController, Context applicationContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(videoAdLoaderController, "videoAdLoaderController");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        this.f32930a = adConfiguration;
        this.f32931b = videoAdLoaderController;
        this.f32932c = applicationContext;
        this.f32933d = new Object();
    }

    public final void a(bi2 vmapRequestConfig, fm0 requestListener) {
        kotlin.jvm.internal.l.f(vmapRequestConfig, "vmapRequestConfig");
        kotlin.jvm.internal.l.f(requestListener, "requestListener");
        this.f32931b.a(vmapRequestConfig, this.f32933d, requestListener);
    }
}
