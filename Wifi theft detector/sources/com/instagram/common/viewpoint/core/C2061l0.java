package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.l0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2061l0 implements LL {
    public static byte[] A08;
    public static String[] A09 = {"mF6wsmKEoSH0oaFjYCs54xiQsDf", "7fvgeHK83IOxRTsxSXxl4b3GDJCkJYIR", "3AWdxUjQjYm4RALX7ZxT6TNspaUhotFB", "ejd6qsjsHb99jkL857XJ5GpzVF9O4Dmm", "HjmRuX1Dl2gTeBJaQInX56gY9CThxDdt", "4dP72HMzoJKZI0lPLVreHOZSlD0czmst", "VabPsN9EmqWHNd02VeXfGkhVpY5qzzPo", "1TiSMCKkeVz3FItUT5PAcFJ22kgDAGxf"};
    public int A00;
    public long A01;
    public long A02;
    public final int A03;
    public final C2374qI A04;
    public final HA A05;
    public final InterfaceC0921Hd A06;
    public final LN A07;

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A08, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 81);
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
    public final boolean AIt(InterfaceC2165ms interfaceC2165ms, long j10) throws IOException {
        long j11 = j10;
        while (true) {
            String[] strArr = A09;
            if (strArr[6].charAt(28) != strArr[5].charAt(28)) {
                throw new RuntimeException();
            }
            A09[7] = "xyHijgDe1t0LZE27YhGAb5keyZPdsLp6";
            if (j11 <= 0 || this.A00 >= this.A03) {
                break;
            }
            int iAIp = this.A06.AIp(interfaceC2165ms, (int) Math.min(this.A03 - this.A00, j11), true);
            if (iAIp == -1) {
                j11 = 0;
            } else {
                this.A00 += iAIp;
                j11 -= iAIp;
            }
        }
        int i10 = this.A07.A02;
        int i11 = this.A00 / i10;
        if (i11 > 0) {
            long jA0U = this.A02 + C5C.A0U(this.A01, 1000000L, this.A07.A04);
            int i12 = i11 * i10;
            int i13 = this.A00 - i12;
            this.A06.AIu(jA0U, 1, i12, i13, null);
            this.A01 += i11;
            this.A00 = i13;
        }
        return j11 <= 0;
    }

    static {
        A01();
    }

    public C2061l0(HA ha, InterfaceC0921Hd interfaceC0921Hd, LN ln, String str, int i10) throws C3K {
        this.A05 = ha;
        this.A06 = interfaceC0921Hd;
        this.A07 = ln;
        int i11 = (ln.A05 * ln.A01) / 8;
        int bytesPerFrame = ln.A02;
        if (bytesPerFrame == i11) {
            int bytesPerFrame2 = ln.A04;
            int constantBitrate = bytesPerFrame2 * i11 * 8;
            int bytesPerFrame3 = ln.A04;
            this.A03 = Math.max(i11, (bytesPerFrame3 * i11) / 10);
            C05652p c05652pA0j = new C05652p().A11(str).A0a(constantBitrate).A0j(constantBitrate);
            int bytesPerFrame4 = this.A03;
            C05652p c05652pA0h = c05652pA0j.A0h(bytesPerFrame4);
            int bytesPerFrame5 = ln.A05;
            C05652p c05652pA0b = c05652pA0h.A0b(bytesPerFrame5);
            int bytesPerFrame6 = ln.A04;
            this.A04 = c05652pA0b.A0m(bytesPerFrame6).A0i(i10).A14();
            return;
        }
        StringBuilder sbAppend = new StringBuilder().append(A00(7, 21, 72)).append(i11).append(A00(0, 7, 48));
        int bytesPerFrame7 = ln.A02;
        throw C3K.A01(sbAppend.append(bytesPerFrame7).toString(), null);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AA8(int i10, long j10) {
        this.A05.AJ7(new C2059ky(this.A07, 1, i10, j10));
        this.A06.A6e(this.A04);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AIk(long j10) {
        this.A02 = j10;
        this.A00 = 0;
        this.A01 = 0L;
    }
}
