package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0478Ep extends AbstractRunnableC0923Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0473Ek A02;

    public C0478Ep(C0473Ek c0473Ek, int i4, int i10) {
        this.A02 = c0473Ek;
        this.A00 = i4;
        this.A01 = i10;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A02.A0C.A02(new C0461Dy(this.A00, this.A01));
    }
}
