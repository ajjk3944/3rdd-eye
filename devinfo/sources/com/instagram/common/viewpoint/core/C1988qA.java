package com.instagram.common.viewpoint.core;

import android.os.Bundle;

/* renamed from: com.facebook.ads.redexgen.X.qA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1988qA implements AnonymousClass24 {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"DHM3ogSyPiOeoDv5bW0AxEOdKkHHyzoj", "DikGrT", "5TP2r3oYS7ZAxQ2Lbh6O1Hwgb27IVuVZ", "BcOsGW4wr7kIZtXNBjWS4kH8Hq7r3t1j", "xCBSo", "o3SRWC", "etImtR6pfOeyK0p12rnN", "VXmJTa"};
    public static final C1988qA A07 = new AnonymousClass30().A05();
    public static final AnonymousClass23<C1988qA> A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qB
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C1988qA.A00(bundle);
        }
    };

    @Deprecated
    public C1988qA(long j, long j8, long j9, float f10, float f11) {
        this.A04 = j;
        this.A03 = j8;
        this.A02 = j9;
        this.A01 = f10;
        this.A00 = f11;
    }

    public C1988qA(AnonymousClass30 anonymousClass30) {
        this(anonymousClass30.A04, anonymousClass30.A03, anonymousClass30.A02, anonymousClass30.A01, anonymousClass30.A00);
    }

    public static /* synthetic */ C1988qA A00(Bundle bundle) {
        return new C1988qA(bundle.getLong(A01(0), -9223372036854775807L), bundle.getLong(A01(1), -9223372036854775807L), bundle.getLong(A01(2), -9223372036854775807L), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i4) {
        return Integer.toString(i4, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1988qA)) {
            return false;
        }
        C1988qA c1988qA = (C1988qA) obj;
        if (this.A04 == c1988qA.A04 && this.A03 == c1988qA.A03) {
            long j = this.A02;
            if (A05[3].charAt(15) == 'f') {
                throw new RuntimeException();
            }
            A05[3] = "Dnbo0S1X4SiwSLqrl4n96G4h1rg7k6Qp";
            if (j == c1988qA.A02) {
                float f10 = this.A01;
                float f11 = c1988qA.A01;
                String[] strArr = A05;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "apznZec0lqKPAkNyEzYuPUZE7fb8LaPc";
                strArr2[6] = "99vPzfkBdBLW0Tl0nQsz";
                if (f10 == f11 && this.A00 == c1988qA.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i4 = ((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        return ((((i4 + result) * 31) + (this.A01 != 0.0f ? Float.floatToIntBits(this.A01) : 0)) * 31) + (this.A00 != 0.0f ? Float.floatToIntBits(this.A00) : 0);
    }
}
