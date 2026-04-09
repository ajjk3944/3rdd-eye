package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.7I, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C7I {
    public final long A00;
    public final long A01;
    public static final C7I A04 = new C7I(0, 0);
    public static final C7I A02 = new C7I(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C7I A06 = new C7I(Long.MAX_VALUE, 0);
    public static final C7I A05 = new C7I(0, Long.MAX_VALUE);
    public static final C7I A03 = A04;

    public C7I(long j4, long j10) {
        C3M.A07(j4 >= 0);
        C3M.A07(j10 >= 0);
        this.A01 = j4;
        this.A00 = j10;
    }

    public final long A00(long minPositionUs, long j4, long j10) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = AbstractC22614a.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = AbstractC22614a.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = jA0V <= j4 && j4 <= jA0S;
        if (jA0V > j10 || j10 > jA0S) {
            z10 = false;
        }
        if (z11 && z10) {
            long jAbs = Math.abs(j4 - minPositionUs);
            long maxPositionUs = Math.abs(j10 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j4;
            }
            return j10;
        }
        if (z11) {
            return j4;
        }
        if (z10) {
            return j10;
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
        C7I c7i = (C7I) obj;
        return this.A01 == c7i.A01 && this.A00 == c7i.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
