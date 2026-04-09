package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vungle.ads.internal.protos.Sdk$SDKError;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.xbill.DNS.Flags;
import org.xbill.DNS.TTL;

/* renamed from: com.facebook.ads.redexgen.X.m6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2129m6 implements H9 {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final HD A0g;
    public static final C2374qI A0h;
    public static final byte[] A0i;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public int A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public long A0B;
    public long A0C;
    public SparseArray<J7> A0D;
    public C06214v A0E;
    public HA A0F;
    public J7 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public InterfaceC0921Hd[] A0K;
    public InterfaceC0921Hd[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C06214v A0O;
    public final C06214v A0P;
    public final C06214v A0Q;
    public final C06214v A0R;
    public final C06214v A0S;
    public final AnonymousClass53 A0T;
    public final InterfaceC0921Hd A0U;
    public final I0 A0V;
    public final JO A0W;
    public final ArrayDeque<C2137mE> A0X;
    public final ArrayDeque<J6> A0Y;
    public final List<C2374qI> A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final byte[] A0d;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static int A00(com.instagram.common.viewpoint.core.J7 r25, int r26, long r27, int r29, com.instagram.common.viewpoint.core.C06214v r30, int r31) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2129m6.A00(com.facebook.ads.redexgen.X.J7, int, long, int, com.facebook.ads.redexgen.X.4v, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2170my> A04(C06214v c06214v, long j10) throws C3K {
        long jA0R;
        long jA0R2;
        c06214v.A0f(8);
        int iA01 = AbstractC0963Iu.A01(c06214v.A0C());
        c06214v.A0g(4);
        long jA0Q = c06214v.A0Q();
        if (iA01 == 0) {
            jA0R = c06214v.A0Q();
            jA0R2 = j10 + c06214v.A0Q();
        } else {
            jA0R = c06214v.A0R();
            jA0R2 = j10 + c06214v.A0R();
        }
        long jA0U = C5C.A0U(jA0R, 1000000L, jA0Q);
        c06214v.A0g(2);
        int iA0M = c06214v.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i10 = 0; i10 < iA0M; i10++) {
            int iA0C = c06214v.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw new C3K(A0B(634, 28, 93));
            }
            long jA0Q2 = c06214v.A0Q();
            iArr[i10] = Integer.MAX_VALUE & iA0C;
            jArr[i10] = jA0R2;
            jArr3[i10] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = C5C.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i10] = jA0U2 - jArr3[i10];
            c06214v.A0g(4);
            jA0R2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0U), new C2170my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static J7 A09(C06214v c06214v, SparseArray<J7> sparseArray, boolean z10) {
        c06214v.A0f(8);
        int iA00 = AbstractC0963Iu.A00(c06214v.A0C());
        J7 j7A08 = A08(sparseArray, c06214v.A0C(), z10);
        if (j7A08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c06214v.A0R();
            j7A08.A07.A04 = jA0R;
            j7A08.A07.A03 = jA0R;
        }
        J1 j12 = j7A08.A04;
        j7A08.A07.A06 = new J1((iA00 & 2) != 0 ? c06214v.A0L() - 1 : j12.A02, (iA00 & 8) != 0 ? c06214v.A0L() : j12.A00, (iA00 & 16) != 0 ? c06214v.A0L() : j12.A03, (iA00 & 32) != 0 ? c06214v.A0L() : j12.A01);
        return j7A08;
    }

    public static String A0B(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 99);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A0E() {
        String[] strArr = A0f;
        if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0f;
        strArr2[1] = "BGZmKOZPo9hBykc2GdFNUQpHC0I3sPv1";
        strArr2[5] = "CvUkm70dQ0grN9w1V6xWMg6HVylPciNL";
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, 127, 112, 62, 118, 123, 127, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, 27, 6, 23, 6, 14, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, 15, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, 127, 107, 124, 104, 44, 45, 49, 44, 61, 44, 36, 121, 98, 127, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, 26, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, 23, 30, 31, 2, 25, 30, 23, 80, 30, 21, 23, 17, 4, 25, 6, 21, 80, 31, 22, 22, 3, 21, 4, 80, 4, 31, 80, 3, 17, 29, 0, 28, 21, 80, 20, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, 29, 115, 124, 113, 29, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, 29, 92, 73, 82, 80, 29, 89, 88, 91, 84, 83, 88, 78, 29, 88, 69, 73, 88, 83, 89, 88, 89, 29, 92, 73, 82, 80, 29, 78, 84, 71, 88, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 19, 62, 23, 19, 20, 82, 19, 6, 29, 31, 82, 5, 27, 6, 26, 82, 30, 23, 28, 21, 6, 26, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, 61, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, 61, 105, 114, 61, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, 61, 121, 124, 105, 124, 61, 106, 124, 110, 61, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, 20, 64, 91, 20, 81, 90, 80, 20, 91, 82, 20, 89, 80, 85, 64, 20, 67, 85, 71, 20, 90, 81, 83, 85, 64, 93, 66, 81, 26, 61, 4, 23, 0, 0, 27, 22, 27, 28, 21, 82, 38, 0, 19, 17, 25, 55, 28, 17, 0, Flags.CD, 2, 6, 27, 29, 28, 48, 29, 10, 82, 2, 19, 0, 19, 31, 23, 6, 23, 0, 1, 82, 27, 1, 82, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, 127, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, 31, 31, 6, 1, 8, 79, 14, 27, 0, 2, 79, 24, 6, 27, 7, 79, 3, 10, 1, 8, 27, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, 26, 1, 28, 26, 31, 31, 0, 29, 27, 10, Flags.CD, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 1, 3, 3, 26, 76, 14, 3, 20, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, 30, 87, 80, 90, 87, 76, 91, 93, 74, 30, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, 29, 81, 88, 83, 90, 73, 85, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 29, 84, 83, 29, 78, 90, 77, 89, 29, 91, 82, 72, 83, 89, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, 29, 74, 31, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 78, 83, 23, 14, 85, 87, 87, 70, 89, 84, 85, 95, 31, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C06214v c06214v, Uri uri) {
        String str;
        String str2;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c06214v.A0f(8);
        int iA01 = AbstractC0963Iu.A01(c06214v.A0C());
        long jA0U2 = C.TIME_UNSET;
        long jA05 = C.TIME_UNSET;
        switch (iA01) {
            case 0:
                str = (String) AbstractC05983y.A01(c06214v.A0U());
                str2 = (String) AbstractC05983y.A01(c06214v.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c06214v.A0Q();
                jA0U2 = C5C.A0U(c06214v.A0Q(), 1000000L, jA0Q2);
                if (this.A0C != C.TIME_UNSET) {
                    jA05 = this.A0C + jA0U2;
                }
                jA0U = C5C.A0U(c06214v.A0Q(), 1000L, jA0Q2);
                jA0Q = c06214v.A0Q();
                break;
            case 1:
                long jA0Q3 = c06214v.A0Q();
                jA05 = C5C.A0U(c06214v.A0R(), 1000000L, jA0Q3);
                jA0U = C5C.A0U(c06214v.A0Q(), 1000L, jA0Q3);
                jA0Q = c06214v.A0Q();
                str = (String) AbstractC05983y.A01(c06214v.A0U());
                str2 = (String) AbstractC05983y.A01(c06214v.A0U());
                break;
            default:
                AbstractC06064g.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c06214v.A07()];
        c06214v.A0k(bArr, 0, c06214v.A07());
        int i10 = 0;
        C06214v c06214v2 = new C06214v(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c06214v2.A07();
        InterfaceC0921Hd[] interfaceC0921HdArr = this.A0L;
        int length = interfaceC0921HdArr.length;
        int i11 = 0;
        while (i11 < length) {
            InterfaceC0921Hd interfaceC0921Hd = interfaceC0921HdArr[i11];
            c06214v2.A0f(i10);
            interfaceC0921Hd.AKf(uri);
            interfaceC0921Hd.AIr(c06214v2, iA07);
            i11++;
            i10 = 0;
        }
        if (jA05 == C.TIME_UNSET) {
            this.A0Y.addLast(new J6(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != C.TIME_UNSET) {
            jA05 = this.A0A;
        }
        for (InterfaceC0921Hd interfaceC0921Hd2 : this.A0L) {
            interfaceC0921Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C06214v c06214v, C06214v c06214v2, String str, JQ jq) throws C3K {
        c06214v.A0f(8);
        int iA0C = c06214v.A0C();
        if (c06214v.A0C() != 1936025959) {
            return;
        }
        int iA01 = AbstractC0963Iu.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c06214v.A0g(4);
        }
        if (c06214v.A0C() != 1) {
            throw new C3K(A0B(50, 39, 69));
        }
        c06214v2.A0f(8);
        int iA0C2 = c06214v2.A0C();
        if (c06214v2.A0C() != 1936025959) {
            return;
        }
        int iA012 = AbstractC0963Iu.A01(iA0C2);
        if (iA012 == 1) {
            if (c06214v2.A0Q() == 0) {
                throw new C3K(A0B(662, 55, 94));
            }
        } else if (iA012 >= 2) {
            c06214v2.A0g(4);
        }
        if (c06214v2.A0Q() != 1) {
            throw new C3K(A0B(89, 39, 111));
        }
        c06214v2.A0g(1);
        int iA0I = c06214v2.A0I();
        int i10 = (iA0I & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i11 = iA0I & 15;
        boolean z10 = c06214v2.A0I() == 1;
        if (z10) {
            int iA0I2 = c06214v2.A0I();
            byte[] bArr = new byte[16];
            c06214v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c06214v2.A0I();
                bArr2 = new byte[iA0I3];
                c06214v2.A0k(bArr2, 0, iA0I3);
            }
            jq.A08 = true;
            jq.A07 = new JP(z10, str, iA0I2, bArr, i10, i11, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0096  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0R(com.instagram.common.viewpoint.core.C2137mE r17) throws com.instagram.common.viewpoint.core.C3K {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2129m6.A0R(com.facebook.ads.redexgen.X.mE):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006a A[PHI: r0 r3
  0x006a: PHI (r0v33 com.facebook.ads.redexgen.X.mD) = (r0v12 com.facebook.ads.redexgen.X.mD), (r0v38 com.facebook.ads.redexgen.X.mD) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]
  0x006a: PHI (r3v6 com.facebook.ads.redexgen.X.JP) = (r3v1 com.facebook.ads.redexgen.X.JP), (r3v7 com.facebook.ads.redexgen.X.JP) binds: [B:43:0x0106, B:17:0x0068] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0T(com.instagram.common.viewpoint.core.C2137mE r9, android.util.SparseArray<com.instagram.common.viewpoint.core.J7> r10, int r11, byte[] r12, boolean r13) throws com.instagram.common.viewpoint.core.C3K {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2129m6.A0T(com.facebook.ads.redexgen.X.mE, android.util.SparseArray, int, byte[], boolean):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(JP jp, C06214v c06214v, JQ jq) throws C3K {
        int i10 = jp.A00;
        c06214v.A0f(8);
        if ((AbstractC0963Iu.A00(c06214v.A0C()) & 1) == 1) {
            c06214v.A0g(8);
        }
        int iA0I = c06214v.A0I();
        int iA0L = c06214v.A0L();
        if (iA0L != jq.A00) {
            throw new C3K(A0B(308, 17, 45) + iA0L + A0B(0, 2, 27) + jq.A00);
        }
        int i11 = 0;
        if (iA0I == 0) {
            boolean[] zArr = jq.A0F;
            for (int i12 = 0; i12 < iA0L; i12++) {
                int iA0I2 = c06214v.A0I();
                i11 += iA0I2;
                zArr[i12] = iA0I2 > i10;
            }
        } else {
            i11 = 0 + (iA0I * iA0L);
            Arrays.fill(jq.A0F, 0, iA0L, iA0I > i10);
        }
        jq.A02(i11);
    }

    static {
        A0E();
        A0g = new HD() { // from class: com.facebook.ads.redexgen.X.mA
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2129m6.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C05652p().A11(A0B(717, 18, 81)).A14();
    }

    public C2129m6() {
        this(0);
    }

    public C2129m6(int i10) {
        this(i10, null);
    }

    public C2129m6(int i10, AnonymousClass53 anonymousClass53) {
        this(i10, anonymousClass53, null, null);
    }

    public C2129m6(int i10, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData) {
        this(i10, anonymousClass53, jo, drmInitData, Collections.emptyList());
    }

    public C2129m6(int i10, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData, List<C2374qI> list) {
        this(i10, anonymousClass53, jo, drmInitData, list, null, false, false, false);
    }

    public C2129m6(int i10, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData, List<C2374qI> list, InterfaceC0921Hd interfaceC0921Hd, boolean z10, boolean z11, boolean z12) {
        this.A0A = C.TIME_UNSET;
        this.A0M = (jo != null ? 8 : 0) | i10;
        this.A0T = anonymousClass53;
        this.A0W = jo;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = interfaceC0921Hd;
        this.A0c = z10;
        this.A0b = z11;
        this.A0a = z12;
        this.A0V = new I0();
        this.A0O = new C06214v(16);
        this.A0R = new C06214v(HS.A03);
        this.A0Q = new C06214v(5);
        this.A0P = new C06214v();
        this.A0d = new byte[16];
        this.A0S = new C06214v(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A0C = C.TIME_UNSET;
        A0C();
    }

    public static long A01(C06214v c06214v) {
        c06214v.A0f(8);
        int fullAtom = c06214v.A0C();
        return AbstractC0963Iu.A01(fullAtom) == 0 ? c06214v.A0Q() : c06214v.A0R();
    }

    public static long A02(C06214v c06214v) {
        c06214v.A0f(8);
        int fullAtom = c06214v.A0C();
        int version = AbstractC0963Iu.A01(fullAtom);
        return version == 1 ? c06214v.A0R() : c06214v.A0Q();
    }

    public static Pair<Integer, J1> A03(C06214v c06214v) {
        c06214v.A0f(12);
        int defaultSampleDescriptionIndex = c06214v.A0C();
        int trackId = c06214v.A0L();
        int defaultSampleFlags = c06214v.A0L();
        int defaultSampleSize = c06214v.A0L();
        int defaultSampleDuration = c06214v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C2136mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2136mD c2136mD = list.get(i10);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C2136mD c2136mD2 = c2136mD;
            int leafChildrenSize2 = ((AbstractC0963Iu) c2136mD2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c2136mD2.A00.A00;
                UUID uuidA02 = JH.A02(bArr);
                if (uuidA02 == null) {
                    AbstractC06064g.A07(A0B(128, 22, 77), A0B(455, 42, 100));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0B(766, 9, 61), bArr));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private J1 A06(SparseArray<J1> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (J1) AbstractC05983y.A01(sparseArray.get(i10));
    }

    public static J7 A07(SparseArray<J7> sparseArray) {
        J7 j72 = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            J7 j7ValueAt = sparseArray.valueAt(i10);
            if (j7ValueAt.A02 != j7ValueAt.A07.A01) {
                long nextTrackRunOffset = j7ValueAt.A07.A0E[j7ValueAt.A02];
                if (nextTrackRunOffset < j10) {
                    j72 = j7ValueAt;
                    j10 = nextTrackRunOffset;
                }
            }
        }
        return j72;
    }

    public static J7 A08(SparseArray<J7> sparseArray, int i10, boolean z10) {
        if (sparseArray.size() == 1 && !z10) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i10);
    }

    private final JO A0A(JO jo) {
        return jo;
    }

    private void A0C() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:21:0x007e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0D() {
        /*
            r6 = this;
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0L
            if (r0 != 0) goto L6c
            r0 = 2
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0921Hd[r0]
            r6.A0L = r0
            r3 = 0
            com.facebook.ads.redexgen.X.Hd r0 = r6.A0U
            if (r0 == 0) goto L17
            com.facebook.ads.redexgen.X.Hd[] r2 = r6.A0L
            int r1 = r3 + 1
            com.facebook.ads.redexgen.X.Hd r0 = r6.A0U
            r2[r3] = r0
            r3 = r1
        L17:
            int r0 = r6.A0M
            r0 = r0 & 4
            if (r0 == 0) goto L4c
            com.facebook.ads.redexgen.X.Hd[] r4 = r6.A0L
            int r5 = r3 + 1
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C2129m6.A0f
            r0 = 7
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 48
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2129m6.A0f
            java.lang.String r1 = "2Ynf6gmdLfe6xE9EEWKUzFfHKl41sL7a"
            r0 = 1
            r2[r0] = r1
            java.lang.String r1 = "AN0qqeacVBgpTr6ZS3JdezHHRUzhKU8l"
            r0 = 5
            r2[r0] = r1
            com.facebook.ads.redexgen.X.HA r2 = r6.A0F
            android.util.SparseArray<com.facebook.ads.redexgen.X.J7> r0 = r6.A0D
            int r1 = r0.size()
            r0 = 5
            com.facebook.ads.redexgen.X.Hd r0 = r2.AKS(r1, r0)
            r4[r3] = r0
            r3 = r5
        L4c:
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0L
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r0, r3)
            com.facebook.ads.redexgen.X.Hd[] r0 = (com.instagram.common.viewpoint.core.InterfaceC0921Hd[]) r0
            r6.A0L = r0
            com.facebook.ads.redexgen.X.Hd[] r4 = r6.A0L
            int r3 = r4.length
            r2 = 0
        L5a:
            if (r2 >= r3) goto L6c
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.qI r0 = com.instagram.common.viewpoint.core.C2129m6.A0h
            r1.A6e(r0)
            int r2 = r2 + 1
            goto L5a
        L66:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        L6c:
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0K
            if (r0 != 0) goto La2
            java.util.List<com.facebook.ads.redexgen.X.qI> r0 = r6.A0Z
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0921Hd[r0]
            r6.A0K = r0
            r3 = 0
        L7b:
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0K
            int r0 = r0.length
            if (r3 >= r0) goto La2
            com.facebook.ads.redexgen.X.HA r2 = r6.A0F
            android.util.SparseArray<com.facebook.ads.redexgen.X.J7> r0 = r6.A0D
            int r0 = r0.size()
            int r1 = r0 + 1
            int r1 = r1 + r3
            r0 = 3
            com.facebook.ads.redexgen.X.Hd r1 = r2.AKS(r1, r0)
            java.util.List<com.facebook.ads.redexgen.X.qI> r0 = r6.A0Z
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.qI r0 = (com.instagram.common.viewpoint.core.C2374qI) r0
            r1.A6e(r0)
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0K
            r0[r3] = r1
            int r3 = r3 + 1
            goto L7b
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2129m6.A0D():void");
    }

    private void A0F(long j10) {
        while (!this.A0Y.isEmpty()) {
            J6 j6RemoveFirst = this.A0Y.removeFirst();
            this.A03 -= j6RemoveFirst.A00;
            long jA05 = j10 + j6RemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (InterfaceC0921Hd interfaceC0921Hd : this.A0L) {
                interfaceC0921Hd.AIu(jA05, 1, j6RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j10) throws C3K {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j10) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C06214v c06214v, int i10, JQ jq) throws C3K {
        c06214v.A0f(i10 + 8);
        int fullAtom = c06214v.A0C();
        int flags = AbstractC0963Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c06214v.A0L();
            int fullAtom4 = jq.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(jq.A0F, 0, sampleCount, z10);
                int fullAtom5 = c06214v.A07();
                jq.A02(fullAtom5);
                jq.A04(c06214v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(308, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = jq.A00;
            throw new C3K(sbAppend.append(fullAtom6).toString());
        }
        throw new C3K(A0B(399, 56, 17));
    }

    public static void A0K(C06214v c06214v, JQ jq) throws C3K {
        c06214v.A0f(8);
        int flags = c06214v.A0C();
        int fullAtom = AbstractC0963Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c06214v.A0g(8);
        }
        int iA0L = c06214v.A0L();
        if (iA0L == 1) {
            int entryCount = AbstractC0963Iu.A01(flags);
            jq.A03 += entryCount == 0 ? c06214v.A0Q() : c06214v.A0R();
            return;
        }
        throw new C3K(A0B(605, 29, 113) + iA0L);
    }

    public static void A0L(C06214v c06214v, JQ jq) throws C3K {
        A0H(c06214v, 0, jq);
    }

    public static void A0M(C06214v c06214v, JQ jq, byte[] bArr) throws C3K {
        c06214v.A0f(8);
        c06214v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c06214v, 16, jq);
    }

    private void A0N(InterfaceC2165ms interfaceC2165ms) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC2165ms.readFully(this.A0E.A00, 8, i10);
            A0V(new C2136mD(this.A01, this.A0E), interfaceC2165ms);
        } else {
            interfaceC2165ms.AK3(i10);
        }
        A0G(interfaceC2165ms.A8n());
    }

    private void A0O(InterfaceC2165ms interfaceC2165ms) throws IOException {
        J7 j7ValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0D.size();
        int i10 = 0;
        while (true) {
            if (i10 < size) {
                J7 nextTrackBundle = this.A0D.valueAt(i10);
                JQ jq = nextTrackBundle.A07;
                if (jq.A0A) {
                    long nextDataOffset = jq.A03;
                    String[] strArr = A0f;
                    if (strArr[3].length() == strArr[6].length()) {
                        break;
                    }
                    A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                    if (nextDataOffset < j10) {
                        j10 = jq.A03;
                        j7ValueAt = this.A0D.valueAt(i10);
                    }
                }
                i10++;
            } else {
                if (j7ValueAt != null) {
                    int iA8n = (int) (j10 - interfaceC2165ms.A8n());
                    if (iA8n >= 0) {
                        interfaceC2165ms.AK3(iA8n);
                        j7ValueAt.A07.A05(interfaceC2165ms);
                        return;
                    }
                    throw new C3K(A0B(325, 39, 126));
                }
                if (A0f[4].length() == 23) {
                    A0f[0] = "NbtoUSPOiQE3wq0";
                    this.A02 = 3;
                    return;
                }
            }
        }
        throw new RuntimeException();
    }

    private void A0P(C2137mE c2137mE) throws C3K {
        if (((AbstractC0963Iu) c2137mE).A00 == 1836019574) {
            A0R(c2137mE);
        } else if (((AbstractC0963Iu) c2137mE).A00 == 1836019558) {
            A0Q(c2137mE);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c2137mE);
        }
    }

    private void A0Q(C2137mE c2137mE) throws C3K {
        A0S(c2137mE, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c2137mE.A02);
        if (drmInitDataA05 != null) {
            int i10 = this.A0D.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != C.TIME_UNSET) {
            int size = this.A0D.size();
            for (int i11 = 0; i11 < size; i11++) {
                this.A0D.valueAt(i11).A06(this.A0B);
            }
            this.A0B = C.TIME_UNSET;
        }
    }

    public static void A0S(C2137mE c2137mE, SparseArray<J7> sparseArray, int i10, byte[] bArr, boolean z10) throws C3K {
        int size = c2137mE.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2137mE child = c2137mE.A01.get(i11);
            int i12 = ((AbstractC0963Iu) child).A00;
            if (i12 == 1953653094) {
                boolean z11 = true;
                if (size <= 1 || !z10) {
                    z11 = false;
                }
                A0T(child, sparseArray, i10, bArr, z11);
            }
        }
    }

    public static void A0U(C2137mE c2137mE, J7 j72, long j10, int i10) {
        int i11 = 0;
        int i12 = 0;
        List<C2136mD> list = c2137mE.A02;
        int size = list.size();
        int i13 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i13 < size) {
                C2136mD c2136mD = list.get(i13);
                if (((AbstractC0963Iu) c2136mD).A00 == 1953658222) {
                    C06214v trunData = c2136mD.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i12 += iA0L;
                        i11++;
                    }
                }
                i13++;
            } else {
                j72.A02 = 0;
                j72.A00 = 0;
                j72.A01 = 0;
                j72.A07.A03(i11, i12);
                int i14 = 0;
                int trunStartPosition = 0;
                for (int i15 = 0; i15 < size; i15++) {
                    C2136mD c2136mD2 = list.get(i15);
                    if (((AbstractC0963Iu) c2136mD2).A00 == 1953658222) {
                        trunStartPosition = A00(j72, i14, j10, i10, c2136mD2.A00, trunStartPosition);
                        i14++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C2136mD c2136mD, InterfaceC2165ms interfaceC2165ms) throws C3K {
        Uri uriA9P;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c2136mD);
            return;
        }
        if (((AbstractC0963Iu) c2136mD).A00 == 1936286840) {
            Pair<Long, C2170my> pairA04 = A04(c2136mD.A00, interfaceC2165ms.A8n());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AJ7((HY) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((AbstractC0963Iu) c2136mD).A00 != 1701671783 || (uriA9P = interfaceC2165ms.A9P()) == null) {
            return;
        }
        A0I(c2136mD.A00, uriA9P);
    }

    public static boolean A0X(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
    }

    public static boolean A0Y(int i10) {
        if (i10 != 1751411826 && i10 != 1835296868 && i10 != 1836476516 && i10 != 1936286840 && i10 != 1937011556 && i10 != 1952867444 && i10 != 1952868452 && i10 != 1953196132 && i10 != 1953654136 && i10 != 1953658222 && i10 != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i10 != 1935763834 && i10 != 1935763823 && i10 != 1936027235 && i10 != 1970628964 && i10 != 1935828848 && i10 != 1936158820 && i10 != 1701606260 && i10 != 1835362404 && i10 != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC2165ms interfaceC2165ms) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC2165ms.AHR(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC2165ms.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC2165ms.A8O();
            if (jA8O == -1 && !this.A0X.isEmpty()) {
                jA8O = this.A0X.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC2165ms.A8n();
                int trackCount = this.A00;
                this.A07 = jA8n + trackCount;
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC2165ms.A8n() - this.A00;
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i10 = 0; i10 < size; i10++) {
                    JQ jq = this.A0D.valueAt(i10).A07;
                    jq.A02 = jA8n2;
                    jq.A03 = jA8n2;
                    jq.A04 = jA8n2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8n2;
                if (!this.A0H) {
                    this.A0F.AJ7(new C2160mn(this.A08, jA8n2));
                    this.A0H = true;
                }
                this.A02 = 2;
                return true;
            }
            boolean zA0X = A0X(this.A01);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "BTpsgrbOJA5y808qoKaZGmPima83kMX9";
            if (zA0X) {
                long jA8n3 = (interfaceC2165ms.A8n() + this.A07) - 8;
                this.A0X.push(new C2137mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0G(jA8n3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C3K(A0B(Sdk$SDKError.Reason.INVALID_BID_PAYLOAD_VALUE, 51, 94));
                }
                if (this.A07 <= TTL.MAX_VALUE) {
                    this.A0E = new C06214v((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C3K(A0B(259, 49, 17));
                }
            } else if (this.A07 <= TTL.MAX_VALUE) {
                this.A0E = null;
                this.A02 = 1;
            } else {
                throw new C3K(A0B(497, 53, 12));
            }
            return true;
        }
        throw new C3K(A0B(2, 48, 125));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0266  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02bb  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0a(com.instagram.common.viewpoint.core.InterfaceC2165ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2129m6.A0a(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static /* synthetic */ H9[] A0b() {
        return new H9[]{new C2129m6()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A0F = ha;
        if (this.A0W != null) {
            J7 j72 = new J7(ha.AKS(0, this.A0W.A03));
            j72.A08(this.A0W, new J1(0, 0, 0, 0));
            this.A0D.put(0, j72);
            A0D();
            this.A0F.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2165ms interfaceC2165ms, HV hv) throws IOException {
        while (true) {
            int i10 = this.A02;
            if (A0f[0].length() == 15) {
                String[] strArr = A0f;
                strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
                strArr[6] = "bGm4sUzBrXbQjG5ES";
                switch (i10) {
                    case 0:
                        if (!A0Z(interfaceC2165ms)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0N(interfaceC2165ms);
                        break;
                    case 2:
                        A0O(interfaceC2165ms);
                        break;
                    default:
                        if (!A0a(interfaceC2165ms)) {
                            break;
                        } else {
                            return 0;
                        }
                }
            } else {
                throw new RuntimeException();
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j10, long j11) {
        int size = this.A0D.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0D.valueAt(i10).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2165ms interfaceC2165ms) throws IOException {
        return JM.A01(interfaceC2165ms);
    }
}
