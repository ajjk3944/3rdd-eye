package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.applovin.shadow.okhttp3.internal.http.StatusLine;
import com.applovin.shadow.okhttp3.internal.ws.WebSocketProtocol;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: com.facebook.ads.redexgen.X.m6, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1751m6 implements H9 {
    public static byte[] A0e;
    public static String[] A0f = {"ywSCwlzG1SMdvvW", "WbYO2rYjmhbf4R3oYDPvQZ3H98amgjSr", "Za", "aa8pMmtLKrvpWkukTfymetmlHniL9M", "752FE5aLUbaesINptKDix8v", "1m6bsNbzXuacY99BBbBsLUDHw0asFdhp", "tFAwrqTGVJ2tUOf2i", "X0elgRXJnrwhMbXNAucG6j3nQ1B9k96A"};
    public static final HD A0g;
    public static final C1996qI A0h;
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
    public C02434v A0E;
    public HA A0F;
    public J7 A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public InterfaceC0543Hd[] A0K;
    public InterfaceC0543Hd[] A0L;
    public final int A0M;
    public final DrmInitData A0N;
    public final C02434v A0O;
    public final C02434v A0P;
    public final C02434v A0Q;
    public final C02434v A0R;
    public final C02434v A0S;
    public final AnonymousClass53 A0T;
    public final InterfaceC0543Hd A0U;
    public final I0 A0V;
    public final JO A0W;
    public final ArrayDeque<C1759mE> A0X;
    public final ArrayDeque<J6> A0Y;
    public final List<C1996qI> A0Z;
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
    public static int A00(com.instagram.common.viewpoint.core.J7 r25, int r26, long r27, int r29, com.instagram.common.viewpoint.core.C02434v r30, int r31) {
        /*
            Method dump skipped, instructions count: 346
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1751m6.A00(com.facebook.ads.redexgen.X.J7, int, long, int, com.facebook.ads.redexgen.X.4v, int):int");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C1792my> A04(C02434v c02434v, long j) throws C3K {
        long jA0R;
        long jA0R2;
        c02434v.A0f(8);
        int iA01 = AbstractC0585Iu.A01(c02434v.A0C());
        c02434v.A0g(4);
        long jA0Q = c02434v.A0Q();
        if (iA01 == 0) {
            jA0R = c02434v.A0Q();
            jA0R2 = j + c02434v.A0Q();
        } else {
            jA0R = c02434v.A0R();
            jA0R2 = j + c02434v.A0R();
        }
        long jA0U = C5C.A0U(jA0R, 1000000L, jA0Q);
        c02434v.A0g(2);
        int iA0M = c02434v.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i4 = 0; i4 < iA0M; i4++) {
            int iA0C = c02434v.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw new C3K(A0B(634, 28, 93));
            }
            long jA0Q2 = c02434v.A0Q();
            iArr[i4] = Integer.MAX_VALUE & iA0C;
            jArr[i4] = jA0R2;
            jArr3[i4] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = C5C.A0U(jA0R, 1000000L, jA0Q);
            String[] strArr = A0f;
            if (strArr[3].length() == strArr[6].length()) {
                throw new RuntimeException();
            }
            A0f[7] = "mBjUzKzbBV9DJWZlH52EoviqXd7Fx3w7";
            jArr2[i4] = jA0U2 - jArr3[i4];
            c02434v.A0g(4);
            jA0R2 += iArr[i4];
        }
        return Pair.create(Long.valueOf(jA0U), new C1792my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static J7 A09(C02434v c02434v, SparseArray<J7> sparseArray, boolean z3) {
        c02434v.A0f(8);
        int iA00 = AbstractC0585Iu.A00(c02434v.A0C());
        J7 j7A08 = A08(sparseArray, c02434v.A0C(), z3);
        if (j7A08 == null) {
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c02434v.A0R();
            j7A08.A07.A04 = jA0R;
            j7A08.A07.A03 = jA0R;
        }
        J1 j12 = j7A08.A04;
        j7A08.A07.A06 = new J1((iA00 & 2) != 0 ? c02434v.A0L() - 1 : j12.A02, (iA00 & 8) != 0 ? c02434v.A0L() : j12.A00, (iA00 & 16) != 0 ? c02434v.A0L() : j12.A03, (iA00 & 32) != 0 ? c02434v.A0L() : j12.A01);
        return j7A08;
    }

    public static String A0B(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0e, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 99);
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
        A0e = new byte[]{84, 88, 95, 106, 113, 115, 62, 109, 119, 100, 123, 62, 114, 123, 109, 109, 62, 106, 118, 127, 112, 62, 118, 123, 127, 122, 123, 108, 62, 114, 123, 112, 121, 106, 118, 62, 54, 107, 112, 109, 107, 110, 110, 113, 108, 106, 123, 122, 55, 48, 99, 72, 82, 84, 95, 6, 69, 73, 83, 72, 82, 6, 79, 72, 6, 85, 68, 65, 86, 6, 7, 27, 6, 23, 6, 14, 83, 72, 85, 83, 86, 86, 73, 84, 82, 67, 66, 15, 8, 73, 98, 120, 126, 117, 44, 111, 99, 121, 98, 120, 44, 101, 98, 44, 127, 107, 124, 104, 44, 45, 49, 44, 61, 44, 36, 121, 98, 127, 121, 124, 124, 99, 126, 120, 105, 104, 37, 34, 104, 92, 79, 73, 67, 75, 64, 90, 75, 74, 99, 94, 26, 107, 86, 90, 92, 79, 77, 90, 65, 92, 57, 23, 30, 31, 2, 25, 30, 23, 80, 30, 21, 23, 17, 4, 25, 6, 21, 80, 31, 22, 22, 3, 21, 4, 80, 4, 31, 80, 3, 17, 29, 0, 28, 21, 80, 20, 17, 4, 17, 94, 116, 83, 75, 92, 81, 84, 89, 29, 115, 124, 113, 29, 81, 88, 83, 90, 73, 85, 113, 88, 92, 91, 29, 92, 73, 82, 80, 29, 89, 88, 91, 84, 83, 88, 78, 29, 88, 69, 73, 88, 83, 89, 88, 89, 29, 92, 73, 82, 80, 29, 78, 84, 71, 88, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 19, 62, 23, 19, 20, 82, 19, 6, 29, 31, 82, 5, 27, 6, 26, 82, 30, 23, 28, 21, 6, 26, 82, 76, 82, 64, 67, 70, 69, 70, 74, 65, 68, 70, 69, 82, 90, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 91, 92, 2, 43, 32, 41, 58, 38, 110, 35, 39, 61, 35, 47, 58, 45, 38, 116, 110, 82, 123, 123, 110, 120, 105, 61, 105, 114, 61, 120, 115, 126, 111, 100, 109, 105, 116, 114, 115, 61, 121, 124, 105, 124, 61, 106, 124, 110, 61, 115, 120, 122, 124, 105, 116, 107, 120, 51, 123, 82, 82, 71, 81, 64, 20, 64, 91, 20, 81, 90, 80, 20, 91, 82, 20, 89, 80, 85, 64, 20, 67, 85, 71, 20, 90, 81, 83, 85, 64, 93, 66, 81, 26, 61, 4, 23, 0, 0, 27, 22, 27, 28, 21, 82, 38, 0, 19, 17, 25, 55, 28, 17, 0, 11, 2, 6, 27, 29, 28, 48, 29, 10, 82, 2, 19, 0, 19, 31, 23, 6, 23, 0, 1, 82, 27, 1, 82, 7, 28, 1, 7, 2, 2, 29, 0, 6, 23, 22, 92, 84, 108, 110, 119, 119, 98, 99, 39, 119, 116, 116, 111, 39, 102, 115, 104, 106, 39, 47, 97, 102, 110, 107, 98, 99, 39, 115, 104, 39, 98, 127, 115, 117, 102, 100, 115, 39, 114, 114, 110, 99, 46, 60, 4, 6, 31, 31, 6, 1, 8, 79, 14, 27, 0, 2, 79, 24, 6, 27, 7, 79, 3, 10, 1, 8, 27, 7, 79, 81, 79, 93, 94, 91, 88, 91, 87, 92, 89, 91, 88, 79, 71, 26, 1, 28, 26, 31, 31, 0, 29, 27, 10, 11, 70, 65, 79, 119, 117, 108, 108, 117, 114, 123, 60, 105, 114, 111, 105, 108, 108, 115, 110, 104, 121, 120, 60, 121, 113, 111, 123, 60, 106, 121, 110, 111, 117, 115, 114, 38, 60, 57, 2, 9, 20, 28, 9, 15, 24, 9, 8, 76, 1, 3, 3, 26, 76, 14, 3, 20, 66, 71, 124, 119, 106, 98, 119, 113, 102, 119, 118, 50, 97, 115, 123, 125, 50, 119, 124, 102, 96, 107, 50, 113, 125, 103, 124, 102, 40, 50, 107, 80, 86, 95, 80, 90, 82, 91, 90, 30, 87, 80, 90, 87, 76, 91, 93, 74, 30, 76, 91, 88, 91, 76, 91, 80, 93, 91, 107, 92, 79, 84, 92, 95, 81, 88, 29, 81, 88, 83, 90, 73, 85, 29, 89, 88, 78, 94, 79, 84, 77, 73, 84, 82, 83, 29, 84, 83, 29, 78, 90, 77, 89, 29, 91, 82, 72, 83, 89, 29, 21, 72, 83, 78, 72, 77, 77, 82, 79, 73, 88, 89, 20, 83, 66, 66, 94, 91, 81, 83, 70, 91, 93, 92, 29, 74, 31, 87, 95, 65, 85, 66, 83, 83, 79, 74, 64, 66, 87, 74, 76, 77, 12, 91, 14, 78, 83, 23, 14, 85, 87, 87, 70, 89, 84, 85, 95, 31, 88, 85, 70, 83, 40, 55, 58, 59, 49, 113, 51, 46, 106};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    private void A0I(C02434v c02434v, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0L == null || this.A0L.length == 0) {
            return;
        }
        c02434v.A0f(8);
        int iA01 = AbstractC0585Iu.A01(c02434v.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) AbstractC02203y.A01(c02434v.A0U());
                str2 = (String) AbstractC02203y.A01(c02434v.A0U());
                if (A0f[2].length() != 2) {
                    throw new RuntimeException();
                }
                A0f[0] = "4yWaL9iFGGaDiXT";
                long jA0Q2 = c02434v.A0Q();
                jA0U2 = C5C.A0U(c02434v.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = C5C.A0U(c02434v.A0Q(), 1000L, jA0Q2);
                jA0Q = c02434v.A0Q();
                break;
            case 1:
                long jA0Q3 = c02434v.A0Q();
                jA05 = C5C.A0U(c02434v.A0R(), 1000000L, jA0Q3);
                jA0U = C5C.A0U(c02434v.A0Q(), 1000L, jA0Q3);
                jA0Q = c02434v.A0Q();
                str = (String) AbstractC02203y.A01(c02434v.A0U());
                str2 = (String) AbstractC02203y.A01(c02434v.A0U());
                break;
            default:
                AbstractC02284g.A07(A0B(128, 22, 77), A0B(550, 35, 127) + iA01);
                return;
        }
        byte[] bArr = new byte[c02434v.A07()];
        c02434v.A0k(bArr, 0, c02434v.A07());
        int i4 = 0;
        C02434v c02434v2 = new C02434v(this.A0V.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c02434v2.A07();
        InterfaceC0543Hd[] interfaceC0543HdArr = this.A0L;
        int length = interfaceC0543HdArr.length;
        int i10 = 0;
        while (i10 < length) {
            InterfaceC0543Hd interfaceC0543Hd = interfaceC0543HdArr[i10];
            c02434v2.A0f(i4);
            interfaceC0543Hd.AKf(uri);
            interfaceC0543Hd.AIr(c02434v2, iA07);
            i10++;
            i4 = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0Y.addLast(new J6(jA0U2, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0T != null) {
            jA05 = this.A0T.A05(jA05);
        }
        if (this.A0b && this.A0A != -9223372036854775807L) {
            jA05 = this.A0A;
        }
        for (InterfaceC0543Hd interfaceC0543Hd2 : this.A0L) {
            interfaceC0543Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0J(C02434v c02434v, C02434v c02434v2, String str, JQ jq) throws C3K {
        c02434v.A0f(8);
        int iA0C = c02434v.A0C();
        if (c02434v.A0C() != 1936025959) {
            return;
        }
        int iA01 = AbstractC0585Iu.A01(iA0C);
        if (A0f[2].length() != 2) {
            throw new RuntimeException();
        }
        A0f[0] = "QrVDtjxvyixdHPq";
        if (iA01 == 1) {
            c02434v.A0g(4);
        }
        if (c02434v.A0C() != 1) {
            throw new C3K(A0B(50, 39, 69));
        }
        c02434v2.A0f(8);
        int iA0C2 = c02434v2.A0C();
        if (c02434v2.A0C() != 1936025959) {
            return;
        }
        int iA012 = AbstractC0585Iu.A01(iA0C2);
        if (iA012 == 1) {
            if (c02434v2.A0Q() == 0) {
                throw new C3K(A0B(662, 55, 94));
            }
        } else if (iA012 >= 2) {
            c02434v2.A0g(4);
        }
        if (c02434v2.A0Q() != 1) {
            throw new C3K(A0B(89, 39, FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION));
        }
        c02434v2.A0g(1);
        int iA0I = c02434v2.A0I();
        int i4 = (iA0I & 240) >> 4;
        int i10 = iA0I & 15;
        boolean z3 = c02434v2.A0I() == 1;
        if (z3) {
            int iA0I2 = c02434v2.A0I();
            byte[] bArr = new byte[16];
            c02434v2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c02434v2.A0I();
                bArr2 = new byte[iA0I3];
                c02434v2.A0k(bArr2, 0, iA0I3);
            }
            jq.A08 = true;
            jq.A07 = new JP(z3, str, iA0I2, bArr, i4, i10, bArr2);
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
    private void A0R(com.instagram.common.viewpoint.core.C1759mE r17) throws com.instagram.common.viewpoint.core.C3K {
        /*
            Method dump skipped, instructions count: 392
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1751m6.A0R(com.facebook.ads.redexgen.X.mE):void");
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
    public static void A0T(com.instagram.common.viewpoint.core.C1759mE r9, android.util.SparseArray<com.instagram.common.viewpoint.core.J7> r10, int r11, byte[] r12, boolean r13) throws com.instagram.common.viewpoint.core.C3K {
        /*
            Method dump skipped, instructions count: 267
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1751m6.A0T(com.facebook.ads.redexgen.X.mE, android.util.SparseArray, int, byte[], boolean):void");
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0W(JP jp, C02434v c02434v, JQ jq) throws C3K {
        int i4 = jp.A00;
        c02434v.A0f(8);
        if ((AbstractC0585Iu.A00(c02434v.A0C()) & 1) == 1) {
            c02434v.A0g(8);
        }
        int iA0I = c02434v.A0I();
        int iA0L = c02434v.A0L();
        if (iA0L != jq.A00) {
            throw new C3K(A0B(StatusLine.HTTP_PERM_REDIRECT, 17, 45) + iA0L + A0B(0, 2, 27) + jq.A00);
        }
        int i10 = 0;
        if (iA0I == 0) {
            boolean[] zArr = jq.A0F;
            for (int i11 = 0; i11 < iA0L; i11++) {
                int iA0I2 = c02434v.A0I();
                i10 += iA0I2;
                zArr[i11] = iA0I2 > i4;
            }
        } else {
            i10 = 0 + (iA0I * iA0L);
            Arrays.fill(jq.A0F, 0, iA0L, iA0I > i4);
        }
        jq.A02(i10);
    }

    static {
        A0E();
        A0g = new HD() { // from class: com.facebook.ads.redexgen.X.mA
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C1751m6.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0i = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0h = new C01872p().A11(A0B(717, 18, 81)).A14();
    }

    public C1751m6() {
        this(0);
    }

    public C1751m6(int i4) {
        this(i4, null);
    }

    public C1751m6(int i4, AnonymousClass53 anonymousClass53) {
        this(i4, anonymousClass53, null, null);
    }

    public C1751m6(int i4, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData) {
        this(i4, anonymousClass53, jo, drmInitData, Collections.emptyList());
    }

    public C1751m6(int i4, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData, List<C1996qI> list) {
        this(i4, anonymousClass53, jo, drmInitData, list, null, false, false, false);
    }

    public C1751m6(int i4, AnonymousClass53 anonymousClass53, JO jo, DrmInitData drmInitData, List<C1996qI> list, InterfaceC0543Hd interfaceC0543Hd, boolean z3, boolean z10, boolean z11) {
        this.A0A = -9223372036854775807L;
        this.A0M = (jo != null ? 8 : 0) | i4;
        this.A0T = anonymousClass53;
        this.A0W = jo;
        this.A0N = drmInitData;
        this.A0Z = Collections.unmodifiableList(list);
        this.A0U = interfaceC0543Hd;
        this.A0c = z3;
        this.A0b = z10;
        this.A0a = z11;
        this.A0V = new I0();
        this.A0O = new C02434v(16);
        this.A0R = new C02434v(HS.A03);
        this.A0Q = new C02434v(5);
        this.A0P = new C02434v();
        this.A0d = new byte[16];
        this.A0S = new C02434v(this.A0d);
        this.A0X = new ArrayDeque<>();
        this.A0Y = new ArrayDeque<>();
        this.A0D = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        A0C();
    }

    public static long A01(C02434v c02434v) {
        c02434v.A0f(8);
        int fullAtom = c02434v.A0C();
        return AbstractC0585Iu.A01(fullAtom) == 0 ? c02434v.A0Q() : c02434v.A0R();
    }

    public static long A02(C02434v c02434v) {
        c02434v.A0f(8);
        int fullAtom = c02434v.A0C();
        int version = AbstractC0585Iu.A01(fullAtom);
        return version == 1 ? c02434v.A0R() : c02434v.A0Q();
    }

    public static Pair<Integer, J1> A03(C02434v c02434v) {
        c02434v.A0f(12);
        int defaultSampleDescriptionIndex = c02434v.A0C();
        int trackId = c02434v.A0L();
        int defaultSampleFlags = c02434v.A0L();
        int defaultSampleSize = c02434v.A0L();
        int defaultSampleDuration = c02434v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A05(List<C1758mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i4 = 0; i4 < size; i4++) {
            C1758mD c1758mD = list.get(i4);
            int leafChildrenSize = A0f[4].length();
            if (leafChildrenSize != 23) {
                throw new RuntimeException();
            }
            A0f[0] = "gRucWkmmr3YeQcV";
            C1758mD c1758mD2 = c1758mD;
            int leafChildrenSize2 = ((AbstractC0585Iu) c1758mD2).A00;
            if (leafChildrenSize2 == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArr = c1758mD2.A00.A00;
                UUID uuidA02 = JH.A02(bArr);
                if (uuidA02 == null) {
                    AbstractC02284g.A07(A0B(128, 22, 77), A0B(455, 42, 100));
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

    private J1 A06(SparseArray<J1> sparseArray, int i4) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (J1) AbstractC02203y.A01(sparseArray.get(i4));
    }

    public static J7 A07(SparseArray<J7> sparseArray) {
        J7 j72 = null;
        long j = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i4 = 0; i4 < size; i4++) {
            J7 j7ValueAt = sparseArray.valueAt(i4);
            if (j7ValueAt.A02 != j7ValueAt.A07.A01) {
                long nextTrackRunOffset = j7ValueAt.A07.A0E[j7ValueAt.A02];
                if (nextTrackRunOffset < j) {
                    j72 = j7ValueAt;
                    j = nextTrackRunOffset;
                }
            }
        }
        return j72;
    }

    public static J7 A08(SparseArray<J7> sparseArray, int i4, boolean z3) {
        if (sparseArray.size() == 1 && !z3) {
            return sparseArray.valueAt(0);
        }
        return sparseArray.get(i4);
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
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0543Hd[r0]
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
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C1751m6.A0f
            r0 = 7
            r1 = r1[r0]
            r0 = 29
            char r1 = r1.charAt(r0)
            r0 = 48
            if (r1 == r0) goto L66
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C1751m6.A0f
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
            com.facebook.ads.redexgen.X.Hd[] r0 = (com.instagram.common.viewpoint.core.InterfaceC0543Hd[]) r0
            r6.A0L = r0
            com.facebook.ads.redexgen.X.Hd[] r4 = r6.A0L
            int r3 = r4.length
            r2 = 0
        L5a:
            if (r2 >= r3) goto L6c
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.qI r0 = com.instagram.common.viewpoint.core.C1751m6.A0h
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
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0543Hd[r0]
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
            com.facebook.ads.redexgen.X.qI r0 = (com.instagram.common.viewpoint.core.C1996qI) r0
            r1.A6e(r0)
            com.facebook.ads.redexgen.X.Hd[] r0 = r6.A0K
            r0[r3] = r1
            int r3 = r3 + 1
            goto L7b
        La2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1751m6.A0D():void");
    }

    private void A0F(long j) {
        while (!this.A0Y.isEmpty()) {
            J6 j6RemoveFirst = this.A0Y.removeFirst();
            this.A03 -= j6RemoveFirst.A00;
            long jA05 = j + j6RemoveFirst.A01;
            if (this.A0T != null) {
                jA05 = this.A0T.A05(jA05);
            }
            for (InterfaceC0543Hd interfaceC0543Hd : this.A0L) {
                interfaceC0543Hd.AIu(jA05, 1, j6RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0G(long j) throws C3K {
        while (!this.A0X.isEmpty() && this.A0X.peek().A00 == j) {
            A0P(this.A0X.pop());
        }
        A0C();
    }

    public static void A0H(C02434v c02434v, int i4, JQ jq) throws C3K {
        c02434v.A0f(i4 + 8);
        int fullAtom = c02434v.A0C();
        int flags = AbstractC0585Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z3 = fullAtom3 != 0;
            int sampleCount = c02434v.A0L();
            int fullAtom4 = jq.A00;
            if (sampleCount == fullAtom4) {
                Arrays.fill(jq.A0F, 0, sampleCount, z3);
                int fullAtom5 = c02434v.A07();
                jq.A02(fullAtom5);
                jq.A04(c02434v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0B(StatusLine.HTTP_PERM_REDIRECT, 17, 45)).append(sampleCount).append(A0B(0, 2, 27));
            int fullAtom6 = jq.A00;
            throw new C3K(sbAppend.append(fullAtom6).toString());
        }
        throw new C3K(A0B(399, 56, 17));
    }

    public static void A0K(C02434v c02434v, JQ jq) throws C3K {
        c02434v.A0f(8);
        int flags = c02434v.A0C();
        int fullAtom = AbstractC0585Iu.A00(flags) & 1;
        if (fullAtom == 1) {
            c02434v.A0g(8);
        }
        int iA0L = c02434v.A0L();
        if (iA0L == 1) {
            int entryCount = AbstractC0585Iu.A01(flags);
            jq.A03 += entryCount == 0 ? c02434v.A0Q() : c02434v.A0R();
            return;
        }
        throw new C3K(A0B(605, 29, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID) + iA0L);
    }

    public static void A0L(C02434v c02434v, JQ jq) throws C3K {
        A0H(c02434v, 0, jq);
    }

    public static void A0M(C02434v c02434v, JQ jq, byte[] bArr) throws C3K {
        c02434v.A0f(8);
        c02434v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0i)) {
            return;
        }
        A0H(c02434v, 16, jq);
    }

    private void A0N(InterfaceC1787ms interfaceC1787ms) throws IOException {
        int i4 = ((int) this.A07) - this.A00;
        if (this.A0E != null) {
            interfaceC1787ms.readFully(this.A0E.A00, 8, i4);
            A0V(new C1758mD(this.A01, this.A0E), interfaceC1787ms);
        } else {
            interfaceC1787ms.AK3(i4);
        }
        A0G(interfaceC1787ms.A8n());
    }

    private void A0O(InterfaceC1787ms interfaceC1787ms) throws IOException {
        J7 j7ValueAt = null;
        long j = Long.MAX_VALUE;
        int size = this.A0D.size();
        int i4 = 0;
        while (true) {
            if (i4 < size) {
                J7 nextTrackBundle = this.A0D.valueAt(i4);
                JQ jq = nextTrackBundle.A07;
                if (jq.A0A) {
                    long nextDataOffset = jq.A03;
                    String[] strArr = A0f;
                    if (strArr[3].length() == strArr[6].length()) {
                        break;
                    }
                    A0f[4] = "mIjUpcDFQdM2YkTgY6cnbvy";
                    if (nextDataOffset < j) {
                        j = jq.A03;
                        j7ValueAt = this.A0D.valueAt(i4);
                    }
                }
                i4++;
            } else {
                if (j7ValueAt != null) {
                    int iA8n = (int) (j - interfaceC1787ms.A8n());
                    if (iA8n >= 0) {
                        interfaceC1787ms.AK3(iA8n);
                        j7ValueAt.A07.A05(interfaceC1787ms);
                        return;
                    }
                    throw new C3K(A0B(325, 39, WebSocketProtocol.PAYLOAD_SHORT));
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

    private void A0P(C1759mE c1759mE) throws C3K {
        if (((AbstractC0585Iu) c1759mE).A00 == 1836019574) {
            A0R(c1759mE);
        } else if (((AbstractC0585Iu) c1759mE).A00 == 1836019558) {
            A0Q(c1759mE);
        } else {
            if (this.A0X.isEmpty()) {
                return;
            }
            this.A0X.peek().A08(c1759mE);
        }
    }

    private void A0Q(C1759mE c1759mE) throws C3K {
        A0S(c1759mE, this.A0D, this.A0M, this.A0d, this.A0c);
        DrmInitData drmInitDataA05 = this.A0N != null ? null : A05(c1759mE.A02);
        if (drmInitDataA05 != null) {
            int i4 = this.A0D.size();
            for (int trackCount = 0; trackCount < i4; trackCount++) {
                this.A0D.valueAt(trackCount).A07(drmInitDataA05);
            }
        }
        if (this.A0B != -9223372036854775807L) {
            int size = this.A0D.size();
            for (int i10 = 0; i10 < size; i10++) {
                this.A0D.valueAt(i10).A06(this.A0B);
            }
            this.A0B = -9223372036854775807L;
        }
    }

    public static void A0S(C1759mE c1759mE, SparseArray<J7> sparseArray, int i4, byte[] bArr, boolean z3) throws C3K {
        int size = c1759mE.A01.size();
        for (int i10 = 0; i10 < size; i10++) {
            C1759mE child = c1759mE.A01.get(i10);
            int i11 = ((AbstractC0585Iu) child).A00;
            if (i11 == 1953653094) {
                boolean z10 = true;
                if (size <= 1 || !z3) {
                    z10 = false;
                }
                A0T(child, sparseArray, i4, bArr, z10);
            }
        }
    }

    public static void A0U(C1759mE c1759mE, J7 j72, long j, int i4) {
        int i10 = 0;
        int i11 = 0;
        List<C1758mD> list = c1759mE.A02;
        int size = list.size();
        int i12 = 0;
        while (true) {
            String[] strArr = A0f;
            if (strArr[1].charAt(23) != strArr[5].charAt(23)) {
                throw new RuntimeException();
            }
            A0f[0] = "3b9EJYgpciD07do";
            if (i12 < size) {
                C1758mD c1758mD = list.get(i12);
                if (((AbstractC0585Iu) c1758mD).A00 == 1953658222) {
                    C02434v trunData = c1758mD.A00;
                    trunData.A0f(12);
                    int iA0L = trunData.A0L();
                    if (iA0L > 0) {
                        i11 += iA0L;
                        i10++;
                    }
                }
                i12++;
            } else {
                j72.A02 = 0;
                j72.A00 = 0;
                j72.A01 = 0;
                j72.A07.A03(i10, i11);
                int i13 = 0;
                int trunStartPosition = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    C1758mD c1758mD2 = list.get(i14);
                    if (((AbstractC0585Iu) c1758mD2).A00 == 1953658222) {
                        trunStartPosition = A00(j72, i13, j, i4, c1758mD2.A00, trunStartPosition);
                        i13++;
                    }
                }
                return;
            }
        }
    }

    private void A0V(C1758mD c1758mD, InterfaceC1787ms interfaceC1787ms) throws C3K {
        Uri uriA9P;
        if (!this.A0X.isEmpty()) {
            this.A0X.peek().A09(c1758mD);
            return;
        }
        if (((AbstractC0585Iu) c1758mD).A00 == 1936286840) {
            Pair<Long, C1792my> pairA04 = A04(c1758mD.A00, interfaceC1787ms.A8n());
            this.A0C = ((Long) pairA04.first).longValue();
            this.A0F.AJ7((HY) pairA04.second);
            if (A0f[2].length() != 2) {
                throw new RuntimeException();
            }
            A0f[2] = "jw";
            this.A0H = true;
            return;
        }
        if (((AbstractC0585Iu) c1758mD).A00 != 1701671783 || (uriA9P = interfaceC1787ms.A9P()) == null) {
            return;
        }
        A0I(c1758mD.A00, uriA9P);
    }

    public static boolean A0X(int i4) {
        return i4 == 1836019574 || i4 == 1953653099 || i4 == 1835297121 || i4 == 1835626086 || i4 == 1937007212 || i4 == 1836019558 || i4 == 1953653094 || i4 == 1836475768 || i4 == 1701082227;
    }

    public static boolean A0Y(int i4) {
        if (i4 != 1751411826 && i4 != 1835296868 && i4 != 1836476516 && i4 != 1936286840 && i4 != 1937011556 && i4 != 1952867444 && i4 != 1952868452 && i4 != 1953196132 && i4 != 1953654136 && i4 != 1953658222 && i4 != 1886614376) {
            if (A0f[0].length() != 15) {
                throw new RuntimeException();
            }
            String[] strArr = A0f;
            strArr[1] = "pufslWDHGkolcxIdleA53YlHTmcCni23";
            strArr[5] = "pxTVwd0BvZHkKJbeu8mcyfUHnPvesqsQ";
            if (i4 != 1935763834 && i4 != 1935763823 && i4 != 1936027235 && i4 != 1970628964 && i4 != 1935828848 && i4 != 1936158820 && i4 != 1701606260 && i4 != 1835362404 && i4 != 1701671783) {
                return false;
            }
        }
        return true;
    }

    private boolean A0Z(InterfaceC1787ms interfaceC1787ms) throws IOException {
        if (this.A00 == 0) {
            if (!interfaceC1787ms.AHR(this.A0O.A00, 0, 8, true)) {
                return false;
            }
            this.A00 = 8;
            this.A0O.A0f(0);
            this.A07 = this.A0O.A0Q();
            this.A01 = this.A0O.A0C();
        }
        if (this.A07 == 1) {
            interfaceC1787ms.readFully(this.A0O.A00, 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0O.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC1787ms.A8O();
            if (jA8O == -1 && !this.A0X.isEmpty()) {
                jA8O = this.A0X.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC1787ms.A8n();
                int trackCount = this.A00;
                this.A07 = jA8n + trackCount;
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC1787ms.A8n() - this.A00;
            if (this.A01 == 1836019558) {
                int size = this.A0D.size();
                for (int i4 = 0; i4 < size; i4++) {
                    JQ jq = this.A0D.valueAt(i4).A07;
                    jq.A02 = jA8n2;
                    jq.A03 = jA8n2;
                    jq.A04 = jA8n2;
                }
            }
            if (this.A01 == 1835295092) {
                this.A0G = null;
                this.A09 = this.A07 + jA8n2;
                if (!this.A0H) {
                    this.A0F.AJ7(new C1782mn(this.A08, jA8n2));
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
                long jA8n3 = (interfaceC1787ms.A8n() + this.A07) - 8;
                this.A0X.push(new C1759mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0G(jA8n3);
                } else {
                    A0C();
                }
            } else if (A0Y(this.A01)) {
                if (this.A00 != 8) {
                    throw new C3K(A0B(208, 51, 94));
                }
                if (this.A07 <= 2147483647L) {
                    this.A0E = new C02434v((int) this.A07);
                    System.arraycopy(this.A0O.A00, 0, this.A0E.A00, 0, 8);
                    this.A02 = 1;
                } else {
                    throw new C3K(A0B(259, 49, 17));
                }
            } else if (this.A07 <= 2147483647L) {
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
    private boolean A0a(com.instagram.common.viewpoint.core.InterfaceC1787ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 790
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1751m6.A0a(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static /* synthetic */ H9[] A0b() {
        return new H9[]{new C1751m6()};
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha2) {
        this.A0F = ha2;
        if (this.A0W != null) {
            J7 j72 = new J7(ha2.AKS(0, this.A0W.A03));
            j72.A08(this.A0W, new J1(0, 0, 0, 0));
            this.A0D.put(0, j72);
            A0D();
            this.A0F.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC1787ms interfaceC1787ms, HV hv) throws IOException {
        while (true) {
            int i4 = this.A02;
            if (A0f[0].length() == 15) {
                String[] strArr = A0f;
                strArr[3] = "yYIiClYY3RZS73RDJ5vLPk2bDdZFXU";
                strArr[6] = "bGm4sUzBrXbQjG5ES";
                switch (i4) {
                    case 0:
                        if (!A0Z(interfaceC1787ms)) {
                            return -1;
                        }
                        break;
                    case 1:
                        A0N(interfaceC1787ms);
                        break;
                    case 2:
                        A0O(interfaceC1787ms);
                        break;
                    default:
                        if (!A0a(interfaceC1787ms)) {
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
    public final void AJ6(long j, long j8) {
        int size = this.A0D.size();
        for (int i4 = 0; i4 < size; i4++) {
            this.A0D.valueAt(i4).A05();
        }
        this.A0Y.clear();
        this.A03 = 0;
        this.A0B = j8;
        this.A0X.clear();
        this.A0I = false;
        A0C();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC1787ms interfaceC1787ms) throws IOException {
        return JM.A01(interfaceC1787ms);
    }
}
