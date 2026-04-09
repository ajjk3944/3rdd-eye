package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class fl {

    /* renamed from: a, reason: collision with root package name */
    private final List<kb2> f27368a;

    /* renamed from: b, reason: collision with root package name */
    private final ys f27369b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<ViewGroup> f27370c;

    /* renamed from: d, reason: collision with root package name */
    private final gl0 f27371d;

    /* renamed from: e, reason: collision with root package name */
    private o70 f27372e;

    public fl(ViewGroup adViewGroup, List<kb2> friendlyOverlays, ys binder, WeakReference<ViewGroup> adViewGroupReference, gl0 binderPrivate, o70 o70Var) {
        kotlin.jvm.internal.l.f(adViewGroup, "adViewGroup");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        kotlin.jvm.internal.l.f(binder, "binder");
        kotlin.jvm.internal.l.f(adViewGroupReference, "adViewGroupReference");
        kotlin.jvm.internal.l.f(binderPrivate, "binderPrivate");
        this.f27368a = friendlyOverlays;
        this.f27369b = binder;
        this.f27370c = adViewGroupReference;
        this.f27371d = binderPrivate;
        this.f27372e = o70Var;
    }

    public final void a() {
        ViewGroup viewGroup = this.f27370c.get();
        if (viewGroup != null) {
            if (this.f27372e == null) {
                Context context = viewGroup.getContext();
                kotlin.jvm.internal.l.e(context, "getContext(...)");
                this.f27372e = new o70(context);
                viewGroup.addView(this.f27372e, new ViewGroup.LayoutParams(-1, -1));
            }
            o70 o70Var = this.f27372e;
            if (o70Var != null) {
                this.f27371d.a(o70Var, this.f27368a);
            }
        }
    }

    public final void b() {
        o70 o70Var;
        ViewGroup viewGroup = this.f27370c.get();
        if (viewGroup != null && (o70Var = this.f27372e) != null) {
            viewGroup.removeView(o70Var);
        }
        this.f27372e = null;
        ys ysVar = this.f27369b;
        ysVar.a((sl2) null);
        ysVar.e();
        ysVar.invalidateAdPlayer();
        ysVar.a();
    }

    public final void c() {
        this.f27371d.a();
    }

    public final void d() {
        this.f27371d.b();
    }

    public final void a(ab2 ab2Var) {
        this.f27369b.a(ab2Var);
    }
}
