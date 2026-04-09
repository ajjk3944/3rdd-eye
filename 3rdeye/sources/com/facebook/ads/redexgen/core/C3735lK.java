package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3735lK implements InterfaceC2579Gw {
    public static String[] A02 = {"1Tt6ltc55g", "ops4n6D0RsDIbcNK2iFIW7Ay7S5Nano", "QFUbJLsUaFmSVLdjzr36RpAXorrqi07i", "7FxugF0ZmqBQk4dAnarwpNTfiaTe1g6g", "N3T7HRrxqFzk5rl0dpC6S3h47ocLp3rK", "Rq3uRmlvLOcLbWX3oXceNMTvaDTByq6j", "8TmLuftHICqYkzwVWbIwZIwFPzZSJxQj", "4hmJxBFNQAJLWam3xj85pvhcrB85xjeQ"};
    public final long A00;
    public final C2564Gh A01;

    public C3735lK(C2564Gh c2564Gh, long j4) {
        this.A01 = c2564Gh;
        this.A00 = j4;
    }

    private C2580Gx A00(long j4, long j10) {
        return new C2580Gx((1000000 * j4) / this.A01.A07, this.A00 + j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A01.A06();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        long j10;
        C3M.A02(this.A01.A0A);
        long[] jArr = this.A01.A0A.A01;
        long[] jArr2 = this.A01.A0A.A00;
        int iA0L = AbstractC22614a.A0L(jArr, this.A01.A07(j4), true, false);
        long j11 = 0;
        if (iA0L == -1) {
            j10 = 0;
        } else {
            j10 = jArr[iA0L];
        }
        if (iA0L != -1) {
            j11 = jArr2[iA0L];
        }
        C2580Gx c2580GxA00 = A00(j10, j11);
        if (c2580GxA00.A01 != j4) {
            int length = jArr.length - 1;
            String[] strArr = A02;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A02;
            strArr2[3] = "o5tsTNyqew751hc5myqwVOdw8F1gICkG";
            strArr2[6] = "VidtQTuToVY7NImzxnJwSrK8bx75lEQY";
            if (iA0L != length) {
                C2580Gx secondSeekPoint = A00(jArr[iA0L + 1], jArr2[iA0L + 1]);
                return new C2578Gv(c2580GxA00, secondSeekPoint);
            }
        }
        return new C2578Gv(c2580GxA00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
