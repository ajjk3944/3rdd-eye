package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class c00 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25476a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f25477b;

    /* renamed from: c, reason: collision with root package name */
    private final a8<?> f25478c;

    public c00(Context context, a8 adResponse, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f25476a = context;
        this.f25477b = adConfiguration;
        this.f25478c = adResponse;
    }

    public final d70 a() {
        return new l60(this.f25476a, this.f25478c, this.f25477b).a();
    }
}
