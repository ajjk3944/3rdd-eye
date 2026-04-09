package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.lV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3745lV implements InterfaceC2579Gw {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final GL A06;

    public C3745lV(GL gl, long j4, long j10, long j11, long j12, long j13, long j14) {
        this.A06 = gl;
        this.A03 = j4;
        this.A05 = j10;
        this.A02 = j11;
        this.A04 = j12;
        this.A01 = j13;
        this.A00 = j14;
    }

    public final long A05(long j4) {
        return this.A06.AJf(j4);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final long A7l() {
        return this.A03;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final C2578Gv A8t(long j4) {
        return new C2578Gv(new C2580Gx(j4, GK.A05(this.A06.AJf(j4), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC2579Gw
    public final boolean AAa() {
        return true;
    }
}
