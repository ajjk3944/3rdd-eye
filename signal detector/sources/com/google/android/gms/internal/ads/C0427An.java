package com.google.android.gms.internal.ads;

import android.content.Context;
import android.webkit.WebView;
import org.chromium.support_lib_boundary.WebViewProviderBoundaryInterface;
import q2.C2841s;
import t2.AbstractC2907C;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.An, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0427An {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7034a;

    /* renamed from: b, reason: collision with root package name */
    public final H6 f7035b;

    /* renamed from: c, reason: collision with root package name */
    public final U9 f7036c;

    /* renamed from: d, reason: collision with root package name */
    public final C2951a f7037d;

    /* renamed from: e, reason: collision with root package name */
    public final V2.h f7038e;

    /* renamed from: f, reason: collision with root package name */
    public final A8 f7039f;

    /* renamed from: g, reason: collision with root package name */
    public final C0679Pk f7040g;

    /* renamed from: h, reason: collision with root package name */
    public final BinderC0718Rp f7041h;
    public final C1068du i;

    /* renamed from: j, reason: collision with root package name */
    public final C0784Vn f7042j;

    /* renamed from: k, reason: collision with root package name */
    public final C1972uh f7043k;

    public C0427An(Context context, H6 h6, U9 u9, C2951a c2951a, V2.h hVar, A8 a8, C0679Pk c0679Pk, BinderC0718Rp binderC0718Rp, C1068du c1068du, C0784Vn c0784Vn, C1972uh c1972uh) {
        this.f7034a = context;
        this.f7035b = h6;
        this.f7036c = u9;
        this.f7037d = c2951a;
        this.f7038e = hVar;
        this.f7039f = a8;
        this.f7040g = c0679Pk;
        this.f7041h = binderC0718Rp;
        this.i = c1068du;
        this.f7042j = c0784Vn;
        this.f7043k = c1972uh;
    }

    public final InterfaceC0828Yg a(q2.d1 d1Var, Qt qt, St st) {
        InterfaceC0828Yg interfaceC0828YgG = W9.g(this.f7034a, T2.d.a(d1Var), d1Var.f23188a, false, false, this.f7035b, this.f7036c, this.f7037d, new Nx(17, this), this.f7038e, this.f7039f, qt, st, this.f7041h, this.i, this.f7042j);
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.nf)).booleanValue()) {
            WebView webViewT = interfaceC0828YgG.t();
            if (this.f7043k.f17147a != null) {
                try {
                    int i = T0.f.f3557a;
                    if (!U0.m.f3685g.b()) {
                        throw U0.m.a();
                    }
                    ((WebViewProviderBoundaryInterface) T0.f.c(webViewT).f73b).setProfile("GMA_WEBVIEW_PROFILE");
                    AbstractC2907C.m("WebViewCompat Profile is defined");
                    return interfaceC0828YgG;
                } catch (IllegalStateException e6) {
                    u2.k.h("WebViewCompat error: ".concat(e6.toString()));
                    if (((Boolean) C2841s.f23267e.f23270c.a(H9.mf)).booleanValue()) {
                        p2.j.f22785C.f22795h.f("WebViewCompat.setProfile", e6);
                    }
                }
            }
        }
        return interfaceC0828YgG;
    }
}
