package com.instagram.common.viewpoint.core;

/* renamed from: com.facebook.ads.redexgen.X.hD, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1845hD implements XN {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C1844hC A01;

    public C1845hD(C1844hC c1844hC, int i10) {
        this.A01 = c1844hC;
        this.A00 = i10;
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void ADS() {
        this.A01.A0C.A0F().ABa();
    }

    @Override // com.instagram.common.viewpoint.core.XN
    public final void AFV(float f10) {
        float f11 = 1.0f - (f10 / this.A00);
        if (this.A01.A0G != null) {
            this.A01.A0G.setProgressWithAnimation(100.0f * f11);
        }
    }
}
