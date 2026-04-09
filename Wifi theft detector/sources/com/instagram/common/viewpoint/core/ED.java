package com.instagram.common.viewpoint.core;

import android.util.AttributeSet;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public abstract class ED extends RelativeLayout implements InterfaceC1702eu {
    public C0851Ek A00;

    public ED(C1814gi c1814gi) {
        super(c1814gi);
    }

    public ED(C1814gi c1814gi, AttributeSet attributeSet, int i10) {
        super(c1814gi, attributeSet, i10);
        RelativeLayout.LayoutParams params = new RelativeLayout.LayoutParams(-1, -1);
        setLayoutParams(params);
    }

    public void A07() {
    }

    public void A08() {
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1702eu
    public final void AAv(C0851Ek c0851Ek) {
        this.A00 = c0851Ek;
        A07();
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1702eu
    public final void AKV(C0851Ek c0851Ek) {
        A08();
        this.A00 = null;
    }

    public C0851Ek getVideoView() {
        return this.A00;
    }
}
