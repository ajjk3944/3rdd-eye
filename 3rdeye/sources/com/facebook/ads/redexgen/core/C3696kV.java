package com.facebook.ads.redexgen.core;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.facebook.ads.redexgen.X.kV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3696kV implements InterfaceC2630Iw {
    public static byte[] A0C;
    public static String[] A0D = {"jRj2ugi7SPR", "MNKsBNeD8MF1tCUmeU2P5Nj3hkdjoOc", "XMkmXaTlrOCX5lXmL6kh3TwHyWbdiNoj", "CqZnv6WT0ufq4g7hl2oSYE9w8", "bGEXSwT2dmCwLmvORXS7whQ8v", "55313totkqX4mBMXvHmYF6PzdsDv8MD", "C0ywJUyDCeWGQi9DxnjwsD3coqyGffR", "BhHq3twmKlbS1H4hpApJBSGHB"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public long A05;
    public long A06;
    public long A07;
    public final long A08;
    public final long A09;
    public final C2629Iv A0A;
    public final AbstractC2633Iz A0B;

    public static String A07(int i, int i10, int i11) {
        byte[] bArrCopyOfRange = Arrays.copyOfRange(A0C, i, i + i10);
        for (int i12 = 0; i12 < bArrCopyOfRange.length; i12++) {
            bArrCopyOfRange[i12] = (byte) ((bArrCopyOfRange[i12] - i11) - 83);
        }
        return new String(bArrCopyOfRange);
    }

    public static void A08() {
        A0C = new byte[]{-68, -35, -114, -35, -43, -43, -114, -34, -49, -43, -45, -114, -47, -49, -36, -114, -48, -45, -114, -44, -35, -29, -36, -46, -100};
    }

    static {
        A08();
    }

    public C3696kV(AbstractC2633Iz abstractC2633Iz, long j4, long j10, long j11, long j12, boolean z10) {
        C3M.A07(j4 >= 0 && j10 > j4);
        this.A0B = abstractC2633Iz;
        this.A09 = j4;
        this.A08 = j10;
        if (j11 == j10 - j4 || z10) {
            this.A07 = j12;
            this.A00 = 4;
        } else {
            this.A00 = 0;
        }
        this.A0A = new C2629Iv();
    }

    private long A00(InterfaceC3738lN interfaceC3738lN) throws IOException {
        if (this.A04 == this.A01) {
            return -1L;
        }
        long jA8f = interfaceC3738lN.A8f();
        if (!this.A0A.A04(interfaceC3738lN, this.A01)) {
            if (this.A04 != jA8f) {
                return this.A04;
            }
            throw new IOException(A07(0, 25, 27));
        }
        this.A0A.A05(interfaceC3738lN, false);
        interfaceC3738lN.AI1();
        long currentPosition = this.A06 - this.A0A.A05;
        int i = this.A0A.A01 + this.A0A.A00;
        if (0 <= currentPosition && currentPosition < 72000) {
            return -1L;
        }
        if (currentPosition >= 0) {
            this.A04 = interfaceC3738lN.A8f() + i;
            this.A05 = this.A0A.A05;
        } else {
            this.A01 = jA8f;
            C2629Iv c2629Iv = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() == strArr[1].length()) {
                throw new RuntimeException();
            }
            String[] strArr2 = A0D;
            strArr2[3] = "rTnMeKP9Ntef56gYj2I82A9Og";
            strArr2[7] = "Ns8cmH2a0bzEbJPPC1zDKlbsv";
            this.A02 = c2629Iv.A05;
        }
        if (this.A01 - this.A04 < 100000) {
            this.A01 = this.A04;
            return this.A04;
        }
        long offset = i * (currentPosition <= 0 ? 2L : 1L);
        long jA8f2 = interfaceC3738lN.A8f() - offset;
        long offset2 = this.A01;
        return AbstractC22614a.A0T(jA8f2 + (((offset2 - this.A04) * currentPosition) / (this.A02 - this.A05)), this.A04, this.A01 - 1);
    }

    private final long A01(InterfaceC3738lN interfaceC3738lN) throws IOException {
        this.A0A.A02();
        if (this.A0A.A03(interfaceC3738lN)) {
            this.A0A.A05(interfaceC3738lN, false);
            interfaceC3738lN.AJJ(this.A0A.A01 + this.A0A.A00);
            C2629Iv c2629Iv = this.A0A;
            String[] strArr = A0D;
            if (strArr[0].length() != strArr[1].length()) {
                String[] strArr2 = A0D;
                strArr2[3] = "I2mhjjmoE8ZJ2Dg0LzbNmT9WC";
                strArr2[7] = "IEpLWq2gVTEx0SVSUh2piystZ";
                long j4 = c2629Iv.A05;
                while ((this.A0A.A04 & 4) != 4 && this.A0A.A03(interfaceC3738lN) && interfaceC3738lN.A8f() < this.A08) {
                    if (this.A0A.A05(interfaceC3738lN, true)) {
                        C2629Iv c2629Iv2 = this.A0A;
                        String[] strArr3 = A0D;
                        if (strArr3[6].length() == strArr3[5].length()) {
                            A0D[2] = "1J9QEDZvjIULKx6bD2w0xEMzJBfvilpU";
                            if (GZ.A02(interfaceC3738lN, c2629Iv2.A01 + this.A0A.A00)) {
                                j4 = this.A0A.A05;
                            }
                        }
                    }
                    return j4;
                }
                return j4;
            }
            throw new RuntimeException();
        }
        throw new EOFException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    /* renamed from: A05, reason: merged with bridge method [inline-methods] */
    public final C3697kW A5R() {
        C2627It c2627It = null;
        if (this.A07 != 0) {
            return new C3697kW(this);
        }
        return null;
    }

    private void A09(InterfaceC3738lN interfaceC3738lN) throws IOException {
        while (true) {
            this.A0A.A03(interfaceC3738lN);
            this.A0A.A05(interfaceC3738lN, false);
            if (this.A0A.A05 > this.A06) {
                interfaceC3738lN.AI1();
                return;
            } else {
                interfaceC3738lN.AJJ(this.A0A.A01 + this.A0A.A00);
                this.A04 = interfaceC3738lN.A8f();
                this.A05 = this.A0A.A05;
            }
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    public final long AGd(InterfaceC3738lN interfaceC3738lN) throws IOException {
        switch (this.A00) {
            case 0:
                this.A03 = interfaceC3738lN.A8f();
                this.A00 = 1;
                long j4 = this.A08 - 65307;
                if (j4 > this.A03) {
                    return j4;
                }
            case 1:
                long lastPageSearchPosition = A01(interfaceC3738lN);
                this.A07 = lastPageSearchPosition;
                String[] strArr = A0D;
                if (strArr[6].length() != strArr[5].length()) {
                    A0D[4] = "Q";
                    this.A00 = 4;
                    return this.A03;
                }
                A0D[2] = "zPL0M1I0YHefEI7ePcrxVR039vnXiGQX";
                this.A00 = 4;
                return this.A03;
            case 2:
                long position = A00(interfaceC3738lN);
                if (A0D[2].charAt(28) != 'i') {
                    throw new RuntimeException();
                }
                A0D[4] = "EIP7mTXqLgr9aPVawFNgKKAemnhenv";
                if (position != -1) {
                    return position;
                }
                this.A00 = 3;
            case 3:
                A09(interfaceC3738lN);
                this.A00 = 4;
                return -(this.A05 + 2);
            case 4:
                return -1L;
            default:
                throw new IllegalStateException();
        }
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    public final void AJR(long j4) {
        this.A06 = AbstractC22614a.A0T(j4, 0L, this.A07 - 1);
        this.A00 = 2;
        this.A04 = this.A09;
        this.A01 = this.A08;
        this.A05 = 0L;
        this.A02 = this.A07;
    }
}
