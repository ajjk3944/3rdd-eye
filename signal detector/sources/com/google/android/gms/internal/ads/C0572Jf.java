package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import java.math.BigInteger;
import java.util.HashSet;
import q2.C2841s;
import t2.C2909E;

/* renamed from: com.google.android.gms.internal.ads.Jf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0572Jf implements T7 {

    /* renamed from: b, reason: collision with root package name */
    public final C2909E f9320b;

    /* renamed from: c, reason: collision with root package name */
    public final C0889ae f9321c;

    /* renamed from: d, reason: collision with root package name */
    public final C0555If f9322d;

    /* renamed from: a, reason: collision with root package name */
    public final Object f9319a = new Object();

    /* renamed from: e, reason: collision with root package name */
    public final HashSet f9323e = new HashSet();

    /* renamed from: f, reason: collision with root package name */
    public final HashSet f9324f = new HashSet();

    /* renamed from: g, reason: collision with root package name */
    public boolean f9325g = false;

    public C0572Jf(String str, C2909E c2909e) {
        this.f9322d = new C0555If(str, c2909e);
        this.f9320b = c2909e;
        C0889ae c0889ae = new C0889ae(12);
        c0889ae.f13150b = BigInteger.ONE;
        c0889ae.f13151c = "0";
        this.f9321c = c0889ae;
    }

    public final void a(C0470Df c0470Df) {
        synchronized (this.f9319a) {
            this.f9323e.add(c0470Df);
        }
    }

    public final void b(HashSet hashSet) {
        synchronized (this.f9319a) {
            this.f9323e.addAll(hashSet);
        }
    }

    public final void c() {
        synchronized (this.f9319a) {
            this.f9322d.a();
        }
    }

    public final void d() {
        synchronized (this.f9319a) {
            this.f9322d.b();
        }
    }

    public final void e(q2.a1 a1Var, long j6) {
        synchronized (this.f9319a) {
            this.f9322d.e(a1Var, j6);
        }
    }

    public final void f() {
        synchronized (this.f9319a) {
            this.f9322d.g();
        }
    }

    public final void g() {
        synchronized (this.f9319a) {
            this.f9322d.g();
        }
    }

    @Override // com.google.android.gms.internal.ads.T7
    public final void g0(boolean z6) {
        p2.j.f22785C.f22797k.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (z6) {
            C2909E c2909e = this.f9320b;
            if (jCurrentTimeMillis - c2909e.t() > ((Long) C2841s.f23267e.f23270c.a(H9.f8824s1)).longValue()) {
                this.f9322d.f9110d = -1;
            } else {
                this.f9322d.f9110d = c2909e.v();
            }
            this.f9325g = true;
            return;
        }
        C2909E c2909e2 = this.f9320b;
        c2909e2.m();
        synchronized (c2909e2.f23548a) {
            try {
                if (c2909e2.f23561o != jCurrentTimeMillis) {
                    c2909e2.f23561o = jCurrentTimeMillis;
                    SharedPreferences.Editor editor = c2909e2.f23554g;
                    if (editor != null) {
                        editor.putLong("app_last_background_time_ms", jCurrentTimeMillis);
                        c2909e2.f23554g.apply();
                    }
                    c2909e2.n();
                }
            } finally {
            }
        }
        c2909e2.u(this.f9322d.f9110d);
    }
}
