package com.google.android.gms.internal.ads;

import android.content.Context;
import android.view.View;
import android.webkit.WebView;
import java.util.ArrayList;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class wh0 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f18022a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f18023b;

    /* renamed from: c, reason: collision with root package name */
    public final wp0 f18024c;

    /* renamed from: d, reason: collision with root package name */
    public final qz f18025d;

    /* renamed from: e, reason: collision with root package name */
    public final qd0 f18026e;

    /* renamed from: f, reason: collision with root package name */
    public zt0 f18027f;

    public wh0(Context context, za.a aVar, wp0 wp0Var, qz qzVar, qd0 qd0Var) {
        this.f18022a = context;
        this.f18023b = aVar;
        this.f18024c = wp0Var;
        this.f18025d = qzVar;
        this.f18026e = qd0Var;
    }

    public final synchronized boolean a() {
        qz qzVar;
        wp0 wp0Var = this.f18024c;
        if (wp0Var.T) {
            pk pkVar = sk.f16040a6;
            va.s sVar = va.s.f36163e;
            if (((Boolean) sVar.f36166c.a(pkVar)).booleanValue()) {
                if (((Boolean) sVar.f36166c.a(sk.f16090d6)).booleanValue() && (qzVar = this.f18025d) != null) {
                    if (this.f18027f != null) {
                        za.i.h("Omid javascript session service already started for ad.");
                        return false;
                    }
                    Context context = this.f18022a;
                    ua.j jVar = ua.j.C;
                    jVar.f35280x.getClass();
                    if (!h80.f(context)) {
                        za.i.h("Unable to initialize omid.");
                        return false;
                    }
                    iq0 iq0Var = wp0Var.V;
                    iq0Var.getClass();
                    if (iq0Var.f12420a.optBoolean((String) sVar.f36166c.a(sk.f16122f6), true)) {
                        za.a aVar = this.f18023b;
                        h80 h80Var = jVar.f35280x;
                        WebView webViewI = qzVar.i();
                        h80Var.getClass();
                        zt0 zt0Var = (zt0) h80.r(new rt(17, aVar, webViewI));
                        if (((Boolean) sVar.f36166c.a(sk.f16105e6)).booleanValue()) {
                            qd0 qd0Var = this.f18026e;
                            String str = zt0Var != null ? "1" : "0";
                            rt rtVarA = qd0Var.a();
                            rtVarA.u("omid_js_session_success", str);
                            rtVarA.v();
                        }
                        if (zt0Var == null) {
                            za.i.h("Unable to create javascript session service.");
                            return false;
                        }
                        za.i.g("Created omid javascript session service.");
                        this.f18027f = zt0Var;
                        qzVar.x0(this);
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final synchronized void b() {
        qz qzVar;
        try {
            zt0 zt0Var = this.f18027f;
            if (zt0Var == null || (qzVar = this.f18025d) == null) {
                return;
            }
            ArrayList arrayListY = qzVar.y();
            int size = arrayListY.size();
            int i4 = 0;
            while (i4 < size) {
                Object obj = arrayListY.get(i4);
                i4++;
                ua.j.C.f35280x.getClass();
                h80.s(new uh0(0, zt0Var, (View) obj));
            }
            qzVar.a("onSdkLoaded", z51.g);
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void c() {
        qz qzVar;
        if (this.f18027f == null || (qzVar = this.f18025d) == null) {
            return;
        }
        qzVar.a("onSdkImpression", z51.g);
    }
}
