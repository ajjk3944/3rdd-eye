package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.os.Looper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.RelativeLayout;
import j$.util.DesugarCollections;
import java.util.Collections;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ts extends rt {

    /* renamed from: e, reason: collision with root package name */
    public String f16925e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f16926f;
    public int g;

    /* renamed from: h, reason: collision with root package name */
    public int f16927h;

    /* renamed from: i, reason: collision with root package name */
    public int f16928i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public int f16929k;

    /* renamed from: l, reason: collision with root package name */
    public int f16930l;

    /* renamed from: m, reason: collision with root package name */
    public final Object f16931m;

    /* renamed from: n, reason: collision with root package name */
    public final qz f16932n;

    /* renamed from: o, reason: collision with root package name */
    public final Activity f16933o;

    /* renamed from: p, reason: collision with root package name */
    public h0 f16934p;

    /* renamed from: q, reason: collision with root package name */
    public ImageView f16935q;

    /* renamed from: r, reason: collision with root package name */
    public LinearLayout f16936r;

    /* renamed from: s, reason: collision with root package name */
    public final dz1 f16937s;

    /* renamed from: t, reason: collision with root package name */
    public PopupWindow f16938t;

    /* renamed from: u, reason: collision with root package name */
    public RelativeLayout f16939u;

    /* renamed from: v, reason: collision with root package name */
    public ViewGroup f16940v;

    static {
        x.f fVar = new x.f(7);
        Collections.addAll(fVar, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        DesugarCollections.unmodifiableSet(fVar);
    }

    public ts(b00 b00Var, dz1 dz1Var) {
        super(7, b00Var, "resize");
        this.f16925e = "top-right";
        this.f16926f = true;
        this.g = 0;
        this.f16927h = 0;
        this.f16928i = -1;
        this.j = 0;
        this.f16929k = 0;
        this.f16930l = -1;
        this.f16931m = new Object();
        this.f16932n = b00Var;
        this.f16933o = b00Var.A1();
        this.f16937s = dz1Var;
    }

    public final void C(boolean z3) {
        synchronized (this.f16931m) {
            try {
                if (this.f16938t != null) {
                    if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16079cc)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        D(z3);
                    } else {
                        fx.f11279f.c(new bi.a(1, this, z3));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void D(boolean z3) {
        pk pkVar = sk.dc;
        va.s sVar = va.s.f36163e;
        rk rkVar = sVar.f36166c;
        rk rkVar2 = sVar.f36166c;
        boolean zBooleanValue = ((Boolean) rkVar.a(pkVar)).booleanValue();
        qz qzVar = this.f16932n;
        if (zBooleanValue) {
            this.f16939u.removeView((View) qzVar);
            this.f16938t.dismiss();
        } else {
            this.f16938t.dismiss();
            this.f16939u.removeView((View) qzVar);
        }
        if (((Boolean) rkVar2.a(sk.f16111ec)).booleanValue()) {
            View view = (View) qzVar;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f16940v;
        if (viewGroup != null) {
            viewGroup.removeView(this.f16935q);
            if (((Boolean) rkVar2.a(sk.f16128fc)).booleanValue()) {
                try {
                    this.f16940v.addView((View) qzVar);
                    qzVar.D0(this.f16934p);
                } catch (IllegalStateException e2) {
                    za.i.f("Unable to add webview back to view hierarchy.", e2);
                    ua.j.C.f35265h.f("MraidCallResizeHandler.collapseInternal", e2);
                }
            } else {
                this.f16940v.addView((View) qzVar);
                qzVar.D0(this.f16934p);
            }
        }
        if (z3) {
            A("default");
            dz1 dz1Var = this.f16937s;
            if (dz1Var != null) {
                ((vc0) dz1Var.f10622a).f17583c.p1(k60.f13049h);
            }
        }
        this.f16938t = null;
        this.f16939u = null;
        this.f16940v = null;
        this.f16936r = null;
    }
}
