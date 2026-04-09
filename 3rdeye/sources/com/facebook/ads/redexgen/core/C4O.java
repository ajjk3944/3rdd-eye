package com.facebook.ads.redexgen.core;

import android.view.Surface;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4O, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4O {
    public static byte[] A04;
    public static String[] A05 = {"rYnPbEfuSaTBbvatyKmqENn8mgRSZdek", "ofstc3luVQLhDPNdocOCjRxToKRzk7nB", "Fnbmz9sIEw5y7N9QBLdBg", "MRjsdls7eSgWLCoo8pA3j", "UfW8AgM42njlyNRr2q7EB3IdvayipkgN", "kcxrVmXx561a0K31f6UYVe0sWhenvrT2", "", "AcILJL5UwW37jf1DZrUjVyU1aBx980VR"};
    public final int A00;
    public final int A01;
    public final int A02;
    public final Surface A03;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A04, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] ^ i11) ^ 33);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A04 = new byte[]{66, 95, 68, 72, 67, 89, 76, 89, 68, 66, 67, 105, 72, 74, 95, 72, 72, 94, 13, 64, 88, 94, 89, 13, 79, 72, 13, 29, 1, 13, 20, 29, 1, 13, 28, 21, 29, 1, 13, 66, 95, 13, 31, 26, 29};
    }

    static {
        A01();
    }

    public C4O(Surface surface, int i, int i10) {
        this(surface, i, i10, 0);
    }

    public C4O(Surface surface, int i, int i10, int i11) {
        C3M.A09(i11 == 0 || i11 == 90 || i11 == 180 || i11 == 270, A00(0, 45, 12));
        this.A03 = surface;
        this.A02 = i;
        this.A00 = i10;
        this.A01 = i11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4O)) {
            return false;
        }
        C4O c4o = (C4O) obj;
        if (this.A02 == c4o.A02 && this.A00 == c4o.A00) {
            int i = this.A01;
            int i10 = c4o.A01;
            if (A05[7].charAt(29) == 'q') {
                throw new RuntimeException();
            }
            String[] strArr = A05;
            strArr[2] = "IfmXZsmHB8xObc4DA1o6c";
            strArr[3] = "9bmF1UX1T4riDJeOAx7tH";
            if (i == i10 && this.A03.equals(c4o.A03)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int result = this.A03.hashCode();
        int i = result * 31;
        int result2 = this.A02;
        int result3 = (((i + result2) * 31) + this.A00) * 31;
        int result4 = this.A01;
        return result3 + result4;
    }
}
