package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Es, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0481Es extends AbstractRunnableC0923Wc {
    public final /* synthetic */ C0473Ek A00;

    public C0481Es(C0473Ek c0473Ek) {
        this.A00 = c0473Ek;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        if (!this.A00.A04) {
            UM um = this.A00.A0C;
            final int currentPositionInMillis = this.A00.getCurrentPositionInMillis();
            um.A02(new EB(currentPositionInMillis) { // from class: com.facebook.ads.redexgen.X.4A
            });
            this.A00.A08.postDelayed(this, this.A00.A01);
        }
    }
}
