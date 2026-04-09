package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class gb0 {

    /* renamed from: a, reason: collision with root package name */
    private final vy1 f27610a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC4105f1 f27611b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f27612c;

    public gb0(Context context, vy1 sizeInfo, InterfaceC4105f1 adActivityListener) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sizeInfo, "sizeInfo");
        kotlin.jvm.internal.l.f(adActivityListener, "adActivityListener");
        this.f27610a = sizeInfo;
        this.f27611b = adActivityListener;
        this.f27612c = context.getApplicationContext();
    }

    public final void a() {
        int i = this.f27612c.getResources().getConfiguration().orientation;
        Context context = this.f27612c;
        kotlin.jvm.internal.l.e(context, "context");
        vy1 vy1Var = this.f27610a;
        boolean zB = ca.b(context, vy1Var);
        boolean zA = ca.a(context, vy1Var);
        int i10 = zB == zA ? -1 : (!zA ? 1 == i : 1 != i) ? 6 : 7;
        if (-1 != i10) {
            this.f27611b.a(i10);
        }
    }
}
