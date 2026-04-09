package com.instagram.common.viewpoint.core;

import java.io.IOException;

/* renamed from: com.facebook.ads.redexgen.X.l8, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1691l8 implements H1 {
    public static String[] A04 = {"sdKdmhexVnrlWGhX9TH5KtuHBxlX2", "B98Zkm438dg3YkwTFsWcwjYsIqopE2cW", "q7DFl2FydsE0DWNk8QJk98tFdBPGU17r", "uw89PlDwsU5CTp5ALy1o", "HmpI", "x0Unc4LQNUVImDERNKiE", "Klo4tVDdc3zNBBgsT3eAMryjwXw3w", "mmy2vPNb8zCZX"};
    public final int A00;
    public final int A01;
    public final C02434v A02 = new C02434v();
    public final AnonymousClass53 A03;

    public C1691l8(int i4, AnonymousClass53 anonymousClass53, int i10) {
        this.A00 = i4;
        this.A03 = anonymousClass53;
        this.A01 = i10;
    }

    private C0539Gz A00(C02434v c02434v, long j, long j8) {
        int iA00;
        int iA002;
        int iA0A = c02434v.A0A();
        long j9 = -1;
        long j10 = -1;
        long lastPcrTimeUsInRange = -9223372036854775807L;
        while (c02434v.A07() >= 188 && (iA002 = (iA00 = LI.A00(c02434v.A0l(), c02434v.A09(), iA0A)) + 188) <= iA0A) {
            long jA01 = LI.A01(c02434v, iA00, this.A00);
            if (jA01 != -9223372036854775807L) {
                long jA06 = this.A03.A06(jA01);
                if (jA06 > j) {
                    String[] strArr = A04;
                    if (strArr[1].charAt(12) == strArr[2].charAt(12)) {
                        throw new RuntimeException();
                    }
                    String[] strArr2 = A04;
                    strArr2[3] = "aExFpEIrb6zE8t35yvld";
                    strArr2[5] = "jMLoot3yN0lnttWSwPI3";
                    if (lastPcrTimeUsInRange == -9223372036854775807L) {
                        return C0539Gz.A04(jA06, j8);
                    }
                    return C0539Gz.A03(j8 + j9);
                }
                long j11 = jA06 + 100000;
                String[] strArr3 = A04;
                if (strArr3[1].charAt(12) != strArr3[2].charAt(12)) {
                    String[] strArr4 = A04;
                    strArr4[3] = "ZHgwZuqrkfLn2FTfbKUV";
                    strArr4[5] = "99YI6qOyfmrUQVvNk1ZB";
                    if (j11 > j) {
                        return C0539Gz.A03(iA00 + j8);
                    }
                    j9 = iA00;
                    lastPcrTimeUsInRange = jA06;
                } else {
                    A04[4] = "5ynNf";
                    if (j11 > j) {
                        return C0539Gz.A03(iA00 + j8);
                    }
                    j9 = iA00;
                    lastPcrTimeUsInRange = jA06;
                }
            }
            c02434v.A0f(iA002);
            j10 = iA002;
        }
        if (lastPcrTimeUsInRange != -9223372036854775807L) {
            return C0539Gz.A05(lastPcrTimeUsInRange, j8 + j10);
        }
        return C0539Gz.A03;
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final void AFs() {
        this.A02.A0i(C5C.A07);
    }

    @Override // com.instagram.common.viewpoint.core.H1
    public final C0539Gz AIw(InterfaceC1787ms interfaceC1787ms, long j) throws IOException {
        long jA8n = interfaceC1787ms.A8n();
        int iMin = (int) Math.min(this.A01, interfaceC1787ms.A8O() - jA8n);
        this.A02.A0d(iMin);
        interfaceC1787ms.AGt(this.A02.A0l(), 0, iMin);
        return A00(this.A02, j, jA8n);
    }
}
