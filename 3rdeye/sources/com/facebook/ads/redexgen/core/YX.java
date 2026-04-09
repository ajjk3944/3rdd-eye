package com.facebook.ads.redexgen.core;

import android.view.View;
import android.view.ViewGroup;
import javax.annotation.Nullable;

/* loaded from: assets/audience_network.dex */
public final class YX extends View {

    @Nullable
    public YW A00;

    public YX(C3272dL c3272dL, YW yw) {
        super(c3272dL);
        this.A00 = yw;
        setLayoutParams(new ViewGroup.LayoutParams(0, 0));
    }

    @Override // android.view.View
    public final void onWindowVisibilityChanged(int i) {
        YW yw = this.A00;
    }
}
