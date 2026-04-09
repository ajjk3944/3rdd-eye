package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.jS, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3631jS implements InterfaceC2579Gw {
    public final int A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final C2671Kl A04;

    public C3631jS(C2671Kl c2671Kl, int i, long j4, long j10) {
        this.A04 = c2671Kl;
        this.A00 = i;
        this.A03 = j4;
        this.A01 = (j10 - j4) / c2671Kl.A02;
        this.A02 = A00(this.A01);
    }

    private long A00(long j4) {
        return AbstractC22614a.A0U(j4 * this.A00, 1000000L, this.A04.A04);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A02;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        long jA0T = AbstractC22614a.A0T((this.A04.A04 * j4) / (this.A00 * 1000000), 0L, this.A01 - 1);
        long j10 = this.A03 + (this.A04.A02 * jA0T);
        long jA00 = A00(jA0T);
        C2580Gx c2580Gx = new C2580Gx(jA00, j10);
        if (jA00 >= j4 || jA0T == this.A01 - 1) {
            return new C2578Gv(c2580Gx);
        }
        long j11 = 1 + jA0T;
        return new C2578Gv(c2580Gx, new C2580Gx(A00(j11), this.A03 + (this.A04.A02 * j11)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
