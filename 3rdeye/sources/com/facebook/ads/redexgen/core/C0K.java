package com.facebook.ads.redexgen.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.0K, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C0K extends C21660h {
    public C23055s A00;
    public List<C3239cn> A01;

    public C0K(C3272dL c3272dL) {
        super(c3272dL);
        this.A00 = new C23055s(this, 1, null, null, null);
    }

    public final void A20(C3345eX c3345eX) {
        if (this.A00 != null) {
            this.A00.A0c(c3345eX);
        }
    }

    public C23055s getCarouselCardBehaviorHelper() {
        return this.A00;
    }

    public void setCardsInfo(ArrayList arrayList) {
        this.A01 = arrayList;
        this.A00.A0d(this.A01);
    }
}
