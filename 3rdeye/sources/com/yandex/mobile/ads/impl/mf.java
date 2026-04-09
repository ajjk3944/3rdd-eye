package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class mf implements nd0<lf> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f30365a;

    public mf(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f30365a = context;
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final td0 a(a8 adResponse, C4072a3 adConfiguration, wc0 fullScreenController) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        return new lf(this.f30365a, adResponse, adConfiguration, new pc0(), new dg0(), fullScreenController);
    }
}
