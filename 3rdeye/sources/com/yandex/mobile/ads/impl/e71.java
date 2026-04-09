package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.i62;

/* loaded from: classes3.dex */
public final class e71 implements View.OnAttachStateChangeListener {

    /* renamed from: e, reason: collision with root package name */
    static final /* synthetic */ w9.i<Object>[] f26704e = {fa.a(e71.class, "viewReference", "getViewReference()Landroid/view/View;", 0)};

    /* renamed from: a, reason: collision with root package name */
    private final i62.a f26705a;

    /* renamed from: b, reason: collision with root package name */
    private final a71 f26706b;

    /* renamed from: c, reason: collision with root package name */
    private z61 f26707c;

    /* renamed from: d, reason: collision with root package name */
    private final ao1 f26708d;

    public e71(View view, q81 trackingListener, a71 globalLayoutListenerFactory) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
        kotlin.jvm.internal.l.f(globalLayoutListenerFactory, "globalLayoutListenerFactory");
        this.f26705a = trackingListener;
        this.f26706b = globalLayoutListenerFactory;
        this.f26708d = bo1.a(view);
    }

    public final void a() {
        ao1 ao1Var = this.f26708d;
        w9.i<?>[] iVarArr = f26704e;
        View view = (View) ao1Var.getValue(this, iVarArr[0]);
        if (view != null) {
            view.addOnAttachStateChangeListener(this);
        }
        View view2 = (View) this.f26708d.getValue(this, iVarArr[0]);
        if (view2 != null && view2.isAttachedToWindow()) {
            a71 a71Var = this.f26706b;
            i62.a trackingListener = this.f26705a;
            a71Var.getClass();
            kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
            z61 z61Var = new z61(view2, trackingListener);
            this.f26707c = z61Var;
            z61Var.a();
        }
    }

    public final void b() {
        z61 z61Var = this.f26707c;
        if (z61Var != null) {
            z61Var.b();
        }
        this.f26707c = null;
        View view = (View) this.f26708d.getValue(this, f26704e[0]);
        if (view != null) {
            view.removeOnAttachStateChangeListener(this);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        this.f26705a.a();
        View view = (View) this.f26708d.getValue(this, f26704e[0]);
        if (view != null && view.isAttachedToWindow()) {
            a71 a71Var = this.f26706b;
            i62.a trackingListener = this.f26705a;
            a71Var.getClass();
            kotlin.jvm.internal.l.f(trackingListener, "trackingListener");
            z61 z61Var = new z61(view, trackingListener);
            this.f26707c = z61Var;
            z61Var.a();
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View v10) {
        kotlin.jvm.internal.l.f(v10, "v");
        z61 z61Var = this.f26707c;
        if (z61Var != null) {
            z61Var.b();
        }
        this.f26707c = null;
        this.f26705a.b();
    }
}
