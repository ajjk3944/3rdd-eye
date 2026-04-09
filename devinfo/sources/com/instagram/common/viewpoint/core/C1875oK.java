package com.instagram.common.viewpoint.core;

import com.applovin.shadow.okio.Utf8;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.oK, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1875oK implements InterfaceC03448v {
    public static byte[] A01;
    public static String[] A02 = {"", "W3zKx7uimPBnuqB79eRuk71Lq6Q9Tdtq", "pdw5IcOEDsyx", "PznYxCtiabQ1XXQUVp9BfEAYIGk6ZsUE", "E1k4hPJKfb0MvebzJOZYusmHHBWvORO7", "bmueFxdYYt0nqn8p", "GRfRtgnBgmJZB0Qq", "VS7ML1wDeymmTLeKFRcttz7uEm3bVRGQ"};
    public final /* synthetic */ AnonymousClass12 A00;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A01, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A02;
            if (strArr[5].length() != strArr[6].length()) {
                throw new RuntimeException();
            }
            A02[4] = "fuFs1gweK6T0kCx4bj1F2DHsk5QuVwMS";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 8);
            i12++;
        }
    }

    public static void A01() {
        A01 = new byte[]{47, 27, 10, 7, 1, 78, 29, 7, 0, 5, 78, 11, 28, 28, 1, 28, 32, 8, 9, 4, 12, 46, 2, 9, 8, 14, 44, 24, 9, 4, 2, Utf8.REPLACEMENT_BYTE, 8, 3, 9, 8, 31, 8, 31, 55, 54, 11, 52, 61, 61, 40, 24, 25, 32, 22, 28, 18, 2, 7};
    }

    static {
        A01();
    }

    public C1875oK(AnonymousClass12 anonymousClass12) {
        this.A00 = anonymousClass12;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AD6(Exception exc) {
        AbstractC02284g.A08(A00(16, 23, 101), A00(0, 16, FacebookMediationAdapter.ERROR_BANNER_SIZE_MISMATCH), exc);
        this.A00.A0F.A0D(exc);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AD7(C03418r c03418r) {
        this.A00.A0F.A0B(c03418r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AD8(C03418r c03418r) {
        this.A00.A0F.A0C(c03418r);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AF2() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(46, 8, 127));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AF3() {
        AnonymousClass12.A05(this.A00);
        if (0 != 0) {
            AnonymousClass12.A05(this.A00);
            throw new NullPointerException(A00(39, 7, 80));
        }
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AFN(long j) {
        this.A00.A0F.A03(j);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AFO() {
        this.A00.A26();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AFy(boolean z3) {
        this.A00.A0F.A0I(z3);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC03448v
    public final void AGJ(int i4, long j, long j8) {
        this.A00.A0F.A01(i4, j, j8);
    }
}
