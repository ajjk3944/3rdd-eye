package com.facebook.ads.redexgen.core;

import java.io.IOException;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public final class H2 {
    public static byte[] A07;
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public boolean A05;
    public final byte[] A06 = new byte[10];

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A07, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 90);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A07 = new byte[]{78, 104, 111, 127, 82, 94, 58, 121, 114, 111, 116, 113, 58, 105, 123, 119, 106, 118, 127, 105, 58, 119, 111, 105, 110, 58, 120, 127, 58, 121, 117, 116, 110, 115, 125, 111, 117, 111, 105, 58, 115, 116, 58, 110, 114, 127, 58, 105, 123, 119, 106, 118, 127, 58, 107, 111, 127, 111, 127, 52};
    }

    public final void A02() {
        this.A05 = false;
        this.A02 = 0;
    }

    public final void A03(InterfaceC3738lN interfaceC3738lN) throws IOException {
        if (this.A05) {
            return;
        }
        interfaceC3738lN.AG9(this.A06, 0, 10);
        interfaceC3738lN.AI1();
        if (GF.A06(this.A06) == 0) {
            return;
        }
        this.A05 = true;
    }

    public final void A04(H1 h12, long j4, int i, int i10, int i11, C2582Gz c2582Gz) {
        C3M.A0A(this.A01 <= i10 + i11, A00(0, 60, 64));
        if (!this.A05) {
            return;
        }
        int i12 = this.A02;
        this.A02 = i12 + 1;
        if (i12 == 0) {
            this.A04 = j4;
            this.A00 = i;
            this.A03 = 0;
        }
        this.A03 += i10;
        this.A01 = i11;
        if (this.A02 >= 16) {
            A05(h12, c2582Gz);
        }
    }

    public final void A05(H1 h12, C2582Gz c2582Gz) {
        if (this.A02 > 0) {
            h12.AIA(this.A04, this.A00, this.A03, this.A01, c2582Gz);
            this.A02 = 0;
        }
    }
}
