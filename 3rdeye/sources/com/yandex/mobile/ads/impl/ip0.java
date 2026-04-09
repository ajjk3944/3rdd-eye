package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ip0 implements nd0<hp0> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f28770a;

    public ip0(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        this.f28770a = context;
    }

    @Override // com.yandex.mobile.ads.impl.nd0
    public final td0 a(a8 adResponse, C4072a3 adConfiguration, wc0 fullScreenController) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullScreenController, "fullScreenController");
        return new hp0(this.f28770a, adResponse, adConfiguration, new pc0(), new dg0(), fullScreenController);
    }
}
