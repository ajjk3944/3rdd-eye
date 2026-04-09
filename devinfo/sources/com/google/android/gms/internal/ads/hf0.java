package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hf0 implements xa.l, m00 {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11850a;

    /* renamed from: b, reason: collision with root package name */
    public final za.a f11851b;

    /* renamed from: c, reason: collision with root package name */
    public ff0 f11852c;

    /* renamed from: d, reason: collision with root package name */
    public qz f11853d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f11854e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f11855f;
    public long g;

    /* renamed from: h, reason: collision with root package name */
    public va.o1 f11856h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f11857i;

    public hf0(Context context, za.a aVar) {
        this.f11850a = context;
        this.f11851b = aVar;
    }

    public final synchronized void a(va.o1 o1Var, po poVar, co coVar, po poVar2) {
        if (c(o1Var)) {
            try {
                ua.j jVar = ua.j.C;
                hl hlVar = jVar.f35262d;
                qz qzVarF = hl.f(this.f11850a, new h0(0, 0, 0), "", false, false, null, null, this.f11851b, null, null, new li(), null, null, null, null, null);
                this.f11853d = qzVarF;
                i00 i00VarX = qzVarF.X();
                if (i00VarX == null) {
                    za.i.h("Failed to obtain a web view for the ad inspector");
                    try {
                        jVar.f35265h.f("InspectorUi.openInspector 2", new NullPointerException("Failed to obtain a web view for the ad inspector"));
                        o1Var.Q(yo0.A(17, "Failed to obtain a web view for the ad inspector", null));
                        return;
                    } catch (RemoteException e2) {
                        ua.j.C.f35265h.f("InspectorUi.openInspector 3", e2);
                        return;
                    }
                }
                this.f11856h = o1Var;
                Context context = this.f11850a;
                i00VarX.j(null, null, null, null, null, false, null, null, null, null, null, null, null, poVar, null, new co(6, context), coVar, poVar2, null, null, null, null);
                i00VarX.g = this;
                this.f11853d.loadUrl((String) va.s.f36163e.f36166c.a(sk.ia));
                ja.c.E(context, new AdOverlayInfoParcel(this, this.f11853d, this.f11851b), true, null);
                jVar.f35267k.getClass();
                this.g = System.currentTimeMillis();
            } catch (zz e10) {
                za.i.i("Failed to obtain a web view for the ad inspector", e10);
                try {
                    ua.j.C.f35265h.f("InspectorUi.openInspector 0", e10);
                    o1Var.Q(yo0.A(17, "Failed to obtain a web view for the ad inspector", null));
                } catch (RemoteException e11) {
                    ua.j.C.f35265h.f("InspectorUi.openInspector 1", e11);
                }
            }
        }
    }

    public final synchronized void b() {
        if (this.f11854e && this.f11855f) {
            fx.f11279f.execute(new s30(10, this));
        }
    }

    public final synchronized boolean c(va.o1 o1Var) {
        if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16155ha)).booleanValue()) {
            za.i.h("Ad inspector had an internal error.");
            try {
                o1Var.Q(yo0.A(16, null, null));
            } catch (RemoteException unused) {
            }
            return false;
        }
        if (this.f11852c == null) {
            za.i.h("Ad inspector had an internal error.");
            try {
                ua.j.C.f35265h.f("InspectorUi.shouldOpenUi", new NullPointerException("InspectorManager null"));
                o1Var.Q(yo0.A(16, null, null));
            } catch (RemoteException unused2) {
            }
            return false;
        }
        if (!this.f11854e && !this.f11855f) {
            ua.j.C.f35267k.getClass();
            if (System.currentTimeMillis() >= this.g + ((Integer) r1.f36166c.a(sk.f16198ka)).intValue()) {
                return true;
            }
        }
        za.i.h("Ad inspector cannot be opened because it is already open.");
        try {
            o1Var.Q(yo0.A(19, null, null));
        } catch (RemoteException unused3) {
        }
        return false;
    }

    @Override // xa.l
    public final synchronized void e0(int i4) {
        this.f11853d.destroy();
        if (!this.f11857i) {
            ya.a0.m("Inspector closed.");
            va.o1 o1Var = this.f11856h;
            if (o1Var != null) {
                try {
                    o1Var.Q(null);
                } catch (RemoteException unused) {
                }
            }
        }
        this.f11855f = false;
        this.f11854e = false;
        this.g = 0L;
        this.f11857i = false;
        this.f11856h = null;
    }

    @Override // com.google.android.gms.internal.ads.m00
    public final synchronized void p(String str, int i4, String str2, boolean z3) {
        if (z3) {
            ya.a0.m("Ad inspector loaded.");
            this.f11854e = true;
            b();
            return;
        }
        za.i.h("Ad inspector failed to load.");
        try {
            zw zwVar = ua.j.C.f35265h;
            StringBuilder sb2 = new StringBuilder(String.valueOf(i4).length() + 46 + String.valueOf(str).length() + 15 + String.valueOf(str2).length());
            sb2.append("Failed to load UI. Error code: ");
            sb2.append(i4);
            sb2.append(", Description: ");
            sb2.append(str);
            sb2.append(", Failing URL: ");
            sb2.append(str2);
            zwVar.f("InspectorUi.onAdWebViewFinishedLoading 0", new Exception(sb2.toString()));
            va.o1 o1Var = this.f11856h;
            if (o1Var != null) {
                o1Var.Q(yo0.A(17, null, null));
            }
        } catch (RemoteException e2) {
            ua.j.C.f35265h.f("InspectorUi.onAdWebViewFinishedLoading 1", e2);
        }
        this.f11857i = true;
        this.f11853d.destroy();
    }

    @Override // xa.l
    public final synchronized void z1() {
        this.f11855f = true;
        b();
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
