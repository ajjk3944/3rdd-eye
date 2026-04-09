package com.instagram.common.viewpoint.core;

/* loaded from: assets/audience_network/classes2.dex */
public final class L3 {
    public static String[] A0D = {"ITeGogKqorZ7bSCIE87s8DTmQOo7Fv11", "MgkbApIEYzpKXgGasWREFXTi3GTadnaL", "OAixFelLhBe3iSBS2M", "ijopPBuuJeE4Ltql3uBrQuSo8nqq7R3R", "1SB5ttJ09JcNeK6D9rJTpC1clnicerw7", "nbktskyiJneEJjHZifeKEa33HsJGsJ62", "ZYvdfmJVTREWWhesr4Tm9ps4syTvrO", "VkO2l5JSpUAFzoG39IjRbEodOO78G96O"};
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public long A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public final InterfaceC0543Hd A0C;

    public L3(InterfaceC0543Hd interfaceC0543Hd) {
        this.A0C = interfaceC0543Hd;
    }

    private void A00(int i4) {
        if (this.A04 == -9223372036854775807L) {
            return;
        }
        boolean z3 = this.A0B;
        this.A0C.AIu(this.A04, z3 ? 1 : 0, (int) (this.A01 - this.A03), i4, null);
    }

    public static boolean A01(int i4) {
        return (32 <= i4 && i4 <= 35) || i4 == 39;
    }

    public static boolean A02(int i4) {
        return i4 < 32 || i4 == 40;
    }

    public final void A03() {
        this.A07 = false;
        this.A06 = false;
        this.A05 = false;
        this.A0A = false;
        this.A09 = false;
    }

    public final void A04(long j, int i4, int i10, long j8, boolean z3) {
        this.A06 = false;
        this.A05 = false;
        this.A02 = j8;
        this.A00 = 0;
        this.A01 = j;
        if (!A02(i10)) {
            if (this.A0A && !this.A09) {
                if (z3) {
                    A00(i4);
                }
                this.A0A = false;
            }
            if (A01(i10)) {
                this.A05 = !this.A09;
                this.A09 = true;
            }
        }
        this.A08 = i10 >= 16 && i10 <= 21;
        this.A07 = this.A08 || i10 <= 9;
        if (A0D[6].length() != 30) {
            throw new RuntimeException();
        }
        A0D[6] = "HIa27EP0rmwgvhPEN5RK7GL0DsepbL";
    }

    public final void A05(long j, int i4, boolean z3) {
        if (this.A09 && this.A06) {
            this.A0B = this.A08;
            this.A09 = false;
        } else {
            if (!this.A05 && !this.A06) {
                return;
            }
            if (z3 && this.A0A) {
                A00(i4 + ((int) (j - this.A01)));
            }
            this.A03 = this.A01;
            this.A04 = this.A02;
            this.A0B = this.A08;
            this.A0A = true;
        }
    }

    public final void A06(byte[] bArr, int i4, int i10) {
        if (this.A07) {
            int i11 = (i4 + 2) - this.A00;
            if (i11 < i10) {
                int headerOffset = bArr[i11];
                this.A06 = (headerOffset & 128) != 0;
                this.A07 = false;
                return;
            }
            this.A00 += i10 - i4;
        }
    }
}
