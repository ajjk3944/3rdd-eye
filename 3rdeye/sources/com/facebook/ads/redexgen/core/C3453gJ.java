package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.gJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3453gJ implements QM {
    public static byte[] A04;
    public int A00;
    public int A01;
    public int A02;
    public int[] A03;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 51);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{-95, -74, -50, -60, -54, -55, 117, -59, -60, -56, -66, -55, -66, -60, -61, -56, 117, -62, -54, -56, -55, 117, -73, -70, 117, -61, -60, -61, -126, -61, -70, -68, -74, -55, -66, -53, -70, -117, -92, -77, -96, -89, 91, -97, -92, -82, -81, -100, -87, -98, -96, 91, -88, -80, -82, -81, 91, -99, -96, 91, -87, -86, -87, 104, -87, -96, -94, -100, -81, -92, -79, -96};
    }

    public final void A02() {
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        this.A00 = 0;
    }

    public final void A03(int i, int i10) {
        this.A01 = i;
        this.A02 = i10;
    }

    public final void A04(C23196g c23196g, boolean z10) {
        this.A00 = 0;
        if (this.A03 != null) {
            Arrays.fill(this.A03, -1);
        }
        QO qo = c23196g.A06;
        if (c23196g.A04 != null && qo != null && qo.A1W()) {
            if (z10) {
                if (!c23196g.A00.A0B()) {
                    qo.A1t(c23196g.A04.A0B(), this);
                }
            } else if (!c23196g.A1r()) {
                qo.A1s(this.A01, this.A02, c23196g.A0s, this);
            }
            if (this.A00 > qo.A00) {
                qo.A00 = this.A00;
                qo.A08 = z10;
                c23196g.A0r.A0O();
            }
        }
    }

    public final boolean A05(int i) {
        if (this.A03 != null) {
            int i10 = this.A00 * 2;
            for (int i11 = 0; i11 < i10; i11 += 2) {
                int count = this.A03[i11];
                if (count == i) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    @Override // com.facebook.ads.redexgen.core.QM
    public final void A3u(int i, int i10) {
        if (i >= 0) {
            if (i10 >= 0) {
                int i11 = this.A00 * 2;
                if (this.A03 == null) {
                    this.A03 = new int[4];
                    Arrays.fill(this.A03, -1);
                } else {
                    int storagePosition = this.A03.length;
                    if (i11 >= storagePosition) {
                        int[] iArr = this.A03;
                        int storagePosition2 = i11 * 2;
                        this.A03 = new int[storagePosition2];
                        System.arraycopy(iArr, 0, this.A03, 0, iArr.length);
                    }
                }
                this.A03[i11] = i;
                int storagePosition3 = i11 + 1;
                this.A03[storagePosition3] = i10;
                int storagePosition4 = this.A00;
                this.A00 = storagePosition4 + 1;
                return;
            }
            throw new IllegalArgumentException(A00(37, 35, 8));
        }
        throw new IllegalArgumentException(A00(0, 37, 34));
    }
}
