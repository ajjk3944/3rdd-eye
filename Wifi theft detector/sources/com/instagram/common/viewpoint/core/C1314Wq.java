package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Wq, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1314Wq extends AbstractRunnableC1301Wc {
    public final /* synthetic */ Wm A00;

    public C1314Wq(Wm wm) {
        this.A00 = wm;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A00.A0C = false;
        if (this.A00.A0B.getQueue().isEmpty()) {
            this.A00.A0B.execute(this.A00.A0A);
        }
    }
}
