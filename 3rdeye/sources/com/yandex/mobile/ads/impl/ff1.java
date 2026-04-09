package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ff1 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<?> f27312a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4105f1 f27313b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27314c;

    public ff1(Context context, a8 adResponse, C4188r1 adActivityListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        this.f27312a = adResponse;
        this.f27313b = adActivityListener;
        this.f27314c = context.getApplicationContext();
    }

    public final void a() {
        if (this.f27312a.S()) {
            return;
        }
        vy1 vy1VarM = this.f27312a.M();
        Context context = this.f27314c;
        kotlin.jvm.internal.l.e(context, "context");
        new gb0(context, vy1VarM, this.f27313b).a();
    }
}
