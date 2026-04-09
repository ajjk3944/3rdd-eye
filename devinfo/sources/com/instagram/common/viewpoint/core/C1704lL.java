package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.applovin.AppLovinMediationAdapter;
import java.util.Arrays;
import java.util.Collections;

/* renamed from: com.facebook.ads.redexgen.X.lL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1704lL implements InterfaceC0638Kv {
    public static byte[] A0B;
    public static String[] A0C = {"Sri33Nkjg2q1UfSTa8c1c4poMbcRpRLi", "09hX7cFAjusi8bmxYUkedKuhTIWBBFyj", "9Nq5ciBjH0E2wAdqO8kDicSSF4ASqfED", "QsWxT4gaPPGppGCvyiz5txfiFuAY8zGx", "IfMd", "WTVPPiGNk6qIrjWgxgkH9oFnGfUzUO7U", "kZSjpU6etDs1IBDvrqsQrqQjBcHBIo8z", "H6v3RmW3GvMpIK1G5kWvIHPLiCmsEM1C"};
    public static final float[] A0D;
    public long A00;
    public long A01;
    public InterfaceC0543Hd A02;
    public C0642Kz A03;
    public String A04;
    public boolean A05;
    public final C02434v A06;
    public final C0641Ky A07;
    public final L4 A08;
    public final LJ A09;
    public final boolean[] A0A;

    public static String A01(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A02() {
        A0B = new byte[]{66, 56, 60, 57, 88, 111, 107, 110, 111, 120, 18, 53, 45, 58, 55, 50, Utf8.REPLACEMENT_BYTE, 123, 58, 40, 43, 62, 56, 47, 123, 41, 58, 47, 50, 52, 125, 90, 66, 85, 88, 93, 80, 20, 66, 91, 68, 107, 93, 90, 87, 70, 81, 89, 81, 90, 64, 107, 64, 93, 89, 81, 107, 70, 81, 71, 91, 88, 65, 64, 93, 91, 90, 77, 118, 112, 121, 118, 124, 116, 125, 124, 56, 110, 113, 124, 125, 119, 56, 119, 122, 114, 125, 123, 108, 56, 116, 121, 97, 125, 106, 56, 107, 112, 121, 104, 125, 45, 50, Utf8.REPLACEMENT_BYTE, 62, 52, 116, 54, 43, 111, 45, 118, 62, 40};
    }

    static {
        A02();
        A0D = new float[]{1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 1.0f};
    }

    public C1704lL() {
        this(null);
    }

    public C1704lL(LJ lj2) {
        this.A09 = lj2;
        this.A0A = new boolean[4];
        this.A07 = new C0641Ky(128);
        this.A00 = -9223372036854775807L;
        if (lj2 != null) {
            this.A08 = new L4(178, 128);
            this.A06 = new C02434v();
        } else {
            this.A08 = null;
            this.A06 = null;
        }
    }

    public static C1996qI A00(C0641Ky c0641Ky, int i4, String str) {
        float f10;
        byte[] bArrCopyOf = Arrays.copyOf(c0641Ky.A02, c0641Ky.A00);
        C02424u c02424u = new C02424u(bArrCopyOf);
        c02424u.A0A(i4);
        c02424u.A0A(4);
        c02424u.A07();
        c02424u.A09(8);
        if (c02424u.A0H()) {
            c02424u.A09(4);
            c02424u.A09(3);
        }
        int iA04 = c02424u.A04(4);
        String strA01 = A01(10, 20, 30);
        String strA012 = A01(0, 10, 79);
        if (iA04 == 15) {
            int iA042 = c02424u.A04(8);
            String[] strArr = A0C;
            if (strArr[1].charAt(10) != strArr[6].charAt(10)) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0C;
            strArr2[1] = "pNVnHJusVCsmPjFYzkWaaBxpUvIALZFH";
            strArr2[6] = "5W5bueKBkmsFSlOt61KpehVGJe26nslO";
            int iA043 = c02424u.A04(8);
            if (iA043 == 0) {
                AbstractC02284g.A07(strA012, strA01);
                f10 = 1.0f;
            } else {
                f10 = iA042 / iA043;
            }
        } else if (iA04 < A0D.length) {
            f10 = A0D[iA04];
        } else {
            AbstractC02284g.A07(strA012, strA01);
            f10 = 1.0f;
        }
        if (c02424u.A0H()) {
            c02424u.A09(2);
            c02424u.A09(1);
            boolean zA0H = c02424u.A0H();
            if (A0C[2].charAt(24) != 'F') {
                throw new RuntimeException();
            }
            String[] strArr3 = A0C;
            strArr3[1] = "a7iwuG0S7TsvBO2g0yc87XIFTOWCV0GN";
            strArr3[6] = "G4F0gcHQBssTN40k2zdU8kwKQEhYA5ZF";
            if (zA0H) {
                c02424u.A09(15);
                c02424u.A07();
                c02424u.A09(15);
                c02424u.A07();
                c02424u.A09(15);
                c02424u.A07();
                c02424u.A09(3);
                c02424u.A09(11);
                c02424u.A07();
                c02424u.A09(15);
                c02424u.A07();
            }
        }
        if (c02424u.A04(2) != 0) {
            AbstractC02284g.A07(strA012, A01(67, 34, 93));
        }
        c02424u.A07();
        int iA044 = c02424u.A04(16);
        c02424u.A07();
        if (c02424u.A0H()) {
            if (iA044 == 0) {
                AbstractC02284g.A07(strA012, A01(30, 37, AppLovinMediationAdapter.ERROR_MISSING_AD_UNIT_ID));
            } else {
                int i10 = 0;
                for (int i11 = iA044 - 1; i11 > 0; i11 >>= 1) {
                    i10++;
                }
                c02424u.A09(i10);
            }
        }
        c02424u.A07();
        int videoObjectLayerWidth = c02424u.A04(13);
        c02424u.A07();
        int iA045 = c02424u.A04(13);
        c02424u.A07();
        c02424u.A07();
        return new C01872p().A0y(str).A11(A01(101, 13, 30)).A0r(videoObjectLayerWidth).A0f(iA045).A0Y(f10).A12(Collections.singletonList(bArrCopyOf)).A14();
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x012e A[SYNTHETIC] */
    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void A5A(com.instagram.common.viewpoint.core.C02434v r13) {
        /*
            Method dump skipped, instructions count: 326
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.common.viewpoint.core.C1704lL.A5A(com.facebook.ads.redexgen.X.4v):void");
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void A5c(HA ha2, LG lg2) {
        lg2.A05();
        this.A04 = lg2.A04();
        this.A02 = ha2.AKS(lg2.A03(), 2);
        this.A03 = new C0642Kz(this.A02);
        if (this.A09 != null) {
            this.A09.A03(ha2, lg2);
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGp() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AGq(long j, int i4) {
        if (j != -9223372036854775807L) {
            this.A00 = j;
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0638Kv
    public final void AJ5() {
        HS.A0H(this.A0A);
        this.A07.A02();
        if (this.A03 != null) {
            this.A03.A00();
        }
        if (this.A08 != null) {
            this.A08.A00();
        }
        if (A0C[4].length() != 4) {
            throw new RuntimeException();
        }
        A0C[2] = "KHBnxT5PT6gCJIZCrRbgphkbFp7MF5Ts";
        this.A01 = 0L;
        this.A00 = -9223372036854775807L;
    }
}
