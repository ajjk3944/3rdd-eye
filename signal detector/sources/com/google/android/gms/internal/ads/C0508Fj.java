package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import java.util.LinkedList;
import q2.InterfaceC2806a;

/* renamed from: com.google.android.gms.internal.ads.Fj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0508Fj implements InterfaceC0441Bk, InterfaceC2806a, InterfaceC0730Sk, InterfaceC1921tk, InterfaceC1382jk, InterfaceC1005cl {

    /* renamed from: a, reason: collision with root package name */
    public final Q2.a f8177a;

    /* renamed from: b, reason: collision with root package name */
    public final C0470Df f8178b;

    public C0508Fj(Q2.a aVar, C0470Df c0470Df) {
        this.f8177a = aVar;
        this.f8178b = c0470Df;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void A(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void B(C1084e9 c1084e9) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void E(C1807re c1807re) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void H(C1084e9 c1084e9) {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            c0470Df.f7808b.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void I() {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            try {
                if (c0470Df.f7816k != -1) {
                    LinkedList linkedList = c0470Df.f7809c;
                    if (!linkedList.isEmpty()) {
                        C0453Cf c0453Cf = (C0453Cf) linkedList.getLast();
                        if (c0453Cf.f7632b == -1) {
                            c0453Cf.f7633c.f7807a.getClass();
                            c0453Cf.f7632b = SystemClock.elapsedRealtime();
                            c0470Df.f7808b.a(c0470Df);
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void N() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void b() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void d() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0441Bk
    public final void e() {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            try {
                if (c0470Df.f7816k != -1) {
                    c0470Df.f7807a.getClass();
                    c0470Df.f7814h = SystemClock.elapsedRealtime();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // q2.InterfaceC2806a
    public final void onAdClicked() {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            try {
                if (c0470Df.f7816k != -1) {
                    C0453Cf c0453Cf = new C0453Cf(c0470Df);
                    c0453Cf.f7633c.f7807a.getClass();
                    c0453Cf.f7631a = SystemClock.elapsedRealtime();
                    c0470Df.f7809c.add(c0453Cf);
                    c0470Df.i++;
                    C0572Jf c0572Jf = c0470Df.f7808b;
                    c0572Jf.c();
                    c0572Jf.a(c0470Df);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void p() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void v() {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC0730Sk
    public final void w(Xt xt) {
        Q2.a aVar = this.f8177a;
        C0470Df c0470Df = this.f8178b;
        aVar.getClass();
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        synchronized (c0470Df.f7810d) {
            try {
                c0470Df.f7816k = jElapsedRealtime;
                if (jElapsedRealtime != -1) {
                    c0470Df.f7808b.a(c0470Df);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void x(boolean z6) {
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1005cl
    public final void y(C1084e9 c1084e9) {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            c0470Df.f7808b.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1921tk
    public final void z() {
        C0470Df c0470Df = this.f8178b;
        synchronized (c0470Df.f7810d) {
            try {
                if (c0470Df.f7816k != -1 && c0470Df.f7813g == -1) {
                    c0470Df.f7807a.getClass();
                    c0470Df.f7813g = SystemClock.elapsedRealtime();
                    c0470Df.f7808b.a(c0470Df);
                }
                c0470Df.f7808b.d();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1382jk
    public final void F(BinderC2185ye binderC2185ye, String str, String str2) {
    }
}
