package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;
import org.xbill.DNS.Flags;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i10, int i11, int i12) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i10, i10 + i11);
        for (int i13 = 0; i13 < bArrCopyOfRange.length; i13++) {
            bArrCopyOfRange[i13] = (byte) ((bArrCopyOfRange[i13] ^ i12) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{Flags.CD, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C1814gi c1814gi, AbstractC1979jd abstractC1979jd, boolean z10, O3 o32) {
        if (!C1264Up.A2E(c1814gi)) {
            C1220Sx c1220Sx = new C1220Sx(c1814gi);
            C1086No c1086NoA07 = abstractC1979jd.A29().A0H().A07();
            c1220Sx.A0e(new VI(abstractC1979jd.A2E(), c1814gi.A0A()));
            if (c1086NoA07 == null) {
                o32.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c1086NoA07.A0Y()) {
                o32.AFG();
                return;
            }
            C1216St c1216St = new C1216St(c1086NoA07.A0L(), abstractC1979jd.A1D(), abstractC1979jd.A10());
            c1216St.A04 = true;
            c1216St.A03 = A00(0, 5, 86);
            switch (O2.A00[c1086NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c1220Sx.A0Y(c1216St);
                    break;
            }
            c1220Sx.A0c(new C1218Sv(abstractC1979jd.A2C().A01(), -1, -1, abstractC1979jd.A1D(), abstractC1979jd.A10()));
            c1220Sx.A0c(new C1218Sv(c1086NoA07.A0K(), -1, -1, abstractC1979jd.A1D(), abstractC1979jd.A10()));
            O0.A00(abstractC1979jd, c1220Sx, A00(5, 12, 71));
            c1220Sx.A0X(new C1957jA(c1814gi, o32, c1220Sx, c1086NoA07, z10), new C1213Sq(abstractC1979jd.A1D(), abstractC1979jd.A10()));
            return;
        }
        o32.AFG();
    }
}
