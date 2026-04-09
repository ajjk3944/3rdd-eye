package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class nw1 {

    /* renamed from: a, reason: collision with root package name */
    private final v82 f31034a;

    /* renamed from: b, reason: collision with root package name */
    private final x82 f31035b;

    public /* synthetic */ nw1(Context context) {
        this(context, new v82(context), new x82(context));
    }

    public final void a() {
        this.f31035b.a();
        this.f31034a.a();
    }

    public nw1(Context context, v82 indicatorController, x82 logController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(indicatorController, "indicatorController");
        kotlin.jvm.internal.l.f(logController, "logController");
        this.f31034a = indicatorController;
        this.f31035b = logController;
    }
}
