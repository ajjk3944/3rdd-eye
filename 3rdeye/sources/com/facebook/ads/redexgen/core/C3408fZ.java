package com.facebook.ads.redexgen.core;

import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: com.facebook.ads.redexgen.X.fZ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C3408fZ implements RQ {
    public final /* synthetic */ ImageView A00;
    public final /* synthetic */ RS A01;
    public final /* synthetic */ C2815Qc A02;

    public C3408fZ(RS rs, ImageView imageView, C2815Qc c2815Qc) {
        this.A01 = rs;
        this.A00 = imageView;
        this.A02 = c2815Qc;
    }

    @Override // com.facebook.ads.redexgen.core.RQ
    public final void ADU(Drawable drawable) {
        C2815Qc.A0f(drawable, this.A00);
        this.A02.A1K(drawable);
    }
}
