package com.instagram.common.viewpoint.core;

import com.bytedance.sdk.openadsdk.api.PAGErrorCode;
import com.google.ads.mediation.facebook.FacebookMediationAdapter;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.ox, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1914ox implements AnonymousClass74 {
    public static byte[] A0B;
    public static String[] A0C = {"WWBqbqM8cT7NtZ20aOE3uXs3Aw8DSv9K", "wsMqXc0RGaIy4bMjDS0CDKFK5K3H0E7a", "tXUn5oHGArEZhR5EfIYxUHEmkE2i7Wlz", "L3oqKt7yiugAXq9nLkVCiYddeszNHWIU", "GxMV2HKS42DeS6e3iSG9rTJ", "iBUmcZRwnnz5BMe8LKV", "MLtAALupoqSZMT31TgfSKHmksSEA2gyG", "KlBG0Bt2bdiLbLP3pzzetkFN2"};
    public int A00;
    public boolean A01;
    public final int A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final long A06;
    public final long A07;
    public final C1806nC A08;
    public final boolean A09;
    public final boolean A0A;

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0B, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 69);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A03() {
        A0B = new byte[]{-127, -60, -62, -49, -49, -48, -43, -127, -61, -58, -127, -51, -58, -44, -44, -127, -43, -55, -62, -49, -127, 123, -91, -58, -57, -62, -42, -51, -43, -83, -48, -62, -59, -92, -48, -49, -43, -45, -48, -51, 3, 16, 33, 22, 20, 35, -49, 17, 36, 21, 21, 20, 33, -49, 34, 24, 41, 20, -49, 33, 20, 16, 18, 23, 20, 19, -49, 38, 24, 35, 23, -49, 27, 20, 34, 34, -49, 35, 23, 16, 29, -49, -28, -33, -33, 28, 34, -49, 30, 21, -49, 17, 36, 21, 21, 20, 33, 20, 19, -49, 28, 20, 19, 24, 16, -49, 19, 16, 35, 16, -35, -36, -37, -35, -27, -68, -17, -32, -32, -33, -20, -66, -17, -20, -37, -18, -29, -23, -24, -57, -19, -77, -58, -73, -73, -74, -61, -105, -64, -61, -95, -67, -78, -54, -77, -78, -76, -68, -110, -73, -59, -74, -61, -93, -74, -77, -58, -73, -73, -74, -61, -98, -60, 21, 40, 25, 25, 24, 37, -7, 34, 37, 3, 31, 20, 44, 21, 20, 22, 30, 0, 38, -12, -24, -1, -55, -4, -19, -19, -20, -7, -44, -6, 43, 39, 44, 0, 51, 36, 36, 35, 48, 11, 49};
    }

    static {
        A03();
    }

    public C1914ox() {
        this(new C1806nC(true, 65536), 50000, 50000, 2500, PAGErrorCode.LOAD_FACTORY_NULL_CODE, -1, false, 0, false);
    }

    public C1914ox(C1806nC c1806nC, int i4, int i10, int i11, int i12, int i13, boolean z3, int i14, boolean z10) {
        int i15;
        String strA02 = A02(163, 19, 110);
        String strA022 = A02(21, 1, 6);
        A04(i11, 0, strA02, strA022);
        String strA023 = A02(131, 32, 12);
        A04(i12, 0, strA023, strA022);
        String strA024 = A02(193, 11, 121);
        A04(i4, i11, strA024, strA02);
        A04(i4, i12, strA024, strA023);
        A04(i10, i4, A02(182, 11, 66), strA024);
        A04(i14, 0, A02(FacebookMediationAdapter.ERROR_ADVIEW_CONSTRUCTOR_EXCEPTION, 20, 53), strA022);
        this.A08 = c1806nC;
        this.A07 = C5C.A0O(i4);
        this.A06 = C5C.A0O(i10);
        this.A05 = C5C.A0O(i11);
        this.A04 = C5C.A0O(i12);
        this.A02 = i13;
        if (this.A02 != -1) {
            i15 = this.A02;
        } else {
            i15 = 13107200;
        }
        this.A00 = i15;
        this.A09 = z3;
        this.A03 = C5C.A0O(i14);
        this.A0A = z10;
    }

    public static int A00(int i4) {
        switch (i4) {
            case -2:
                return 0;
            case -1:
            default:
                throw new IllegalArgumentException();
            case 0:
                return 144310272;
            case 1:
                return 13107200;
            case 2:
                if (A0C[7].length() == 32) {
                    throw new RuntimeException();
                }
                A0C[5] = "ABED08YC";
                return 131072000;
            case 3:
                return 131072;
            case 4:
                return 131072;
            case 5:
                return 131072;
            case 6:
                return 131072;
        }
    }

    private final int A01(InterfaceC1808nE[] interfaceC1808nEArr) {
        int iA00 = 0;
        for (InterfaceC1808nE interfaceC1808nE : interfaceC1808nEArr) {
            if (interfaceC1808nE != null) {
                int targetBufferSize = interfaceC1808nE.A9L().A02;
                iA00 += A00(targetBufferSize);
            }
        }
        int iMax = Math.max(13107200, iA00);
        if (A0C[0].charAt(6) == 'f') {
            throw new RuntimeException();
        }
        A0C[0] = "RHrwW0B94f4UqoylhYQPwgHgnQSWW3zM";
        return iMax;
    }

    public static void A04(int i4, int i10, String str, String str2) {
        AbstractC02203y.A09(i4 >= i10, str + A02(0, 21, 28) + str2);
    }

    private void A05(boolean z3) {
        int i4;
        if (this.A02 == -1) {
            i4 = 13107200;
        } else {
            i4 = this.A02;
        }
        this.A00 = i4;
        this.A01 = false;
        if (z3) {
            this.A08.A01();
        }
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final C1806nC A6v() {
        return this.A08;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final long A70(C8O c8o) {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AFR(C8O c8o) {
        A05(false);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AFc(C8O c8o) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AG6(C8O c8o) {
        A05(true);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final void AGF(AnonymousClass73 anonymousClass73, C1826nW c1826nW, InterfaceC1808nE[] interfaceC1808nEArr) {
        int iA01;
        if (this.A02 == -1) {
            iA01 = A01(interfaceC1808nEArr);
        } else {
            iA01 = this.A02;
        }
        this.A00 = iA01;
        this.A08.A02(this.A00);
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AIn(C8O c8o) {
        return this.A0A;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AJv(AnonymousClass73 anonymousClass73) {
        boolean z3 = true;
        boolean z10 = this.A08.A00() >= this.A00;
        long jMin = this.A07;
        if (anonymousClass73.A00 > 1.0f) {
            jMin = Math.min(C5C.A0Q(jMin, anonymousClass73.A00), this.A06);
        }
        if (anonymousClass73.A01 < Math.max(jMin, 500000L)) {
            boolean targetBufferSizeReached = this.A09;
            if (!targetBufferSizeReached && z10) {
                z3 = false;
            }
            this.A01 = z3;
            boolean targetBufferSizeReached2 = this.A01;
            if (!targetBufferSizeReached2 && anonymousClass73.A01 < 500000) {
                AbstractC02284g.A07(A02(22, 18, 28), A02(40, 71, 106));
            }
        } else if (anonymousClass73.A01 >= this.A06 || z10) {
            this.A01 = false;
        }
        boolean targetBufferSizeReached3 = this.A01;
        return targetBufferSizeReached3;
    }

    @Override // com.instagram.common.viewpoint.core.AnonymousClass74
    public final boolean AJy(long j, float f10, boolean z3, boolean z10, long minBufferDurationUs) {
        long jA0R = C5C.A0R(j, f10);
        long jMin = z3 ? this.A04 : this.A05;
        String[] strArr = A0C;
        if (strArr[3].charAt(20) == strArr[1].charAt(20)) {
            throw new RuntimeException();
        }
        A0C[4] = "l7tzQS6toEbIIxnpfZA1NGx";
        if (minBufferDurationUs != -9223372036854775807L) {
            jMin = Math.min(minBufferDurationUs / 2, jMin);
        }
        return jMin <= 0 || jA0R >= jMin || (!this.A09 && this.A08.A00() >= this.A00);
    }
}
