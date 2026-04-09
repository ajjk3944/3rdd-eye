package com.google.android.gms.internal.ads;

import q2.C2841s;

/* loaded from: classes.dex */
public final class Pt {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f10530a;

    /* renamed from: b, reason: collision with root package name */
    public final C0784Vn f10531b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f10532c = new Object();

    /* renamed from: e, reason: collision with root package name */
    public volatile int f10534e = 1;

    /* renamed from: d, reason: collision with root package name */
    public volatile long f10533d = 0;

    public Pt(Q2.a aVar, C0784Vn c0784Vn) {
        this.f10530a = aVar;
        this.f10531b = c0784Vn;
    }

    public final void a(boolean z6) {
        if (((Boolean) C2841s.f23267e.f23270c.a(H9.oe)).booleanValue()) {
            C0697Ql c0697QlA = this.f10531b.a();
            c0697QlA.r("action", "mbs_state");
            c0697QlA.r("mbs_state", true != z6 ? "0" : "1");
            c0697QlA.s();
        }
        if (z6) {
            d(1, 2);
        } else {
            d(2, 1);
        }
    }

    public final boolean b() {
        boolean z6;
        synchronized (this.f10532c) {
            c();
            z6 = this.f10534e == 3;
        }
        return z6;
    }

    public final void c() {
        this.f10530a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.f10532c) {
            try {
                if (this.f10534e == 3) {
                    if (this.f10533d + ((Long) C2841s.f23267e.f23270c.a(H9.K6)).longValue() <= jCurrentTimeMillis) {
                        this.f10534e = 1;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void d(int i, int i3) {
        c();
        Object obj = this.f10532c;
        this.f10530a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (obj) {
            try {
                if (this.f10534e != i) {
                    return;
                }
                this.f10534e = i3;
                if (this.f10534e == 3) {
                    this.f10533d = jCurrentTimeMillis;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
