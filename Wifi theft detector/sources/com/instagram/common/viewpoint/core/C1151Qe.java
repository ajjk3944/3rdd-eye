package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Qe, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1151Qe extends AbstractRunnableC1301Wc {
    public final /* synthetic */ XO A00;

    public C1151Qe(XO xo) {
        this.A00 = xo;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        if (!this.A00.A05()) {
            return;
        }
        this.A00.A02();
        this.A00.A05.postDelayed(this, this.A00.A02);
    }
}
