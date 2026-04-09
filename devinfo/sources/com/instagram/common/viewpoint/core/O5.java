package com.instagram.common.viewpoint.core;

import com.facebook.ads.AdError;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class O5 {
    public static byte[] A00;

    static {
        A01();
    }

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A00, i4, i4 + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 115);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A00 = new byte[]{11, 77, 81, 72, 73, 93, 90, 64, 81, 70, 71, 64, 93, 64, 93, 85, 88};
    }

    public static void A02(C1436gi c1436gi, AbstractC1601jd abstractC1601jd, boolean z3, O3 o32) {
        if (!C0886Up.A2E(c1436gi)) {
            C0842Sx c0842Sx = new C0842Sx(c1436gi);
            C0708No c0708NoA07 = abstractC1601jd.A29().A0H().A07();
            c0842Sx.A0e(new VI(abstractC1601jd.A2E(), c1436gi.A0A()));
            if (c0708NoA07 == null) {
                o32.AFF(AdError.CACHE_ERROR);
                return;
            }
            if (c0708NoA07.A0Y()) {
                o32.AFG();
                return;
            }
            C0838St c0838St = new C0838St(c0708NoA07.A0L(), abstractC1601jd.A1D(), abstractC1601jd.A10());
            c0838St.A04 = true;
            c0838St.A03 = A00(0, 5, 86);
            switch (O2.A00[c0708NoA07.A0G().ordinal()]) {
                case 1:
                case 2:
                    c0842Sx.A0Y(c0838St);
                    break;
            }
            c0842Sx.A0c(new C0840Sv(abstractC1601jd.A2C().A01(), -1, -1, abstractC1601jd.A1D(), abstractC1601jd.A10()));
            c0842Sx.A0c(new C0840Sv(c0708NoA07.A0K(), -1, -1, abstractC1601jd.A1D(), abstractC1601jd.A10()));
            O0.A00(abstractC1601jd, c0842Sx, A00(5, 12, 71));
            c0842Sx.A0X(new C1579jA(c1436gi, o32, c0842Sx, c0708NoA07, z3), new C0835Sq(abstractC1601jd.A1D(), abstractC1601jd.A10()));
            return;
        }
        o32.AFG();
    }
}
