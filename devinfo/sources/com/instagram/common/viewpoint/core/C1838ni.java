package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.ni, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C1838ni implements InterfaceC0488Ez {
    public long A00;
    public long A01;
    public C1838ni A02;
    public C0487Ey A03;

    public C1838ni(long j, int i4) {
        A02(j, i4);
    }

    public final int A00(long j) {
        return ((int) (j - this.A01)) + this.A03.A00;
    }

    public final C1838ni A01() {
        this.A03 = null;
        C1838ni c1838ni = this.A02;
        this.A02 = null;
        return c1838ni;
    }

    public final void A02(long j, int i4) {
        AbstractC02203y.A08(this.A03 == null);
        this.A01 = j;
        this.A00 = i4 + j;
    }

    public final void A03(C0487Ey c0487Ey, C1838ni c1838ni) {
        this.A03 = c0487Ey;
        this.A02 = c1838ni;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0488Ez
    public final C0487Ey A6u() {
        return (C0487Ey) AbstractC02203y.A01(this.A03);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0488Ez
    public final C1838ni ACc() {
        if (this.A02 == null || this.A02.A03 == null) {
            return null;
        }
        return this.A02;
    }
}
