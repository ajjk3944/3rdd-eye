package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.l0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1683l0 implements LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C1996qI A04;
    public final HA A05;
    public final InterfaceC0543Hd A06;
    public final LN A07;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 81);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A08 = new byte[]{-68, -95, -24, -16, -11, -69, -95, -34, 17, 9, -2, -4, 13, -2, -3, -71, -5, 5, 8, -4, 4, -71, 12, 2, 19, -2, -45, -71};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.LL
    public final boolean AIt(InterfaceC1787ms interfaceC1787ms, long j) throws IOException {
        long j8 = j;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j8 <= 0 || this.A00 >= this.A03) {
                break;
            }
            int iAIp = this.A06.AIp(interfaceC1787ms, (int) Math.min(this.A03 - this.A00, j8), true);
            if (iAIp == -1) {
                j8 = 0;
            } else {
                this.A00 += iAIp;
                j8 -= iAIp;
            }
        }
        int i4 = this.A07.A02;
        int i10 = this.A00 / i4;
        if (i10 > 0) {
            long jA0U = this.A02 + C5C.A0U(this.A01, 1000000L, this.A07.A04);
            int i11 = i10 * i4;
            int i12 = this.A00 - i11;
            this.A06.AIu(jA0U, 1, i11, i12, null);
            this.A01 += i10;
            this.A00 = i12;
        }
        return j8 <= 0;
    }

    static {
        A01();
    }

    public C1683l0(HA ha2, InterfaceC0543Hd interfaceC0543Hd, LN ln, String str, int i4) throws C3K {
        this.A05 = ha2;
        this.A06 = interfaceC0543Hd;
        this.A07 = ln;
        int i10 = (ln.A05 * ln.A01) / 8;
        int bytesPerFrame = ln.A02;
        if (bytesPerFrame == i10) {
            int bytesPerFrame2 = ln.A04;
            int constantBitrate = bytesPerFrame2 * i10 * 8;
            int bytesPerFrame3 = ln.A04;
            this.A03 = Math.max(i10, (bytesPerFrame3 * i10) / 10);
            C01872p c01872pA0j = new C01872p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C01872p c01872pA0h = c01872pA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = ln.A05;
            C01872p c01872pA0b = c01872pA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = ln.A04;
            this.A04 = c01872pA0b.A0m(bytesPerFrame6).A0i(i4).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i10).append(A00(0, 7, 48));
        int bytesPerFrame7 = ln.A02;
        throw C3K.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AA8(int i4, long j) {
        this.A05.AJ7(new C1681ky(this.A07, 1, i4, j));
        this.A06.A6e(this.A04);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AIk(long j) {
        this.A02 = j;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
