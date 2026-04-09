package com.facebook.ads.redexgen.core;

import android.widget.ImageView;
import android.widget.LinearLayout;

/* loaded from: assets/audience_network.dex */
public final class YG extends LinearLayout {
    public static final int A03 = (int) (AbstractC2975Wl.A02 * 10.0f);
    public static final int A04 = (int) (AbstractC2975Wl.A02 * 24.0f);
    public final ImageView A00;
    public final O2 A01;
    public final C3272dL A02;

    public YG(C3272dL c3272dL) {
        super(c3272dL);
        this.A02 = c3272dL;
        this.A01 = O3.A00(c3272dL.A02());
        this.A00 = new ImageView(c3272dL);
        A02();
    }

    private void A02() {
        A03(this.A00, XX.REDESIGN_INFO_ICON);
        setPadding(A03, A03 / 3, A03, A03 / 3);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(A04, A04);
        layoutParams.gravity = 16;
        addView(this.A00, layoutParams);
    }

    public static void A03(ImageView imageView, XX xx) {
        imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
        imageView.setImageBitmap(XY.A01(xx));
        imageView.setColorFilter(-1);
    }

    public void setAdDetails(N9 n9, String str, C2915Ua c2915Ua, InterfaceC3003Xn interfaceC3003Xn) {
        setOnClickListener(new YF(this, c2915Ua, interfaceC3003Xn, str, n9));
    }

    public void setIconColors(int i) {
        this.A00.setColorFilter(i);
    }
}
