package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class k50 {

    /* renamed from: c, reason: collision with root package name */
    private static k50 f29495c;

    /* renamed from: d, reason: collision with root package name */
    private static final Object f29496d = new Object();

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f29497e = 0;

    /* renamed from: a, reason: collision with root package name */
    private final j50 f29498a;

    /* renamed from: b, reason: collision with root package name */
    private mi0 f29499b;

    public static final class a {
        public static k50 a(Context context) {
            k50 k50Var;
            kotlin.jvm.internal.l.f(context, "context");
            k50 k50Var2 = k50.f29495c;
            if (k50Var2 != null) {
                return k50Var2;
            }
            synchronized (k50.f29496d) {
                k50Var = k50.f29495c;
                if (k50Var == null) {
                    Context applicationContext = context.getApplicationContext();
                    kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
                    k50Var = new k50(applicationContext, new j50(), xe.a(applicationContext));
                    k50.f29495c = k50Var;
                }
            }
            return k50Var;
        }
    }

    public k50(Context appContext, j50 environmentConfiguration, mi0 appMetricaProvider) {
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(environmentConfiguration, "environmentConfiguration");
        kotlin.jvm.internal.l.f(appMetricaProvider, "appMetricaProvider");
        this.f29498a = environmentConfiguration;
        this.f29499b = appMetricaProvider;
    }

    public final j50 c() {
        return this.f29498a;
    }

    public final mi0 d() {
        return this.f29499b;
    }
}
