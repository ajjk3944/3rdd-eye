package com.instagram.common.viewpoint.core;

import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

/* loaded from: assets/audience_network/classes2.dex */
public final class F9 extends C1509bl {
    public final ImageView A00;
    public final C1814gi A01;

    public F9(C1814gi c1814gi) {
        super(c1814gi);
        this.A01 = c1814gi;
        setRadius(30);
        this.A00 = new ImageView(c1814gi);
        this.A00.setAdjustViewBounds(true);
        addView(this.A00, new RelativeLayout.LayoutParams(-2, -1));
    }

    public final /* synthetic */ void A00(C1469b7 c1469b7) {
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        layoutParams.width = -2;
        ViewGroup viewGroup = (ViewGroup) getParent();
        if (viewGroup != null) {
            viewGroup.updateViewLayout(this, layoutParams);
        }
    }

    public void setUrl(String str) {
        LM lm = new LM(this.A00, this.A01);
        lm.A04();
        lm.A07(str);
        lm.A06(new InterfaceC1470b8() { // from class: com.facebook.ads.redexgen.X.FA
            @Override // com.instagram.common.viewpoint.core.InterfaceC1470b8
            public final void AE7(C1469b7 c1469b7) {
                this.A00.A00(c1469b7);
            }
        });
    }
}
