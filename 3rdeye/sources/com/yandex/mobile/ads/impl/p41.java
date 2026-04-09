package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class p41 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f31586a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f31587b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f31588c;

    /* renamed from: d, reason: collision with root package name */
    private o71 f31589d;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ p41(Context context, C4072a3 c4072a3, a8 a8Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, a8Var, applicationContext);
    }

    public final yo a(String assetName, String clickType) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        kotlin.jvm.internal.l.f(clickType, "clickType");
        return new yo(this.f31588c, this.f31587b, this.f31586a, new q41(assetName, clickType, this.f31589d));
    }

    public p41(Context context, C4072a3 adConfiguration, a8<?> adResponse, Context appContext) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        this.f31586a = adConfiguration;
        this.f31587b = adResponse;
        this.f31588c = appContext;
    }

    public final void a(o71 o71Var) {
        this.f31589d = o71Var;
    }
}
