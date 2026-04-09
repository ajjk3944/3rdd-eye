package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class vp0 {

    /* renamed from: a, reason: collision with root package name */
    public final tb.a f17681a;

    /* renamed from: b, reason: collision with root package name */
    public final qd0 f17682b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f17683c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f17685e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f17684d = 0;

    public vp0(tb.a aVar, qd0 qd0Var) {
        this.f17681a = aVar;
        this.f17682b = qd0Var;
    }

    public final void a(boolean z3) {
        if (((Boolean) va.s.f36163e.f36166c.a(sk.f16296qe)).booleanValue()) {
            rt rtVarA = this.f17682b.a();
            rtVarA.u("action", "mbs_state");
            rtVarA.u("mbs_state", true != z3 ? "0" : "1");
            rtVarA.v();
        }
        if (z3) {
            d(1, 2);
        } else {
            d(2, 1);
        }
    }

    public final boolean b() {
        boolean z3;
        synchronized (this.f17683c) {
            c();
            z3 = this.f17685e == 3;
        }
        return z3;
    }

    public final void c() {
        this.f17681a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f17683c) {
            try {
                if (this.f17685e == 3) {
                    if (this.f17684d + ((Long) va.s.f36163e.f36166c.a(sk.K6)).longValue() <= jCurrentTimeMillis) {
                        this.f17685e = 1;
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void d(int i4, int i10) {
        c();
        Object obj = this.f17683c;
        this.f17681a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f17685e != i4) {
                    return;
                }
                this.f17685e = i10;
                if (this.f17685e == 3) {
                    this.f17684d = jCurrentTimeMillis;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
