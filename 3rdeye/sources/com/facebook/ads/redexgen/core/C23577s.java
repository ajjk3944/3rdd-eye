package com.facebook.ads.redexgen.core;

import android.util.Pair;
import com.facebook.ads.androidx.media3.extractor.metadata.id3.MlltFrame;

/* renamed from: com.facebook.ads.redexgen.X.7s, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23577s implements InterfaceC3711kk {
    public final long A00;
    public final long[] A01;
    public final long[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, Long> A00(long j4, long[] jArr, long[] jArr2) {
        int iA0L = AbstractC22614a.A0L(jArr, j4, true, true);
        long j10 = jArr[iA0L];
        long j11 = jArr2[iA0L];
        int i = iA0L + 1;
        if (i == jArr.length) {
            return Pair.create(Long.valueOf(j10), Long.valueOf(j11));
        }
        return Pair.create(Long.valueOf(j4), Long.valueOf(((long) ((jArr2[i] - j11) * (jArr[i] == j10 ? 0.0d : (j4 - j10) / (r4 - j10)))) + j11));
    }

    public C23577s(long[] jArr, long[] jArr2, long j4) {
        this.A01 = jArr;
        this.A02 = jArr2;
        this.A00 = j4 == -9223372036854775807L ? AbstractC22614a.A0O(jArr2[jArr2.length - 1]) : j4;
    }

    public static C23577s A01(long j4, MlltFrame mlltFrame, long j10) {
        int length = mlltFrame.A03.length;
        int referenceCount = length + 1;
        long[] jArr = new long[referenceCount];
        int referenceCount2 = length + 1;
        long[] jArr2 = new long[referenceCount2];
        jArr[0] = j4;
        jArr2[0] = 0;
        long j11 = 0;
        for (int i = 1; i <= length; i++) {
            int referenceCount3 = i - 1;
            j4 += mlltFrame.A00 + mlltFrame.A03[referenceCount3];
            int referenceCount4 = i - 1;
            j11 += mlltFrame.A01 + mlltFrame.A04[referenceCount4];
            jArr[i] = j4;
            jArr2[i] = j11;
        }
        return new C23577s(jArr, jArr2, j10);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A7b() {
        return -1L;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        Pair<Long, Long> pairA00 = A00(AbstractC22614a.A0P(AbstractC22614a.A0T(j4, 0L, this.A00)), this.A02, this.A01);
        return new C2578Gv(new C2580Gx(AbstractC22614a.A0O(((Long) pairA00.first).longValue()), ((Long) pairA00.second).longValue()));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A99(long j4) {
        Pair<Long, Long> positionAndTimeMs = A00(j4, this.A01, this.A02);
        return AbstractC22614a.A0O(((Long) positionAndTimeMs.second).longValue());
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
