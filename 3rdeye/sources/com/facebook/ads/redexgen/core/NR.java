package com.facebook.ads.redexgen.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network.dex */
public abstract class NR {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73};
    }

    public static void A02(C3272dL c3272dL, AbstractC3547hy abstractC3547hy, boolean z10, NP np) {
        if (!U7.A27(c3272dL)) {
            SF sf = new SF(c3272dL);
            NB nbA07 = abstractC3547hy.A20().A0H().A07();
            sf.A0e(new C2915Ua(abstractC3547hy.A25(), c3272dL.A0A()));
            if (nbA07 == null) {
                np.AEZ(AdError.CACHE_ERROR);
                return;
            }
            if (nbA07.A0O()) {
                np.AEa();
                return;
            }
            SB sb = new SB(nbA07.A0F(), abstractC3547hy.A17(), abstractC3547hy.A0v());
            sb.A04 = true;
            sb.A03 = A00(0, 5, 86);
            switch (NO.A00[nbA07.A0A().ordinal()]) {
                case 1:
                case 2:
                    sf.A0Y(sb);
                    break;
            }
            sf.A0c(new SD(abstractC3547hy.A23().A01(), -1, -1, abstractC3547hy.A17(), abstractC3547hy.A0v()));
            sf.A0c(new SD(nbA07.A0E(), -1, -1, abstractC3547hy.A17(), abstractC3547hy.A0v()));
            sf.A0X(new C3527hZ(c3272dL, np, sf, nbA07, z10), new S8(abstractC3547hy.A17(), abstractC3547hy.A0v()));
            return;
        }
        np.AEa();
    }
}
