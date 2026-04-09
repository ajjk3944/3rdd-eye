package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class op0 {

    /* renamed from: a, reason: collision with root package name */
    private final lm1 f31458a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31459b;

    public /* synthetic */ op0(Context context, gd0 gd0Var) {
        this(context, new lm1(gd0Var));
    }

    public final np0 a(hp0 contentController) {
        kotlin.jvm.internal.l.f(contentController, "contentController");
        Context appContext = this.f31459b;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        return new np0(appContext, contentController, this.f31458a, new zs0(appContext), new vs0());
    }

    public op0(Context context, lm1 proxyInterstitialAdShowListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(proxyInterstitialAdShowListener, "proxyInterstitialAdShowListener");
        this.f31458a = proxyInterstitialAdShowListener;
        this.f31459b = context.getApplicationContext();
    }
}
