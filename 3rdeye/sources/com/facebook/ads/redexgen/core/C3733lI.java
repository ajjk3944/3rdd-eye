package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lI, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3733lI implements InterfaceC2579Gw {
    public final long A00;
    public final C2578Gv A01;

    public C3733lI(long j4) {
        this(j4, 0L);
    }

    public C3733lI(long j4, long j10) {
        this.A00 = j4;
        this.A01 = new C2578Gv(j10 == 0 ? C2580Gx.A04 : new C2580Gx(0L, j10));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A00;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return false;
    }
}
