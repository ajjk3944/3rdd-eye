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
import java.util.Collections;
import q2.C2841s;
import u.C2937f;

/* renamed from: com.google.android.gms.internal.ads.Dd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0468Dd extends C0697Ql {

    /* renamed from: C, reason: collision with root package name */
    public T2.d f7790C;

    /* renamed from: D, reason: collision with root package name */
    public ImageView f7791D;

    /* renamed from: E, reason: collision with root package name */
    public LinearLayout f7792E;

    /* renamed from: F, reason: collision with root package name */
    public final Rx f7793F;

    /* renamed from: G, reason: collision with root package name */
    public PopupWindow f7794G;

    /* renamed from: H, reason: collision with root package name */
    public RelativeLayout f7795H;

    /* renamed from: I, reason: collision with root package name */
    public ViewGroup f7796I;

    /* renamed from: d, reason: collision with root package name */
    public String f7797d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f7798e;

    /* renamed from: f, reason: collision with root package name */
    public int f7799f;

    /* renamed from: g, reason: collision with root package name */
    public int f7800g;

    /* renamed from: h, reason: collision with root package name */
    public int f7801h;
    public int i;

    /* renamed from: j, reason: collision with root package name */
    public int f7802j;

    /* renamed from: k, reason: collision with root package name */
    public int f7803k;

    /* renamed from: l, reason: collision with root package name */
    public final Object f7804l;

    /* renamed from: m, reason: collision with root package name */
    public final InterfaceC0828Yg f7805m;

    /* renamed from: n, reason: collision with root package name */
    public final Activity f7806n;

    static {
        C2937f c2937f = new C2937f(7);
        Collections.addAll(c2937f, "top-left", "top-right", "top-center", "center", "bottom-left", "bottom-right", "bottom-center");
        Collections.unmodifiableSet(c2937f);
    }

    public C0468Dd(C1273hh c1273hh, Rx rx) {
        super(c1273hh, 9, "resize");
        this.f7797d = "top-right";
        this.f7798e = true;
        this.f7799f = 0;
        this.f7800g = 0;
        this.f7801h = -1;
        this.i = 0;
        this.f7802j = 0;
        this.f7803k = -1;
        this.f7804l = new Object();
        this.f7805m = c1273hh;
        this.f7806n = c1273hh.h();
        this.f7793F = rx;
    }

    public final void E(boolean z6) {
        synchronized (this.f7804l) {
            try {
                if (this.f7794G != null) {
                    if (!((Boolean) C2841s.f23267e.f23270c.a(H9.ac)).booleanValue() || Looper.getMainLooper().getThread() == Thread.currentThread()) {
                        F(z6);
                    } else {
                        AbstractC0640Nf.f10010f.a(new A1.q(this, z6, 3));
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void F(boolean z6) {
        E9 e9 = H9.bc;
        C2841s c2841s = C2841s.f23267e;
        G9 g9 = c2841s.f23270c;
        G9 g92 = c2841s.f23270c;
        boolean zBooleanValue = ((Boolean) g9.a(e9)).booleanValue();
        InterfaceC0828Yg interfaceC0828Yg = this.f7805m;
        if (zBooleanValue) {
            this.f7795H.removeView((View) interfaceC0828Yg);
            this.f7794G.dismiss();
        } else {
            this.f7794G.dismiss();
            this.f7795H.removeView((View) interfaceC0828Yg);
        }
        if (((Boolean) g92.a(H9.cc)).booleanValue()) {
            View view = (View) interfaceC0828Yg;
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
        ViewGroup viewGroup = this.f7796I;
        if (viewGroup != null) {
            viewGroup.removeView(this.f7791D);
            if (((Boolean) g92.a(H9.dc)).booleanValue()) {
                try {
                    this.f7796I.addView((View) interfaceC0828Yg);
                    interfaceC0828Yg.f1(this.f7790C);
                } catch (IllegalStateException e6) {
                    u2.k.f("Unable to add webview back to view hierarchy.", e6);
                    p2.j.f22785C.f22795h.f("MraidCallResizeHandler.collapseInternal", e6);
                }
            } else {
                this.f7796I.addView((View) interfaceC0828Yg);
                interfaceC0828Yg.f1(this.f7790C);
            }
        }
        if (z6) {
            C("default");
            Rx rx = this.f7793F;
            if (rx != null) {
                ((C2248zn) rx.f11090b).f17943c.C1(C1652ok.i);
            }
        }
        this.f7794G = null;
        this.f7795H = null;
        this.f7796I = null;
        this.f7792E = null;
    }
}
