package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class kj {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f29680a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f29681b;

    public kj(Context context, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f29680a = adConfiguration;
        this.f29681b = context.getApplicationContext();
    }

    public final jj a(a8<String> adResponse, vy1 configurationSizeInfo) throws gj2 {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(configurationSizeInfo, "configurationSizeInfo");
        Context appContext = this.f29681b;
        kotlin.jvm.internal.l.e(appContext, "appContext");
        return new jj(appContext, adResponse, this.f29680a, configurationSizeInfo);
    }
}
