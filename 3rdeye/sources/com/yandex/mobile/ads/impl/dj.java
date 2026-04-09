package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.RelativeLayout;

/* loaded from: classes3.dex */
public final class dj<T extends ViewGroup> {

    /* renamed from: d, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f26192d;

    /* renamed from: a, reason: collision with root package name */
    private final ViewTreeObserver.OnPreDrawListener f26193a;

    /* renamed from: b, reason: collision with root package name */
    private w00<T> f26194b;

    /* renamed from: c, reason: collision with root package name */
    private final ao1 f26195c;

    static {
        kotlin.jvm.internal.n nVar = new kotlin.jvm.internal.n(dj.class, "parentDesignView", "getParentDesignView()Landroid/view/ViewGroup;");
        kotlin.jvm.internal.x.f43661a.getClass();
        f26192d = new w9.i[]{nVar};
    }

    public dj(ViewTreeObserver.OnPreDrawListener preDrawListener) {
        kotlin.jvm.internal.l.f(preDrawListener, "preDrawListener");
        this.f26193a = preDrawListener;
        this.f26195c = bo1.a(null);
    }

    public final void a(ViewGroup container, T designView, sq0<T> layoutDesign, vy1 vy1Var) {
        kotlin.jvm.internal.l.f(container, "container");
        kotlin.jvm.internal.l.f(designView, "designView");
        kotlin.jvm.internal.l.f(layoutDesign, "layoutDesign");
        this.f26195c.setValue(this, f26192d[0], designView);
        container.setVisibility(0);
        container.removeAllViews();
        Context context = container.getContext();
        kotlin.jvm.internal.l.e(context, "getContext(...)");
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = this.f26193a;
        int i = mg2.f30375b;
        if (container.indexOfChild(designView) == -1) {
            RelativeLayout.LayoutParams layoutParamsA = y7.a(context, vy1Var);
            container.setVisibility(0);
            designView.setVisibility(0);
            container.addView(designView, layoutParamsA);
            if (onPreDrawListener != null) {
                jh2.a(designView, onPreDrawListener);
            }
        }
        w00<T> w00Var = (w00<T>) layoutDesign.a();
        this.f26194b = w00Var;
        if (w00Var != null) {
            w00Var.a(designView);
        }
    }

    public final void a() {
        ViewGroup viewGroup = (ViewGroup) this.f26195c.getValue(this, f26192d[0]);
        if (viewGroup != null) {
            ng2.a(viewGroup);
        }
        w00<T> w00Var = this.f26194b;
        if (w00Var != null) {
            w00Var.c();
        }
    }
}
