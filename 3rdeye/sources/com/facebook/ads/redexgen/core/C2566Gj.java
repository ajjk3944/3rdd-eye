package com.facebook.ads.redexgen.core;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.Gj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2566Gj {
    public static byte[] A09;
    public static String[] A0A = {"EsB1Svc2O0r", "neXgiGAVZF2hPSW", "e5UrGC6TzR", "xWVfqfZ1XD25z1nFBwMIBfHnywy3RQhb", "m9mgew9TdIxun9z0pjAF4NJPGlbJBstI", "nE", "RVA0jPrNpk", "4CgUEtTVWe3Kq65nNHH5xBV3YKPxdnIZ"};
    public final float A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;
    public final int A06;
    public final String A07;
    public final List<byte[]> A08;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2566Gj A00(C4J c4j) throws C22172i {
        try {
            c4j.A0g(21);
            int iA0I = c4j.A0I() & 3;
            int iA0I2 = c4j.A0I();
            int i = 0;
            int iA09 = c4j.A09();
            for (int i10 = 0; i10 < iA0I2; i10++) {
                c4j.A0g(1);
                int iA0M = c4j.A0M();
                for (int i11 = 0; i11 < iA0M; i11++) {
                    int iA0M2 = c4j.A0M();
                    i += iA0M2 + 4;
                    c4j.A0g(iA0M2);
                }
            }
            c4j.A0f(iA09);
            byte[] bArr = new byte[i];
            int i12 = 0;
            int i13 = -1;
            int i14 = -1;
            int i15 = -1;
            int i16 = -1;
            int i17 = -1;
            float f10 = 1.0f;
            String strA03 = null;
            for (int i18 = 0; i18 < iA0I2; i18++) {
                int iA0I3 = c4j.A0I() & 63;
                int iA0M3 = c4j.A0M();
                for (int i19 = 0; i19 < iA0M3; i19++) {
                    int iA0M4 = c4j.A0M();
                    System.arraycopy(AbstractC2573Gq.A03, 0, bArr, i12, AbstractC2573Gq.A03.length);
                    int length = i12 + AbstractC2573Gq.A03.length;
                    System.arraycopy(c4j.A0l(), c4j.A09(), bArr, length, iA0M4);
                    if (iA0I3 == 33 && i19 == 0) {
                        C2570Gn c2570GnA05 = AbstractC2573Gq.A05(bArr, length, length + iA0M4);
                        i13 = c2570GnA05.A0A;
                        i14 = c2570GnA05.A08;
                        i15 = c2570GnA05.A02;
                        i16 = c2570GnA05.A01;
                        i17 = c2570GnA05.A03;
                        f10 = c2570GnA05.A00;
                        strA03 = C3U.A03(c2570GnA05.A07, c2570GnA05.A0B, c2570GnA05.A06, c2570GnA05.A05, c2570GnA05.A0C, c2570GnA05.A04);
                    }
                    i12 = length + iA0M4;
                    c4j.A0g(iA0M4);
                }
            }
            return new C2566Gj(i == 0 ? Collections.emptyList() : Collections.singletonList(bArr), iA0I + 1, i13, i14, f10, strA03, i15, i16, i17);
        } catch (ArrayIndexOutOfBoundsException e4) {
            throw C22172i.A01(A01(0, 25, 126), e4);
        }
    }

    public static String A01(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A09, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            if (A0A[5].length() == 29) {
                throw new RuntimeException();
            }
            A0A[5] = "YyBlh7kREcvGfk8zeLahZrRMr2fR36";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 68);
            i12++;
        }
    }

    public static void A02() {
        A09 = new byte[]{127, 72, 72, 85, 72, 26, 74, 91, 72, 73, 83, 84, 93, 26, 114, 127, 108, 121, 26, 89, 85, 84, 92, 83, 93};
    }

    static {
        A02();
    }

    public C2566Gj(List<byte[]> initializationData, int i, int i10, int i11, float f10, String str, int i12, int i13, int i14) {
        this.A08 = initializationData;
        this.A05 = i;
        this.A06 = i10;
        this.A04 = i11;
        this.A00 = f10;
        this.A07 = str;
        this.A02 = i12;
        this.A01 = i13;
        this.A03 = i14;
    }
}
