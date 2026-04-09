package com.instagram.common.viewpoint.core;

import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Qx, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0791Qx {
    public int A00;
    public int A01;
    public int A02;
    public int A03;

    private final C0791Qx A00(RK rk2, int i4) {
        View view = rk2.A0H;
        this.A01 = view.getLeft();
        this.A03 = view.getTop();
        this.A02 = view.getRight();
        this.A00 = view.getBottom();
        return this;
    }

    public final C0791Qx A01(RK rk2) {
        return A00(rk2, 0);
    }
}
