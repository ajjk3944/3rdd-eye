package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.applovin.shadow.okhttp3.internal.http2.Http2;
import com.applovin.shadow.okio.Utf8;
import com.facebook.ads.androidx.media3.common.Format;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1959pg implements AnonymousClass24 {
    public static byte[] A05;
    public static final AnonymousClass23<C1959pg> A06;
    public static final String A07;
    public static final String A08;
    public int A00;
    public final int A01;
    public final int A02;
    public final String A03;
    public final C1996qI[] A04;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A05, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 15);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A05() {
        A05 = new byte[]{95, 28, 16, 18, 29, 22, 17, 26, 27, 95, 22, 17, 95, 16, 17, 26, 95, 43, 13, 30, 28, 20, 56, 13, 16, 10, 15, 69, 95, 88, 100, 99, 107, 55, 49, 34, 32, 40, 99, 112, 119, 127, 35, 37, 54, 52, 60, 119, 103, 126, 119, 54, 57, 51, 119, 112, 62, 106, 71, 72, 72, 75, 92, 75, 64, 90, 14, 22, 48, 35, 33, 41, 5, 48, 45, 55, 50, 50, Utf8.REPLACEMENT_BYTE, 48, 57, 43, Utf8.REPLACEMENT_BYTE, 57, 59, 45, 40, 53, 54, Utf8.REPLACEMENT_BYTE, 122, 60, 54, 59, 61, 41, 61, 38, 44};
    }

    static {
        A05();
        A07 = C5C.A0h(0);
        A08 = C5C.A0h(1);
        A06 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.ph
            @Override // com.instagram.common.viewpoint.core.AnonymousClass23
            public final AnonymousClass24 A6f(Bundle bundle) {
                return C1959pg.A01(bundle);
            }
        };
    }

    public C1959pg(String str, C1996qI... c1996qIArr) {
        AbstractC02203y.A07(c1996qIArr.length > 0);
        this.A03 = str;
        this.A04 = c1996qIArr;
        this.A01 = c1996qIArr.length;
        int iA01 = C3J.A01(c1996qIArr[0].A0W);
        this.A02 = iA01 == -1 ? C3J.A01(c1996qIArr[0].A0S) : iA01;
        A04();
    }

    public C1959pg(C1996qI... c1996qIArr) {
        this(A02(0, 0, 114), c1996qIArr);
    }

    public static int A00(int i4) {
        return i4 | Http2.INITIAL_MAX_FRAME_SIZE;
    }

    public static /* synthetic */ C1959pg A01(Bundle bundle) {
        List listA01;
        List<Format> formats = bundle.getParcelableArrayList(A07);
        if (formats == null) {
            listA01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            listA01 = AnonymousClass44.A01(C1996qI.A0b, formats);
        }
        String id2 = bundle.getString(A08, A02(0, 0, 114));
        return new C1959pg(id2, (C1996qI[]) listA01.toArray(new C1996qI[0]));
    }

    public static String A03(String str) {
        return (str == null || str.equals(A02(96, 3, 71))) ? A02(0, 0, 114) : str;
    }

    private void A04() {
        String strA03 = A03(this.A04[0].A0V);
        int iA00 = A00(this.A04[0].A0E);
        for (int i4 = 1; i4 < this.A04.length; i4++) {
            String language = this.A04[i4].A0V;
            if (!strA03.equals(A03(language))) {
                String str = this.A04[0].A0V;
                String str2 = this.A04[i4].A0V;
                String language2 = A02(77, 9, 81);
                A06(language2, str, str2, i4);
                return;
            }
            if (iA00 != A00(this.A04[i4].A0E)) {
                String binaryString = Integer.toBinaryString(this.A04[0].A0E);
                String binaryString2 = Integer.toBinaryString(this.A04[i4].A0E);
                String language3 = A02(86, 10, 85);
                A06(language3, binaryString, binaryString2, i4);
                return;
            }
        }
    }

    public static void A06(String str, String str2, String str3, int i4) {
        AbstractC02284g.A08(A02(67, 10, 77), A02(0, 0, 114), new IllegalStateException(A02(57, 10, 33) + str + A02(0, 30, AppLovinMediationAdapter.ERROR_CHILD_USER) + str2 + A02(39, 17, 88) + str3 + A02(30, 9, 76) + i4 + A02(56, 1, 24)));
    }

    /* JADX WARN: Incorrect condition in loop: B:4:0x0004 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int A07(com.instagram.common.viewpoint.core.C1996qI r3) {
        /*
            r2 = this;
            r1 = 0
        L1:
            com.facebook.ads.redexgen.X.qI[] r0 = r2.A04
            int r0 = r0.length
            if (r1 >= r0) goto L10
            com.facebook.ads.redexgen.X.qI[] r0 = r2.A04
            r0 = r0[r1]
            if (r3 != r0) goto Ld
            return r1
        Ld:
            int r1 = r1 + 1
            goto L1
        L10:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1959pg.A07(com.facebook.ads.redexgen.X.qI):int");
    }

    public final C1996qI A08(int i4) {
        return this.A04[i4];
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1959pg c1959pg = (C1959pg) obj;
        return this.A03.equals(c1959pg.A03) && Arrays.equals(this.A04, c1959pg.A04);
    }

    public final int hashCode() {
        if (this.A00 == 0) {
            int result = this.A03.hashCode();
            this.A00 = (((17 * 31) + result) * 31) + Arrays.hashCode(this.A04);
        }
        int result2 = this.A00;
        return result2;
    }
}
