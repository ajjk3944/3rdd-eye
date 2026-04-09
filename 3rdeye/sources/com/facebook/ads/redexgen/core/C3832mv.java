package com.facebook.ads.redexgen.core;

import java.math.RoundingMode;

/* renamed from: com.facebook.ads.redexgen.X.mv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3832mv implements InterfaceC23658d {
    public final int A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final int A05;

    public C3832mv(C23738o c23738o) {
        this.A02 = c23738o.A02;
        this.A01 = c23738o.A01;
        this.A05 = c23738o.A05;
        this.A04 = c23738o.A04;
        this.A03 = c23738o.A03;
        this.A00 = c23738o.A00;
    }

    public static int A00(int i) {
        switch (i) {
            case 5:
                return 80000;
            case 6:
            case 18:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return 16000;
            case 12:
                return 7000;
            case 13:
            case 19:
            default:
                throw new IllegalArgumentException();
            case 14:
                return 3062500;
            case 15:
                return 8000;
            case 16:
                return 256000;
            case 17:
                return 336000;
            case 20:
                return 63750;
        }
    }

    private final int A01(int i) {
        int iA00 = A00(i);
        int maxByteRate = this.A03;
        return AD.A03((maxByteRate * iA00) / 1000000);
    }

    private final int A02(int i, int i10) {
        int bufferSizeUs;
        int i11 = this.A04;
        if (i == 5) {
            int bufferSizeUs2 = this.A00;
            i11 *= bufferSizeUs2;
        }
        if (i10 != -1) {
            bufferSizeUs = C9D.A00(i10, 8, RoundingMode.CEILING);
        } else {
            bufferSizeUs = A00(i);
        }
        return AD.A03((i11 * bufferSizeUs) / 1000000);
    }

    public static int A03(int i, int i10, int i11) {
        return AD.A03(((i * i10) * i11) / 1000000);
    }

    private final int A04(int i, int i10, int i11) {
        int maxAppBufferSize = this.A05 * i;
        int targetBufferSize = this.A02;
        int minAppBufferSize = A03(targetBufferSize, i10, i11);
        int targetBufferSize2 = this.A01;
        return AbstractC22614a.A07(maxAppBufferSize, minAppBufferSize, A03(targetBufferSize2, i10, i11));
    }

    private final int A05(int i, int i10, int i11, int i12, int i13, int i14) {
        switch (i11) {
            case 0:
                return A04(i, i13, i12);
            case 1:
                return A01(i10);
            case 2:
                return A02(i10, i14);
            default:
                throw new IllegalArgumentException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC23658d
    public final int A6x(int i, int i10, int i11, int i12, int i13, int i14, double d10) {
        int bufferSize = A05(i, i10, i11, i12, i13, i14);
        return (((Math.max(i, (int) (bufferSize * d10)) + i12) - 1) / i12) * i12;
    }
}
