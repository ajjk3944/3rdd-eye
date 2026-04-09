package com.facebook.ads.redexgen.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Da, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public abstract class AbstractC2479Da extends RelativeLayout implements InterfaceC3289dc {
    public E1 A00;

    public AbstractC2479Da(C3272dL c3272dL) {
        super(c3272dL);
    }

    public AbstractC2479Da(C3272dL c3272dL, AttributeSet attributeSet, int i) {
        super(c3272dL, attributeSet, i);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AAm(E1 e12) {
        this.A00 = e12;
        A07();
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3289dc
    public final void AJk(E1 e12) {
        A08();
        this.A00 = null;
    }

    public E1 getVideoView() {
        return this.A00;
    }
}
