package com.instagram.common.viewpoint.core;

import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.8U, reason: invalid class name */
/* loaded from: assets/audience_network/classes2.dex */
public final class C8U implements InterfaceC1760mF {
    public static byte[] A06;
    public static String[] A07 = {"QubeI9WU03qBZcNvE4IUkWvlw0NRrBK6", "F1d068LLA73yClDAGmhas6o", "9YpbVeLOd0f6m", "7Ycu3nAZXESMUbUrutcG9271koISuOhT", "QjcyZL4t35rbWMpE5hp6oYgD7sVhkS0D", "M48I8dHdEQTg0rHaHaNT6qI1", "cVfJzOsNywAlxLknvQSr1dDTMZn5TIAU", "kJeh17rnzHgOQ2HfO7oDpw4wPPnH7lFe"};
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long[] A05;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C8U A01(long j, long j8, HN hn, C02434v c02434v) {
        int iA0L;
        int i4 = hn.A04;
        int i10 = hn.A03;
        int iA0C = c02434v.A0C();
        if ((iA0C & 1) != 1 || (iA0L = c02434v.A0L()) == 0) {
            return null;
        }
        long jA0U = C5C.A0U(iA0L, i4 * 1000000, i10);
        if ((iA0C & 6) != 6) {
            return new C8U(j8, hn.A02, jA0U);
        }
        long jA0Q = c02434v.A0Q();
        long[] jArr = new long[100];
        for (int i11 = 0; i11 < 100; i11++) {
            jArr[i11] = c02434v.A0I();
        }
        if (j != -1 && j != j8 + jA0Q) {
            AbstractC02284g.A07(A02(27, 10, 78), A02(2, 25, 105) + j + A02(0, 2, 40) + (j8 + jA0Q));
        }
        return new C8U(j8, hn.A02, jA0U, jA0Q, jArr);
    }

    public static String A02(int i4, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A06, i4, i4 + i10);
        int i12 = 0;
        while (true) {
            int length = bArrCopyOfRange.length;
            String[] strArr = A07;
            if (strArr[1].length() == strArr[5].length()) {
                throw new RuntimeException();
            }
            A07[2] = "La6";
            if (i12 >= length) {
                return new String(bArrCopyOfRange);
            }
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 30);
            i12++;
        }
    }

    public static void A03() {
        A06 = new byte[]{114, 102, -33, -48, -43, -50, -89, -21, -24, -5, -24, -89, -6, -16, 1, -20, -89, -12, -16, -6, -12, -24, -5, -22, -17, -63, -89, -60, -43, -38, -45, -65, -47, -47, -41, -47, -34};
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j) {
        double d10;
        if (!AAj()) {
            return new HX(new HZ(0L, this.A03 + this.A00));
        }
        long jA0T = C5C.A0T(j, 0L, this.A04);
        double d11 = (jA0T * 100.0d) / this.A04;
        if (d11 <= 0.0d) {
            d10 = 0.0d;
        } else if (d11 >= 100.0d) {
            d10 = 256.0d;
        } else {
            int i4 = (int) d11;
            double d12 = ((long[]) AbstractC02203y.A02(this.A05))[i4];
            d10 = (((i4 == 99 ? 256.0d : r9[i4 + 1]) - d12) * (d11 - i4)) + d12;
        }
        return new HX(new HZ(jA0T, this.A03 + C5C.A0T(Math.round((d10 / 256.0d) * this.A02), this.A00, this.A02 - 1)));
    }

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    @Override // com.instagram.common.viewpoint.core.InterfaceC1760mF
    public final long A9H(long j) {
        long j8 = j - this.A03;
        if (!AAj() || j8 <= this.A00) {
            return 0L;
        }
        long[] jArr = (long[]) AbstractC02203y.A02(this.A05);
        double d10 = (j8 * 256.0d) / this.A02;
        int iA0L = C5C.A0L(jArr, (long) d10, true, true);
        long jA00 = A00(iA0L);
        long j9 = jArr[iA0L];
        long jA002 = A00(iA0L + 1);
        long j10 = iA0L == 99 ? 256L : jArr[iA0L + 1];
        String[] strArr = A07;
        if (strArr[0].charAt(4) == strArr[4].charAt(4)) {
            throw new RuntimeException();
        }
        A07[6] = "PlWtaQzxKmV3LAe12cSeUsJTirSwbfkK";
        return Math.round((jA002 - jA00) * (j9 == j10 ? 0.0d : (d10 - j9) / (j10 - j9))) + jA00;
    }

    static {
        A03();
    }

    public C8U(long j, int i4, long j8) {
        this(j, i4, j8, -1L, null);
    }

    public C8U(long j, int i4, long j8, long j9, long[] jArr) {
        this.A03 = j;
        this.A00 = i4;
        this.A04 = j8;
        this.A05 = jArr;
        this.A02 = j9;
        this.A01 = j9 != -1 ? j + j9 : -1L;
    }

    private long A00(int i4) {
        return (this.A04 * i4) / 100;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1760mF
    public final long A7j() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A04;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return this.A05 != null;
    }
}
