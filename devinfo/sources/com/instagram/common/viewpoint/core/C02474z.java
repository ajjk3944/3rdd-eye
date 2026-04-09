package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.4z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C02474z {
    public static byte[] A02;
    public static final C02474z A03;
    public static final C02474z A04;
    public final int A00;
    public final int A01;

    public static String A00(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A02, i4, i4 + i10);
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
        A03 = new C02474z(-1, -1);
        A04 = new C02474z(0, 0);
    }

    public C02474z(int i4, int i10) {
        AbstractC02203y.A07((i4 == -1 || i4 >= 0) && (i10 == -1 || i10 >= 0));
        this.A01 = i4;
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
        if (!(obj instanceof C02474z)) {
            return false;
        }
        C02474z c02474z = (C02474z) obj;
        return this.A01 == c02474z.A01 && this.A00 == c02474z.A00;
    }

    public final int hashCode() {
        return this.A00 ^ ((this.A01 << 16) | (this.A01 >>> 16));
    }

    public final String toString() {
        return this.A01 + A00(0, 1, 44) + this.A00;
    }
}
