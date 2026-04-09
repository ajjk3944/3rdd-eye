package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.kW, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C3697kW implements InterfaceC2579Gw {
    public final /* synthetic */ C3696kV A00;

    public C3697kW(C3696kV c3696kV) {
        this.A00 = c3696kV;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A00.A0B.A05(this.A00.A07);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        long jA06 = this.A00.A0B.A06(j4);
        long j10 = this.A00.A09;
        long j11 = this.A00.A08;
        long targetGranule = this.A00.A09;
        long j12 = (j11 - targetGranule) * jA06;
        long targetGranule2 = this.A00.A07;
        long estimatedPosition = AbstractC22614a.A0T((j10 + (j12 / targetGranule2)) - 30000, this.A00.A09, this.A00.A08 - 1);
        return new C2578Gv(new C2580Gx(j4, estimatedPosition));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
