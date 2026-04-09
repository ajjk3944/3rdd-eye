package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1324eu {
    public C0473Ek A00;

    public ED(C1436gi c1436gi) {
        super(c1436gi);
    }

    public ED(C1436gi c1436gi, AttributeSet attributeSet, int i4) {
        super(c1436gi, attributeSet, i4);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1324eu
    public final void AAv(C0473Ek c0473Ek) {
        this.A00 = c0473Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1324eu
    public final void AKV(C0473Ek c0473Ek) {
        A08();
        this.A00 = null;
    }

    public C0473Ek getVideoView() {
        return this.A00;
    }
}
