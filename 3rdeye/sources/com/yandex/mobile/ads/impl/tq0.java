package com.yandex.mobile.ads.impl;

import android.view.ViewGroup;

/* loaded from: classes3.dex */
public final class tq0<V extends ViewGroup> {

    /* renamed from: a, reason: collision with root package name */
    private w00<V> f33763a;

    public final void a(ViewGroup container, V designView, sq0<V> layoutDesign) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(designView, "designView");
        kotlin.jvm.internal.l.f(layoutDesign, "layoutDesign");
        try {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            container.removeAllViews();
            container.addView(designView, layoutParams);
        } catch (Throwable unused) {
        }
        w00<V> w00VarA = layoutDesign.a();
        this.f33763a = w00VarA;
        if (w00VarA != null) {
            w00VarA.a(designView);
        }
    }

    public final void a(ViewGroup container) {
        kotlin.jvm.internal.l.f(container, "container");
        try {
            container.removeAllViews();
            w00<V> w00Var = this.f33763a;
            if (w00Var != null) {
                w00Var.c();
            }
        } catch (Throwable unused) {
        }
    }
}
