package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.Ep, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0856Ep extends AbstractRunnableC1301Wc {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C0851Ek A02;

    public C0856Ep(C0851Ek c0851Ek, int i10, int i11) {
        this.A02 = c0851Ek;
        this.A00 = i10;
        this.A01 = i11;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC1301Wc
    public final void A07() {
        this.A02.A0C.A02(new C0839Dy(this.A00, this.A01));
    }
}
