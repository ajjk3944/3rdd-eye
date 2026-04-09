package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sp0 extends bv {

    /* renamed from: b, reason: collision with root package name */
    public final qp0 f16502b;

    /* renamed from: c, reason: collision with root package name */
    public final np0 f16503c;

    /* renamed from: d, reason: collision with root package name */
    public final String f16504d;

    /* renamed from: e, reason: collision with root package name */
    public final eq0 f16505e;

    /* renamed from: f, reason: collision with root package name */
    public final Context f16506f;
    public final za.a g;

    /* renamed from: h, reason: collision with root package name */
    public final oe f16507h;

    /* renamed from: i, reason: collision with root package name */
    public final qd0 f16508i;
    public oc0 j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f16509k = ((Boolean) va.s.f36163e.f36166c.a(sk.f16052b1)).booleanValue();

    public sp0(String str, qp0 qp0Var, Context context, np0 np0Var, eq0 eq0Var, za.a aVar, oe oeVar, qd0 qd0Var) {
        this.f16504d = str;
        this.f16502b = qp0Var;
        this.f16503c = np0Var;
        this.f16505e = eq0Var;
        this.f16506f = context;
        this.g = aVar;
        this.f16507h = oeVar;
        this.f16508i = qd0Var;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized String A1() {
        c60 c60Var;
        oc0 oc0Var = this.j;
        if (oc0Var == null || (c60Var = oc0Var.f14537f) == null) {
            return null;
        }
        return c60Var.f9997a;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final zu B1() {
        pb.y.d("#008 Must be called on the main UI thread.");
        oc0 oc0Var = this.j;
        if (oc0Var != null) {
            return oc0Var.f14663s;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final boolean C1() {
        pb.y.d("#008 Must be called on the main UI thread.");
        oc0 oc0Var = this.j;
        return (oc0Var == null || oc0Var.f14667w) ? false : true;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized long E1() {
        o50 o50Var;
        oc0 oc0Var = this.j;
        if (oc0Var == null || (o50Var = oc0Var.j) == null) {
            return 0L;
        }
        return o50Var.f14565a.get();
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final va.x1 F1() {
        oc0 oc0Var;
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16401x7)).booleanValue() && (oc0Var = this.j) != null) {
            return oc0Var.f14537f;
        }
        return null;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final String G1() {
        return this.f16504d;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void I2(vb.a aVar) {
        l1(aVar, this.f16509k);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void M2(va.r1 r1Var) {
        pb.y.d("setOnPaidEventListener must be called on the main UI thread.");
        try {
            if (!r1Var.d()) {
                this.f16508i.b();
            }
        } catch (RemoteException e2) {
            za.i.d("Error in making CSI ping for reporting paid event callback", e2);
        }
        this.f16503c.f14396h.set(r1Var);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void T2(long j) {
        o50 o50Var;
        oc0 oc0Var = this.j;
        if (oc0Var == null || (o50Var = oc0Var.j) == null) {
            return;
        }
        o50Var.a(j);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void V2(va.z2 z2Var, jv jvVar) {
        h4(z2Var, jvVar, 3);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Y0(va.p1 p1Var) {
        np0 np0Var = this.f16503c;
        if (p1Var == null) {
            np0Var.f14391b.set(null);
        } else {
            np0Var.f14391b.set(new rp0(this, p1Var, 0));
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Y1(kv kvVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        this.f16503c.f14395f.set(kvVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Y2(fv fvVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        this.f16503c.f14393d.set(fvVar);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void c4(boolean z3) {
        pb.y.d("setImmersiveMode must be called on the main UI thread.");
        this.f16509k = z3;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final Bundle e() {
        pb.y.d("#008 Must be called on the main UI thread.");
        oc0 oc0Var = this.j;
        return oc0Var != null ? oc0Var.d() : new Bundle();
    }

    public final synchronized void h4(va.z2 z2Var, jv jvVar, int i4) {
        try {
            if (!z2Var.c()) {
                boolean z3 = false;
                if (((Boolean) sl.f16463k.u()).booleanValue()) {
                    if (((Boolean) va.s.f36163e.f36166c.a(sk.f16373vc)).booleanValue()) {
                        z3 = true;
                    }
                }
                if (this.g.f38131c < ((Integer) va.s.f36163e.f36166c.a(sk.f16389wc)).intValue() || !z3) {
                    pb.y.d("#008 Must be called on the main UI thread.");
                }
            }
            np0 np0Var = this.f16503c;
            np0Var.f14392c.set(jvVar);
            ya.f0 f0Var = ua.j.C.f35261c;
            if (ya.f0.i(this.f16506f) && z2Var.f36204s == null) {
                za.i.e("Failed to load the ad because app ID is missing.");
                np0Var.o(yo0.A(4, null, null));
                return;
            }
            if (this.j != null) {
                return;
            }
            op0 op0Var = new op0(0);
            qp0 qp0Var = this.f16502b;
            qp0Var.f15392h.f11588o.f15910b = i4;
            qp0Var.a(z2Var, this.f16504d, op0Var, new rg0(8, this));
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void l1(vb.a aVar, boolean z3) {
        pb.y.d("#008 Must be called on the main UI thread.");
        if (this.j == null) {
            za.i.h("Rewarded can not be shown before loaded");
            this.f16503c.b(yo0.A(9, null, null));
            return;
        }
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16317s3)).booleanValue()) {
            this.f16507h.f14684b.e(new Throwable().getStackTrace());
        }
        this.j.c((Activity) vb.b.U0(aVar), z3);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void v2(va.z2 z2Var, jv jvVar) {
        h4(z2Var, jvVar, 2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final synchronized void w0(nv nvVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        eq0 eq0Var = this.f16505e;
        eq0Var.f10848a = nvVar.f14446a;
        eq0Var.f10849b = nvVar.f14447b;
    }
}
