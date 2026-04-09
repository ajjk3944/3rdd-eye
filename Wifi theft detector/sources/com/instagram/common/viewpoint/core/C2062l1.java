package com.instagram.common.viewpoint.core;

import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.Arrays;
import javax.jmdns.impl.constants.DNSRecordClass;

/* renamed from: com.facebook.ads.redexgen.X.l1, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2062l1 implements LL {
    public static byte[] A0C;
    public static String[] A0D = {"bYPw9lwZ90LIMnDVrWR9nivpaP", "yFs6hGP2BjxCIYW4vwAvQB", "ThDP9clSa9Dn", "ZJ8KrZKjZ6YsWfu6TvhIHbPrHjBQXt73", "tonD2drFJKLGWlZx83XdaJTA2vW", "BxtbVLMcuUKNP9oDIvLT", "q4ZypHVOEkKJ", "0njOXKHdBu5kWS0YMUnz8"};
    public static final int[] A0E;
    public static final int[] A0F;
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public final int A04;
    public final int A05;
    public final C2374qI A06;
    public final C06214v A07;
    public final HA A08;
    public final InterfaceC0921Hd A09;
    public final LN A0A;
    public final byte[] A0B;

    public static String A03(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] - i12) - 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A04() {
        A0C = new byte[]{-120, 109, -76, -68, -63, -121, 109, -51, 0, -8, -19, -21, -4, -19, -20, -88, -18, -6, -23, -11, -19, -5, -88, -8, -19, -6, -88, -22, -12, -9, -21, -13, -62, -88, -7, 13, -4, 1, 7, -57, 10, -7, 15};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A06(byte[] bArr, int i10, int i11, byte[] bArr2) {
        int i12 = this.A0A.A02;
        int i13 = this.A0A.A05;
        int i14 = (i11 * 4) + (i10 * i12);
        int i15 = (i13 * 4) + i14;
        int i16 = (i12 / i13) - 4;
        int iA07 = ((bArr[i14 + 1] & 255) << 8) | (bArr[i14] & 255);
        int iMin = Math.min(bArr[i14 + 2] & 255, 88);
        int i17 = A0F[iMin];
        int i18 = ((this.A04 * i10 * i13) + i11) * 2;
        bArr2[i18] = (byte) (iA07 & 255);
        bArr2[i18 + 1] = (byte) (iA07 >> 8);
        for (int i19 = 0; i19 < i16 * 2; i19++) {
            int i20 = bArr[((i19 / 8) * i13 * 4) + i15 + ((i19 / 2) % 4)] & 255;
            int i21 = i19 % 2 == 0 ? i20 & 15 : i20 >> 4;
            int i22 = ((((i21 & 7) * 2) + 1) * i17) >> 3;
            if ((i21 & 8) != 0) {
                i22 = -i22;
            }
            iA07 = C5C.A07(iA07 + i22, -32768, DNSRecordClass.CLASS_MASK);
            i18 += i13 * 2;
            bArr2[i18] = (byte) (iA07 & 255);
            bArr2[i18 + 1] = (byte) (iA07 >> 8);
            iMin = C5C.A07(iMin + A0E[i21], 0, A0F.length - 1);
            i17 = A0F[iMin];
        }
    }

    static {
        A04();
        A0E = new int[]{-1, -1, -1, -1, 2, 4, 6, 8, -1, -1, -1, -1, 2, 4, 6, 8};
        A0F = new int[]{7, 8, 9, 10, 11, 12, 13, 14, 16, 17, 19, 21, 23, 25, 28, 31, 34, 37, 41, 45, 50, 55, 60, 66, 73, 80, 88, 97, 107, 118, 130, 143, 157, TTAdConstant.IMAGE_MODE_VERTICAL_IMG_173, 190, Sdk$SDKError.Reason.INVALID_JSON_BID_PAYLOAD_VALUE, 230, 253, 279, 307, 337, 371, TTAdConstant.DOWNLOAD_URL_CODE, 449, 494, 544, 598, 658, 724, 796, 876, 963, 1060, 1166, 1282, 1411, 1552, 1707, 1878, 2066, 2272, 2499, 2749, 3024, 3327, 3660, 4026, 4428, 4871, 5358, 5894, 6484, 7132, 7845, 8630, 9493, 10442, 11487, 12635, 13899, 15289, 16818, 18500, 20350, 22385, 24623, 27086, 29794, DNSRecordClass.CLASS_MASK};
    }

    public C2062l1(HA ha, InterfaceC0921Hd interfaceC0921Hd, LN ln) throws C3K {
        this.A08 = ha;
        this.A09 = interfaceC0921Hd;
        this.A0A = ln;
        this.A05 = Math.max(1, ln.A04 / 10);
        C06214v scratch = new C06214v(ln.A06);
        scratch.A0G();
        this.A04 = scratch.A0G();
        int i10 = ln.A05;
        int i11 = (((ln.A02 - (i10 * 4)) * 8) / (ln.A01 * i10)) + 1;
        if (this.A04 == i11) {
            int numChannels = C5C.A05(this.A05, this.A04);
            this.A0B = new byte[ln.A02 * numChannels];
            int maxBlocksToDecode = A02(this.A04, i10);
            this.A07 = new C06214v(maxBlocksToDecode * numChannels);
            int maxBlocksToDecode2 = ln.A04;
            int constantBitrate = ((maxBlocksToDecode2 * ln.A02) * 8) / this.A04;
            this.A06 = new C05652p().A11(A03(34, 9, 83)).A0a(constantBitrate).A0j(constantBitrate).A0h(A02(this.A05, i10)).A0b(ln.A05).A0m(ln.A04).A0i(2).A14();
            return;
        }
        throw C3K.A01(A03(7, 27, 67) + i11 + A03(0, 7, 8) + this.A04, null);
    }

    private int A00(int i10) {
        return i10 / (this.A0A.A05 * 2);
    }

    private int A01(int i10) {
        return A02(i10, this.A0A.A05);
    }

    public static int A02(int i10, int i11) {
        return i10 * 2 * i11;
    }

    private void A05(int i10) {
        long jA0U = this.A03 + C5C.A0U(this.A02, 1000000L, this.A0A.A04);
        int iA01 = A01(i10);
        this.A09.AIu(jA0U, 1, iA01, this.A01 - iA01, null);
        long timeUs = i10;
        this.A02 += timeUs;
        this.A01 -= iA01;
    }

    /* JADX WARN: Incorrect condition in loop: B:6:0x0008 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A07(byte[] r4, int r5, com.instagram.common.viewpoint.core.C06214v r6) {
        /*
            r3 = this;
            r2 = 0
        L1:
            if (r2 >= r5) goto L17
            r1 = 0
        L4:
            com.facebook.ads.redexgen.X.LN r0 = r3.A0A
            int r0 = r0.A05
            if (r1 >= r0) goto L14
            byte[] r0 = r6.A0l()
            r3.A06(r4, r2, r1, r0)
            int r1 = r1 + 1
            goto L4
        L14:
            int r2 = r2 + 1
            goto L1
        L17:
            int r0 = r3.A04
            int r0 = r0 * r5
            int r1 = r3.A01(r0)
            r0 = 0
            r6.A0f(r0)
            r6.A0e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2062l1.A07(byte[], int, com.facebook.ads.redexgen.X.4v):void");
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AA8(int i10, long j10) {
        this.A08.AJ7(new C2059ky(this.A0A, this.A04, i10, j10));
        this.A09.A6e(this.A06);
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final void AIk(long j10) {
        this.A00 = 0;
        this.A03 = j10;
        this.A01 = 0;
        this.A02 = 0L;
    }

    @Override // com.instagram.common.viewpoint.core.LL
    public final boolean AIt(InterfaceC2165ms interfaceC2165ms, long j10) throws IOException {
        int iA00 = this.A05 - A00(this.A01);
        int targetFramesRemaining = this.A04;
        int blocksToDecode = C5C.A05(iA00, targetFramesRemaining);
        int i10 = this.A0A.A02 * blocksToDecode;
        boolean z10 = j10 == 0;
        while (!z10) {
            int targetFramesRemaining2 = this.A00;
            if (targetFramesRemaining2 >= i10) {
                break;
            }
            int targetFramesRemaining3 = this.A00;
            int targetReadBytes = (int) Math.min(i10 - targetFramesRemaining3, j10);
            byte[] bArr = this.A0B;
            int targetFramesRemaining4 = this.A00;
            int blocksToDecode2 = interfaceC2165ms.read(bArr, targetFramesRemaining4, targetReadBytes);
            if (blocksToDecode2 == -1) {
                z10 = true;
            } else {
                int targetFramesRemaining5 = this.A00;
                this.A00 = targetFramesRemaining5 + blocksToDecode2;
            }
        }
        int targetReadBytes2 = this.A00;
        int targetFramesRemaining6 = this.A0A.A02;
        int targetReadBytes3 = targetReadBytes2 / targetFramesRemaining6;
        if (targetReadBytes3 > 0) {
            A07(this.A0B, targetReadBytes3, this.A07);
            int blocksToDecode3 = this.A00;
            int targetFramesRemaining7 = this.A0A.A02;
            this.A00 = blocksToDecode3 - (targetFramesRemaining7 * targetReadBytes3);
            int blocksToDecode4 = A0D[3].charAt(16);
            if (blocksToDecode4 != 84) {
                throw new RuntimeException();
            }
            A0D[0] = "TvVFAtGQ";
            int targetReadBytes4 = this.A07.A0A();
            this.A09.AIr(this.A07, targetReadBytes4);
            int targetFramesRemaining8 = this.A01;
            this.A01 = targetFramesRemaining8 + targetReadBytes4;
            int targetFramesRemaining9 = this.A01;
            int blocksToDecode5 = A00(targetFramesRemaining9);
            int targetFramesRemaining10 = this.A05;
            if (blocksToDecode5 >= targetFramesRemaining10) {
                int targetFramesRemaining11 = this.A05;
                A05(targetFramesRemaining11);
            }
        }
        if (z10) {
            int targetFramesRemaining12 = this.A01;
            int targetFramesRemaining13 = A00(targetFramesRemaining12);
            if (targetFramesRemaining13 > 0) {
                A05(targetFramesRemaining13);
            }
        }
        return z10;
    }
}
