package com.facebook.ads.redexgen.core;

import com.facebook.ads.androidx.media3.common.DrmInitData;
import java.nio.ByteBuffer;
import java.util.Arrays;
import kotlin.KotlinVersion;

/* loaded from: assets/audience_network.dex */
public abstract class GI {
    public static byte[] A00;
    public static String[] A01 = {"xbfghvjfzJvhku5N8OELiq204nVuVPFf", "QHdNkhaNqF6P8ZoHbM5E7ac9pSEOFT0I", "gTrjGkh7SJSYjcOCOWWCub6Uckq9Yltj", "B1r", "bt5fTN19iCcMkB3LBJCDNqZ6iO4ZjItL", "3vLSrbB7SQdOWYeFWsx", "mXdQOoT87saNovPMynKxKkWZ", "FMZbalTyTizDclIiFtsmYNu0onhdvCq9"};
    public static final int[] A02;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0072  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static com.facebook.ads.redexgen.core.GH A04(com.facebook.ads.redexgen.core.C4I r12) {
        /*
            r2 = 0
            r0 = 16
            int r1 = r12.A04(r0)
            r4 = 2
            int r2 = r2 + r4
            int r10 = r12.A04(r0)
            int r2 = r2 + r4
            r0 = 65535(0xffff, float:9.1834E-41)
            if (r10 != r0) goto L1b
            r0 = 24
            int r10 = r12.A04(r0)
            int r2 = r2 + 3
        L1b:
            int r10 = r10 + r2
            r0 = 44097(0xac41, float:6.1793E-41)
            if (r1 != r0) goto L23
            int r10 = r10 + 2
        L23:
            int r7 = r12.A04(r4)
            r3 = 3
            if (r7 != r3) goto L4a
            int r0 = A00(r12, r4)
            int r7 = r7 + r0
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GI.A01
            r0 = 1
            r1 = r2[r0]
            r0 = 4
            r2 = r2[r0]
            r0 = 27
            char r1 = r1.charAt(r0)
            char r0 = r2.charAt(r0)
            if (r1 == r0) goto Lc9
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GI.A01
            java.lang.String r1 = "JeV"
            r0 = 3
            r2[r0] = r1
        L4a:
            r0 = 10
            int r6 = r12.A04(r0)
            boolean r0 = r12.A0H()
            if (r0 == 0) goto L5f
            int r0 = r12.A04(r3)
            if (r0 <= 0) goto L5f
            r12.A09(r4)
        L5f:
            boolean r4 = r12.A0H()
            r5 = 48000(0xbb80, float:6.7262E-41)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.GI.A01
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 0
            if (r1 == r0) goto Lc9
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.GI.A01
            java.lang.String r1 = "lwIINFZkQEgov7IcPWK4ANnqSDhXt22f"
            r0 = 7
            r2[r0] = r1
            r0 = 44100(0xac44, float:6.1797E-41)
            if (r4 == 0) goto Lc5
            r9 = 48000(0xbb80, float:6.7262E-41)
        L81:
            r1 = 4
            int r4 = r12.A04(r1)
            r11 = 0
            if (r9 != r0) goto L99
            r0 = 13
            if (r4 != r0) goto L99
            int[] r0 = com.facebook.ads.redexgen.core.GI.A02
            r11 = r0[r4]
        L91:
            com.facebook.ads.redexgen.X.GH r6 = new com.facebook.ads.redexgen.X.GH
            r8 = 2
            r12 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            return r6
        L99:
            if (r9 != r5) goto L91
            int[] r0 = com.facebook.ads.redexgen.core.GI.A02
            int r0 = r0.length
            if (r4 >= r0) goto L91
            int[] r0 = com.facebook.ads.redexgen.core.GI.A02
            r11 = r0[r4]
            int r2 = r6 % 5
            r1 = 11
            r0 = 8
            switch(r2) {
                case 1: goto Lbe;
                case 2: goto Lb7;
                case 3: goto Lbe;
                case 4: goto Lae;
                default: goto Lad;
            }
        Lad:
            goto L91
        Lae:
            if (r4 == r3) goto Lb4
            if (r4 == r0) goto Lb4
            if (r4 != r1) goto L91
        Lb4:
            int r11 = r11 + 1
            goto L91
        Lb7:
            if (r4 == r0) goto Lbb
            if (r4 != r1) goto L91
        Lbb:
            int r11 = r11 + 1
            goto L91
        Lbe:
            if (r4 == r3) goto Lc2
            if (r4 != r0) goto L91
        Lc2:
            int r11 = r11 + 1
            goto L91
        Lc5:
            r9 = 44100(0xac44, float:6.1797E-41)
            goto L81
        Lc9:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.GI.A04(com.facebook.ads.redexgen.X.4I):com.facebook.ads.redexgen.X.GH");
    }

    public static String A05(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            byte b10 = bArrCopyOfRange[i12];
            if (A01[7].charAt(26) == 'U') {
                throw new RuntimeException();
            }
            String[] strArr = A01;
            strArr[2] = "ZZS15YLfqnGzRKQmbGGBAS62S7daT6Pr";
            strArr[0] = "wbQ3s0ZhLtikxP7PtpYOpvXFjSSpaatC";
            bArrCopyOfRange[i12] = (byte) ((b10 - i11) - 7);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A06() {
        A00 = new byte[]{-121, -101, -118, -113, -107, 85, -121, -119, 90};
    }

    static {
        A06();
        A02 = new int[]{2002, 2000, 1920, 1601, 1600, 1001, 1000, 960, 800, 800, 480, 400, 400, 2048};
    }

    public static int A00(C4I c4i, int i) {
        int i10 = 0;
        while (true) {
            int value = c4i.A04(i);
            int i11 = i10 + value;
            if (!c4i.A0H()) {
                return i11;
            }
            i10 = (i11 + 1) << i;
        }
    }

    public static int A01(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[16];
        int iPosition = byteBuffer.position();
        byteBuffer.get(bArr);
        byteBuffer.position(iPosition);
        return A04(new C4I(bArr)).A03;
    }

    public static int A02(byte[] bArr, int i) {
        if (bArr.length < 7) {
            return -1;
        }
        int headerSize = bArr[2];
        int i10 = (headerSize & KotlinVersion.MAX_COMPONENT_VALUE) << 8;
        int headerSize2 = bArr[3];
        int i11 = i10 | (headerSize2 & KotlinVersion.MAX_COMPONENT_VALUE);
        int frameSize = 2 + 2;
        if (i11 == 65535) {
            int headerSize3 = bArr[4];
            int i12 = (headerSize3 & KotlinVersion.MAX_COMPONENT_VALUE) << 16;
            int headerSize4 = bArr[5];
            int i13 = i12 | ((headerSize4 & KotlinVersion.MAX_COMPONENT_VALUE) << 8);
            int headerSize5 = bArr[6];
            i11 = i13 | (headerSize5 & KotlinVersion.MAX_COMPONENT_VALUE);
            frameSize += 3;
        }
        if (i == 44097) {
            frameSize += 2;
        }
        int i14 = i11 + frameSize;
        String[] strArr = A01;
        String str = strArr[1];
        String str2 = strArr[4];
        int iCharAt = str.charAt(27);
        int headerSize6 = str2.charAt(27);
        if (iCharAt == headerSize6) {
            throw new RuntimeException();
        }
        A01[7] = "5dLepgbvmcODZNjBgadRz1gh8sb0vEN9";
        return i14;
    }

    public static C3949or A03(C4J c4j, String str, String str2, DrmInitData drmInitData) {
        c4j.A0g(1);
        return new C2D().A0y(str).A11(A05(0, 9, 31)).A0b(2).A0m(((c4j.A0I() & 32) >> 5) == 1 ? 48000 : 44100).A0u(drmInitData).A10(str2).A14();
    }

    public static void A07(int i, C4J c4j) {
        c4j.A0d(7);
        byte[] bArrA0l = c4j.A0l();
        bArrA0l[0] = -84;
        bArrA0l[1] = 64;
        bArrA0l[2] = -1;
        bArrA0l[3] = -1;
        bArrA0l[4] = (byte) ((i >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrA0l[5] = (byte) ((i >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
        bArrA0l[6] = (byte) (i & KotlinVersion.MAX_COMPONENT_VALUE);
    }
}
