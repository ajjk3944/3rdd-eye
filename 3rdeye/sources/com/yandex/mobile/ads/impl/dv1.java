package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class dv1<T> {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f26496a;

    /* renamed from: b, reason: collision with root package name */
    private final v8 f26497b;

    /* renamed from: c, reason: collision with root package name */
    private final cv1<T> f26498c;

    public dv1(C4072a3 adConfiguration, v8 sizeValidator, cv1<T> sdkHtmlAdCreateController) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(sizeValidator, "sizeValidator");
        kotlin.jvm.internal.l.f(sdkHtmlAdCreateController, "sdkHtmlAdCreateController");
        this.f26496a = adConfiguration;
        this.f26497b = sizeValidator;
        this.f26498c = sdkHtmlAdCreateController;
    }

    public final void a() {
        this.f26498c.a();
    }

    public final void a(Context context, a8<String> adResponse, ev1<T> creationListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(creationListener, "creationListener");
        String strI = adResponse.I();
        vy1 vy1VarM = adResponse.M();
        boolean zA = this.f26497b.a(context, vy1VarM);
        vy1 vy1VarR = this.f26496a.r();
        if (!zA) {
            creationListener.a(i7.k());
            return;
        }
        if (vy1VarR == null) {
            creationListener.a(i7.m());
            return;
        }
        if (!xy1.a(context, adResponse, vy1VarM, this.f26497b, vy1VarR)) {
            creationListener.a(i7.a(vy1VarR.c(context), vy1VarR.a(context), vy1VarM.getWidth(), vy1VarM.getHeight(), jh2.d(context), jh2.b(context)));
            return;
        }
        if (strI == null || y9.q.i0(strI)) {
            creationListener.a(i7.k());
        } else {
            if (!aa.a(context)) {
                creationListener.a(i7.z());
                return;
            }
            try {
                this.f26498c.a(adResponse, vy1VarR, strI, creationListener);
            } catch (gj2 unused) {
                creationListener.a(i7.y());
            }
        }
    }
}
