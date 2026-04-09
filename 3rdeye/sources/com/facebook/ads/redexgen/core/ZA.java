package com.facebook.ads.redexgen.core;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.ImageView;

/* loaded from: assets/audience_network.dex */
public final class ZA extends ImageView {
    public ZA(C3272dL c3272dL, View.OnClickListener onClickListener) {
        super(c3272dL);
        Bitmap bitmap = XY.A01(XX.CREDIT_LINE_PILL);
        setImageBitmap(bitmap);
        setOnClickListener(onClickListener);
    }
}
