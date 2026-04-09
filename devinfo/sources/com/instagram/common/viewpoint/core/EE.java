package com.instagram.common.viewpoint.core;

import android.view.View;

/* loaded from: assets/audience_network/classes2.dex */
public final class EE implements InterfaceC1321er {
    public final View A00;
    public final C1436gi A01;

    public EE(C1436gi c1436gi, View view) {
        this.A01 = c1436gi;
        this.A00 = view;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1321er
    public final double A9V() {
        C1382fq result = C1381fp.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
