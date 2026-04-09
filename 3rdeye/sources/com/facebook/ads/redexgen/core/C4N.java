package com.facebook.ads.redexgen.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4N, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C4N {
    public static byte[] A02;
    public static final C4N A03;
    public static final C4N A04;
    public final int A00;
    public final int A01;

    public static String A00(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 64);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A01() {
        A02 = new byte[]{-28};
    }

    static {
        A01();
        A03 = new C4N(-1, -1);
        A04 = new C4N(0, 0);
    }

    public C4N(int i, int i10) {
        C3M.A07((i == -1 || i >= 0) && (i10 == -1 || i10 >= 0));
        this.A01 = i;
        this.A00 = i10;
    }

    public final int A02() {
        return this.A00;
    }

    public final int A03() {
        return this.A01;
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4N)) {
            return false;
        }
        C4N c4n = (C4N) obj;
        return this.A01 == c4n.A01 && this.A00 == c4n.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
