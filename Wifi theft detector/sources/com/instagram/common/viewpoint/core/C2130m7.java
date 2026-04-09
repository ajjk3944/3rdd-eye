package com.instagram.common.viewpoint.core;

import android.net.Uri;
import android.util.Pair;
import android.util.SparseArray;
import com.facebook.ads.androidx.media3.common.DrmInitData;
import com.facebook.ads.androidx.media3.extractor.metadata.emsg.EventMessage;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.xbill.DNS.Flags;
import org.xbill.DNS.KEYRecord;
import org.xbill.DNS.TTL;

@MetaExoPlayerCustomization("Rename the class for A/B Testing")
/* renamed from: com.facebook.ads.redexgen.X.m7, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2130m7 implements H9 {
    public static byte[] A0Z;
    public static String[] A0a = {"vtb", "vbKonC", "9ohrxt3rIVPnhyMUHrYVmyK7bOK5FZ2r", "2NigTWH0ge82u7sbUdSeL8Wtj6iQtHIS", "zZrcpvCeqeJUqHmK3YGTET67EQVL4Dlr", "FEfAuyU", "TXQt6Bb5wsq1E0rpiydPRGzBJonmO6nW", "L3NiJ083BoYvWzKRwautviQbODBNEwGW"};
    public static final HD A0b;
    public static final C2374qI A0c;
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
    public C06214v A0D;
    public HA A0E;
    public JA A0F;
    public boolean A0G;
    public boolean A0H;
    public InterfaceC0921Hd[] A0I;
    public InterfaceC0921Hd[] A0J;
    public final int A0K;
    public final SparseArray<JA> A0L;
    public final C06214v A0M;
    public final C06214v A0N;
    public final C06214v A0O;
    public final C06214v A0P;
    public final C06214v A0Q;
    public final AnonymousClass53 A0R;
    public final InterfaceC0921Hd A0S;
    public final I0 A0T;
    public final JO A0U;
    public final ArrayDeque<C2137mE> A0V;
    public final ArrayDeque<J9> A0W;
    public final List<C2374qI> A0X;
    public final byte[] A0Y;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static int A01(JA ja, int i10, int i11, C06214v c06214v, int i12) throws C3K {
        int iA0C;
        int i13 = i12;
        c06214v.A0f(8);
        int iA00 = AbstractC0963Iu.A00(c06214v.A0C());
        JO jo = ja.A05.A03;
        JQ jq = ja.A09;
        J1 j12 = (J1) C5C.A0f(jq.A06);
        jq.A0C[i10] = c06214v.A0L();
        jq.A0E[i10] = jq.A04;
        if ((iA00 & 1) != 0) {
            long[] jArr = jq.A0E;
            jArr[i10] = jArr[i10] + c06214v.A0C();
        }
        boolean z10 = (iA00 & 4) != 0;
        int iA0C2 = j12.A01;
        if (z10) {
            iA0C2 = c06214v.A0C();
        }
        boolean z11 = (iA00 & 256) != 0;
        boolean z12 = (iA00 & 512) != 0;
        boolean z13 = (iA00 & 1024) != 0;
        boolean z14 = (iA00 & KEYRecord.Flags.FLAG4) != 0;
        long j10 = A0a(jo) ? ((long[]) C5C.A0f(jo.A09))[0] : 0L;
        int[] iArr = jq.A0B;
        long[] jArr2 = jq.A0D;
        boolean[] zArr = jq.A0G;
        boolean z15 = jo.A03 == 2 && (i11 & 1) != 0;
        int i14 = i13 + jq.A0C[i10];
        long j11 = jo.A06;
        long j13 = jq.A05;
        while (i13 < i14) {
            if (z11) {
                iA0C = c06214v.A0C();
                if (A0a[5].length() == 30) {
                    throw new RuntimeException();
                }
                A0a[0] = "Vvd";
            } else {
                iA0C = j12.A00;
            }
            int iA002 = A00(iA0C);
            int iA003 = A00(z12 ? c06214v.A0C() : j12.A03);
            int iA0C3 = z13 ? c06214v.A0C() : (i13 == 0 && z10) ? iA0C2 : j12.A01;
            jArr2[i13] = C5C.A0U(((z14 ? c06214v.A0C() : 0) + j13) - j10, 1000000L, j11);
            if (!jq.A09) {
                jArr2[i13] = jArr2[i13] + ja.A05.A02;
            }
            iArr[i13] = iA003;
            zArr[i13] = ((iA0C3 >> 16) & 1) == 0 && (!z15 || i13 == 0);
            j13 += iA002;
            i13++;
        }
        jq.A05 = j13;
        return i14;
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static Pair<Long, C2170my> A05(C06214v c06214v, long j10) throws C3K {
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
                throw C3K.A01(A0A(756, 28, 79), null);
            }
            long jA0Q2 = c06214v.A0Q();
            iArr[i10] = Integer.MAX_VALUE & iA0C;
            jArr[i10] = jA0R2;
            jArr3[i10] = jA0U2;
            jA0R += jA0Q2;
            jA0U2 = C5C.A0U(jA0R, 1000000L, jA0Q);
            jArr2[i10] = jA0U2 - jArr3[i10];
            c06214v.A0g(4);
            jA0R2 += iArr[i10];
        }
        return Pair.create(Long.valueOf(jA0U), new C2170my(iArr, jArr, jArr2, jArr3));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static JA A09(C06214v c06214v, SparseArray<JA> sparseArray, boolean z10) {
        c06214v.A0f(8);
        int iA00 = AbstractC0963Iu.A00(c06214v.A0C());
        JA jaValueAt = z10 ? sparseArray.valueAt(0) : sparseArray.get(c06214v.A0C());
        if (jaValueAt == null) {
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[1] = "jDobgNhtM";
            return null;
        }
        if ((iA00 & 1) != 0) {
            long jA0R = c06214v.A0R();
            jaValueAt.A09.A04 = jA0R;
            jaValueAt.A09.A03 = jA0R;
        }
        J1 j12 = jaValueAt.A04;
        jaValueAt.A09.A06 = new J1((iA00 & 2) != 0 ? c06214v.A0C() - 1 : j12.A02, (iA00 & 8) != 0 ? c06214v.A0C() : j12.A00, (iA00 & 16) != 0 ? c06214v.A0C() : j12.A03, (iA00 & 32) != 0 ? c06214v.A0C() : j12.A01);
        return jaValueAt;
    }

    public static String A0A(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0Z, i10, i10 + i11);
        int i13 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[5] = "p0M5dFs6dnHIC4r2oiX9lIp2";
            if (i13 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 74);
            i13++;
        }
    }

    public static void A0D() {
        A0Z = new byte[]{8, 65, 91, 8, 76, 65, 78, 78, 77, 90, 77, 70, 92, 8, 78, 90, 71, 69, 8, 78, 90, 73, 79, 69, 77, 70, 92, 8, 91, 73, 69, 88, 68, 77, 8, 75, 71, 93, 70, 92, 109, 36, 62, 109, 42, 63, 40, 44, 57, 40, 63, 109, 57, 37, 44, 35, 109, 43, 63, 44, 42, 32, 40, 35, 57, 109, 62, 44, 32, 61, 33, 40, 109, 46, 34, 56, 35, 57, 47, 26, 1, 3, 78, 29, 7, 20, Flags.CD, 78, 2, Flags.CD, 29, 29, 78, 26, 6, 15, 0, 78, 6, Flags.CD, 15, 10, Flags.CD, 28, 78, 2, Flags.CD, 0, 9, 26, 6, 78, 70, 27, 0, 29, 27, 30, 30, 1, 28, 26, Flags.CD, 10, 71, 64, 70, 109, 119, 113, 122, 35, 96, 108, 118, 109, 119, 35, 106, 109, 35, 112, 97, 100, 115, 35, 34, 62, 35, 50, 35, 43, 118, 109, 112, 118, 115, 115, 108, 113, 119, 102, 103, 42, 45, 29, 54, 44, 42, 33, 120, 59, 55, 45, 54, 44, 120, 49, 54, 120, 43, 63, 40, 60, 120, 121, 101, 120, 105, 120, 112, 45, 54, 43, 45, 40, 40, 55, 42, 44, 61, 60, 113, 118, 71, 115, 96, 102, 108, 100, 111, 117, 100, 101, 76, 113, 53, 68, 121, 117, 115, 96, 98, 117, 110, 115, 14, 32, 41, 40, 53, 46, 41, 32, 103, 41, 34, 32, 38, 51, 46, 49, 34, 103, 40, 33, 33, 52, 34, 51, 103, 51, 40, 103, 52, 38, 42, 55, 43, 34, 103, 35, 38, 51, 38, 105, 118, 81, 73, 94, 83, 86, 91, 31, 113, 126, 115, 31, 83, 90, 81, 88, 75, 87, 0, 41, 45, 42, 108, 45, 56, 35, 33, 108, 40, 41, 42, 37, 34, 41, 63, 108, 41, 52, 56, 41, 34, 40, 41, 40, 108, 45, 56, 35, 33, 108, 63, 37, 54, 41, 108, 100, 57, 34, 63, 57, 60, 60, 35, 62, 56, 41, 40, 101, 98, 75, 98, 102, 97, 39, 102, 115, 104, 106, 39, 112, 110, 115, 111, 39, 107, 98, 105, 96, 115, 111, 39, 57, 39, 53, 54, 51, 48, 51, 63, 52, 49, 51, 48, 39, 47, 114, 105, 116, 114, 119, 119, 104, 117, 115, 98, 99, 46, 41, 62, 23, 23, 2, 20, 5, 81, 5, 30, 81, 20, 31, 18, 3, 8, 1, 5, 24, 30, 31, 81, 21, 16, 5, 16, 81, 6, 16, 2, 81, 31, 20, 22, 16, 5, 24, 7, 20, 95, 120, 81, 81, 68, 82, 67, 23, 67, 88, 23, 82, 89, 83, 23, 88, 81, 23, 90, 83, 86, 67, 23, 64, 86, 68, 23, 89, 82, 80, 86, 67, 94, 65, 82, 25, 27, 34, 49, 38, 38, 61, 48, 61, 58, 51, 116, 0, 38, 53, 55, 63, 17, 58, 55, 38, 45, 36, 32, 61, 59, 58, 22, 59, 44, 116, 36, 53, 38, 53, 57, 49, 32, 49, 38, 39, 116, 61, 39, 116, 33, 58, 39, 33, 36, 36, 59, 38, 32, 49, 48, 122, 35, 17, 25, 10, 80, 3, 17, 29, 0, 28, 21, 80, 19, 31, 5, 30, 4, 80, 70, 112, 123, 118, 53, 102, 116, 120, 101, 121, 112, 53, 118, 122, 96, 123, 97, 53, 5, 61, 63, 38, 38, 51, 50, 118, 38, 37, 37, 62, 118, 55, 34, 57, 59, 118, 126, 48, 55, 63, 58, 51, 50, 118, 34, 57, 118, 51, 46, 34, 36, 55, 53, 34, 118, 35, 35, 63, 50, 127, 78, 118, 116, 109, 109, 116, 115, 122, 61, 124, 105, 114, 112, 61, 106, 116, 105, 117, 61, 113, 120, 115, 122, 105, 117, 61, 35, 61, 47, 44, 41, 42, 41, 37, 46, 43, 41, 42, 61, 53, 104, 115, 110, 104, 109, 109, 114, 111, 105, 120, 121, 52, 51, 1, 57, 59, 34, 34, 59, 60, 53, 114, 39, 60, 33, 39, 34, 34, 61, 32, 38, 55, 54, 114, 55, 63, 33, 53, 114, 36, 55, 32, 33, 59, 61, 60, 104, 114, 23, 44, 39, 58, 50, 39, 33, 54, 39, 38, 98, 47, 45, 45, 52, 98, 32, 45, 58, 108, 92, 103, 108, 113, 121, 108, 106, 125, 108, 109, 41, 103, 108, 110, 104, 125, 96, 127, 108, 41, 127, 104, 101, 124, 108, 51, 41, 35, 24, 19, 14, 6, 19, 21, 2, 19, 18, 86, 5, 23, 31, 25, 86, 19, 24, 2, 4, 15, 86, 21, 25, 3, 24, 2, 76, 86, 80, 107, 109, 100, 107, 97, 105, 96, 97, 37, 108, 107, 97, 108, 119, 96, 102, 113, 37, 119, 96, 99, 96, 119, 96, 107, 102, 96, 114, 69, 86, 77, 69, 70, 72, 65, 4, 72, 65, 74, 67, 80, 76, 4, 64, 65, 87, 71, 86, 77, 84, 80, 77, 75, 74, 4, 77, 74, 4, 87, 67, 84, 64, 4, 66, 75, 81, 74, 64, 4, 12, 81, 74, 87, 81, 84, 84, 75, 86, 80, 65, 64, 13, 102, 119, 119, 107, 110, 100, 102, 115, 110, 104, 105, 40, 127, 42, 98, 106, 116, 96, 88, 73, 73, 85, 80, 90, 88, 77, 80, 86, 87, 22, 65, 20, 84, 73, 13, 20, 79, 77, 77, 52, 32, 49, 60, 58, 122, 52, 54, 97, 72, 87, 90, 91, 81, 17, 86, 91, 72, 93, 126, 97, 108, 109, 103, 39, 101, 120, 60};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0H(C06214v c06214v, Uri uri) {
        String str;
        String str2;
        long jA0U;
        long jA0Q;
        if (this.A0J.length == 0) {
            return;
        }
        c06214v.A0f(8);
        if (A0a[3].charAt(19) != 'e') {
            throw new RuntimeException();
        }
        A0a[1] = "i2btDlVidn";
        int iA01 = AbstractC0963Iu.A01(c06214v.A0C());
        long jA0U2 = C.TIME_UNSET;
        long jA05 = C.TIME_UNSET;
        switch (iA01) {
            case 0:
                str = (String) AbstractC05983y.A01(c06214v.A0U());
                str2 = (String) AbstractC05983y.A01(c06214v.A0U());
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
                AbstractC06064g.A07(A0A(204, 22, 75), A0A(645, 35, 24) + iA01);
                return;
        }
        byte[] bArr = new byte[c06214v.A07()];
        c06214v.A0k(bArr, 0, c06214v.A07());
        int i10 = 0;
        C06214v c06214v2 = new C06214v(this.A0T.A01(new EventMessage(str, str2, jA0U, jA0Q, bArr)));
        int iA07 = c06214v2.A07();
        InterfaceC0921Hd[] interfaceC0921HdArr = this.A0J;
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
            this.A0W.addLast(new J9(jA0U2, true, iA07));
            this.A03 += iA07;
            return;
        }
        if (!this.A0W.isEmpty()) {
            this.A0W.addLast(new J9(jA05, false, iA07));
            this.A03 += iA07;
            return;
        }
        if (this.A0R != null) {
            AnonymousClass53 anonymousClass53 = this.A0R;
            if (A0a[1].length() != 3) {
                String[] strArr = A0a;
                strArr[4] = "dSij3ZZr7drragDO7KaW8OWZIZwByPGb";
                strArr[6] = "O4MuDOrrUt3KGtyHElmFzP2mmpN9Ut0I";
                jA05 = anonymousClass53.A05(jA05);
            } else {
                jA05 = anonymousClass53.A05(jA05);
            }
        }
        if (this.A0A != C.TIME_UNSET && !MetaExoPlayerUpgradeConfig.A03(EnumC1974jX.A11)) {
            jA05 = this.A0A;
        }
        InterfaceC0921Hd[] interfaceC0921HdArr2 = this.A0J;
        if (A0a[0].length() != 3) {
            throw new RuntimeException();
        }
        A0a[2] = "lJ55r5gDB38Ao7rNsYIhv4IUy3LH5Ini";
        for (InterfaceC0921Hd interfaceC0921Hd2 : interfaceC0921HdArr2) {
            interfaceC0921Hd2.AIu(jA05, 1, iA07, 0, null);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0R(C2137mE c2137mE, SparseArray<JA> sparseArray, boolean z10, int i10, byte[] bArr) throws C3K {
        JA jaA09 = A09(((C2136mD) AbstractC05983y.A01(c2137mE.A07(1952868452))).A00, sparseArray, z10);
        if (jaA09 == null) {
            return;
        }
        JQ jq = jaA09.A09;
        long j10 = jq.A05;
        boolean z11 = jq.A09;
        jaA09.A08();
        jaA09.A06 = true;
        C2136mD c2136mDA07 = c2137mE.A07(1952867444);
        if (c2136mDA07 == null || (i10 & 2) != 0) {
            jq.A05 = j10;
            String[] strArr = A0a;
            if (strArr[4].charAt(20) == strArr[6].charAt(20)) {
                throw new RuntimeException();
            }
            A0a[7] = "mrSj0GzHTHwkPK2z0oCyoB4jTU17nK7M";
            jq.A09 = z11;
        } else {
            jq.A05 = A03(c2136mDA07.A00);
            jq.A09 = true;
        }
        A0S(c2137mE, jaA09, i10);
        JO jo = jaA09.A05.A03;
        Object objA01 = AbstractC05983y.A01(jq.A06);
        String[] strArr2 = A0a;
        if (strArr2[4].charAt(20) == strArr2[6].charAt(20)) {
            throw new RuntimeException();
        }
        A0a[1] = "vW8YzoDO1k8YQphW8Ysx";
        JP jpA00 = jo.A00(((J1) objA01).A02);
        C2136mD c2136mDA072 = c2137mE.A07(1935763834);
        if (c2136mDA072 != null) {
            A0V((JP) AbstractC05983y.A01(jpA00), c2136mDA072.A00, jq);
        }
        C2136mD c2136mDA073 = c2137mE.A07(1935763823);
        if (c2136mDA073 != null) {
            A0I(c2136mDA073.A00, jq);
        }
        C2136mD c2136mDA074 = c2137mE.A07(1936027235);
        if (c2136mDA074 != null) {
            A0J(c2136mDA074.A00, jq);
        }
        A0T(c2137mE, jpA00 != null ? jpA00.A02 : null, jq);
        int size = c2137mE.A02.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2136mD c2136mD = c2137mE.A02.get(i11);
            if (((AbstractC0963Iu) c2136mD).A00 == 1970628964) {
                A0K(c2136mD.A00, jq, bArr);
            }
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0T(C2137mE c2137mE, String str, JQ jq) throws C3K {
        C06214v c06214v = null;
        C06214v c06214v2 = null;
        for (int i10 = 0; i10 < c2137mE.A02.size(); i10++) {
            C2136mD c2136mD = c2137mE.A02.get(i10);
            C06214v c06214v3 = c2136mD.A00;
            if (((AbstractC0963Iu) c2136mD).A00 == 1935828848) {
                c06214v3.A0f(12);
                if (c06214v3.A0C() == 1936025959) {
                    c06214v = c06214v3;
                }
            } else if (((AbstractC0963Iu) c2136mD).A00 == 1936158820) {
                c06214v3.A0f(12);
                if (c06214v3.A0C() == 1936025959) {
                    c06214v2 = c06214v3;
                }
            }
        }
        if (c06214v == null || c06214v2 == null) {
            return;
        }
        c06214v.A0f(8);
        int iA01 = AbstractC0963Iu.A01(c06214v.A0C());
        c06214v.A0g(4);
        if (iA01 == 1) {
            c06214v.A0g(4);
        }
        if (c06214v.A0C() != 1) {
            throw C3K.A00(A0A(126, 39, 73));
        }
        c06214v2.A0f(8);
        int iA012 = AbstractC0963Iu.A01(c06214v2.A0C());
        c06214v2.A0g(4);
        if (iA012 == 1) {
            if (c06214v2.A0Q() == 0) {
                throw C3K.A00(A0A(784, 55, 110));
            }
        } else if (iA012 >= 2) {
            c06214v2.A0g(4);
        }
        if (c06214v2.A0Q() != 1) {
            throw C3K.A00(A0A(165, 39, 18));
        }
        c06214v2.A0g(1);
        int iA0I = c06214v2.A0I();
        int i11 = (iA0I & PsExtractor.VIDEO_STREAM_MASK) >> 4;
        int i12 = iA0I & 15;
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
            jq.A07 = new JP(z10, str, iA0I2, bArr, i11, i12, bArr2);
        }
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static void A0V(JP jp, C06214v c06214v, JQ jq) throws C3K {
        int i10 = jp.A00;
        c06214v.A0f(8);
        if ((AbstractC0963Iu.A00(c06214v.A0C()) & 1) == 1) {
            c06214v.A0g(8);
        }
        int iA0I = c06214v.A0I();
        int iA0L = c06214v.A0L();
        if (iA0L > jq.A00) {
            throw C3K.A01(A0A(514, 18, 58) + iA0L + A0A(40, 38, 7) + jq.A00, null);
        }
        int i11 = 0;
        if (iA0I == 0) {
            boolean[] zArr = jq.A0F;
            if (A0a[1].length() == 3) {
                throw new RuntimeException();
            }
            A0a[0] = "ACu";
            for (int i12 = 0; i12 < iA0L; i12++) {
                int iA0I2 = c06214v.A0I();
                i11 += iA0I2;
                zArr[i12] = iA0I2 > i10;
            }
        } else {
            i11 = 0 + (iA0I * iA0L);
            Arrays.fill(jq.A0F, 0, iA0L, iA0I > i10);
        }
        Arrays.fill(jq.A0F, iA0L, jq.A00, false);
        if (i11 > 0) {
            jq.A02(i11);
        }
    }

    static {
        A0D();
        A0b = new HD() { // from class: com.facebook.ads.redexgen.X.m8
            @Override // com.instagram.common.viewpoint.core.HD
            public final H9[] A5N() {
                return C2130m7.A0b();
            }

            @Override // com.instagram.common.viewpoint.core.HD
            public final /* synthetic */ H9[] A5O(Uri uri, Map map) {
                return HC.A01(this, uri, map);
            }
        };
        A0d = new byte[]{-94, 57, 79, 82, 90, -101, 79, 20, -94, 68, 108, 66, 124, 100, -115, -12};
        A0c = new C05652p().A11(A0A(839, 18, 77)).A14();
    }

    public C2130m7() {
        this(0);
    }

    public C2130m7(int i10) {
        this(i10, null);
    }

    public C2130m7(int i10, AnonymousClass53 anonymousClass53) {
        this(i10, anonymousClass53, null, Collections.emptyList());
    }

    public C2130m7(int i10, AnonymousClass53 anonymousClass53, JO jo, List<C2374qI> list) {
        this(i10, anonymousClass53, jo, list, null);
    }

    @MetaExoPlayerCustomization("Additional fields for custom behaviors")
    public C2130m7(int i10, AnonymousClass53 anonymousClass53, JO jo, List<C2374qI> list, InterfaceC0921Hd interfaceC0921Hd) {
        this.A0A = C.TIME_UNSET;
        this.A0K = i10;
        this.A0R = anonymousClass53;
        this.A0U = jo;
        this.A0X = Collections.unmodifiableList(list);
        this.A0S = interfaceC0921Hd;
        this.A0T = new I0();
        this.A0M = new C06214v(16);
        this.A0P = new C06214v(HS.A03);
        this.A0O = new C06214v(5);
        this.A0N = new C06214v();
        this.A0Y = new byte[16];
        this.A0Q = new C06214v(this.A0Y);
        this.A0V = new ArrayDeque<>();
        this.A0W = new ArrayDeque<>();
        this.A0L = new SparseArray<>();
        this.A08 = C.TIME_UNSET;
        this.A0B = C.TIME_UNSET;
        this.A0C = C.TIME_UNSET;
        this.A0E = HA.A00;
        this.A0J = new InterfaceC0921Hd[0];
        this.A0I = new InterfaceC0921Hd[0];
    }

    public static int A00(int i10) throws C3K {
        if (i10 >= 0) {
            return i10;
        }
        throw C3K.A01(A0A(700, 27, 67) + i10, null);
    }

    public static long A02(C06214v c06214v) {
        c06214v.A0f(8);
        int fullAtom = c06214v.A0C();
        return AbstractC0963Iu.A01(fullAtom) == 0 ? c06214v.A0Q() : c06214v.A0R();
    }

    public static long A03(C06214v c06214v) {
        c06214v.A0f(8);
        int fullAtom = c06214v.A0C();
        int version = AbstractC0963Iu.A01(fullAtom);
        return version == 1 ? c06214v.A0R() : c06214v.A0Q();
    }

    public static Pair<Integer, J1> A04(C06214v c06214v) {
        c06214v.A0f(12);
        int defaultSampleDescriptionIndex = c06214v.A0C();
        int trackId = c06214v.A0C();
        int defaultSampleFlags = c06214v.A0C();
        int defaultSampleSize = c06214v.A0C();
        int defaultSampleDuration = c06214v.A0C();
        return Pair.create(Integer.valueOf(defaultSampleDescriptionIndex), new J1(trackId - 1, defaultSampleFlags, defaultSampleSize, defaultSampleDuration));
    }

    public static DrmInitData A06(List<C2136mD> list) {
        ArrayList arrayList = null;
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2136mD c2136mD = list.get(i10);
            int leafChildrenSize = ((AbstractC0963Iu) c2136mD).A00;
            if (leafChildrenSize == 1886614376) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                byte[] bArrA0l = c2136mD.A00.A0l();
                UUID uuidA02 = JH.A02(bArrA0l);
                if (uuidA02 == null) {
                    AbstractC06064g.A07(A0A(204, 22, 75), A0A(550, 42, 28));
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

    private J1 A07(SparseArray<J1> sparseArray, int i10) {
        if (sparseArray.size() == 1) {
            return sparseArray.valueAt(0);
        }
        return (J1) AbstractC05983y.A01(sparseArray.get(i10));
    }

    public static JA A08(SparseArray<JA> sparseArray) {
        JA ja = null;
        long j10 = Long.MAX_VALUE;
        int size = sparseArray.size();
        for (int i10 = 0; i10 < size; i10++) {
            JA jaValueAt = sparseArray.valueAt(i10);
            if (jaValueAt.A06 || jaValueAt.A01 != jaValueAt.A05.A01) {
                boolean z10 = jaValueAt.A06;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "bWFL5LbHycaN2QeAwKakifUxbxentXmn";
                if (!z10 || jaValueAt.A02 != jaValueAt.A09.A01) {
                    long nextSampleOffset = jaValueAt.A05();
                    if (nextSampleOffset < j10) {
                        ja = jaValueAt;
                        j10 = nextSampleOffset;
                    }
                }
            }
        }
        return ja;
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
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0921Hd[r0]
            r7.A0J = r0
            r6 = 0
            com.facebook.ads.redexgen.X.Hd r0 = r7.A0S
            if (r0 == 0) goto L15
            com.facebook.ads.redexgen.X.Hd[] r2 = r7.A0J
            int r1 = r6 + 1
            com.facebook.ads.redexgen.X.Hd r0 = r7.A0S
            r2[r6] = r0
            r6 = r1
        L15:
            int r0 = r7.A0K
            r0 = r0 & 4
            if (r0 == 0) goto L2c
            com.facebook.ads.redexgen.X.Hd[] r4 = r7.A0J
            int r3 = r6 + 1
            com.facebook.ads.redexgen.X.HA r2 = r7.A0E
            int r1 = r5 + 1
            r0 = 5
            com.facebook.ads.redexgen.X.Hd r0 = r2.AKS(r5, r0)
            r4[r6] = r0
            r6 = r3
            r5 = r1
        L2c:
            com.facebook.ads.redexgen.X.Hd[] r0 = r7.A0J
            java.lang.Object[] r0 = com.instagram.common.viewpoint.core.C5C.A1I(r0, r6)
            com.facebook.ads.redexgen.X.Hd[] r0 = (com.instagram.common.viewpoint.core.InterfaceC0921Hd[]) r0
            r7.A0J = r0
            com.facebook.ads.redexgen.X.Hd[] r4 = r7.A0J
            int r3 = r4.length
            r2 = 0
        L3a:
            if (r2 >= r3) goto L46
            r1 = r4[r2]
            com.facebook.ads.redexgen.X.qI r0 = com.instagram.common.viewpoint.core.C2130m7.A0c
            r1.A6e(r0)
            int r2 = r2 + 1
            goto L3a
        L46:
            java.util.List<com.facebook.ads.redexgen.X.qI> r0 = r7.A0X
            int r0 = r0.size()
            com.facebook.ads.redexgen.X.Hd[] r0 = new com.instagram.common.viewpoint.core.InterfaceC0921Hd[r0]
            r7.A0I = r0
            r3 = 0
        L51:
            com.facebook.ads.redexgen.X.Hd[] r0 = r7.A0I
            int r0 = r0.length
            if (r3 >= r0) goto L72
            com.facebook.ads.redexgen.X.HA r1 = r7.A0E
            int r2 = r5 + 1
            r0 = 3
            com.facebook.ads.redexgen.X.Hd r1 = r1.AKS(r5, r0)
            java.util.List<com.facebook.ads.redexgen.X.qI> r0 = r7.A0X
            java.lang.Object r0 = r0.get(r3)
            com.facebook.ads.redexgen.X.qI r0 = (com.instagram.common.viewpoint.core.C2374qI) r0
            r1.A6e(r0)
            com.facebook.ads.redexgen.X.Hd[] r0 = r7.A0I
            r0[r3] = r1
            int r3 = r3 + 1
            r5 = r2
            goto L51
        L72:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2130m7.A0C():void");
    }

    private void A0E(long j10) {
        while (!this.A0W.isEmpty()) {
            J9 j9RemoveFirst = this.A0W.removeFirst();
            this.A03 -= j9RemoveFirst.A00;
            if (A0a[7].charAt(28) == 'N') {
                throw new RuntimeException();
            }
            String[] strArr = A0a;
            strArr[4] = "VR2FeNKrGWLUx6XQMfWHox9ZNtks2zuu";
            strArr[6] = "s2y9CEVkGFcMGmJDsuNOnRFQ2pMNKAx2";
            long jA05 = j9RemoveFirst.A01;
            if (j9RemoveFirst.A02) {
                jA05 += j10;
            }
            if (this.A0R != null) {
                jA05 = this.A0R.A05(jA05);
            }
            for (InterfaceC0921Hd interfaceC0921Hd : this.A0J) {
                interfaceC0921Hd.AIu(jA05, 1, j9RemoveFirst.A00, this.A03, null);
            }
        }
    }

    private void A0F(long j10) throws C3K {
        while (!this.A0V.isEmpty() && this.A0V.peek().A00 == j10) {
            A0N(this.A0V.pop());
        }
        A0B();
    }

    public static void A0G(C06214v c06214v, int i10, JQ jq) throws C3K {
        c06214v.A0f(i10 + 8);
        int fullAtom = c06214v.A0C();
        int flags = AbstractC0963Iu.A00(fullAtom);
        int fullAtom2 = flags & 1;
        if (fullAtom2 == 0) {
            int fullAtom3 = flags & 2;
            boolean z10 = fullAtom3 != 0;
            int sampleCount = c06214v.A0L();
            if (sampleCount == 0) {
                boolean[] zArr = jq.A0F;
                int fullAtom4 = jq.A00;
                Arrays.fill(zArr, 0, fullAtom4, false);
                return;
            }
            int fullAtom5 = jq.A00;
            if (sampleCount == fullAtom5) {
                Arrays.fill(jq.A0F, 0, sampleCount, z10);
                int fullAtom6 = c06214v.A07();
                jq.A02(fullAtom6);
                jq.A04(c06214v);
                return;
            }
            StringBuilder sbAppend = new StringBuilder().append(A0A(532, 18, 95)).append(sampleCount).append(A0A(0, 40, 98));
            int fullAtom7 = jq.A00;
            throw C3K.A01(sbAppend.append(fullAtom7).toString(), null);
        }
        throw C3K.A00(A0A(458, 56, 30));
    }

    public static void A0I(C06214v c06214v, JQ jq) throws C3K {
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
        throw C3K.A01(A0A(727, 29, 60) + iA0L, null);
    }

    public static void A0J(C06214v c06214v, JQ jq) throws C3K {
        A0G(c06214v, 0, jq);
    }

    public static void A0K(C06214v c06214v, JQ jq, byte[] bArr) throws C3K {
        c06214v.A0f(8);
        c06214v.A0k(bArr, 0, 16);
        if (!Arrays.equals(bArr, A0d)) {
            return;
        }
        A0G(c06214v, 16, jq);
    }

    @MetaExoPlayerCustomization("New parameter for getUri()")
    private void A0L(InterfaceC2165ms interfaceC2165ms) throws IOException {
        int i10 = ((int) this.A07) - this.A00;
        C06214v c06214v = this.A0D;
        if (c06214v != null) {
            interfaceC2165ms.readFully(c06214v.A0l(), 8, i10);
            A0U(new C2136mD(this.A01, c06214v), interfaceC2165ms.A8n(), interfaceC2165ms.A9P());
        } else {
            interfaceC2165ms.AK3(i10);
        }
        A0F(interfaceC2165ms.A8n());
    }

    private void A0M(InterfaceC2165ms interfaceC2165ms) throws IOException {
        JA jaValueAt = null;
        long j10 = Long.MAX_VALUE;
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            JA nextTrackBundle = this.A0L.valueAt(i10);
            JQ jq = nextTrackBundle.A09;
            if (jq.A0A && jq.A03 < j10) {
                j10 = jq.A03;
                jaValueAt = this.A0L.valueAt(i10);
            }
        }
        if (jaValueAt == null) {
            this.A02 = 3;
            return;
        }
        int iA8n = (int) (j10 - interfaceC2165ms.A8n());
        if (iA8n >= 0) {
            interfaceC2165ms.AK3(iA8n);
            jaValueAt.A09.A05(interfaceC2165ms);
            return;
        }
        throw C3K.A01(A0A(384, 39, 59), null);
    }

    private void A0N(C2137mE c2137mE) throws C3K {
        if (((AbstractC0963Iu) c2137mE).A00 == 1836019574) {
            A0P(c2137mE);
            return;
        }
        if (((AbstractC0963Iu) c2137mE).A00 == 1836019558) {
            A0O(c2137mE);
            return;
        }
        if (this.A0V.isEmpty()) {
            return;
        }
        C2137mE c2137mEPeek = this.A0V.peek();
        if (A0a[1].length() == 3) {
            throw new RuntimeException();
        }
        A0a[5] = "pjYwVuiFyV8fJrHeJXv5AlOqs";
        c2137mEPeek.A08(c2137mE);
    }

    private void A0O(C2137mE c2137mE) throws C3K {
        A0Q(c2137mE, this.A0L, this.A0U != null, this.A0K, this.A0Y);
        DrmInitData drmInitDataA06 = A06(c2137mE.A02);
        if (drmInitDataA06 != null) {
            int i10 = this.A0L.size();
            for (int trackCount = 0; trackCount < i10; trackCount++) {
                this.A0L.valueAt(trackCount).A0B(drmInitDataA06);
            }
        }
        long j10 = this.A0B;
        if (A0a[5].length() != 30) {
            String[] strArr = A0a;
            strArr[4] = "qdUBZHhFhQeTbxiPtlDH0srS7WoJbCtx";
            strArr[6] = "eg1L367OGrFS41anHFQFHM93YBMqVnGW";
            if (j10 != C.TIME_UNSET) {
                int size = this.A0L.size();
                for (int i11 = 0; i11 < size; i11++) {
                    JA jaValueAt = this.A0L.valueAt(i11);
                    long j11 = this.A0B;
                    int trackCount2 = A0a[5].length();
                    if (trackCount2 != 30) {
                        A0a[3] = "ExaTttTG7QLu5ZnLvMbeVx0ab4jt6cU8";
                        jaValueAt.A0A(j11);
                    }
                }
                this.A0B = C.TIME_UNSET;
                return;
            }
            return;
        }
        throw new RuntimeException();
    }

    private void A0P(C2137mE c2137mE) throws C3K {
        AbstractC05983y.A0A(this.A0U == null, A0A(680, 20, 8));
        DrmInitData drmInitDataA06 = A06(c2137mE.A02);
        C2137mE c2137mE2 = (C2137mE) AbstractC05983y.A01(c2137mE.A06(1836475768));
        SparseArray<J1> sparseArray = new SparseArray<>();
        long jA02 = C.TIME_UNSET;
        int size = c2137mE2.A02.size();
        for (int i10 = 0; i10 < size; i10++) {
            C2136mD c2136mD = c2137mE2.A02.get(i10);
            if (((AbstractC0963Iu) c2136mD).A00 == 1953654136) {
                Pair<Integer, J1> pairA04 = A04(c2136mD.A00);
                Object obj = pairA04.first;
                if (A0a[7].charAt(28) == 'N') {
                    throw new RuntimeException();
                }
                A0a[2] = "1hJqa9Igz9YM2Xn7uSuVVZMPlDpSi7YR";
                sparseArray.put(((Integer) obj).intValue(), (J1) pairA04.second);
            } else if (((AbstractC0963Iu) c2136mD).A00 == 1835362404) {
                jA02 = A02(c2136mD.A00);
            }
        }
        List<JR> listA0O = J0.A0O(c2137mE, new HK(), jA02, drmInitDataA06, (this.A0K & 16) != 0, false, new InterfaceC2025kO() { // from class: com.facebook.ads.redexgen.X.m9
            @Override // com.instagram.common.viewpoint.core.InterfaceC2025kO
            public final Object A4B(Object obj2) {
                return this.A00.A0c((JO) obj2);
            }
        });
        int size2 = listA0O.size();
        if (this.A0L.size() == 0) {
            for (int i11 = 0; i11 < size2; i11++) {
                JR jr = listA0O.get(i11);
                JO jo = jr.A03;
                this.A0L.put(jo.A00, new JA(this.A0E.AKS(i11, jo.A03), jr, A07(sparseArray, jo.A00)));
                this.A08 = Math.max(this.A08, jo.A04);
            }
            this.A0E.A6O();
            return;
        }
        AbstractC05983y.A08(this.A0L.size() == size2);
        for (int i12 = 0; i12 < size2; i12++) {
            JR jr2 = listA0O.get(i12);
            JO jo2 = jr2.A03;
            this.A0L.get(jo2.A00).A0C(jr2, A07(sparseArray, jo2.A00));
        }
    }

    public static void A0Q(C2137mE c2137mE, SparseArray<JA> sparseArray, boolean z10, int i10, byte[] bArr) throws C3K {
        int size = c2137mE.A01.size();
        for (int i11 = 0; i11 < size; i11++) {
            C2137mE child = c2137mE.A01.get(i11);
            int i12 = ((AbstractC0963Iu) child).A00;
            if (i12 == 1953653094) {
                A0R(child, sparseArray, z10, i10, bArr);
            }
        }
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0017 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static void A0S(com.instagram.common.viewpoint.core.C2137mE r8, com.instagram.common.viewpoint.core.JA r9, int r10) throws com.instagram.common.viewpoint.core.C3K {
        /*
            r4 = 0
            r3 = 0
            java.util.List<com.facebook.ads.redexgen.X.mD> r8 = r8.A02
            int r7 = r8.size()
            r5 = 0
        L9:
            r6 = 1953658222(0x7472756e, float:7.683823E31)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C2130m7.A0a
            r0 = 5
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 30
            if (r1 == r0) goto L67
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2130m7.A0a
            java.lang.String r1 = "g5KWW"
            r0 = 1
            r2[r0] = r1
            if (r5 >= r7) goto L3f
            java.lang.Object r1 = r8.get(r5)
            com.facebook.ads.redexgen.X.mD r1 = (com.instagram.common.viewpoint.core.C2136mD) r1
            int r0 = r1.A00
            if (r0 != r6) goto L3c
            com.facebook.ads.redexgen.X.4v r1 = r1.A00
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
            com.facebook.ads.redexgen.X.JQ r0 = r9.A09
            r0.A03(r4, r3)
            r5 = 0
            r0 = 0
            r4 = 0
        L4e:
            if (r4 >= r7) goto L66
            java.lang.Object r3 = r8.get(r4)
            com.facebook.ads.redexgen.X.mD r3 = (com.instagram.common.viewpoint.core.C2136mD) r3
            int r1 = r3.A00
            if (r1 != r6) goto L63
            int r2 = r5 + 1
            com.facebook.ads.redexgen.X.4v r1 = r3.A00
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2130m7.A0S(com.facebook.ads.redexgen.X.mE, com.facebook.ads.redexgen.X.JA, int):void");
    }

    @MetaExoPlayerCustomization("Adding Uri for eMsg")
    private void A0U(C2136mD c2136mD, long j10, Uri uri) throws C3K {
        if (!this.A0V.isEmpty()) {
            this.A0V.peek().A09(c2136mD);
            return;
        }
        if (((AbstractC0963Iu) c2136mD).A00 == 1936286840) {
            Pair<Long, C2170my> pairA05 = A05(c2136mD.A00, j10);
            Long l10 = (Long) pairA05.first;
            if (A0a[2].charAt(14) == 'D') {
                throw new RuntimeException();
            }
            A0a[2] = "KqHjYmkkmLRftUSzBx7x8q1P7pbSwwaZ";
            this.A0C = l10.longValue();
            this.A0E.AJ7((HY) pairA05.second);
            this.A0G = true;
            return;
        }
        if (((AbstractC0963Iu) c2136mD).A00 != 1701671783 || uri == null) {
            return;
        }
        A0H(c2136mD.A00, uri);
    }

    public static boolean A0W(int i10) {
        return i10 == 1836019574 || i10 == 1953653099 || i10 == 1835297121 || i10 == 1835626086 || i10 == 1937007212 || i10 == 1836019558 || i10 == 1953653094 || i10 == 1836475768 || i10 == 1701082227;
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
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C2130m7.A0a
            r0 = 1
            r0 = r1[r0]
            int r1 = r0.length()
            r0 = 3
            if (r1 == r0) goto Lc8
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2130m7.A0a
            java.lang.String r1 = "BwdOpTtZC6qkHbBW6vzemIV3sewTUKel"
            r0 = 4
            r2[r0] = r1
            java.lang.String r1 = "oE5SsWuxWmjvJDoIWd7OBauEjDNEKBY0"
            r0 = 6
            r2[r0] = r1
            if (r4 == r3) goto Lba
            r3 = 1937013298(0x73747a32, float:1.9369489E31)
            java.lang.String[] r1 = com.instagram.common.viewpoint.core.C2130m7.A0a
            r0 = 3
            r1 = r1[r0]
            r0 = 19
            char r1 = r1.charAt(r0)
            r0 = 101(0x65, float:1.42E-43)
            if (r1 == r0) goto Lbe
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2130m7.A0a
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
            java.lang.String[] r2 = com.instagram.common.viewpoint.core.C2130m7.A0a
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
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2130m7.A0X(int):boolean");
    }

    private boolean A0Y(InterfaceC2165ms interfaceC2165ms) throws IOException {
        int trackCount;
        int i10;
        if (this.A00 == 0) {
            C06214v c06214v = this.A0M;
            if (A0a[2].charAt(14) != 'D') {
                A0a[5] = "Du9yMjOrUhZNFJE5GgCY";
                if (!interfaceC2165ms.AHR(c06214v.A0l(), 0, 8, true)) {
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
            interfaceC2165ms.readFully(this.A0M.A0l(), 8, 8);
            int headerBytesRemaining = this.A00;
            this.A00 = headerBytesRemaining + 8;
            this.A07 = this.A0M.A0R();
        } else if (this.A07 == 0) {
            long jA8O = interfaceC2165ms.A8O();
            if (jA8O == -1 && !this.A0V.isEmpty()) {
                jA8O = this.A0V.peek().A00;
            }
            if (jA8O != -1) {
                long jA8n = jA8O - interfaceC2165ms.A8n();
                int trackCount2 = this.A00;
                this.A07 = jA8n + trackCount2;
            }
        }
        if (this.A07 >= this.A00) {
            long jA8n2 = interfaceC2165ms.A8n() - this.A00;
            if ((this.A01 == 1836019558 || this.A01 == 1835295092) && !this.A0G) {
                this.A0E.AJ7(new C2160mn(this.A08, jA8n2));
                this.A0G = true;
            }
            if (this.A01 == 1836019558) {
                SparseArray<JA> sparseArray = this.A0L;
                if (A0a[0].length() != 3) {
                    A0a[7] = "3NdiubR5fLBwA18U1YAUjfhOdAcmjZCx";
                    trackCount = sparseArray.size();
                    i10 = 0;
                } else {
                    A0a[0] = "3Yh";
                    trackCount = sparseArray.size();
                    i10 = 0;
                }
                while (i10 < trackCount) {
                    JQ jq = this.A0L.valueAt(i10).A09;
                    jq.A02 = jA8n2;
                    jq.A03 = jA8n2;
                    jq.A04 = jA8n2;
                    i10++;
                }
            }
            int trackCount3 = this.A01;
            if (trackCount3 == 1835295092) {
                this.A0F = null;
                this.A09 = this.A07 + jA8n2;
                this.A02 = 2;
                return true;
            }
            if (A0W(this.A01)) {
                long jA8n3 = (interfaceC2165ms.A8n() + this.A07) - 8;
                this.A0V.push(new C2137mE(this.A01, jA8n3));
                if (this.A07 == this.A00) {
                    A0F(jA8n3);
                } else {
                    A0B();
                }
            } else if (A0X(this.A01)) {
                if (this.A00 != 8) {
                    throw C3K.A00(A0A(284, 51, 6));
                }
                if (this.A07 <= TTL.MAX_VALUE) {
                    C06214v c06214v2 = new C06214v((int) this.A07);
                    C06214v atomData = this.A0M;
                    System.arraycopy(atomData.A0l(), 0, c06214v2.A0l(), 0, 8);
                    this.A0D = c06214v2;
                    this.A02 = 1;
                } else {
                    throw C3K.A00(A0A(335, 49, 77));
                }
            } else if (this.A07 <= TTL.MAX_VALUE) {
                this.A0D = null;
                this.A02 = 1;
            } else {
                throw C3K.A00(A0A(592, 53, 87));
            }
            return true;
        }
        throw C3K.A00(A0A(78, 48, 36));
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0049, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
    
        r19.AK3(r3);
        A0B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0051, code lost:
    
        return false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005e, code lost:
    
        if (r3 >= 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0246, code lost:
    
        throw com.instagram.common.viewpoint.core.C3K.A01(A0A(423, 35, 125), null);
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ba  */
    @com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization("Mark text samples as sync frames")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private boolean A0Z(com.instagram.common.viewpoint.core.InterfaceC2165ms r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 774
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C2130m7.A0Z(com.facebook.ads.redexgen.X.ms):boolean");
    }

    public static boolean A0a(JO jo) {
        if (jo.A08 == null || jo.A08.length != 1 || jo.A09 == null) {
            return false;
        }
        if (jo.A08[0] == 0) {
            return true;
        }
        long editListEndMediaTimeUs = C5C.A0U(jo.A08[0] + jo.A09[0], 1000000L, jo.A05);
        if (A0a[2].charAt(14) == 'D') {
            throw new RuntimeException();
        }
        A0a[1] = "wHdUW";
        return editListEndMediaTimeUs >= jo.A04;
    }

    public static /* synthetic */ H9[] A0b() {
        return new H9[]{new C2129m6()};
    }

    public final JO A0c(JO jo) {
        return jo;
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AAC(HA ha) {
        this.A0E = ha;
        A0B();
        A0C();
        if (this.A0U != null) {
            this.A0L.put(0, new JA(ha.AKS(0, this.A0U.A03), new JR(this.A0U, new long[0], new int[0], 0, new long[0], new int[0], 0L), new J1(0, 0, 0, 0)));
            this.A0E.A6O();
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final int AHL(InterfaceC2165ms interfaceC2165ms, HV hv) throws IOException {
        while (true) {
            switch (this.A02) {
                case 0:
                    if (!A0Y(interfaceC2165ms)) {
                        return -1;
                    }
                    break;
                case 1:
                    A0L(interfaceC2165ms);
                    break;
                case 2:
                    A0M(interfaceC2165ms);
                    break;
                default:
                    if (!A0Z(interfaceC2165ms)) {
                        break;
                    } else {
                        return 0;
                    }
            }
        }
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AHb() {
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final void AJ6(long j10, long j11) {
        int size = this.A0L.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.A0L.valueAt(i10).A08();
        }
        this.A0W.clear();
        this.A03 = 0;
        this.A0B = j11;
        this.A0V.clear();
        A0B();
    }

    @Override // com.instagram.common.viewpoint.core.H9
    public final boolean AK5(InterfaceC2165ms interfaceC2165ms) throws IOException {
        return JM.A01(interfaceC2165ms);
    }
}
