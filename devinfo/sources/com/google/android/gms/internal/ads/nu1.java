package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nu1 {

    /* renamed from: c, reason: collision with root package name */
    public static final nu1 f14442c;

    /* renamed from: d, reason: collision with root package name */
    public static final nu1 f14443d;

    /* renamed from: a, reason: collision with root package name */
    public final long f14444a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14445b;

    static {
        nu1 nu1Var = new nu1(0L, 0L);
        new nu1(Long.MAX_VALUE, Long.MAX_VALUE);
        f14442c = new nu1(Long.MAX_VALUE, 0L);
        new nu1(0L, Long.MAX_VALUE);
        f14443d = nu1Var;
    }

    public nu1(long j, long j8) {
        mq0.m(j >= 0);
        mq0.m(j8 >= 0);
        this.f14444a = j;
        this.f14445b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && nu1.class == obj.getClass()) {
            nu1 nu1Var = (nu1) obj;
            if (this.f14444a == nu1Var.f14444a && this.f14445b == nu1Var.f14445b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14444a) * 31) + ((int) this.f14445b);
    }
}
