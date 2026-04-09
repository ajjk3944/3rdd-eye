package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Kz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C0642Kz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public final InterfaceC0543Hd A07;

    public C0642Kz(InterfaceC0543Hd interfaceC0543Hd) {
        this.A07 = interfaceC0543Hd;
    }

    public final void A00() {
        this.A05 = false;
        this.A04 = false;
        this.A06 = false;
        this.A00 = -1;
    }

    public final void A01(int i4, long j) {
        this.A00 = i4;
        this.A06 = false;
        boolean z3 = true;
        this.A05 = i4 == 182 || i4 == 179;
        if (i4 != 182) {
            z3 = false;
        }
        this.A04 = z3;
        this.A01 = 0;
        this.A03 = j;
    }

    public final void A02(long j, int i4, boolean z3) {
        if (this.A00 == 182 && z3 && this.A05 && this.A03 != -9223372036854775807L) {
            this.A07.AIu(this.A03, this.A06 ? 1 : 0, (int) (j - this.A02), i4, null);
        }
        if (this.A00 != 179) {
            this.A02 = j;
        }
    }

    public final void A03(byte[] bArr, int i4, int i10) {
        if (this.A04) {
            int i11 = (i4 + 1) - this.A01;
            if (i11 < i10) {
                int headerOffset = bArr[i11];
                this.A06 = ((headerOffset & 192) >> 6) == 0;
                this.A04 = false;
                return;
            }
            this.A01 += i10 - i4;
        }
    }
}
