package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public class K3 implements InterfaceC1470b8 {
    public final /* synthetic */ C0977Ji A00;

    public K3(C0977Ji c0977Ji) {
        this.A00 = c0977Ji;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1470b8
    public final void AE7(C1469b7 c1469b7) {
        if (this.A00.A02 != null && c1469b7.A00() != null) {
            this.A00.A02.setImageBitmap(c1469b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
