package com.facebook.ads.redexgen.core;

import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.Cj, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2462Cj {
    public static String[] A07 = {"1TUPUvqjuckMieKxy618dXqeho2I2nXO", "1tw", "Rv8BHxt03y9lIrpcW4kHhbfWsqmFKBVK", "r8Px", "D2vXeeTjlCXB4Odv", "hN", "uuD40", "TpLNmCJV5wG1YwTXf3toM93vl9iWeWk7"};
    public long A00;
    public C3791mG A01;
    public C3791mG A02;
    public C3791mG A03;
    public final int A04;
    public final C4J A05 = new C4J(32);
    public final EO A06;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public static C3791mG A04(C3791mG c3791mG, C3871nY c3871nY, C2464Cl c2464Cl, C4J c4j) {
        int iA0M;
        long j4 = c2464Cl.A01;
        c4j.A0d(1);
        C3791mG c3791mGA03 = A03(c3791mG, j4, c4j.A0l(), 1);
        long j10 = j4 + 1;
        byte b10 = c4j.A0l()[0];
        boolean z10 = (b10 & 128) != 0;
        int i = b10 & 127;
        C5N c5n = c3871nY.A05;
        if (c5n.A04 == null) {
            c5n.A04 = new byte[16];
        } else {
            Arrays.fill(c5n.A04, (byte) 0);
        }
        C3791mG c3791mGA032 = A03(c3791mGA03, j10, c5n.A04, i);
        long j11 = j10 + i;
        if (z10) {
            c4j.A0d(2);
            c3791mGA032 = A03(c3791mGA032, j11, c4j.A0l(), 2);
            j11 += 2;
            iA0M = c4j.A0M();
        } else {
            iA0M = 1;
            if (A07[7].charAt(5) == 'i') {
                throw new RuntimeException();
            }
            A07[7] = "Hpyz1f8ALnZx1iP9R6alck8MxH3P54oK";
        }
        int[] iArr = c5n.A06;
        if (iArr == null || iArr.length < iA0M) {
            iArr = new int[iA0M];
        }
        int[] iArr2 = c5n.A07;
        if (iArr2 == null || iArr2.length < iA0M) {
            iArr2 = new int[iA0M];
        }
        if (z10) {
            int i10 = iA0M * 6;
            c4j.A0d(i10);
            c3791mGA032 = A03(c3791mGA032, j11, c4j.A0l(), i10);
            j11 += i10;
            c4j.A0f(0);
            for (int i11 = 0; i11 < iA0M; i11++) {
                iArr[i11] = c4j.A0M();
                iArr2[i11] = c4j.A0L();
            }
        } else {
            iArr[0] = 0;
            iArr2[0] = c2464Cl.A00 - ((int) (j11 - c2464Cl.A01));
        }
        C2582Gz c2582Gz = (C2582Gz) AbstractC22614a.A0f(c2464Cl.A02);
        c5n.A02(iA0M, iArr, iArr2, c2582Gz.A03, c5n.A04, c2582Gz.A01, c2582Gz.A02, c2582Gz.A00);
        int i12 = (int) (j11 - c2464Cl.A01);
        c2464Cl.A01 += i12;
        if (A07[0].charAt(1) == 'T') {
            A07[0] = "nTpP9ibfF3cbwjVbkTA4UIhNPpZui5fl";
            c2464Cl.A00 -= i12;
            return c3791mGA032;
        }
        String[] strArr = A07;
        strArr[3] = "b8i1";
        strArr[6] = "bRWrT";
        c2464Cl.A00 -= i12;
        return c3791mGA032;
    }

    public C2462Cj(EO eo) {
        this.A06 = eo;
        this.A04 = eo.A8A();
        this.A01 = new C3791mG(0L, this.A04);
        this.A02 = this.A01;
        this.A03 = this.A01;
    }

    private int A00(int i) {
        if (this.A03.A03 == null) {
            this.A03.A03(this.A06.A41(), new C3791mG(this.A03.A00, this.A04));
        }
        return Math.min(i, (int) (this.A03.A00 - this.A00));
    }

    public static C3791mG A01(C3791mG c3791mG, long j4) {
        while (j4 >= c3791mG.A00) {
            c3791mG = c3791mG.A02;
        }
        return c3791mG;
    }

    public static C3791mG A02(C3791mG c3791mG, long j4, ByteBuffer byteBuffer, int i) {
        C3791mG c3791mGA01 = A01(c3791mG, j4);
        while (i > 0) {
            int remaining = (int) (c3791mGA01.A00 - j4);
            int iMin = Math.min(i, remaining);
            byte[] bArr = c3791mGA01.A03.A01;
            int remaining2 = c3791mGA01.A00(j4);
            byteBuffer.put(bArr, remaining2, iMin);
            i -= iMin;
            j4 += iMin;
            if (j4 == c3791mGA01.A00) {
                c3791mGA01 = c3791mGA01.A02;
            }
        }
        return c3791mGA01;
    }

    public static C3791mG A03(C3791mG c3791mG, long j4, byte[] bArr, int i) {
        C3791mG c3791mGA01 = A01(c3791mG, j4);
        int i10 = i;
        while (i10 > 0) {
            int iMin = Math.min(i10, (int) (c3791mGA01.A00 - j4));
            byte[] bArr2 = c3791mGA01.A03.A01;
            int toCopy = c3791mGA01.A00(j4);
            int remaining = i - i10;
            System.arraycopy(bArr2, toCopy, bArr, remaining, iMin);
            i10 -= iMin;
            j4 += iMin;
            if (j4 == c3791mGA01.A00) {
                c3791mGA01 = c3791mGA01.A02;
            }
        }
        return c3791mGA01;
    }

    public static C3791mG A05(C3791mG c3791mG, C3871nY c3871nY, C2464Cl c2464Cl, C4J c4j) {
        if (c3871nY.A0E()) {
            c3791mG = A04(c3791mG, c3871nY, c2464Cl, c4j);
        }
        if (c3871nY.A03()) {
            c4j.A0d(4);
            C3791mG c3791mGA03 = A03(c3791mG, c2464Cl.A01, c4j.A0l(), 4);
            int iA0L = c4j.A0L();
            c2464Cl.A01 += 4;
            c2464Cl.A00 -= 4;
            c3871nY.A0C(iA0L);
            C3791mG c3791mGA02 = A02(c3791mGA03, c2464Cl.A01, c3871nY.A02, iA0L);
            c2464Cl.A01 += iA0L;
            c2464Cl.A00 -= iA0L;
            c3871nY.A0D(c2464Cl.A00);
            return A02(c3791mGA02, c2464Cl.A01, c3871nY.A03, c2464Cl.A00);
        }
        c3871nY.A0C(c2464Cl.A00);
        return A02(c3791mG, c2464Cl.A01, c3871nY.A02, c2464Cl.A00);
    }

    private void A06(int i) {
        this.A00 += i;
        if (this.A00 == this.A03.A00) {
            this.A03 = this.A03.A02;
        }
    }

    private void A07(C3791mG c3791mG) {
        if (c3791mG.A03 == null) {
            return;
        }
        this.A06.AGu(c3791mG);
        c3791mG.A01();
    }

    public final int A08(AnonymousClass20 anonymousClass20, int i, boolean z10) throws IOException {
        int i10 = anonymousClass20.read(this.A03.A03.A01, this.A03.A00(this.A00), A00(i));
        if (i10 == -1) {
            if (z10) {
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
        this.A06.AJi();
    }

    public final void A0B() {
        this.A02 = this.A01;
    }

    public final void A0C(long j4) {
        if (j4 == -1) {
            return;
        }
        while (j4 >= this.A01.A00) {
            this.A06.AGt(this.A01.A03);
            this.A01 = this.A01.A01();
        }
        long j10 = this.A02.A01;
        long j11 = this.A01.A01;
        String[] strArr = A07;
        if (strArr[3].length() == strArr[6].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A07;
        strArr2[3] = "kTcq";
        strArr2[6] = "Dj6YZ";
        if (j10 < j11) {
            this.A02 = this.A01;
        }
    }

    public final void A0D(C4J c4j, int i) {
        while (i > 0) {
            int iA00 = A00(i);
            byte[] bArr = this.A03.A03.A01;
            int bytesAppended = this.A03.A00(this.A00);
            c4j.A0k(bArr, bytesAppended, iA00);
            i -= iA00;
            A06(iA00);
        }
    }

    public final void A0E(C3871nY c3871nY, C2464Cl c2464Cl) {
        A05(this.A02, c3871nY, c2464Cl, this.A05);
    }

    public final void A0F(C3871nY c3871nY, C2464Cl c2464Cl) {
        this.A02 = A05(this.A02, c3871nY, c2464Cl, this.A05);
    }
}
