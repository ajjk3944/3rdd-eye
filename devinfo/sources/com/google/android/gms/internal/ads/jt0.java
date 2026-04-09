package com.google.android.gms.internal.ads;

import java.util.Random;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jt0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f12815a;

    /* renamed from: b, reason: collision with root package name */
    public final long f12816b;

    /* renamed from: f, reason: collision with root package name */
    public final tb.a f12820f;
    public long g;

    /* renamed from: d, reason: collision with root package name */
    public long f12818d = 5;

    /* renamed from: e, reason: collision with root package name */
    public long f12819e = 0;

    /* renamed from: h, reason: collision with root package name */
    public final Random f12821h = new Random();

    /* renamed from: c, reason: collision with root package name */
    public long f12817c = 0;

    public jt0(long j, long j8, tb.a aVar) {
        this.f12815a = j;
        this.f12816b = j8;
        this.f12820f = aVar;
        a();
    }

    public final void a() {
        this.g = this.f12815a;
        this.f12817c = 0L;
        this.f12819e = 0L;
    }

    public final long b() {
        double d10 = this.g;
        double d11 = 0.2d * d10;
        long j = (long) (d10 + d11);
        return ((long) (d10 - d11)) + ((long) (this.f12821h.nextDouble() * ((j - r0) + 1)));
    }

    public final void c() {
        long jB = b();
        this.f12820f.getClass();
        this.f12819e = System.currentTimeMillis() + jB;
        double d10 = this.g;
        this.g = Math.min((long) (d10 + d10), this.f12816b);
        this.f12817c++;
    }

    public final boolean d() {
        pk pkVar = sk.J;
        va.s sVar = va.s.f36163e;
        return ((Integer) sVar.f36166c.a(pkVar)).intValue() >= 0 && this.f12817c > Math.max(this.f12818d, (long) ((Integer) sVar.f36166c.a(pkVar)).intValue()) && this.g >= this.f12816b;
    }

    public final synchronized void e(int i4) {
        pb.y.b(i4 > 0);
        this.f12818d = i4;
    }
}
