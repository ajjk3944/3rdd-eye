package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3742lS implements InterfaceC2579Gw {
    public final int A00;
    public final int A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final boolean A06;

    public C3742lS(long j4, long j10, int i, int i10, boolean z10) {
        this.A05 = j4;
        this.A04 = j10;
        this.A01 = i10 == -1 ? 1 : i10;
        this.A00 = i;
        this.A06 = z10;
        if (j4 == -1) {
            this.A02 = -1L;
            this.A03 = -9223372036854775807L;
        } else {
            this.A02 = j4 - j10;
            this.A03 = A01(j4, j10, i);
        }
    }

    private long A00(long j4) {
        long positionOffset = this.A01;
        long j10 = ((this.A00 * j4) / 8000000) / positionOffset;
        long positionOffset2 = this.A01;
        long positionOffset3 = j10 * positionOffset2;
        if (this.A02 != -1) {
            positionOffset3 = Math.min(positionOffset3, this.A02 - this.A01);
        }
        long positionOffset4 = Math.max(positionOffset3, 0L);
        long positionOffset5 = this.A04;
        return positionOffset5 + positionOffset4;
    }

    public static long A01(long j4, long j10, int i) {
        return ((Math.max(0L, j4 - j10) * 8) * 1000000) / i;
    }

    public final long A02(long j4) {
        return A01(j4, this.A04, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        if (this.A02 == -1 && !this.A06) {
            return new C2578Gv(new C2580Gx(0L, this.A04));
        }
        long jA00 = A00(j4);
        long jA02 = A02(jA00);
        C2580Gx seekPoint = new C2580Gx(jA02, jA00);
        if (this.A02 == -1 || jA02 >= j4 || this.A01 + jA00 >= this.A05) {
            return new C2578Gv(seekPoint);
        }
        long seekTimeUs = this.A01 + jA00;
        long secondSeekPosition = A02(seekTimeUs);
        return new C2578Gv(seekPoint, new C2580Gx(secondSeekPosition, seekTimeUs));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return this.A02 != -1 || this.A06;
    }
}
