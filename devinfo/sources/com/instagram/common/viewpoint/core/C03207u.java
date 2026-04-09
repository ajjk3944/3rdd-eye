package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C03207u {
    public final long A00;
    public final long A01;
    public static final C03207u A04 = new C03207u(0, 0);
    public static final C03207u A02 = new C03207u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C03207u A06 = new C03207u(Long.MAX_VALUE, 0);
    public static final C03207u A05 = new C03207u(0, Long.MAX_VALUE);
    public static final C03207u A03 = A04;

    public C03207u(long j, long j8) {
        AbstractC02203y.A07(j >= 0);
        AbstractC02203y.A07(j8 >= 0);
        this.A01 = j;
        this.A00 = j8;
    }

    public final long A00(long minPositionUs, long j, long j8) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z3 = true;
        boolean z10 = jA0V <= j && j <= jA0S;
        if (jA0V > j8 || j8 > jA0S) {
            z3 = false;
        }
        if (z10 && z3) {
            long jAbs = Math.abs(j - minPositionUs);
            long maxPositionUs = Math.abs(j8 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j;
            }
            return j8;
        }
        if (z10) {
            return j;
        }
        if (z3) {
            return j8;
        }
        return jA0V;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C03207u c03207u = (C03207u) obj;
        return this.A01 == c03207u.A01 && this.A00 == c03207u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
