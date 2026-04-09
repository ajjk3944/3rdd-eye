package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2216ni implements InterfaceC0866Ez {
    public long A00;
    public long A01;
    public C2216ni A02;
    public C0865Ey A03;

    public C2216ni(long j10, int i10) {
        A02(j10, i10);
    }

    public final int A00(long j10) {
        return ((int) (j10 - this.A01)) + this.A03.A00;
    }

    public final C2216ni A01() {
        this.A03 = null;
        C2216ni c2216ni = this.A02;
        this.A02 = null;
        return c2216ni;
    }

    public final void A02(long j10, int i10) {
        AbstractC05983y.A08(this.A03 == null);
        this.A01 = j10;
        this.A00 = i10 + j10;
    }

    public final void A03(C0865Ey c0865Ey, C2216ni c2216ni) {
        this.A03 = c0865Ey;
        this.A02 = c2216ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0866Ez
    public final C0865Ey A6u() {
        return (C0865Ey) AbstractC05983y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0866Ez
    public final C2216ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
