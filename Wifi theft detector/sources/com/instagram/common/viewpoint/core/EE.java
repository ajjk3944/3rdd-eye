package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1699er {
    public final View A00;
    public final C1814gi A01;

    public EE(C1814gi c1814gi, View view) {
        this.A01 = c1814gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1699er
    public final double A9V() {
        C1760fq result = C1759fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
