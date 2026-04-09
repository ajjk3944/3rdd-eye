package com.instagram.common.viewpoint.core;

import android.graphics.drawable.Drawable;

/* renamed from: com.facebook.ads.redexgen.X.h3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1457h3 extends AbstractRunnableC0923Wc {
    public final /* synthetic */ Drawable A00;
    public final /* synthetic */ SA A01;
    public final /* synthetic */ UK A02;

    public C1457h3(SA sa2, UK uk2, Drawable drawable) {
        this.A01 = sa2;
        this.A02 = uk2;
        this.A00 = drawable;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0923Wc
    public final void A07() {
        this.A02.A1P(this.A00);
    }
}
