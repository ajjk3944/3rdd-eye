package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network.dex */
public class J3 implements InterfaceC3056Zo {
    public final /* synthetic */ C2626Is A00;

    public J3(C2626Is c2626Is) {
        this.A00 = c2626Is;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC3056Zo
    public final void ADT(C3055Zn c3055Zn) {
        if (this.A00.A02 != null && c3055Zn.A00() != null) {
            this.A00.A02.setImageBitmap(c3055Zn.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
