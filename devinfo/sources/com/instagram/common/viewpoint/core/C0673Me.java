package com.instagram.common.viewpoint.core;

import java.io.IOException;
import java.io.InterruptedIOException;

/* renamed from: com.facebook.ads.redexgen.X.Me, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0673Me {
    public static String[] A0A = {"Zahrr4TzPnlvzL1ryUDBJHiLrNQrc0do", "gdtiLcJnOI63VIDKC4FZh", "mcKRdr7QIVfArpWMDov87T9yp6nn6XkX", "hh9PATM4XXQMpkTMp0yEe4VjsJayobMb", "DHsdxhl2jOmdOKqNSGjxb8rQV1nmB92A", "YMP8jok2HwiV", "9", "S"};
    public long A00;
    public long A01;
    public long A02;
    public final C02565i A03;
    public final MP A04;
    public final C8B A05;
    public final InterfaceC0672Md A06;
    public final String A07;
    public final byte[] A08;
    public volatile boolean A09;

    public C0673Me(C8B c8b, C02565i c02565i, byte[] bArr, InterfaceC0672Md interfaceC0672Md) {
        this.A05 = c8b;
        this.A04 = c8b.A0E();
        this.A03 = c02565i;
        this.A08 = bArr == null ? new byte[131072] : bArr;
        this.A06 = interfaceC0672Md;
        this.A07 = c8b.A0F().A4l(c02565i);
        this.A02 = c02565i.A04;
    }

    private long A00() {
        if (this.A01 == -1) {
            return -1L;
        }
        return this.A01 - this.A03.A04;
    }

    private long A01(long j, long j8) throws Throwable {
        boolean z3 = j + j8 == this.A01 || j8 == -1;
        long jAGi = -1;
        boolean z10 = false;
        if (j8 != -1) {
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j).A03(j8).A09());
                z10 = true;
            } catch (IOException unused) {
                AbstractC02515d.A00(this.A05);
            }
        }
        if (!z10) {
            A02();
            try {
                jAGi = this.A05.AGi(this.A03.A04().A04(j).A03(-1L).A09());
            } catch (IOException e2) {
                AbstractC02515d.A00(this.A05);
                throw e2;
            }
        }
        int bytesRead = 0;
        if (A0A[3].charAt(20) != 'e') {
            throw new RuntimeException();
        }
        A0A[0] = "hZR9VwpKkwuUXqoAcu0MC0lnjZxabJfZ";
        if (z3 && jAGi != -1) {
            try {
                A04(j + jAGi);
            } catch (IOException e10) {
                AbstractC02515d.A00(this.A05);
                throw e10;
            }
        }
        int i4 = 0;
        while (i4 != -1) {
            A02();
            i4 = this.A05.read(this.A08, 0, this.A08.length);
            if (i4 != -1) {
                A03(i4);
                bytesRead += i4;
            }
        }
        if (z3) {
            A04(bytesRead + j);
        }
        this.A05.close();
        long j9 = bytesRead;
        String[] strArr = A0A;
        if (strArr[5].length() == strArr[7].length()) {
            throw new RuntimeException();
        }
        String[] strArr2 = A0A;
        strArr2[5] = "HblyszVHSCLV";
        strArr2[7] = "g";
        return j9;
    }

    private void A02() throws InterruptedIOException {
        if (!this.A09) {
        } else {
            throw new InterruptedIOException();
        }
    }

    private void A03(long j) {
        this.A00 += j;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, j);
        }
    }

    private void A04(long j) {
        if (this.A01 == j) {
            return;
        }
        this.A01 = j;
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
    }

    public final void A05() throws IOException {
        long nextRequestLength;
        A02();
        this.A00 = this.A04.A7B(this.A07, this.A03.A04, this.A03.A03);
        if (this.A03.A03 != -1) {
            this.A01 = this.A03.A04 + this.A03.A03;
        } else {
            long jA00 = AbstractC0678Mj.A00(this.A04.A7S(this.A07));
            if (A0A[3].charAt(20) == 'e') {
                String[] strArr = A0A;
                strArr[4] = "d2NeaqM7PiJwxNK1Ah3bQ5GZkUsby9uw";
                strArr[2] = "tLvOBlFvjcFhEySGIYecGT7qbHBlIMmD";
                if (jA00 == -1) {
                    jA00 = -1;
                }
                this.A01 = jA00;
            }
            throw new RuntimeException();
        }
        if (this.A06 != null) {
            this.A06.AFX(A00(), this.A00, 0L);
        }
        while (true) {
            long j = this.A01;
            if (A0A[6].length() == 13) {
                break;
            }
            A0A[1] = "NGuGGBYtFkRF3XmDWlB70";
            if (j == -1 || this.A02 < this.A01) {
                A02();
                if (this.A01 == -1) {
                    nextRequestLength = Long.MAX_VALUE;
                } else {
                    long nextRequestLength2 = this.A01;
                    long blockLength = this.A02;
                    nextRequestLength = nextRequestLength2 - blockLength;
                }
                long jA7C = this.A04.A7C(this.A07, this.A02, nextRequestLength);
                if (jA7C > 0) {
                    long blockLength2 = this.A02;
                    this.A02 = blockLength2 + jA7C;
                } else {
                    long nextRequestLength3 = -jA7C;
                    if (nextRequestLength3 == Long.MAX_VALUE) {
                        nextRequestLength3 = -1;
                    }
                    long j8 = this.A02;
                    long blockLength3 = this.A02;
                    this.A02 = j8 + A01(blockLength3, nextRequestLength3);
                }
            } else {
                return;
            }
        }
    }

    public final void A06() {
        this.A09 = true;
    }
}
