package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.kD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1637kD extends AbstractRunnableC0923Wc {
    public final /* synthetic */ N8 A00;

    public C1637kD(N8 n8) {
        this.A00 = n8;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A00.A07();
        this.A00.A02.A06();
        this.A00.A05.countDown();
    }
}
