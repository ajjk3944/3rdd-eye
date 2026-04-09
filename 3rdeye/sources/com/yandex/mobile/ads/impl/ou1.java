package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ew1;

/* loaded from: classes3.dex */
public final class ou1 implements bq1<du1> {

    /* renamed from: a, reason: collision with root package name */
    private final ew1 f31502a;

    /* renamed from: b, reason: collision with root package name */
    private final cr1<du1> f31503b;

    /* renamed from: c, reason: collision with root package name */
    private final mu1 f31504c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f31505d;

    public /* synthetic */ ou1(Context context, mp1 mp1Var) {
        this(context, mp1Var, ew1.a.a(), new ru1(mp1Var), new mu1());
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final du1 a(nc1 networkResponse) {
        kotlin.jvm.internal.l.f(networkResponse, "networkResponse");
        return this.f31503b.a(networkResponse);
    }

    @Override // com.yandex.mobile.ads.impl.bq1
    public final boolean a() {
        du1 du1VarA = this.f31502a.a(this.f31505d);
        return du1VarA == null || this.f31504c.a(du1VarA);
    }

    public ou1(Context context, mp1 reporter, ew1 sdkSettings, cr1<du1> sdkConfigurationResponseParser, mu1 sdkConfigurationRefreshChecker) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(sdkSettings, "sdkSettings");
        kotlin.jvm.internal.l.f(sdkConfigurationResponseParser, "sdkConfigurationResponseParser");
        kotlin.jvm.internal.l.f(sdkConfigurationRefreshChecker, "sdkConfigurationRefreshChecker");
        this.f31502a = sdkSettings;
        this.f31503b = sdkConfigurationResponseParser;
        this.f31504c = sdkConfigurationRefreshChecker;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f31505d = applicationContext;
    }
}
