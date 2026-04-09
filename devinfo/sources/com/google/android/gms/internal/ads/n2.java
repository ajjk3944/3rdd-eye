package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class n2 {

    /* renamed from: c, reason: collision with root package name */
    public static final n2 f14129c = new n2(0, 0);

    /* renamed from: a, reason: collision with root package name */
    public final long f14130a;

    /* renamed from: b, reason: collision with root package name */
    public final long f14131b;

    public n2(long j, long j8) {
        this.f14130a = j;
        this.f14131b = j8;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && n2.class == obj.getClass()) {
            n2 n2Var = (n2) obj;
            if (this.f14130a == n2Var.f14130a && this.f14131b == n2Var.f14131b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f14130a) * 31) + ((int) this.f14131b);
    }

    public final String toString() {
        long j = this.f14130a;
        int length = String.valueOf(j).length();
        long j8 = this.f14131b;
        StringBuilder sb2 = new StringBuilder(length + 19 + String.valueOf(j8).length() + 1);
        a0.g.A(sb2, "[timeUs=", j, ", position=");
        return je.u.s(j8, "]", sb2);
    }
}
