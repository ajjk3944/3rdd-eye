package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class bx implements eh {

    /* renamed from: b, reason: collision with root package name */
    public final ya.c0 f9835b;

    /* renamed from: c, reason: collision with root package name */
    public final rt f9836c;

    /* renamed from: d, reason: collision with root package name */
    public final ax f9837d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9834a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9838e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f9839f = new HashSet();
    public boolean g = false;

    public bx(String str, ya.c0 c0Var) {
        this.f9837d = new ax(str, c0Var);
        this.f9835b = c0Var;
        rt rtVar = new rt(8);
        rtVar.f15753b = BigInteger.ONE;
        rtVar.f15754c = "0";
        this.f9836c = rtVar;
    }

    @Override // com.google.android.gms.internal.ads.eh
    public final void S(boolean z3) {
        ua.j.C.f35267k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z3) {
            ya.c0 c0Var = this.f9835b;
            if (jCurrentTimeMillis - c0Var.t() > ((Long) va.s.f36163e.f36166c.a(sk.f16315s1)).longValue()) {
                this.f9837d.f9467d = -1;
            } else {
                this.f9837d.f9467d = c0Var.v();
            }
            this.g = true;
            return;
        }
        ya.c0 c0Var2 = this.f9835b;
        c0Var2.m();
        synchronized (c0Var2.f37402a) {
            try {
                if (c0Var2.f37414o != jCurrentTimeMillis) {
                    c0Var2.f37414o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = c0Var2.g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        c0Var2.g.apply();
                    }
                    c0Var2.n();
                }
            } finally {
            }
        }
        c0Var2.u(this.f9837d.f9467d);
    }

    public final void a(vw vwVar) {
        synchronized (this.f9834a) {
            this.f9838e.add(vwVar);
        }
    }

    public final void b(HashSet hashSet) {
        synchronized (this.f9834a) {
            this.f9838e.addAll(hashSet);
        }
    }

    public final void c() {
        synchronized (this.f9834a) {
            this.f9837d.a();
        }
    }

    public final void d() {
        synchronized (this.f9834a) {
            this.f9837d.b();
        }
    }

    public final void e(va.z2 z2Var, long j) {
        synchronized (this.f9834a) {
            this.f9837d.e(z2Var, j);
        }
    }

    public final void f() {
        synchronized (this.f9834a) {
            this.f9837d.g();
        }
    }

    public final void g() {
        synchronized (this.f9834a) {
            this.f9837d.g();
        }
    }
}
