package com.facebook.ads.redexgen.core;

/* loaded from: assets/audience_network.dex */
public final class KN {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final H1 A07;

    public KN(H1 h12) {
        this.A07 = h12;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i, long j4) {
        this.A00 = i;
        this.A06 = false;
        boolean z10 = true;
        this.A05 = i == 182 || i == 179;
        if (i != 182) {
            z10 = false;
        }
        this.A04 = z10;
        this.A01 = 0;
        this.A03 = j4;
    }

    public final void A02(long j4, int i, boolean z10) {
        if (this.A00 == 182 && z10 && this.A05 && this.A03 != -9223372036854775807L) {
            this.A07.AIA(this.A03, this.A06 ? 1 : 0, (int) (j4 - this.A02), i, null);
        }
        if (this.A00 != 179) {
            this.A02 = j4;
        }
    }

    public final void A03(byte[] bArr, int i, int i10) {
        if (this.A04) {
            int i11 = (i + 1) - this.A01;
            if (i11 < i10) {
                int headerOffset = bArr[i11];
                this.A06 = ((headerOffset & 192) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i10 - i;
        }
    }
}
