package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import q2.C2841s;
import u.C2936e;

/* renamed from: com.google.android.gms.internal.ads.mh, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class BinderC1541mh extends q2.A0 {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0828Yg f15636a;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f15638c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f15639d;

    /* renamed from: e, reason: collision with root package name */
    public int f15640e;

    /* renamed from: f, reason: collision with root package name */
    public q2.C0 f15641f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f15642g;
    public float i;

    /* renamed from: j, reason: collision with root package name */
    public float f15644j;

    /* renamed from: k, reason: collision with root package name */
    public float f15645k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f15646l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f15647m;

    /* renamed from: n, reason: collision with root package name */
    public C1267hb f15648n;

    /* renamed from: b, reason: collision with root package name */
    public final Object f15637b = new Object();

    /* renamed from: h, reason: collision with root package name */
    public boolean f15643h = true;

    public BinderC1541mh(InterfaceC0828Yg interfaceC0828Yg, float f2, boolean z6, boolean z7) {
        this.f15636a = interfaceC0828Yg;
        this.i = f2;
        this.f15638c = z6;
        this.f15639d = z7;
    }

    @Override // q2.B0
    public final void J1(q2.C0 c02) {
        synchronized (this.f15637b) {
            this.f15641f = c02;
        }
    }

    public final void L3(q2.Y0 y02) {
        Object obj = this.f15637b;
        boolean z6 = y02.f23148b;
        boolean z7 = y02.f23149c;
        synchronized (obj) {
            this.f15646l = z6;
            this.f15647m = z7;
        }
        boolean z8 = y02.f23147a;
        String str = true != z6 ? "0" : "1";
        String str2 = true != z7 ? "0" : "1";
        String str3 = true != z8 ? "0" : "1";
        C2936e c2936e = new C2936e(3);
        c2936e.put("muteStart", str3);
        c2936e.put("customControlsRequested", str);
        c2936e.put("clickToExpandRequested", str2);
        O3("initialState", Collections.unmodifiableMap(c2936e));
    }

    public final void M3() {
        boolean z6;
        int i;
        int i3;
        synchronized (this.f15637b) {
            z6 = this.f15643h;
            i = this.f15640e;
            i3 = 3;
            this.f15640e = 3;
        }
        AbstractC0640Nf.f10010f.execute(new RunnableC1487lh(this, i, i3, z6, z6));
    }

    public final void N3(float f2, float f5, int i, boolean z6, float f6) {
        boolean z7;
        boolean z8;
        int i3;
        synchronized (this.f15637b) {
            try {
                z7 = true;
                if (f5 == this.i && f6 == this.f15645k) {
                    z7 = false;
                }
                this.i = f5;
                if (!((Boolean) C2841s.f23267e.f23270c.a(H9.Zd)).booleanValue()) {
                    this.f15644j = f2;
                }
                z8 = this.f15643h;
                this.f15643h = z6;
                i3 = this.f15640e;
                this.f15640e = i;
                float f7 = this.f15645k;
                this.f15645k = f6;
                if (Math.abs(f6 - f7) > 1.0E-4f) {
                    this.f15636a.b0().invalidate();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z7) {
            try {
                C1267hb c1267hb = this.f15648n;
                if (c1267hb != null) {
                    c1267hb.I0(c1267hb.h0(), 2);
                }
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            }
        }
        AbstractC0640Nf.f10010f.execute(new RunnableC1487lh(this, i3, i, z8, z6));
    }

    public final void O3(String str, Map map) {
        HashMap map2 = map == null ? new HashMap() : new HashMap(map);
        map2.put("action", str);
        AbstractC0640Nf.f10010f.execute(new CD(this, 17, map2));
    }

    @Override // q2.B0
    public final void b() {
        O3("play", null);
    }

    @Override // q2.B0
    public final void d() {
        O3("pause", null);
    }

    @Override // q2.B0
    public final boolean g() {
        boolean z6;
        synchronized (this.f15637b) {
            z6 = this.f15643h;
        }
        return z6;
    }

    @Override // q2.B0
    public final float h() {
        float f2;
        synchronized (this.f15637b) {
            f2 = this.i;
        }
        return f2;
    }

    @Override // q2.B0
    public final int j() {
        int i;
        synchronized (this.f15637b) {
            i = this.f15640e;
        }
        return i;
    }

    @Override // q2.B0
    public final float k() {
        float f2;
        synchronized (this.f15637b) {
            f2 = this.f15644j;
        }
        return f2;
    }

    @Override // q2.B0
    public final float n() {
        float f2;
        synchronized (this.f15637b) {
            f2 = this.f15645k;
        }
        return f2;
    }

    @Override // q2.B0
    public final boolean o() {
        boolean z6;
        synchronized (this.f15637b) {
            try {
                z6 = false;
                if (this.f15638c && this.f15646l) {
                    z6 = true;
                }
            } finally {
            }
        }
        return z6;
    }

    @Override // q2.B0
    public final q2.C0 p() {
        q2.C0 c02;
        synchronized (this.f15637b) {
            c02 = this.f15641f;
        }
        return c02;
    }

    @Override // q2.B0
    public final boolean q() {
        boolean z6;
        Object obj = this.f15637b;
        boolean zO = o();
        synchronized (obj) {
            z6 = false;
            if (!zO) {
                try {
                    if (this.f15647m && this.f15639d) {
                        z6 = true;
                    }
                } finally {
                }
            }
        }
        return z6;
    }

    @Override // q2.B0
    public final void r0(boolean z6) {
        O3(true != z6 ? "unmute" : "mute", null);
    }

    @Override // q2.B0
    public final void y() {
        O3("stop", null);
    }
}
