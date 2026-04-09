package com.facebook.ads.redexgen.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Db, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public final class C2480Db implements InterfaceC3286dZ {
    public final View A00;
    public final C3272dL A01;

    public C2480Db(C3272dL c3272dL, View view) {
        this.A01 = c3272dL;
        this.A00 = view;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3286dZ
    public final double A9N() {
        C3346eY result = C3345eX.A0E(this.A00, 0, this.A01);
        return result.A00();
    }
}
