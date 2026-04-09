package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class f40 implements w60, p60 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f10982a;

    /* renamed from: b, reason: collision with root package name */
    public final qz f10983b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f10984c;

    /* renamed from: d, reason: collision with root package name */
    public final za.a f10985d;

    /* renamed from: e, reason: collision with root package name */
    public xh0 f10986e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f10987f;
    public final wh0 g;

    public f40(Context context, qz qzVar, wp0 wp0Var, za.a aVar, wh0 wh0Var) {
        this.f10982a = context;
        this.f10983b = qzVar;
        this.f10984c = wp0Var;
        this.f10985d = aVar;
        this.g = wh0Var;
    }

    public final synchronized void a() {
        qz qzVar;
        int i4;
        int i10;
        try {
            wp0 wp0Var = this.f10984c;
            if (wp0Var.T && (qzVar = this.f10983b) != null) {
                Context context = this.f10982a;
                ua.j jVar = ua.j.C;
                jVar.f35280x.getClass();
                if (h80.f(context)) {
                    za.a aVar = this.f10985d;
                    int i11 = aVar.f38130b;
                    int i12 = aVar.f38131c;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(i11).length() + 1 + String.valueOf(i12).length());
                    sb2.append(i11);
                    sb2.append(".");
                    sb2.append(i12);
                    String string = sb2.toString();
                    iq0 iq0Var = wp0Var.V;
                    String str = iq0Var.a() + (-1) != 1 ? "javascript" : null;
                    if (iq0Var.a() == 1) {
                        i4 = 2;
                        i10 = 3;
                    } else if (wp0Var.f18080e == 1) {
                        i4 = 3;
                        i10 = 1;
                    } else {
                        i4 = 1;
                        i10 = 1;
                    }
                    String str2 = wp0Var.f18093l0;
                    h80 h80Var = jVar.f35280x;
                    WebView webViewI = qzVar.i();
                    h80Var.getClass();
                    xh0 xh0VarI = h80.i(i4, i10, webViewI, string, str, str2);
                    this.f10986e = xh0VarI;
                    if (xh0VarI != null) {
                        vt0 vt0Var = xh0VarI.f18390a;
                        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16074c6)).booleanValue()) {
                            h80 h80Var2 = jVar.f35280x;
                            WebView webViewI2 = qzVar.i();
                            h80Var2.getClass();
                            h80.l(vt0Var, webViewI2);
                            ArrayList arrayListY = qzVar.y();
                            int size = arrayListY.size();
                            int i13 = 0;
                            while (i13 < size) {
                                Object obj = arrayListY.get(i13);
                                i13++;
                                ua.j.C.f35280x.getClass();
                                h80.s(new th0(vt0Var, (View) obj, 0));
                            }
                        } else {
                            View viewN = qzVar.N();
                            jVar.f35280x.getClass();
                            h80.l(vt0Var, viewN);
                        }
                        qzVar.d0(this.f10986e);
                        ua.j.C.f35280x.getClass();
                        h80.j(vt0Var);
                        this.f10987f = true;
                        qzVar.a("onSdkLoaded", new x.e(0));
                    }
                }
            }
        } finally {
        }
    }

    public final boolean b() {
        zt0 zt0Var;
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16090d6)).booleanValue()) {
            return false;
        }
        wh0 wh0Var = this.g;
        synchronized (wh0Var) {
            zt0Var = wh0Var.f18027f;
        }
        return zt0Var != null;
    }

    @Override // com.google.android.gms.internal.ads.w60
    public final synchronized void e() {
        if (b()) {
            this.g.b();
        } else {
            if (this.f10987f) {
                return;
            }
            a();
        }
    }

    @Override // com.google.android.gms.internal.ads.p60
    public final synchronized void n() {
        qz qzVar;
        if (b()) {
            this.g.c();
            return;
        }
        if (!this.f10987f) {
            a();
        }
        if (!this.f10984c.T || this.f10986e == null || (qzVar = this.f10983b) == null) {
            return;
        }
        qzVar.a("onSdkImpression", new x.e(0));
    }
}
