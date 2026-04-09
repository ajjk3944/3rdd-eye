package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class fw1 {

    /* renamed from: a, reason: collision with root package name */
    private final at0 f27475a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f27476b;

    public fw1(at0 manifestAnalyzer, vu1 sdkEnvironmentModule) {
        kotlin.jvm.internal.l.f(manifestAnalyzer, "manifestAnalyzer");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        this.f27475a = manifestAnalyzer;
        this.f27476b = sdkEnvironmentModule;
    }

    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f27475a.getClass();
        if (at0.e(context)) {
            f11.a(context, this.f27476b, new J0(3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a() {
        fp0.a(new Object[0]);
    }
}
