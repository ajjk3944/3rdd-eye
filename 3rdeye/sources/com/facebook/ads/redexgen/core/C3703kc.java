package com.facebook.ads.redexgen.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.google.android.gms.ads.AdRequest;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* renamed from: com.facebook.ads.redexgen.X.kc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3703kc implements GX {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final InterfaceC2558Gb A0b;
    public static final C3949or A0c;
    public static final byte[] A0d;
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

    @MetaExoPlayerCustomization("New field")
    public long A0A;
    public long A0B;
    public long A0C;
    public C4J A0D;
    public GY A0E;
    public IY A0F;
    public boolean A0G;
    public boolean A0H;
    public H1[] A0I;
    public H1[] A0J;
    public final int A0K;
    public final SparseArray<IY> A0L;
    public final C4J A0M;
    public final C4J A0N;
    public final C4J A0O;
    public final C4J A0P;
    public final C4J A0Q;
    public final C4R A0R;
    public final H1 A0S;
    public final HO A0T;
    public final C2620Im A0U;
    public final ArrayDeque<C3710kj> A0V;
    public final ArrayDeque<IX> A0W;
    public final List<C3949or> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(IY iy, int i, int i10, C4J c4j, int i11) throws C22172i {
        int iA0C;
        int i12 = i11;
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        C2620Im c2620Im = iy.A05.A03;
        C2622Io c2622Io = iy.A09;
        IP ip = (IP) AbstractC22614a.A0f(c2622Io.A06);
        c2622Io.A0C[i] = c4j.A0L();
        c2622Io.A0E[i] = c2622Io.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = c2622Io.A0E;
            jArr[i] = jArr[i] + c4j.A0C();
        }
        boolean z10 = (iA00 & 4) != 0;
        int iA0C2 = ip.A01;
        if (z10) {
            iA0C2 = c4j.A0C();
        }
        boolean z11 = (iA00 & 256) != 0;
        boolean z12 = (iA00 & AdRequest.MAX_CONTENT_URL_LENGTH) != 0;
        boolean z13 = (iA00 & 1024) != 0;
        boolean z14 = (iA00 & 2048) != 0;
        long j4 = A0a(c2620Im) ? ((long[]) AbstractC22614a.A0f(c2620Im.A09))[0] : 0L;
        int[] iArr = c2622Io.A0B;
        long[] jArr2 = c2622Io.A0D;
        boolean[] zArr = c2622Io.A0G;
        boolean z15 = c2620Im.A03 == 2 && (i10 & 1) != 0;
        int i13 = i12 + c2622Io.A0C[i];
        long j10 = c2620Im.A06;
        long j11 = c2622Io.A05;
        while (i12 < i13) {
            if (z11) {
                iA0C = c4j.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = ip.A00;
            }
            int iA002 = A00(iA0C);
            int iA003 = A00(z12 ? c4j.A0C() : ip.A03);
            int iA0C3 = z13 ? c4j.A0C() : (i12 == 0 && z10) ? iA0C2 : ip.A01;
            jArr2[i12] = AbstractC22614a.A0U(((z14 ? c4j.A0C() : 0) + j11) - j4, 1000000L, j10);
            if (!c2622Io.A09) {
                jArr2[i12] = jArr2[i12] + iy.A05.A02;
            }
            iArr[i12] = iA003;
            zArr[i12] = ((iA0C3 >> 16) & 1) == 0 && (!z15 || i12 == 0);
            j11 += iA002;
            i12++;
        }
        c2622Io.A05 = j11;
        return i13;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C3743lT> A05(C4J c4j, long j4) throws C22172i {
        long jA0R;
        long jA0R2;
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        long jA0Q = c4j.A0Q();
        if (iA01 == 0) {
            jA0R = c4j.A0Q();
            jA0R2 = j4 + c4j.A0Q();
        } else {
            jA0R = c4j.A0R();
            jA0R2 = j4 + c4j.A0R();
        }
        long jA0U = AbstractC22614a.A0U(jA0R, 1000000L, jA0Q);
        c4j.A0g(2);
        int iA0M = c4j.A0M();
        int[] iArr = new int[iA0M];
        long[] jArr = new long[iA0M];
        long[] jArr2 = new long[iA0M];
        long[] jArr3 = new long[iA0M];
        long jA0U2 = jA0U;
        for (int i = 0; i < iA0M; i++) {
            int iA0C = c4j.A0C();
            if ((Integer.MIN_VALUE & iA0C) != 0) {
                throw C22172i.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c4j.A0Q();
            iArr[i] = Integer.MAX_VALUE & iA0C;
            jArr[i] = jA0R2;
            jArr3[i] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = AbstractC22614a.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i] = jA0U2 - jArr3[i];
            c4j.A0g(4);
            jA0R2 += iArr[i];
        }
        return Pair.create(Long.valueOf(jA0U), new C3743lT(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static IY A09(C4J c4j, SparseArray<IY> sparseArray, boolean z10) {
        c4j.A0f(8);
        int iA00 = II.A00(c4j.A0C());
        IY iyValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c4j.A0C());
        if (iyValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c4j.A0R();
            iyValueAt.A09.A04 = jA0R;
            iyValueAt.A09.A03 = jA0R;
        }
        IP ip = iyValueAt.A04;
        iyValueAt.A09.A06 = new IP((iA00 & 2) != 0 ? c4j.A0C() - 1 : ip.A02, (iA00 & 8) != 0 ? c4j.A0C() : ip.A00, (iA00 & 16) != 0 ? c4j.A0C() : ip.A03, (iA00 & 32) != 0 ? c4j.A0C() : ip.A01);
        return iyValueAt;
    }

    public static String A0A(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i, i + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 74);
            i12++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, 11, 78, 2, 11, 29, 29, 78, 26, 6, 15, 0, 78, 6, 11, 15, 10, 11, 28, 78, 2, 11, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, 11, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, 29, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, 64, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, 127, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, 127, 108, 41, 127, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 127, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C4J c4j, Uri uri) {
        String str;
        String str2;
        long jA05;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c4j.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = II.A01(c4j.A0C());
        long jA0U2 = -9223372036854775807L;
        switch (iA01) {
            case 0:
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                long jA0Q2 = c4j.A0Q();
                jA0U2 = AbstractC22614a.A0U(c4j.A0Q(), 1000000L, jA0Q2);
                jA05 = this.A0C != -9223372036854775807L ? this.A0C + jA0U2 : -9223372036854775807L;
                jA0U = AbstractC22614a.A0U(c4j.A0Q(), 1000L, jA0Q2);
                jA0Q = c4j.A0Q();
                break;
            case 1:
                long jA0Q3 = c4j.A0Q();
                jA05 = AbstractC22614a.A0U(c4j.A0R(), 1000000L, jA0Q3);
                jA0U = AbstractC22614a.A0U(c4j.A0Q(), 1000L, jA0Q3);
                jA0Q = c4j.A0Q();
                str = (String) C3M.A01(c4j.A0U());
                str2 = (String) C3M.A01(c4j.A0U());
                break;
            default:
                AnonymousClass44.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c4j.A07()];
        c4j.A0k(bArr, 0, c4j.A07());
        int i = 0;
        C4J c4j2 = new C4J(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c4j2.A07();
        H1[] h1Arr = this.A0J;
        int length = h1Arr.length;
        int i10 = 0;
        while (i10 < length) {
            H1 h12 = h1Arr[i10];
            c4j2.A0f(i);
            h12.AJu(uri);
            h12.AI7(c4j2, iA07);
            i10++;
            i = 0;
        }
        if (jA05 == -9223372036854775807L) {
            this.A0W.addLast(new IX(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new IX(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            C4R c4r = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = c4r.A05(jA05);
            } else {
                jA05 = c4r.A05(jA05);
            }
        }
        if (this.A0A != -9223372036854775807L && !MetaExoPlayerUpgradeConfig.A03(EnumC3548i2.A12)) {
            jA05 = this.A0A;
        }
        H1[] h1Arr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (H1 h13 : h1Arr2) {
            h13.AIA(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C3710kj c3710kj, SparseArray<IY> sparseArray, boolean z10, int i, byte[] bArr) throws C22172i {
        IY iyA09 = A09(((C3709ki) C3M.A01(c3710kj.A07(1952868452))).A00, sparseArray, z10);
        if (iyA09 == null) {
            return;
        }
        C2622Io c2622Io = iyA09.A09;
        long j4 = c2622Io.A05;
        boolean z11 = c2622Io.A09;
        iyA09.A08();
        iyA09.A06 = true;
        C3709ki c3709kiA07 = c3710kj.A07(1952867444);
        if (c3709kiA07 == null || (i & 2) != 0) {
            c2622Io.A05 = j4;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            c2622Io.A09 = z11;
        } else {
            c2622Io.A05 = A03(c3709kiA07.A00);
            c2622Io.A09 = true;
        }
        A0S(c3710kj, iyA09, i);
        C2620Im c2620Im = iyA09.A05.A03;
        Object objA01 = C3M.A01(c2622Io.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        C2621In c2621InA00 = c2620Im.A00(((IP) objA01).A02);
        C3709ki c3709kiA072 = c3710kj.A07(1935763834);
        if (c3709kiA072 != null) {
            A0V((C2621In) C3M.A01(c2621InA00), c3709kiA072.A00, c2622Io);
        }
        C3709ki c3709kiA073 = c3710kj.A07(1935763823);
        if (c3709kiA073 != null) {
            A0I(c3709kiA073.A00, c2622Io);
        }
        C3709ki c3709kiA074 = c3710kj.A07(1936027235);
        if (c3709kiA074 != null) {
            A0J(c3709kiA074.A00, c2622Io);
        }
        A0T(c3710kj, c2621InA00 != null ? c2621InA00.A02 : null, c2622Io);
        int size = c3710kj.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3709ki c3709ki = c3710kj.A02.get(i10);
            if (((II) c3709ki).A00 == 1970628964) {
                A0K(c3709ki.A00, c2622Io, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C3710kj c3710kj, String str, C2622Io c2622Io) throws C22172i {
        C4J c4j = null;
        C4J c4j2 = null;
        for (int i = 0; i < c3710kj.A02.size(); i++) {
            C3709ki c3709ki = c3710kj.A02.get(i);
            C4J c4j3 = c3709ki.A00;
            if (((II) c3709ki).A00 == 1935828848) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j = c4j3;
                }
            } else if (((II) c3709ki).A00 == 1936158820) {
                c4j3.A0f(12);
                if (c4j3.A0C() == 1936025959) {
                    c4j2 = c4j3;
                }
            }
        }
        if (c4j == null || c4j2 == null) {
            return;
        }
        c4j.A0f(8);
        int iA01 = II.A01(c4j.A0C());
        c4j.A0g(4);
        if (iA01 == 1) {
            c4j.A0g(4);
        }
        if (c4j.A0C() != 1) {
            throw C22172i.A00(A0A(126, 39, 73));
        }
        c4j2.A0f(8);
        int iA012 = II.A01(c4j2.A0C());
        c4j2.A0g(4);
        if (iA012 == 1) {
            if (c4j2.A0Q() == 0) {
                throw C22172i.A00(A0A(784, 55, 110));
            }
        } else if (iA012 >= 2) {
            c4j2.A0g(4);
        }
        if (c4j2.A0Q() != 1) {
            throw C22172i.A00(A0A(165, 39, 18));
        }
        c4j2.A0g(1);
        int iA0I = c4j2.A0I();
        int i10 = (iA0I & 240) >> 4;
        int i11 = iA0I & 15;
        boolean z10 = c4j2.A0I() == 1;
        if (z10) {
            int iA0I2 = c4j2.A0I();
            byte[] bArr = new byte[16];
            c4j2.A0k(bArr, 0, bArr.length);
            byte[] bArr2 = null;
            if (iA0I2 == 0) {
                int iA0I3 = c4j2.A0I();
                bArr2 = new byte[iA0I3];
                c4j2.A0k(bArr2, 0, iA0I3);
            }
            c2622Io.A08 = true;
            c2622Io.A07 = new C2621In(z10, str, iA0I2, bArr, i10, i11, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(C2621In c2621In, C4J c4j, C2622Io c2622Io) throws C22172i {
        int i = c2621In.A00;
        c4j.A0f(8);
        if ((II.A00(c4j.A0C()) & 1) == 1) {
            c4j.A0g(8);
        }
        int iA0I = c4j.A0I();
        int iA0L = c4j.A0L();
        if (iA0L > c2622Io.A00) {
            throw C22172i.A01(A0A(514, 18, 58) + iA0L + A0A(40, 38, 7) + c2622Io.A00, null);
        }
        int i10 = 0;
        if (iA0I == 0) {
            boolean[] zArr = c2622Io.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i11 = 0; i11 < iA0L; i11++) {
                int iA0I2 = c4j.A0I();
                i10 += iA0I2;
                zArr[i11] = iA0I2 > i;
            }
        } else {
            i10 = 0 + (iA0I * iA0L);
            Arrays.fill(c2622Io.A0F, 0, iA0L, iA0I > i);
        }
        Arrays.fill(c2622Io.A0F, iA0L, c2622Io.A00, false);
        if (i10 > 0) {
            c2622Io.A02(i10);
        }
    }

    static {
        A0D();
        A0b = new InterfaceC2558Gb() { // from class: com.facebook.ads.redexgen.X.kd
            @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
            public final GX[] A5F() {
                return C3703kc.A0b();
            }

            @Override // com.facebook.ads.redexgen.core.InterfaceC2558Gb
            public final /* synthetic */ GX[] A5G(Uri uri, Map map) {
                return AbstractC2557Ga.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C2D().A11(A0A(839, 18, 77)).A14();
    }

    public C3703kc() {
        this(0);
    }

    public C3703kc(int i) {
        this(i, null);
    }

    public C3703kc(int i, C4R c4r) {
        this(i, c4r, null, Collections.emptyList());
    }

    public C3703kc(int i, C4R c4r, C2620Im c2620Im, List<C3949or> list) {
        this(i, c4r, c2620Im, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C3703kc(int i, C4R c4r, C2620Im c2620Im, List<C3949or> list, H1 h12) {
        this.A0A = -9223372036854775807L;
        this.A0K = i;
        this.A0R = c4r;
        this.A0U = c2620Im;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = h12;
        this.A0T = new HO();
        this.A0M = new C4J(16);
        this.A0P = new C4J(AbstractC2573Gq.A03);
        this.A0O = new C4J(5);
        this.A0N = new C4J();
        this.A0Y = new byte[16];
        this.A0Q = new C4J(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = -9223372036854775807L;
        this.A0B = -9223372036854775807L;
        this.A0C = -9223372036854775807L;
        this.A0E = GY.A00;
        this.A0J = new H1[0];
        this.A0I = new H1[0];
    }

    public static int A00(int i) throws C22172i {
        if (i >= 0) {
            return i;
        }
        throw C22172i.A01(A0A(700, 27, 67) + i, null);
    }

    public static long A02(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        return II.A01(fullAtom) == 0 ? c4j.A0Q() : c4j.A0R();
    }

    public static long A03(C4J c4j) {
        c4j.A0f(8);
        int fullAtom = c4j.A0C();
        int version = II.A01(fullAtom);
        return version == 1 ? c4j.A0R() : c4j.A0Q();
    }

    public static Pair<Integer, IP> A04(C4J c4j) {
        c4j.A0f(12);
        int defaultSampleDescriptionIndex = c4j.A0C();
        int trackId = c4j.A0C();
        int defaultSampleFlags = c4j.A0C();
        int defaultSampleSize = c4j.A0C();
        int defaultSampleDuration = c4j.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new IP(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C3709ki> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i = 0; i < size; i++) {
            C3709ki c3709ki = list.get(i);
            int leafChildrenSize = ((II) c3709ki).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c3709ki.A00.A0l();
                UUID uuidA02 = AbstractC2613If.A02(bArrA0l);
                if (uuidA02 == null) {
                    AnonymousClass44.A07(A0A(204, 22, 75), A0A(550, 42, 28));
                } else {
                    arrayList.add(new DrmInitData.SchemeData(uuidA02, A0A(897, 9, 66), bArrA0l));
                }
            }
        }
        if (arrayList == null) {
            return null;
        }
        return new DrmInitData(arrayList);
    }

    private IP A07(SparseArray<IP> sparseArray, int i) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (IP) C3M.A01(sparseArray.get(i));
    }

    public static IY A08(SparseArray<IY> sparseArray) {
        IY iy = null;
        long j4 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i = 0; i < size; i++) {
            IY iyValueAt = sparseArray.valueAt(i);
            if (iyValueAt.A06 || iyValueAt.A01 != iyValueAt.A05.A01) {
                boolean z10 = iyValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z10 || iyValueAt.A02 != iyValueAt.A09.A01) {
                    long nextSampleOffset = iyValueAt.A05();
                    if (nextSampleOffset < j4) {
                        iy = iyValueAt;
                        j4 = nextSampleOffset;
                    }
                }
            }
        }
        return iy;
    }

    private void A0B() {
        this.A02 = 0;
        this.A00 = 0;
    }

    /* JADX WARN: Incorrect condition in loop: B:13:0x0054 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void A0C() {
        /*
            r7 = this;
            r5 = 100
            r0 = 2
            com.facebook.ads.redexgen.X.H1[] r0 = new com.facebook.ads.redexgen.core.H1[r0]
            r7.A0J = r0
            r6 = 0
            com.facebook.ads.redexgen.X.H1 r0 = r7.A0S
            if (r0 == 0) goto L15
            com.facebook.ads.redexgen.X.H1[] r2 = r7.A0J
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.H1 r0 = r7.A0S
            r2[r6] = r0
            r6 = r1
        L15:
            int r0 = r7.A0K
            r0 = r0 & 4
            if (r0 == 0) goto L2c
            com.facebook.ads.redexgen.X.H1[] r4 = r7.A0J
            int r3 = r6 + 1
            com.facebook.ads.redexgen.X.GY r2 = r7.A0E
            int r1 = r5 + 1
            r0 = 5
            com.facebook.ads.redexgen.X.H1 r0 = r2.AJh(r5, r0)
            r4[r6] = r0
            r6 = r3
            r5 = r1
        L2c:
            com.facebook.ads.redexgen.X.H1[] r0 = r7.A0J
            java.lang.Object[] r0 = com.facebook.ads.redexgen.core.AbstractC22614a.A1I(r0, r6)
            com.facebook.ads.redexgen.X.H1[] r0 = (com.facebook.ads.redexgen.core.H1[]) r0
            r7.A0J = r0
            com.facebook.ads.redexgen.X.H1[] r4 = r7.A0J
            int r3 = r4.length
            r2 = 0
        L3a:
            if (r2 >= r3) goto L46
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.or r0 = com.facebook.ads.redexgen.core.C3703kc.A0c
            r1.A6W(r0)
            int r2 = r2 + 1
            goto L3a
        L46:
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r7.A0X
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.H1[] r0 = new com.facebook.ads.redexgen.core.H1[r0]
            r7.A0I = r0
            r3 = 0
        L51:
            com.facebook.ads.redexgen.X.H1[] r0 = r7.A0I
            int r0 = r0.length
            if (r3 >= r0) goto L72
            com.facebook.ads.redexgen.X.GY r1 = r7.A0E
            int r2 = r5 + 1
            r0 = 3
            com.facebook.ads.redexgen.X.H1 r1 = r1.AJh(r5, r0)
            java.util.List<com.facebook.ads.redexgen.X.or> r0 = r7.A0X
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.or r0 = (com.facebook.ads.redexgen.core.C3949or) r0
            r1.A6W(r0)
            com.facebook.ads.redexgen.X.H1[] r0 = r7.A0I
            r0[r3] = r1
            int r3 = r3 + 1
            r5 = r2
            goto L51
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3703kc.A0C():void");
    }

    private void A0E(long j4) {
        while (!this.A0W.isEmpty()) {
            IX ixRemoveFirst = this.A0W.removeFirst();
            this.A03 -= ixRemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = ixRemoveFirst.A01;
            if (ixRemoveFirst.A02) {
                jA05 += j4;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (H1 h12 : this.A0J) {
                h12.AIA(jA05, 1, ixRemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j4) throws C22172i {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j4) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C4J c4j, int i, C2622Io c2622Io) throws C22172i {
        c4j.A0f(i + 8);
        int fullAtom = c4j.A0C();
        int flags = II.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c4j.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = c2622Io.A0F;
                int fullAtom4 = c2622Io.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = c2622Io.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(c2622Io.A0F, 0, sampleCount, z10);
                int fullAtom6 = c4j.A07();
                c2622Io.A02(fullAtom6);
                c2622Io.A04(c4j);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = c2622Io.A00;
            throw C22172i.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw C22172i.A00(A0A(458, 56, 30));
    }

    public static void A0I(C4J c4j, C2622Io c2622Io) throws C22172i {
        c4j.A0f(8);
        int flags = c4j.A0C();
        int fullAtom = II.A00(flags) & 1;
        if (fullAtom == 1) {
            c4j.A0g(8);
        }
        int iA0L = c4j.A0L();
        if (iA0L == 1) {
            int entryCount = II.A01(flags);
            c2622Io.A03 += entryCount == 0 ? c4j.A0Q() : c4j.A0R();
            return;
        }
        throw C22172i.A01(A0A(727, 29, 60) + iA0L, null);
    }

    public static void A0J(C4J c4j, C2622Io c2622Io) throws C22172i {
        A0G(c4j, 0, c2622Io);
    }

    public static void A0K(C4J c4j, C2622Io c2622Io, byte[] bArr) throws C22172i {
        c4j.A0f(8);
        c4j.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c4j, 16, c2622Io);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC3738lN interfaceC3738lN) throws IOException {
        int i = ((int) this.A07) - this.A00;
        C4J c4j = this.A0D;
        if (c4j != null) {
            interfaceC3738lN.readFully(c4j.A0l(), 8, i);
            A0U(new C3709ki(this.A01, c4j), interfaceC3738lN.A8f(), interfaceC3738lN.A9H());
        } else {
            interfaceC3738lN.AJJ(i);
        }
        A0F(interfaceC3738lN.A8f());
    }

    private void A0M(InterfaceC3738lN interfaceC3738lN) throws IOException {
        IY iyValueAt = null;
        long j4 = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            IY nextTrackBundle = this.A0L.valueAt(i);
            C2622Io c2622Io = nextTrackBundle.A09;
            if (c2622Io.A0A && c2622Io.A03 < j4) {
                j4 = c2622Io.A03;
                iyValueAt = this.A0L.valueAt(i);
            }
        }
        if (iyValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8f = (int) (j4 - interfaceC3738lN.A8f());
        if (iA8f >= 0) {
            interfaceC3738lN.AJJ(iA8f);
            iyValueAt.A09.A05(interfaceC3738lN);
            return;
        }
        throw C22172i.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C3710kj c3710kj) throws C22172i {
        if (((II) c3710kj).A00 == 1836019574) {
            A0P(c3710kj);
            return;
        }
        if (((II) c3710kj).A00 == 1836019558) {
            A0O(c3710kj);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C3710kj c3710kjPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c3710kjPeek.A08(c3710kj);
    }

    private void A0O(C3710kj c3710kj) throws C22172i {
        A0Q(c3710kj, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c3710kj.A02);
        if (drmInitDataA06 != null) {
            int i = this.A0L.size();
            for (int trackCount = 0; trackCount < i; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        long j4 = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j4 != -9223372036854775807L) {
                int size = this.A0L.size();
                for (int i10 = 0; i10 < size; i10++) {
                    IY iyValueAt = this.A0L.valueAt(i10);
                    long j10 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        iyValueAt.A0A(j10);
                    }
                }
                this.A0B = -9223372036854775807L;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C3710kj c3710kj) throws C22172i {
        C3M.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c3710kj.A02);
        C3710kj c3710kj2 = (C3710kj) C3M.A01(c3710kj.A06(1836475768));
        SparseArray<IP> sparseArray = new SparseArray<>();
        long jA02 = -9223372036854775807L;
        int size = c3710kj2.A02.size();
        for (int i = 0; i < size; i++) {
            C3709ki c3709ki = c3710kj2.A02.get(i);
            if (((II) c3709ki).A00 == 1953654136) {
                Pair<Integer, IP> pairA04 = A04(c3709ki.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (IP) pairA04.second);
            } else if (((II) c3709ki).A00 == 1835362404) {
                jA02 = A02(c3709ki.A00);
            }
        }
        List<C2623Ip> listA0O = IO.A0O(c3710kj, new C2565Gi(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC3594ip() { // from class: com.facebook.ads.redexgen.X.ke
            @Override // com.facebook.ads.redexgen.core.InterfaceC3594ip
            public final Object A43(Object obj2) {
                return this.A00.A0c((C2620Im) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i10 = 0; i10 < size2; i10++) {
                C2623Ip c2623Ip = listA0O.get(i10);
                C2620Im c2620Im = c2623Ip.A03;
                this.A0L.put(c2620Im.A00, new IY(this.A0E.AJh(i10, c2620Im.A03), c2623Ip, A07(sparseArray, c2620Im.A00)));
                this.A08 = Math.max(this.A08, c2620Im.A04);
            }
            this.A0E.A6G();
            return;
        }
        C3M.A08(this.A0L.size() == size2);
        for (int i11 = 0; i11 < size2; i11++) {
            C2623Ip c2623Ip2 = listA0O.get(i11);
            C2620Im c2620Im2 = c2623Ip2.A03;
            this.A0L.get(c2620Im2.A00).A0C(c2623Ip2, A07(sparseArray, c2620Im2.A00));
        }
    }

    public static void A0Q(C3710kj c3710kj, SparseArray<IY> sparseArray, boolean z10, int i, byte[] bArr) throws C22172i {
        int size = c3710kj.A01.size();
        for (int i10 = 0; i10 < size; i10++) {
            C3710kj child = c3710kj.A01.get(i10);
            int i11 = ((II) child).A00;
            if (i11 == 1953653094) {
                A0R(child, sparseArray, z10, i, bArr);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0S(com.facebook.ads.redexgen.core.C3710kj r8, com.facebook.ads.redexgen.core.IY r9, int r10) throws com.facebook.ads.redexgen.core.C22172i {
        /*
            r4 = 0
            r3 = 0
            java.util.List<com.facebook.ads.redexgen.X.ki> r8 = r8.A02
            int r7 = r8.size()
            r5 = 0
        L9:
            r6 = 1953658222(0x7472756e, float:7.683823E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3703kc.A0a
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3703kc.A0a
            java.lang.String r1 = "g5KWW"
            r0 = 1
            r2[r0] = r1
            if (r5 >= r7) goto L3f
            java.lang.Object r1 = r8.get(r5)
            com.facebook.ads.redexgen.X.ki r1 = (com.facebook.ads.redexgen.core.C3709ki) r1
            int r0 = r1.A00
            if (r0 != r6) goto L3c
            com.facebook.ads.redexgen.X.4J r1 = r1.A00
            r0 = 12
            r1.A0f(r0)
            int r0 = r1.A0L()
            if (r0 <= 0) goto L3c
            int r3 = r3 + r0
            int r4 = r4 + 1
        L3c:
            int r5 = r5 + 1
            goto L9
        L3f:
            r0 = 0
            r9.A02 = r0
            r9.A00 = r0
            r9.A01 = r0
            com.facebook.ads.redexgen.X.Io r0 = r9.A09
            r0.A03(r4, r3)
            r5 = 0
            r0 = 0
            r4 = 0
        L4e:
            if (r4 >= r7) goto L66
            java.lang.Object r3 = r8.get(r4)
            com.facebook.ads.redexgen.X.ki r3 = (com.facebook.ads.redexgen.core.C3709ki) r3
            int r1 = r3.A00
            if (r1 != r6) goto L63
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.4J r1 = r3.A00
            int r0 = A01(r9, r5, r10, r1, r0)
            r5 = r2
        L63:
            int r4 = r4 + 1
            goto L4e
        L66:
            return
        L67:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3703kc.A0S(com.facebook.ads.redexgen.X.kj, com.facebook.ads.redexgen.X.IY, int):void");
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C3709ki c3709ki, long j4, Uri uri) throws C22172i {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c3709ki);
            return;
        }
        if (((II) c3709ki).A00 == 1936286840) {
            Pair<Long, C3743lT> pairA05 = A05(c3709ki.A00, j4);
            Long l5 = (Long) pairA05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l5.longValue();
            this.A0E.AIN((InterfaceC2579Gw) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((II) c3709ki).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c3709ki.A00, uri);
    }

    public static boolean A0W(int i) {
        return i == 1836019574 || i == 1953653099 || i == 1835297121 || i == 1835626086 || i == 1937007212 || i == 1836019558 || i == 1953653094 || i == 1836475768 || i == 1701082227;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static boolean A0X(int r4) {
        /*
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            if (r4 == r0) goto Lba
            r0 = 1835296868(0x6d646864, float:4.418049E27)
            if (r4 == r0) goto Lba
            r0 = 1836476516(0x6d766864, float:4.7662196E27)
            if (r4 == r0) goto Lba
            r0 = 1936286840(0x73696478, float:1.8491255E31)
            if (r4 == r0) goto Lba
            r0 = 1937011556(0x73747364, float:1.9367383E31)
            if (r4 == r0) goto Lba
            r0 = 1937011827(0x73747473, float:1.9367711E31)
            if (r4 == r0) goto Lba
            r0 = 1668576371(0x63747473, float:4.5093966E21)
            if (r4 == r0) goto Lba
            r0 = 1937011555(0x73747363, float:1.9367382E31)
            if (r4 == r0) goto Lba
            r3 = 1937011578(0x7374737a, float:1.936741E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3703kc.A0a
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto Lc8
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3703kc.A0a
            java.lang.String r1 = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto Lba
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            java.lang.String[] r1 = com.facebook.ads.redexgen.core.C3703kc.A0a
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3703kc.A0a
            java.lang.String r1 = "alBOnYvVhDOHTU7zpsfhYzjhJlh1j5qj"
            r0 = 7
            r2[r0] = r1
            if (r4 == r3) goto Lba
        L60:
            r0 = 1937007471(0x7374636f, float:1.9362445E31)
            if (r4 == r0) goto Lba
            r0 = 1668232756(0x636f3634, float:4.4126776E21)
            if (r4 == r0) goto Lba
            r0 = 1937011571(0x73747373, float:1.9367401E31)
            if (r4 == r0) goto Lba
            r0 = 1952867444(0x74666474, float:7.3014264E31)
            if (r4 == r0) goto Lba
            r0 = 1952868452(0x74666864, float:7.301914E31)
            if (r4 == r0) goto Lba
            r0 = 1953196132(0x746b6864, float:7.46037E31)
            if (r4 == r0) goto Lba
            r0 = 1953654136(0x74726578, float:7.6818474E31)
            if (r4 == r0) goto Lba
            r0 = 1953658222(0x7472756e, float:7.683823E31)
            if (r4 == r0) goto Lba
            r0 = 1886614376(0x70737368, float:3.013775E29)
            if (r4 == r0) goto Lba
            r0 = 1935763834(0x7361697a, float:1.785898E31)
            if (r4 == r0) goto Lba
            r0 = 1935763823(0x7361696f, float:1.7858967E31)
            if (r4 == r0) goto Lba
            r0 = 1936027235(0x73656e63, float:1.8177412E31)
            if (r4 == r0) goto Lba
            r0 = 1970628964(0x75756964, float:3.1109627E32)
            if (r4 == r0) goto Lba
            r0 = 1935828848(0x73626770, float:1.7937577E31)
            if (r4 == r0) goto Lba
            r0 = 1936158820(0x73677064, float:1.8336489E31)
            if (r4 == r0) goto Lba
            r0 = 1701606260(0x656c7374, float:6.9788014E22)
            if (r4 == r0) goto Lba
            r0 = 1835362404(0x6d656864, float:4.4373917E27)
            if (r4 == r0) goto Lba
            r0 = 1701671783(0x656d7367, float:7.0083103E22)
            if (r4 != r0) goto Lbc
        Lba:
            r0 = 1
        Lbb:
            return r0
        Lbc:
            r0 = 0
            goto Lbb
        Lbe:
            java.lang.String[] r2 = com.facebook.ads.redexgen.core.C3703kc.A0a
            java.lang.String r1 = "AuC"
            r0 = 0
            r2[r0] = r1
            if (r4 == r3) goto Lba
            goto L60
        Lc8:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3703kc.A0X(int):boolean");
    }

    private boolean A0Y(InterfaceC3738lN interfaceC3738lN) throws IOException {
        int trackCount;
        int i;
        if (this.A00 == 0) {
            C4J c4j = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC3738lN.AGh(c4j.A0l(), 0, 8, true)) {
                    return false;
                }
                this.A00 = 8;
                this.A0M.A0f(0);
                this.A07 = this.A0M.A0Q();
                int iA0C = this.A0M.A0C();
                if (A0a[5].length() != 30) {
                    A0a[0] = "Nk2";
                    this.A01 = iA0C;
                }
            }
            throw new RuntimeException();
        }
        if (this.A07 == 1) {
            interfaceC3738lN.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8G = interfaceC3738lN.A8G();
            if (jA8G == -1 && !this.A0V.isEmpty()) {
                jA8G = this.A0V.peek().A00;
            }
            if (jA8G != -1) {
                long jA8f = jA8G - interfaceC3738lN.A8f();
                int trackCount2 = this.A00;
                this.A07 = jA8f + trackCount2;
            }
        }
        if (this.A07 >= this.A00) {
            long jA8f2 = interfaceC3738lN.A8f() - this.A00;
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AIN(new C3733lI(this.A08, jA8f2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<IY> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i = 0;
                }
                while (i < trackCount) {
                    C2622Io c2622Io = this.A0L.valueAt(i).A09;
                    c2622Io.A02 = jA8f2;
                    c2622Io.A03 = jA8f2;
                    c2622Io.A04 = jA8f2;
                    i++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + jA8f2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA8f3 = (interfaceC3738lN.A8f() + this.A07) - 8;
                this.A0V.push(new C3710kj(this.A01, jA8f3));
                if (this.A07 == this.A00) {
                    A0F(jA8f3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C22172i.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= 2147483647L) {
                    C4J c4j2 = new C4J((int) this.A07);
                    C4J atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c4j2.A0l(), 0, 8);
                    this.A0D = c4j2;
                    this.A02 = 1;
                } else {
                    throw C22172i.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= 2147483647L) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C22172i.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C22172i.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AJJ(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.facebook.ads.redexgen.core.C22172i.A01(A0A(423, 35, 125), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.facebook.ads.redexgen.core.InterfaceC3738lN r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.ads.redexgen.core.C3703kc.A0Z(com.facebook.ads.redexgen.X.lN):boolean");
    }

    public static boolean A0a(C2620Im c2620Im) {
        if (c2620Im.A08 == null || c2620Im.A08.length != 1 || c2620Im.A09 == null) {
            return false;
        }
        if (c2620Im.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = AbstractC22614a.A0U(c2620Im.A08[0] + c2620Im.A09[0], 1000000L, c2620Im.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= c2620Im.A04;
    }

    public static /* synthetic */ GX[] A0b() {
        return new GX[]{new C3702kb()};
    }

    public final C2620Im A0c(C2620Im c2620Im) {
        return c2620Im;
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AA4(GY gy) {
        this.A0E = gy;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new IY(gy.AJh(0, this.A0U.A03), new C2623Ip(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new IP(0, 0, 0, 0)));
            this.A0E.A6G();
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final int AGb(InterfaceC3738lN interfaceC3738lN, C2576Gt c2576Gt) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC3738lN)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0L(interfaceC3738lN);
                    break;
                case 2:
                    A0M(interfaceC3738lN);
                    break;
                default:
                    if (!A0Z(interfaceC3738lN)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AGr() {
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final void AIM(long j4, long j10) {
        int size = this.A0L.size();
        for (int i = 0; i < size; i++) {
            this.A0L.valueAt(i).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j10;
        this.A0V.clear();
        A0B();
    }

    @Override // com.facebook.ads.redexgen.core.GX
    public final boolean AJL(InterfaceC3738lN interfaceC3738lN) throws IOException {
        return AbstractC2618Ik.A01(interfaceC3738lN);
    }
}
