package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class wr1 implements nd0<vr1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f35047a;

    public wr1(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f35047a = context;
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final td0 a(a8 adResponse, C4072a3 adConfiguration, wc0 fullScreenController) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        Context context = this.f35047a;
        om1 om1Var = new om1();
        return new vr1(context, adResponse, adConfiguration, fullScreenController, om1Var, new is1(om1Var), new dg0(), new pc0(), new rt1(adConfiguration));
    }
}
