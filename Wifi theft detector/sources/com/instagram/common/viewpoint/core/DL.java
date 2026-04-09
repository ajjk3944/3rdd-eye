package com.instagram.common.viewpoint.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* loaded from: assets/audience_network/classes2.dex */
public final class DL {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C2216ni A01;
    public C2216ni A02;
    public C2216ni A03;
    public final int A04;
    public final C06214v A05 = new C06214v(32);
    public final F0 A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C2216ni A04(C2216ni c2216ni, C2295p0 c2295p0, DN dn, C06214v c06214v) {
        int iA0M;
        long j10 = dn.A01;
        c06214v.A0d(1);
        C2216ni c2216niA03 = A03(c2216ni, j10, c06214v.A0l(), 1);
        long j11 = j10 + 1;
        byte b10 = c06214v.A0l()[0];
        boolean z10 = (b10 & 128) != 0;
        int i10 = b10 & 127;
        C06515z c06515z = c2295p0.A05;
        if (c06515z.A04 == null) {
            c06515z.A04 = new byte[16];
        } else {
            Arrays.fill(c06515z.A04, (byte) 0);
        }
        C2216ni c2216niA032 = A03(c2216niA03, j11, c06515z.A04, i10);
        long j12 = j11 + i10;
        if (z10) {
            c06214v.A0d(2);
            c2216niA032 = A03(c2216niA032, j12, c06214v.A0l(), 2);
            j12 += 2;
            iA0M = c06214v.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c06515z.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c06515z.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z10) {
            int i11 = iA0M * 6;
            c06214v.A0d(i11);
            c2216niA032 = A03(c2216niA032, j12, c06214v.A0l(), i11);
            j12 += i11;
            c06214v.A0f(0);
            for (int i12 = 0; i12 < iA0M; i12++) {
                iArr[i12] = c06214v.A0M();
                iArr2[i12] = c06214v.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = dn.A00 - ((int) (j12 - dn.A01));
        }
        C0919Hb c0919Hb = (C0919Hb) C5C.A0f(dn.A02);
        c06515z.A02(iA0M, iArr, iArr2, c0919Hb.A03, c06515z.A04, c0919Hb.A01, c0919Hb.A02, c0919Hb.A00);
        int i13 = (int) (j12 - dn.A01);
        dn.A01 += i13;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            dn.A00 -= i13;
            return c2216niA032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        dn.A00 -= i13;
        return c2216niA032;
    }

    public DL(F0 f02) {
        this.A06 = f02;
        this.A04 = f02.A8I();
        this.A01 = new C2216ni(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i10) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A49(), new C2216ni(this.A03.A00, this.A04));
        }
        return Math.min(i10, (int) (this.A03.A00 - this.A00));
    }

    public static C2216ni A01(C2216ni c2216ni, long j10) {
        while (j10 >= c2216ni.A00) {
            c2216ni = c2216ni.A02;
        }
        return c2216ni;
    }

    public static C2216ni A02(C2216ni c2216ni, long j10, ByteBuffer byteBuffer, int i10) {
        C2216ni c2216niA01 = A01(c2216ni, j10);
        while (i10 > 0) {
            int remaining = (int) (c2216niA01.A00 - j10);
            int iMin = Math.min(i10, remaining);
            byte[] bArr = c2216niA01.A03.A01;
            int remaining2 = c2216niA01.A00(j10);
            byteBuffer.put(bArr, remaining2, iMin);
            i10 -= iMin;
            j10 += iMin;
            if (j10 == c2216niA01.A00) {
                c2216niA01 = c2216niA01.A02;
            }
        }
        return c2216niA01;
    }

    public static C2216ni A03(C2216ni c2216ni, long j10, byte[] bArr, int i10) {
        C2216ni c2216niA01 = A01(c2216ni, j10);
        int i11 = i10;
        while (i11 > 0) {
            int iMin = Math.min(i11, (int) (c2216niA01.A00 - j10));
            byte[] bArr2 = c2216niA01.A03.A01;
            int toCopy = c2216niA01.A00(j10);
            int remaining = i10 - i11;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i11 -= iMin;
            j10 += iMin;
            if (j10 == c2216niA01.A00) {
                c2216niA01 = c2216niA01.A02;
            }
        }
        return c2216niA01;
    }

    public static C2216ni A05(C2216ni c2216ni, C2295p0 c2295p0, DN dn, C06214v c06214v) {
        if (c2295p0.A0E()) {
            c2216ni = A04(c2216ni, c2295p0, dn, c06214v);
        }
        if (c2295p0.A03()) {
            c06214v.A0d(4);
            C2216ni c2216niA03 = A03(c2216ni, dn.A01, c06214v.A0l(), 4);
            int iA0L = c06214v.A0L();
            dn.A01 += 4;
            dn.A00 -= 4;
            c2295p0.A0C(iA0L);
            C2216ni c2216niA02 = A02(c2216niA03, dn.A01, c2295p0.A02, iA0L);
            dn.A01 += iA0L;
            dn.A00 -= iA0L;
            c2295p0.A0D(dn.A00);
            return A02(c2216niA02, dn.A01, c2295p0.A03, dn.A00);
        }
        c2295p0.A0C(dn.A00);
        return A02(c2216ni, dn.A01, c2295p0.A02, dn.A00);
    }

    private void A06(int i10) {
        this.A00 += i10;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C2216ni c2216ni) {
        if (c2216ni.A03 == null) {
            return;
        }
        this.A06.AHe(c2216ni);
        c2216ni.A01();
    }

    public final int A08(InterfaceC05542c interfaceC05542c, int i10, boolean z10) throws IOException {
        int i11 = interfaceC05542c.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i10));
        if (i11 == -1) {
            if (z10) {
                return -1;
            }
            throw new EOFException();
        }
        A06(i11);
        return i11;
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

    public final void A0C(long j10) {
        if (j10 == -1) {
            return;
        }
        while (j10 >= this.A01.A00) {
            this.A06.AHd(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j11 = this.A02.A01;
        long j12 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j11 < j12) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C06214v c06214v, int i10) {
        while (i10 > 0) {
            int iA00 = A00(i10);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c06214v.A0k(bArr, bytesAppended, iA00);
            i10 -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C2295p0 c2295p0, DN dn) {
        A05(this.A02, c2295p0, dn, this.A05);
    }

    public final void A0F(C2295p0 c2295p0, DN dn) {
        this.A02 = A05(this.A02, c2295p0, dn, this.A05);
    }
}
