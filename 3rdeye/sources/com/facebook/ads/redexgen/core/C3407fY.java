package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.fY, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3407fY extends AbstractRunnableC2959Vt {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C2815Qc A02;

    public C3407fY(RS rs, C2815Qc c2815Qc, Drawable drawable) {
        this.A01 = rs;
        this.A02 = c2815Qc;
        this.A00 = drawable;
    }

    @Override // com.facebook.ads.redexgen.core.AbstractRunnableC2959Vt
    public final void A07() {
        this.A02.A1K(this.A00);
    }
}
