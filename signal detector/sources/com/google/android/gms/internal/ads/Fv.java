package com.google.android.gms.internal.ads;

import java.util.Random;
import q2.C2841s;

/* loaded from: classes.dex */
public final class Fv {

    /* renamed from: a, reason: collision with root package name */
    public final long f8220a;

    /* renamed from: b, reason: collision with root package name */
    public final long f8221b;

    /* renamed from: f, reason: collision with root package name */
    public final Q2.a f8225f;

    /* renamed from: g, reason: collision with root package name */
    public long f8226g;

    /* renamed from: d, reason: collision with root package name */
    public long f8223d = 5;

    /* renamed from: e, reason: collision with root package name */
    public long f8224e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Random f8227h = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f8222c = 0;

    public Fv(long j6, long j7, Q2.a aVar) {
        this.f8220a = j6;
        this.f8221b = j7;
        this.f8225f = aVar;
        a();
    }

    public final void a() {
        this.f8226g = this.f8220a;
        this.f8222c = 0L;
        this.f8224e = 0L;
    }

    public final long b() {
        double d6 = this.f8226g;
        double d7 = 0.2d * d6;
        long j6 = (long) (d6 + d7);
        return ((long) (d6 - d7)) + ((long) (this.f8227h.nextDouble() * ((j6 - r0) + 1)));
    }

    public final void c() {
        long jB = b();
        this.f8225f.getClass();
        this.f8224e = System.currentTimeMillis() + jB;
        double d6 = this.f8226g;
        this.f8226g = Math.min((long) (d6 + d6), this.f8221b);
        this.f8222c++;
    }

    public final boolean d() {
        E9 e9 = H9.f8614J;
        C2841s c2841s = C2841s.f23267e;
        return ((Integer) c2841s.f23270c.a(e9)).intValue() >= 0 && this.f8222c > Math.max(this.f8223d, (long) ((Integer) c2841s.f23270c.a(e9)).intValue()) && this.f8226g >= this.f8221b;
    }

    public final synchronized void e(int i) {
        M2.u.a(i > 0);
        this.f8223d = i;
    }
}
