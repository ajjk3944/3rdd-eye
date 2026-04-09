package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.n0, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1794n0 implements HY {
    public final long A00;
    public final long A01;
    public final long A02;
    public final long A03;
    public final long A04;
    public final long A05;
    public final InterfaceC0537Gx A06;

    public C1794n0(InterfaceC0537Gx interfaceC0537Gx, long j, long j8, long j9, long j10, long j11, long j12) {
        this.A06 = interfaceC0537Gx;
        this.A03 = j;
        this.A05 = j8;
        this.A02 = j9;
        this.A04 = j10;
        this.A01 = j11;
        this.A00 = j12;
    }

    public final long A05(long j) {
        return this.A06.AKQ(j);
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final long A7t() {
        return this.A03;
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final HX A91(long j) {
        return new HX(new HZ(j, C0536Gw.A05(this.A06.AKQ(j), this.A05, this.A02, this.A04, this.A01, this.A00)));
    }

    @Override // com.instagram.common.viewpoint.core.HY
    public final boolean AAj() {
        return true;
    }
}
