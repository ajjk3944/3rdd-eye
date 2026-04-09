package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.7u, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C06987u {
    public final long A00;
    public final long A01;
    public static final C06987u A04 = new C06987u(0, 0);
    public static final C06987u A02 = new C06987u(Long.MAX_VALUE, Long.MAX_VALUE);
    public static final C06987u A06 = new C06987u(Long.MAX_VALUE, 0);
    public static final C06987u A05 = new C06987u(0, Long.MAX_VALUE);
    public static final C06987u A03 = A04;

    public C06987u(long j10, long j11) {
        AbstractC05983y.A07(j10 >= 0);
        AbstractC05983y.A07(j11 >= 0);
        this.A01 = j10;
        this.A00 = j11;
    }

    public final long A00(long minPositionUs, long j10, long j11) {
        if (this.A01 == 0 && this.A00 == 0) {
            return minPositionUs;
        }
        long jA0V = C5C.A0V(minPositionUs, this.A01, Long.MIN_VALUE);
        long jA0S = C5C.A0S(minPositionUs, this.A00, Long.MAX_VALUE);
        boolean z10 = true;
        boolean z11 = jA0V <= j10 && j10 <= jA0S;
        if (jA0V > j11 || j11 > jA0S) {
            z10 = false;
        }
        if (z11 && z10) {
            long jAbs = Math.abs(j10 - minPositionUs);
            long maxPositionUs = Math.abs(j11 - minPositionUs);
            if (jAbs <= maxPositionUs) {
                return j10;
            }
            return j11;
        }
        if (z11) {
            return j10;
        }
        if (z10) {
            return j11;
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
        C06987u c06987u = (C06987u) obj;
        return this.A01 == c06987u.A01 && this.A00 == c06987u.A00;
    }

    public final int hashCode() {
        return (((int) this.A01) * 31) + ((int) this.A00);
    }
}
