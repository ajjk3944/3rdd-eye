package com.instagram.common.viewpoint.core;

import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class HF {
    public static String[] A00 = {"o6dy0jxWVFoVpdfIHLQ5kJFOMlq1Sn1Q", "79oj", "9g10QGOLUMPWkkbPiEKlPZ6GdmncXBXa", "6fmIgIVXmOYY3cUB7ZYAXnWSgE20TitB", "v6a7Yb3DANDL70kkwlzLnkI1heNzynkm", "eDdjZQkAYxVEYJ3d9Q78IvgSo191T7ve", "sHmXnPOOobIrXpWrquJBTDw1maWJKk3u", "k0vF7vRBeJQaOBXZ"};

    public static int A00(C06214v c06214v, int i10) {
        switch (i10) {
            case 1:
                return PsExtractor.AUDIO_STREAM;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i10 - 2);
            case 6:
                return c06214v.A0I() + 1;
            case 7:
                int iA0M = c06214v.A0M();
                String[] strArr = A00;
                if (strArr[6].charAt(23) != strArr[4].charAt(23)) {
                    throw new RuntimeException();
                }
                A00[7] = "hcXiJWofr5Txci555yuma5X";
                return iA0M + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i10 - 8);
            default:
                return -1;
        }
    }

    public static long A01(InterfaceC2165ms interfaceC2165ms, HJ hj) throws IOException {
        interfaceC2165ms.AIl();
        boolean z10 = true;
        interfaceC2165ms.A47(1);
        byte[] bArr = new byte[1];
        interfaceC2165ms.AGt(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z10 = false;
        }
        interfaceC2165ms.A47(2);
        int i10 = z10 ? 7 : 6;
        C06214v c06214v = new C06214v(i10);
        c06214v.A0e(HB.A00(interfaceC2165ms, c06214v.A0l(), 0, i10));
        interfaceC2165ms.AIl();
        HE he = new HE();
        boolean isBlockSizeVariable = A08(c06214v, hj, z10, he);
        if (isBlockSizeVariable) {
            return he.A00;
        }
        throw C3K.A01(null, null);
    }

    public static boolean A02(int i10, HJ hj) {
        if (i10 == 0) {
            return true;
        }
        int i11 = hj.A01;
        if (A00[7].length() == 8) {
            throw new RuntimeException();
        }
        A00[0] = "dnyA5Em4Vekc9hKZNMMqKWCBR5ivXppC";
        return i10 == i11;
    }

    public static boolean A03(int i10, HJ hj) {
        if (i10 <= 7) {
            return i10 == hj.A02 - 1;
        }
        if (A00[3].charAt(10) != 'Y') {
            throw new RuntimeException();
        }
        A00[3] = "e0AkGTV6jhYRPjlSs9AVJSXBXenCNngQ";
        return i10 <= 10 && hj.A02 == 2;
    }

    public static boolean A04(C06214v c06214v, int i10) {
        int iA0I = c06214v.A0I();
        int crc = c06214v.A09();
        return iA0I == C5C.A0J(c06214v.A0l(), i10, crc + (-1), 0);
    }

    public static boolean A05(C06214v c06214v, HJ hj, int i10) {
        int iA00 = A00(c06214v, i10);
        if (iA00 != -1) {
            int blockSizeSamples = hj.A03;
            if (iA00 <= blockSizeSamples) {
                return true;
            }
        }
        return false;
    }

    public static boolean A06(C06214v c06214v, HJ hj, int i10) {
        int sampleRate = hj.A07;
        if (i10 == 0) {
            return true;
        }
        if (i10 <= 11) {
            return i10 == hj.A08;
        }
        if (i10 == 12) {
            return c06214v.A0I() * 1000 == sampleRate;
        }
        if (i10 > 14) {
            return false;
        }
        int expectedSampleRate = c06214v.A0M();
        if (i10 == 14) {
            expectedSampleRate *= 10;
        }
        return expectedSampleRate == sampleRate;
    }

    public static boolean A07(C06214v c06214v, HJ hj, int i10, HE he) {
        int iA09 = c06214v.A09();
        long jA0Q = c06214v.A0Q();
        long frameHeaderBytes = jA0Q >>> 16;
        if (frameHeaderBytes != i10) {
            return false;
        }
        int blockSizeKey = (int) ((jA0Q >> 8) & 15);
        long frameHeaderBytes2 = jA0Q >> 1;
        int frameStartPosition = (int) (frameHeaderBytes2 & 7);
        return A03((int) ((jA0Q >> 4) & 15), hj) && A02(frameStartPosition, hj) && !(((jA0Q & 1) > 1L ? 1 : ((jA0Q & 1) == 1L ? 0 : -1)) == 0) && A08(c06214v, hj, (((jA0Q >>> 16) & 1) > 1L ? 1 : (((jA0Q >>> 16) & 1) == 1L ? 0 : -1)) == 0, he) && A05(c06214v, hj, (int) ((jA0Q >> 12) & 15)) && A06(c06214v, hj, blockSizeKey) && A04(c06214v, iA09);
    }

    public static boolean A08(C06214v c06214v, HJ hj, boolean z10, HE he) {
        long utf8Value;
        try {
            long jA0S = c06214v.A0S();
            if (z10) {
                utf8Value = jA0S;
            } else {
                long utf8Value2 = hj.A03;
                utf8Value = utf8Value2 * jA0S;
            }
            he.A00 = utf8Value;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    public static boolean A09(InterfaceC2165ms interfaceC2165ms, HJ hj, int i10, HE he) throws IOException {
        long jA8i = interfaceC2165ms.A8i();
        byte[] bArr = new byte[2];
        interfaceC2165ms.AGt(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i10) {
            interfaceC2165ms.AIl();
            interfaceC2165ms.A47((int) (jA8i - interfaceC2165ms.A8n()));
            return false;
        }
        C06214v c06214v = new C06214v(16);
        System.arraycopy(bArr, 0, c06214v.A0l(), 0, 2);
        byte[] frameStartBytes = c06214v.A0l();
        c06214v.A0e(HB.A00(interfaceC2165ms, frameStartBytes, 2, 14));
        interfaceC2165ms.AIl();
        interfaceC2165ms.A47((int) (jA8i - interfaceC2165ms.A8n()));
        return A07(c06214v, hj, i10, he);
    }
}
