package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.mbridge.msdk.playercommon.exoplayer2.C;

/* renamed from: com.facebook.ads.redexgen.X.qA, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2366qA implements AnonymousClass24 {
    public final float A00;
    public final float A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public static String[] A05 = {"DHM3ogSyPiOeoDv5bW0AxEOdKkHHyzoj", "DikGrT", "5TP2r3oYS7ZAxQ2Lbh6O1Hwgb27IVuVZ", "BcOsGW4wr7kIZtXNBjWS4kH8Hq7r3t1j", "xCBSo", "o3SRWC", "etImtR6pfOeyK0p12rnN", "VXmJTa"};
    public static final C2366qA A07 = new AnonymousClass30().A05();
    public static final AnonymousClass23<C2366qA> A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.qB
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            return C2366qA.A00(bundle);
        }
    };

    @Deprecated
    public C2366qA(long j10, long j11, long j12, float f10, float f11) {
        this.A04 = j10;
        this.A03 = j11;
        this.A02 = j12;
        this.A01 = f10;
        this.A00 = f11;
    }

    public C2366qA(AnonymousClass30 anonymousClass30) {
        this(anonymousClass30.A04, anonymousClass30.A03, anonymousClass30.A02, anonymousClass30.A01, anonymousClass30.A00);
    }

    public static /* synthetic */ C2366qA A00(Bundle bundle) {
        return new C2366qA(bundle.getLong(A01(0), C.TIME_UNSET), bundle.getLong(A01(1), C.TIME_UNSET), bundle.getLong(A01(2), C.TIME_UNSET), bundle.getFloat(A01(3), -3.4028235E38f), bundle.getFloat(A01(4), -3.4028235E38f));
    }

    public static String A01(int i10) {
        return Integer.toString(i10, 36);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2366qA)) {
            return false;
        }
        C2366qA c2366qA = (C2366qA) obj;
        if (this.A04 == c2366qA.A04 && this.A03 == c2366qA.A03) {
            long j10 = this.A02;
            if (A05[3].charAt(15) == 'f') {
                throw new RuntimeException();
            }
            A05[3] = "Dnbo0S1X4SiwSLqrl4n96G4h1rg7k6Qp";
            if (j10 == c2366qA.A02) {
                float f10 = this.A01;
                float f11 = c2366qA.A01;
                String[] strArr = A05;
                if (strArr[5].length() != strArr[7].length()) {
                    throw new RuntimeException();
                }
                String[] strArr2 = A05;
                strArr2[0] = "apznZec0lqKPAkNyEzYuPUZE7fb8LaPc";
                strArr2[6] = "99vPzfkBdBLW0Tl0nQsz";
                if (f10 == f11 && this.A00 == c2366qA.A00) {
                    return true;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10 = ((((int) (this.A04 ^ (this.A04 >>> 32))) * 31) + ((int) (this.A03 ^ (this.A03 >>> 32)))) * 31;
        int result = (int) (this.A02 ^ (this.A02 >>> 32));
        return ((((i10 + result) * 31) + (this.A01 != 0.0f ? Float.floatToIntBits(this.A01) : 0)) * 31) + (this.A00 != 0.0f ? Float.floatToIntBits(this.A00) : 0);
    }
}
