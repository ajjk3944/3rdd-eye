package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.mG, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3791mG implements EN {
    public long A00;
    public long A01;
    public C3791mG A02;
    public EM A03;

    public C3791mG(long j4, int i) {
        A02(j4, i);
    }

    public final int A00(long j4) {
        return ((int) (j4 - this.A01)) + this.A03.A00;
    }

    public final C3791mG A01() {
        this.A03 = null;
        C3791mG c3791mG = this.A02;
        this.A02 = null;
        return c3791mG;
    }

    public final void A02(long j4, int i) {
        C3M.A08(this.A03 == null);
        this.A01 = j4;
        this.A00 = i + j4;
    }

    public final void A03(EM em, C3791mG c3791mG) {
        this.A03 = em;
        this.A02 = c3791mG;
    }

    @Override // com.facebook.ads.redexgen.core.EN
    public final EM A6m() {
        return (EM) C3M.A01(this.A03);
    }

    @Override // com.facebook.ads.redexgen.core.EN
    public final C3791mG AC3() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
