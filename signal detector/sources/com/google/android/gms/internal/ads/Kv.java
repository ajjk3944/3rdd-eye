package com.google.android.gms.internal.ads;

import q2.C2841s;

/* loaded from: classes.dex */
public final class Kv {

    /* renamed from: a, reason: collision with root package name */
    public final Object f9579a;

    /* renamed from: b, reason: collision with root package name */
    public final long f9580b;

    /* renamed from: c, reason: collision with root package name */
    public final Q2.a f9581c;

    /* renamed from: d, reason: collision with root package name */
    public final long f9582d;

    /* renamed from: e, reason: collision with root package name */
    public final double f9583e;

    /* renamed from: f, reason: collision with root package name */
    public final int f9584f;

    public Kv(Object obj, Q2.a aVar, double d6, int i) {
        this.f9579a = obj;
        this.f9581c = aVar;
        aVar.getClass();
        this.f9580b = System.currentTimeMillis();
        this.f9582d = ((Long) C2841s.f23267e.f23270c.a(H9.f8688W)).longValue() * 1000;
        this.f9583e = d6;
        this.f9584f = i;
    }

    public final long a() {
        long jMin = this.f9582d + Math.min(Math.max(((Long) C2841s.f23267e.f23270c.a(H9.f8589F)).longValue(), -900000L), 10000L);
        this.f9581c.getClass();
        return jMin - (System.currentTimeMillis() - this.f9580b);
    }
}
