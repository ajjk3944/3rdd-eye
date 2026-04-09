package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ga, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0892Ga extends AbstractRunnableC1301Wc {
    public final /* synthetic */ C06234x A00;

    public C0892Ga(C06234x c06234x) {
        this.A00 = c06234x;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        if (this.A00.A00 != null) {
            this.A00.A00.A1F();
        }
        this.A00.A09.setToolbarActionMode(this.A00.getCloseButtonStyle());
        this.A00.A09.A0A();
        this.A00.A06.set(true);
    }
}
