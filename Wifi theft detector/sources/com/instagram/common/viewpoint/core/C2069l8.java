package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2069l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C06214v A02 = new C06214v();
    public final AnonymousClass53 A03;

    public C2069l8(int i10, AnonymousClass53 anonymousClass53, int i11) {
        this.A00 = i10;
        this.A03 = anonymousClass53;
        this.A01 = i11;
    }

    private C0917Gz A00(C06214v c06214v, long j10, long j11) {
        int iA00;
        int iA002;
        int iA0A = c06214v.A0A();
        long j12 = -1;
        long j13 = -1;
        long lastPcrTimeUsInRange = C.TIME_UNSET;
        while (c06214v.A07() >= 188 && (iA002 = (iA00 = LI.A00(c06214v.A0l(), c06214v.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = LI.A01(c06214v, iA00, this.A00);
            if (jA01 != C.TIME_UNSET) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j10) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == C.TIME_UNSET) {
                        return C0917Gz.A04(jA06, j11);
                    }
                    return C0917Gz.A03(j11 + j12);
                }
                long j14 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j14 > j10) {
                        return C0917Gz.A03(iA00 + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j14 > j10) {
                        return C0917Gz.A03(iA00 + j11);
                    }
                    j12 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c06214v.A0f(iA002);
            j13 = iA002;
        }
        if (lastPcrTimeUsInRange != C.TIME_UNSET) {
            return C0917Gz.A05(lastPcrTimeUsInRange, j11 + j13);
        }
        return C0917Gz.A03;
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0917Gz AIw(InterfaceC2165ms interfaceC2165ms, long j10) throws IOException {
        long jA8n = interfaceC2165ms.A8n();
        int iMin = (int) Math.min(this.A01, interfaceC2165ms.A8O() - jA8n);
        this.A02.A0d(iMin);
        interfaceC2165ms.AGt(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j10, jA8n);
    }
}
