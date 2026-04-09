package com.instagram.common.viewpoint.core;

import android.widget.ImageView;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.Hc, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C0542Hc implements InterfaceC1092b8 {
    public final /* synthetic */ AnonymousClass55 A00;

    public C0542Hc(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC1092b8
    public final void AE7(C1091b7 c1091b7) {
        if (this.A00.A02 != null && c1091b7.A00() != null) {
            this.A00.A02.setImageBitmap(c1091b7.A00());
            this.A00.A02.setScaleType(ImageView.ScaleType.CENTER_CROP);
            this.A00.A02.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        }
    }
}
