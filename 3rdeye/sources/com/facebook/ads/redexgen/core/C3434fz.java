package com.facebook.ads.redexgen.core;

/* renamed from: com.facebook.ads.redexgen.X.fz, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3434fz extends QT {
    public boolean A00 = false;
    public final /* synthetic */ AbstractC3433fy A01;

    public C3434fz(AbstractC3433fy abstractC3433fy) {
        this.A01 = abstractC3433fy;
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0L(C23196g c23196g, int i) {
        super.A0L(c23196g, i);
        if (i == 0 && this.A00) {
            this.A00 = false;
            this.A01.A0F();
        }
    }

    @Override // com.facebook.ads.redexgen.core.QT
    public final void A0M(C23196g c23196g, int i, int i10) {
        if (i != 0 || i10 != 0) {
            this.A00 = true;
        }
    }
}
