package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.DesugarCollections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class g00 extends va.z1 {

    /* renamed from: a, reason: collision with root package name */
    public final qz f11329a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f11331c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f11332d;

    /* renamed from: e, reason: collision with root package name */
    public int f11333e;

    /* renamed from: f, reason: collision with root package name */
    public va.b2 f11334f;
    public boolean g;

    /* renamed from: i, reason: collision with root package name */
    public float f11336i;
    public float j;

    /* renamed from: k, reason: collision with root package name */
    public float f11337k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f11338l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f11339m;

    /* renamed from: n, reason: collision with root package name */
    public rn f11340n;

    /* renamed from: b, reason: collision with root package name */
    public final Object f11330b = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f11335h = true;

    public g00(qz qzVar, float f10, boolean z3, boolean z10) {
        this.f11329a = qzVar;
        this.f11336i = f10;
        this.f11331c = z3;
        this.f11332d = z10;
    }

    @Override // va.a2
    public final float A1() {
        float f10;
        synchronized (this.f11330b) {
            f10 = this.f11336i;
        }
        return f10;
    }

    @Override // va.a2
    public final int C1() {
        int i4;
        synchronized (this.f11330b) {
            i4 = this.f11333e;
        }
        return i4;
    }

    @Override // va.a2
    public final float D1() {
        float f10;
        synchronized (this.f11330b) {
            f10 = this.j;
        }
        return f10;
    }

    @Override // va.a2
    public final float F1() {
        float f10;
        synchronized (this.f11330b) {
            f10 = this.f11337k;
        }
        return f10;
    }

    @Override // va.a2
    public final boolean G1() {
        boolean z3;
        synchronized (this.f11330b) {
            try {
                z3 = false;
                if (this.f11331c && this.f11338l) {
                    z3 = true;
                }
            } finally {
            }
        }
        return z3;
    }

    @Override // va.a2
    public final va.b2 H1() {
        va.b2 b2Var;
        synchronized (this.f11330b) {
            b2Var = this.f11334f;
        }
        return b2Var;
    }

    @Override // va.a2
    public final boolean I1() {
        boolean z3;
        Object obj = this.f11330b;
        boolean zG1 = G1();
        synchronized (obj) {
            z3 = false;
            if (!zG1) {
                try {
                    if (this.f11339m && this.f11332d) {
                        z3 = true;
                    }
                } finally {
                }
            }
        }
        return z3;
    }

    @Override // va.a2
    public final void S1(boolean z3) {
        l4(true != z3 ? "unmute" : "mute", null);
    }

    @Override // va.a2
    public final void X1(va.b2 b2Var) {
        synchronized (this.f11330b) {
            this.f11334f = b2Var;
        }
    }

    @Override // va.a2
    public final void c() {
        l4("play", null);
    }

    @Override // va.a2
    public final void d() {
        l4("pause", null);
    }

    public final void i4(va.x2 x2Var) {
        Object obj = this.f11330b;
        boolean z3 = x2Var.f36184b;
        boolean z10 = x2Var.f36185c;
        synchronized (obj) {
            this.f11338l = z3;
            this.f11339m = z10;
        }
        boolean z11 = x2Var.f36183a;
        String str = true != z3 ? "0" : "1";
        String str2 = true != z10 ? "0" : "1";
        String str3 = true != z11 ? "0" : "1";
        x.e eVar = new x.e(3);
        eVar.put("muteStart", str3);
        eVar.put("customControlsRequested", str);
        eVar.put("clickToExpandRequested", str2);
        l4("initialState", DesugarCollections.unmodifiableMap(eVar));
    }

    public final void j4() {
        boolean z3;
        int i4;
        int i10;
        synchronized (this.f11330b) {
            z3 = this.f11335h;
            i4 = this.f11333e;
            i10 = 3;
            this.f11333e = 3;
        }
        fx.f11279f.execute(new f00(this, i4, i10, z3, z3));
    }

    public final void k4(float f10, float f11, int i4, boolean z3, float f12) {
        boolean z10;
        boolean z11;
        int i10;
        synchronized (this.f11330b) {
            try {
                z10 = true;
                if (f11 == this.f11336i && f12 == this.f11337k) {
                    z10 = false;
                }
                this.f11336i = f11;
                if (!((Boolean) va.s.f36163e.f36166c.a(sk.f16065be)).booleanValue()) {
                    this.j = f10;
                }
                z11 = this.f11335h;
                this.f11335h = z3;
                i10 = this.f11333e;
                this.f11333e = i4;
                float f13 = this.f11337k;
                this.f11337k = f12;
                if (Math.abs(f12 - f13) > 1.0E-4f) {
                    this.f11329a.N().invalidate();
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (z10) {
            try {
                rn rnVar = this.f11340n;
                if (rnVar != null) {
                    rnVar.g1(rnVar.T(), 2);
                }
            } catch (RemoteException e2) {
                za.i.k("#007 Could not call remote method.", e2);
            }
        }
        fx.f11279f.execute(new f00(this, i10, i4, z11, z3));
    }

    @Override // va.a2
    public final void l() {
        l4("stop", null);
    }

    public final void l4(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        fx.f11279f.execute(new q81(16, this, map2));
    }

    @Override // va.a2
    public final boolean z1() {
        boolean z3;
        synchronized (this.f11330b) {
            z3 = this.f11335h;
        }
        return z3;
    }
}
