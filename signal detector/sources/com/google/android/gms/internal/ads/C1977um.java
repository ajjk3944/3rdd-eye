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
import q2.C2841s;
import t2.AbstractC2907C;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.um, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1977um {

    /* renamed from: k, reason: collision with root package name */
    public static final ImageView.ScaleType f17156k = ImageView.ScaleType.CENTER_INSIDE;

    /* renamed from: a, reason: collision with root package name */
    public final C2909E f17157a;

    /* renamed from: b, reason: collision with root package name */
    public final C0960bu f17158b;

    /* renamed from: c, reason: collision with root package name */
    public final C1600nm f17159c;

    /* renamed from: d, reason: collision with root package name */
    public final C1492lm f17160d;

    /* renamed from: e, reason: collision with root package name */
    public final C0443Bm f17161e;

    /* renamed from: f, reason: collision with root package name */
    public final C0511Fm f17162f;

    /* renamed from: g, reason: collision with root package name */
    public final Executor f17163g;

    /* renamed from: h, reason: collision with root package name */
    public final Executor f17164h;
    public final C0499Fa i;

    /* renamed from: j, reason: collision with root package name */
    public final C1384jm f17165j;

    public C1977um(C2909E c2909e, C0960bu c0960bu, C1600nm c1600nm, C1492lm c1492lm, C0443Bm c0443Bm, C0511Fm c0511Fm, Executor executor, C0623Mf c0623Mf, C1384jm c1384jm) {
        this.f17157a = c2909e;
        this.f17158b = c0960bu;
        this.i = c0960bu.f13487j;
        this.f17159c = c1600nm;
        this.f17160d = c1492lm;
        this.f17161e = c0443Bm;
        this.f17162f = c0511Fm;
        this.f17163g = executor;
        this.f17164h = c0623Mf;
        this.f17165j = c1384jm;
    }

    public static void b(RelativeLayout.LayoutParams layoutParams, int i) {
        if (i == 0) {
            layoutParams.addRule(10);
            layoutParams.addRule(9);
        } else if (i == 2) {
            layoutParams.addRule(12);
            layoutParams.addRule(11);
        } else if (i != 3) {
            layoutParams.addRule(10);
            layoutParams.addRule(11);
        } else {
            layoutParams.addRule(12);
            layoutParams.addRule(9);
        }
    }

    public final void a(InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm) {
        if (interfaceViewOnClickListenerC0528Gm == null) {
            return;
        }
        Context context = interfaceViewOnClickListenerC0528Gm.N1().getContext();
        if (a4.t.E(context, this.f17159c.f15813a)) {
            if (!(context instanceof Activity)) {
                u2.k.c("Activity context is needed for policy validator.");
                return;
            }
            C0511Fm c0511Fm = this.f17162f;
            if (c0511Fm == null || interfaceViewOnClickListenerC0528Gm.q3() == null) {
                return;
            }
            try {
                WindowManager windowManager = (WindowManager) context.getSystemService("window");
                windowManager.addView(c0511Fm.a(interfaceViewOnClickListenerC0528Gm.q3(), windowManager), a4.t.G());
            } catch (C1165fh e6) {
                AbstractC2907C.n("web view can not be obtained", e6);
            }
        }
    }

    public final boolean c(ViewGroup viewGroup, boolean z6) {
        View view;
        View viewJ;
        if (z6) {
            viewJ = this.f17160d.j();
        } else {
            C1492lm c1492lm = this.f17160d;
            synchronized (c1492lm) {
                view = c1492lm.f15449p;
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
        viewGroup.addView(viewJ, ((Boolean) C2841s.f23267e.f23270c.a(H9.A4)).booleanValue() ? new FrameLayout.LayoutParams(-1, -1, 17) : new FrameLayout.LayoutParams(-2, -2, 17));
        return true;
    }
}
