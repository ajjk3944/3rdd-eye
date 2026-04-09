package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.util.TypedValue;

/* loaded from: classes3.dex */
public final class kd0 {

    /* renamed from: a, reason: collision with root package name */
    private final j10 f29634a = new j10();

    public final jd0 a(Context context, a8<String> adResponse, C4072a3 adConfiguration) throws gj2 {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.c(applicationContext);
        jd0 jd0Var = new jd0(applicationContext, adResponse, adConfiguration);
        jd0Var.setId(2);
        j10 j10Var = this.f29634a;
        float fR = adResponse.r();
        j10Var.getClass();
        int iY = com.google.gson.internal.c.y(TypedValue.applyDimension(1, fR, applicationContext.getResources().getDisplayMetrics()));
        j10 j10Var2 = this.f29634a;
        float fC = adResponse.c();
        j10Var2.getClass();
        int iY2 = com.google.gson.internal.c.y(TypedValue.applyDimension(1, fC, applicationContext.getResources().getDisplayMetrics()));
        if (iY > 0 && iY2 > 0) {
            jd0Var.layout(0, 0, iY, iY2);
        }
        return jd0Var;
    }
}
