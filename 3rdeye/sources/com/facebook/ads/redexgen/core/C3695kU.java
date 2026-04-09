package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kU, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3695kU implements InterfaceC2630Iw {
    public long A00 = -1;
    public long A01 = -1;
    public C2563Gg A02;
    public C2564Gh A03;

    public C3695kU(C2564Gh c2564Gh, C2563Gg c2563Gg) {
        this.A03 = c2564Gh;
        this.A02 = c2563Gg;
    }

    public final void A00(long j4) {
        this.A00 = j4;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    public final InterfaceC2579Gw A5R() {
        C3M.A08(this.A00 != -1);
        return new C3735lK(this.A03, this.A00);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    public final long AGd(InterfaceC3738lN interfaceC3738lN) {
        if (this.A01 < 0) {
            return -1L;
        }
        long result = -(this.A01 + 2);
        this.A01 = -1L;
        return result;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2630Iw
    public final void AJR(long j4) {
        long[] jArr = this.A02.A01;
        this.A01 = jArr[AbstractC22614a.A0L(jArr, j4, true, true)];
    }
}
