package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g90 implements w60, xa.l, p60 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11404a;

    /* renamed from: b, reason: collision with root package name */
    public final qz f11405b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f11406c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f11407d;

    /* renamed from: e, reason: collision with root package name */
    public final wh0 f11408e;

    /* renamed from: f, reason: collision with root package name */
    public xh0 f11409f;

    public g90(Context context, qz qzVar, wp0 wp0Var, za.a aVar, wh0 wh0Var) {
        this.f11404a = context;
        this.f11405b = qzVar;
        this.f11406c = wp0Var;
        this.f11407d = aVar;
        this.f11408e = wh0Var;
    }

    public final boolean a() {
        zt0 zt0Var;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16090d6)).booleanValue()) {
            return false;
        }
        wh0 wh0Var = this.f11408e;
        synchronized (wh0Var) {
            zt0Var = wh0Var.f18027f;
        }
        return zt0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final void e() {
        qz qzVar;
        wp0 wp0Var = this.f11406c;
        if (!wp0Var.T || (qzVar = this.f11405b) == null) {
            return;
        }
        ua.j jVar = ua.j.C;
        h80 h80Var = jVar.f35280x;
        h80 h80Var2 = jVar.f35280x;
        h80Var.getClass();
        if (h80.f(this.f11404a)) {
            if (a()) {
                this.f11408e.b();
                return;
            }
            za.a aVar = this.f11407d;
            int i4 = aVar.f38130b;
            int i10 = aVar.f38131c;
            int i11 = 1;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 1 + String.valueOf(i10).length());
            sb2.append(i4);
            sb2.append(".");
            sb2.append(i10);
            String string = sb2.toString();
            iq0 iq0Var = wp0Var.V;
            String str = iq0Var.a() + (-1) != 1 ? "javascript" : null;
            int i12 = 2;
            if (iq0Var.a() == 1) {
                i11 = 3;
            } else {
                i12 = wp0Var.Y == 2 ? 4 : 1;
            }
            int i13 = i12;
            int i14 = i11;
            String str2 = wp0Var.f18093l0;
            WebView webViewI = qzVar.i();
            h80Var2.getClass();
            xh0 xh0VarI = h80.i(i13, i14, webViewI, string, str, str2);
            this.f11409f = xh0VarI;
            if (xh0VarI != null) {
                vt0 vt0Var = xh0VarI.f18390a;
                if (((Boolean) va.s.f36163e.f36166c.a(sk.f16074c6)).booleanValue()) {
                    WebView webViewI2 = qzVar.i();
                    h80Var2.getClass();
                    h80.l(vt0Var, webViewI2);
                    ArrayList arrayListY = qzVar.y();
                    int size = arrayListY.size();
                    int i15 = 0;
                    while (i15 < size) {
                        Object obj = arrayListY.get(i15);
                        i15++;
                        ua.j.C.f35280x.getClass();
                        h80.s(new th0(vt0Var, (View) obj, 0));
                    }
                } else {
                    View viewN = qzVar.N();
                    h80Var2.getClass();
                    h80.l(vt0Var, viewN);
                }
                qzVar.d0(this.f11409f);
                ua.j.C.f35280x.getClass();
                h80.j(vt0Var);
                qzVar.a("onSdkLoaded", new x.e(0));
            }
        }
    }

    @Override // xa.l
    public final void e0(int i4) {
        this.f11409f = null;
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final void n() {
        qz qzVar;
        if (a()) {
            this.f11408e.c();
        } else {
            if (this.f11409f == null || (qzVar = this.f11405b) == null) {
                return;
            }
            if (((Boolean) va.s.f36163e.f36166c.a(sk.f16137g6)).booleanValue()) {
                qzVar.a("onSdkImpression", new x.e(0));
            }
        }
    }

    @Override // xa.l
    public final void z1() {
        qz qzVar;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16137g6)).booleanValue() || (qzVar = this.f11405b) == null) {
            return;
        }
        if (this.f11409f != null || a()) {
            if (this.f11409f != null) {
                qzVar.a("onSdkImpression", new x.e(0));
            } else {
                this.f11408e.c();
            }
        }
    }

    @Override // xa.l
    public final void D2() {
    }

    @Override // xa.l
    public final void T() {
    }

    @Override // xa.l
    public final void U0() {
    }

    @Override // xa.l
    public final void a2() {
    }

    @Override // xa.l
    public final void g1() {
    }

    @Override // xa.l
    public final void h3() {
    }

    @Override // xa.l
    public final void k2() {
    }

    @Override // xa.l
    public final void r0() {
    }

    @Override // xa.l
    public final void u1() {
    }
}
