package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DL {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C1838ni A01;
    public C1838ni A02;
    public C1838ni A03;
    public final int A04;
    public final C02434v A05 = new C02434v(32);
    public final F0 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C1838ni A04(C1838ni c1838ni, C1917p0 c1917p0, DN dn, C02434v c02434v) {
        int iA0M;
        long j = dn.A01;
        c02434v.A0d(1);
        C1838ni c1838niA03 = A03(c1838ni, j, c02434v.A0l(), 1);
        long j8 = j + 1;
        byte b10 = c02434v.A0l()[0];
        boolean z3 = (b10 & 128) != 0;
        int i4 = b10 & 127;
        C02735z c02735z = c1917p0.A05;
        if (c02735z.A04 == null) {
            c02735z.A04 = new byte[16];
        } else {
            Arrays.fill(c02735z.A04, (byte) 0);
        }
        C1838ni c1838niA032 = A03(c1838niA03, j8, c02735z.A04, i4);
        long j9 = j8 + i4;
        if (z3) {
            c02434v.A0d(2);
            c1838niA032 = A03(c1838niA032, j9, c02434v.A0l(), 2);
            j9 += 2;
            iA0M = c02434v.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c02735z.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c02735z.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z3) {
            int i10 = iA0M * 6;
            c02434v.A0d(i10);
            c1838niA032 = A03(c1838niA032, j9, c02434v.A0l(), i10);
            j9 += i10;
            c02434v.A0f(0);
            for (int i11 = 0; i11 < iA0M; i11++) {
                iArr[i11] = c02434v.A0M();
                iArr2[i11] = c02434v.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = dn.A00 - ((int) (j9 - dn.A01));
        }
        C0541Hb c0541Hb = (C0541Hb) C5C.A0f(dn.A02);
        c02735z.A02(iA0M, iArr, iArr2, c0541Hb.A03, c02735z.A04, c0541Hb.A01, c0541Hb.A02, c0541Hb.A00);
        int i12 = (int) (j9 - dn.A01);
        dn.A01 += i12;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            dn.A00 -= i12;
            return c1838niA032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        dn.A00 -= i12;
        return c1838niA032;
    }

    public DL(F0 f02) {
        this.A06 = f02;
        this.A04 = f02.A8I();
        this.A01 = new C1838ni(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i4) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A49(), new C1838ni(this.A03.A00, this.A04));
        }
        return Math.min(i4, (int) (this.A03.A00 - this.A00));
    }

    public static C1838ni A01(C1838ni c1838ni, long j) {
        while (j >= c1838ni.A00) {
            c1838ni = c1838ni.A02;
        }
        return c1838ni;
    }

    public static C1838ni A02(C1838ni c1838ni, long j, ByteBuffer byteBuffer, int i4) {
        C1838ni c1838niA01 = A01(c1838ni, j);
        while (i4 > 0) {
            int remaining = (int) (c1838niA01.A00 - j);
            int iMin = Math.min(i4, remaining);
            byte[] bArr = c1838niA01.A03.A01;
            int remaining2 = c1838niA01.A00(j);
            byteBuffer.put(bArr, remaining2, iMin);
            i4 -= iMin;
            j += iMin;
            if (j == c1838niA01.A00) {
                c1838niA01 = c1838niA01.A02;
            }
        }
        return c1838niA01;
    }

    public static C1838ni A03(C1838ni c1838ni, long j, byte[] bArr, int i4) {
        C1838ni c1838niA01 = A01(c1838ni, j);
        int i10 = i4;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c1838niA01.A00 - j));
            byte[] bArr2 = c1838niA01.A03.A01;
            int toCopy = c1838niA01.A00(j);
            int remaining = i4 - i10;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i10 -= iMin;
            j += iMin;
            if (j == c1838niA01.A00) {
                c1838niA01 = c1838niA01.A02;
            }
        }
        return c1838niA01;
    }

    public static C1838ni A05(C1838ni c1838ni, C1917p0 c1917p0, DN dn, C02434v c02434v) {
        if (c1917p0.A0E()) {
            c1838ni = A04(c1838ni, c1917p0, dn, c02434v);
        }
        if (c1917p0.A03()) {
            c02434v.A0d(4);
            C1838ni c1838niA03 = A03(c1838ni, dn.A01, c02434v.A0l(), 4);
            int iA0L = c02434v.A0L();
            dn.A01 += 4;
            dn.A00 -= 4;
            c1917p0.A0C(iA0L);
            C1838ni c1838niA02 = A02(c1838niA03, dn.A01, c1917p0.A02, iA0L);
            dn.A01 += iA0L;
            dn.A00 -= iA0L;
            c1917p0.A0D(dn.A00);
            return A02(c1838niA02, dn.A01, c1917p0.A03, dn.A00);
        }
        c1917p0.A0C(dn.A00);
        return A02(c1838ni, dn.A01, c1917p0.A02, dn.A00);
    }

    private void A06(int i4) {
        this.A00 += i4;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C1838ni c1838ni) {
        if (c1838ni.A03 == null) {
            return;
        }
        this.A06.AHe(c1838ni);
        c1838ni.A01();
    }

    public final int A08(InterfaceC01762c interfaceC01762c, int i4, boolean z3) throws IOException {
        int i10 = interfaceC01762c.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i4));
        if (i10 == -1) {
            if (z3) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i10);
        return i10;
    }

    public final long A09() {
        return this.A00;
    }

    public final void A0A() {
        A07(this.A01);
        this.A01.A02(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
        this.A00 = 0L;
        this.A06.AKT();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j) {
        if (j == -1) {
            return;
        }
        while (j >= this.A01.A00) {
            this.A06.AHd(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j8 = this.A02.A01;
        long j9 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j8 < j9) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C02434v c02434v, int i4) {
        while (i4 > 0) {
            int iA00 = A00(i4);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c02434v.A0k(bArr, bytesAppended, iA00);
            i4 -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C1917p0 c1917p0, DN dn) {
        A05(this.A02, c1917p0, dn, this.A05);
    }

    public final void A0F(C1917p0 c1917p0, DN dn) {
        this.A02 = A05(this.A02, c1917p0, dn, this.A05);
    }
}
