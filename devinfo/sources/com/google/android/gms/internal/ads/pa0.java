package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class pa0 {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f14942k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final ya.c0 f14943a;

    /* renamed from: b, reason: collision with root package name */
    public final hq0 f14944b;

    /* renamed from: c, reason: collision with root package name */
    public final ia0 f14945c;

    /* renamed from: d, reason: collision with root package name */
    public final ga0 f14946d;

    /* renamed from: e, reason: collision with root package name */
    public final wa0 f14947e;

    /* renamed from: f, reason: collision with root package name */
    public final ab0 f14948f;
    public final Executor g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f14949h;

    /* renamed from: i, reason: collision with root package name */
    public final qm f14950i;
    public final ea0 j;

    public pa0(ya.c0 c0Var, hq0 hq0Var, ia0 ia0Var, ga0 ga0Var, wa0 wa0Var, ab0 ab0Var, Executor executor, ex exVar, ea0 ea0Var) {
        this.f14943a = c0Var;
        this.f14944b = hq0Var;
        this.f14950i = hq0Var.j;
        this.f14945c = ia0Var;
        this.f14946d = ga0Var;
        this.f14947e = wa0Var;
        this.f14948f = ab0Var;
        this.g = executor;
        this.f14949h = exVar;
        this.j = ea0Var;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i4) {
        if (i4 == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i4 == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i4 != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(bb0 bb0Var) {
        if (bb0Var == null) {
            return;
        }
        Context context = bb0Var.f2().getContext();
        if (pk.a.O(context, this.f14945c.f12183a)) {
            if (!(context instanceof Activity)) {
                za.i.c("Activity context is needed for policy validator.");
                return;
            }
            ab0 ab0Var = this.f14948f;
            if (ab0Var == null || bb0Var.O3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(ab0Var.a(bb0Var.O3(), windowManager), pk.a.Q());
            } catch (zz e2) {
                ya.a0.n("web view can not be obtained", e2);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z3) {
        View view;
        View viewJ;
        if (z3) {
            viewJ = this.f14946d.j();
        } else {
            ga0 ga0Var = this.f14946d;
            synchronized (ga0Var) {
                view = ga0Var.f11426p;
            }
            viewJ = view;
        }
        if (viewJ == null) {
            return false;
        }
        viewGroup.removeAllViews();
        if (viewJ.getParent() instanceof ViewGroup) {
            ((ViewGroup) viewJ.getParent()).removeView(viewJ);
        }
        viewGroup.addView(viewJ, ((Boolean) va.s.f36163e.f36166c.a(sk.A4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
