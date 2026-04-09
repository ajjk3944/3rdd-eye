package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.7q, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C23557q implements InterfaceC3711kk {
    public static byte[] A04;
    public final long A00;
    public final long A01;
    public final long[] A02;
    public final long[] A03;

    static {
        A02();
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C23557q A00(long j4, long j10, C2568Gl c2568Gl, C4J c4j) {
        int iA0I;
        long j11 = j10;
        c4j.A0g(10);
        int iA0C = c4j.A0C();
        if (iA0C <= 0) {
            return null;
        }
        int i = c2568Gl.A03;
        long jA0U = AbstractC22614a.A0U(iA0C, (i >= 32000 ? 1152 : 576) * 1000000, i);
        int iA0M = c4j.A0M();
        int iA0M2 = c4j.A0M();
        int iA0M3 = c4j.A0M();
        c4j.A0g(2);
        long j12 = j11 + c2568Gl.A02;
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        for (int i10 = 0; i10 < iA0M; i10++) {
            jArr[i10] = (i10 * jA0U) / iA0M;
            jArr2[i10] = Math.max(j11, j12);
            switch (iA0M3) {
                case 1:
                    iA0I = c4j.A0I();
                    break;
                case 2:
                    iA0I = c4j.A0M();
                    break;
                case 3:
                    iA0I = c4j.A0K();
                    break;
                case 4:
                    iA0I = c4j.A0L();
                    break;
                default:
                    return null;
            }
            j11 += iA0I * iA0M2;
        }
        if (j4 != -1 && j4 != j11) {
            AnonymousClass44.A07(A01(27, 10, 89), A01(2, 25, 50) + j4 + A01(0, 2, 80) + j11);
        }
        return new C23557q(jArr, jArr2, jA0U, j11);
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 43);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A04 = new byte[]{-89, -101, -77, -97, -81, -90, 125, -63, -66, -47, -66, 125, -48, -58, -41, -62, 125, -54, -58, -48, -54, -66, -47, -64, -59, -105, 125, -38, -26, -10, -19, -41, -23, -23, -17, -23, -10};
    }

    public C23557q(long[] jArr, long[] jArr2, long j4, long j10) {
        this.A03 = jArr;
        this.A02 = jArr2;
        this.A01 = j4;
        this.A00 = j10;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A7b() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        int iA0L = AbstractC22614a.A0L(this.A03, j4, true, true);
        C2580Gx c2580Gx = new C2580Gx(this.A03[iA0L], this.A02[iA0L]);
        if (c2580Gx.A01 < j4) {
            int tableIndex = this.A03.length;
            if (iA0L != tableIndex - 1) {
                int tableIndex2 = iA0L + 1;
                long j10 = this.A03[tableIndex2];
                int tableIndex3 = iA0L + 1;
                C2580Gx nextSeekPoint = new C2580Gx(j10, this.A02[tableIndex3]);
                return new C2578Gv(c2580Gx, nextSeekPoint);
            }
        }
        return new C2578Gv(c2580Gx);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3711kk
    public final long A99(long j4) {
        return this.A03[AbstractC22614a.A0L(this.A02, j4, true, true)];
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
