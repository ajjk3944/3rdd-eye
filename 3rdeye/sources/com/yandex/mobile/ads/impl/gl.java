package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;
import java.util.List;

/* loaded from: classes3.dex */
public final class gl {

    /* renamed from: a, reason: collision with root package name */
    private final List<kb2> f27804a;

    /* renamed from: b, reason: collision with root package name */
    private final ys f27805b;

    /* renamed from: c, reason: collision with root package name */
    private final WeakReference<ViewGroup> f27806c;

    /* renamed from: d, reason: collision with root package name */
    private final gl0 f27807d;

    /* renamed from: e, reason: collision with root package name */
    private o70 f27808e;

    public gl(ViewGroup adViewGroup, List<kb2> friendlyOverlays, ys binder, WeakReference<ViewGroup> adViewGroupReference, gl0 binderPrivate, o70 o70Var) {
        kotlin.jvm.internal.l.f(adViewGroup, "adViewGroup");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        kotlin.jvm.internal.l.f(binder, "binder");
        kotlin.jvm.internal.l.f(adViewGroupReference, "adViewGroupReference");
        kotlin.jvm.internal.l.f(binderPrivate, "binderPrivate");
        this.f27804a = friendlyOverlays;
        this.f27805b = binder;
        this.f27806c = adViewGroupReference;
        this.f27807d = binderPrivate;
        this.f27808e = o70Var;
    }

    public final void a() {
        ViewGroup viewGroup = this.f27806c.get();
        if (viewGroup != null) {
            if (this.f27808e == null) {
                Context context = viewGroup.getContext();
                kotlin.jvm.internal.l.e(context, "getContext(...)");
                o70 o70Var = new o70(context);
                o70Var.setTag("instream_ad_view");
                this.f27808e = o70Var;
                viewGroup.addView(this.f27808e, new ViewGroup.LayoutParams(-1, -1));
            }
            o70 o70Var2 = this.f27808e;
            if (o70Var2 != null) {
                this.f27807d.a(o70Var2, this.f27804a);
            }
        }
    }

    public final void b() {
        o70 o70Var;
        ViewGroup viewGroup = this.f27806c.get();
        if (viewGroup != null && (o70Var = this.f27808e) != null) {
            viewGroup.removeView(o70Var);
        }
        this.f27808e = null;
        ys ysVar = this.f27805b;
        ysVar.a((sl2) null);
        ysVar.e();
        ysVar.invalidateAdPlayer();
        ysVar.a();
    }

    public final void c() {
        this.f27807d.a();
    }

    public final void d() {
        this.f27807d.b();
    }

    public final void a(ab2 ab2Var) {
        this.f27805b.a(ab2Var);
    }
}
