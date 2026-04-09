package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wc0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f17972a;

    /* renamed from: b, reason: collision with root package name */
    public final oe f17973b;

    /* renamed from: c, reason: collision with root package name */
    public final fl f17974c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f17975d;

    /* renamed from: e, reason: collision with root package name */
    public final km.n f17976e;

    /* renamed from: f, reason: collision with root package name */
    public final li f17977f;
    public final k70 g;

    /* renamed from: h, reason: collision with root package name */
    public final qh0 f17978h;

    /* renamed from: i, reason: collision with root package name */
    public final jq0 f17979i;
    public final qd0 j;

    /* renamed from: k, reason: collision with root package name */
    public final o00 f17980k;

    public wc0(Context context, oe oeVar, fl flVar, za.a aVar, km.n nVar, li liVar, k70 k70Var, qh0 qh0Var, jq0 jq0Var, qd0 qd0Var, o00 o00Var) {
        this.f17972a = context;
        this.f17973b = oeVar;
        this.f17974c = flVar;
        this.f17975d = aVar;
        this.f17976e = nVar;
        this.f17977f = liVar;
        this.g = k70Var;
        this.f17978h = qh0Var;
        this.f17979i = jq0Var;
        this.j = qd0Var;
        this.f17980k = o00Var;
    }

    public final qz a(va.c3 c3Var, wp0 wp0Var, yp0 yp0Var) {
        qz qzVarF = hl.f(this.f17972a, h0.a(c3Var), c3Var.f36038a, false, false, this.f17973b, this.f17974c, this.f17975d, new mx0(25, this), this.f17976e, this.f17977f, wp0Var, yp0Var, this.f17978h, this.f17979i, this.j);
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16281pf)).booleanValue()) {
            WebView webViewI = qzVarF.i();
            if (this.f17980k.f14496a != null) {
                try {
                    int i4 = o6.f.f30411a;
                    if (!p6.l.g.b()) {
                        throw p6.l.a();
                    }
                    ((WebViewProviderBoundaryInterface) o6.f.c(webViewI).f30195b).setProfile("GMA_WEBVIEW_PROFILE");
                    ya.a0.m("WebViewCompat Profile is defined");
                    return qzVarF;
                } catch (IllegalStateException e2) {
                    za.i.h("WebViewCompat error: ".concat(e2.toString()));
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16264of)).booleanValue()) {
                        ua.j.C.f35265h.f("WebViewCompat.setProfile", e2);
                    }
                }
            }
        }
        return qzVarF;
    }
}
