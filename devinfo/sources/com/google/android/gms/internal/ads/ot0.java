package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ot0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f14788a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14789b;

    /* renamed from: c, reason: collision with root package name */
    public final tb.a f14790c;

    /* renamed from: d, reason: collision with root package name */
    public final long f14791d;

    /* renamed from: e, reason: collision with root package name */
    public final double f14792e;

    /* renamed from: f, reason: collision with root package name */
    public final int f14793f;

    public ot0(Object obj, tb.a aVar, double d10, int i4) {
        this.f14788a = obj;
        this.f14790c = aVar;
        aVar.getClass();
        this.f14789b = System.currentTimeMillis();
        this.f14791d = ((Long) va.s.f36163e.f36166c.a(sk.W)).longValue() * 1000;
        this.f14792e = d10;
        this.f14793f = i4;
    }

    public final long a() {
        long jMin = this.f14791d + Math.min(Math.max(((Long) va.s.f36163e.f36166c.a(sk.F)).longValue(), -900000L), 10000L);
        this.f14790c.getClass();
        return jMin - (System.currentTimeMillis() - this.f14789b);
    }
}
