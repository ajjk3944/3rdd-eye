package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class vy implements zb {
    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewP = uiElements.p();
        if (textViewP != null) {
            textViewP.setText(R.string.monetization_ads_internal_instream_sponsored_default);
            textViewP.setVisibility(0);
        }
        ImageView imageViewO = uiElements.o();
        if (imageViewO != null) {
            imageViewO.setImageDrawable(C5848a.getDrawable(imageViewO.getContext(), R.drawable.monetization_ads_instream_internal_advertiser));
            imageViewO.setVisibility(0);
        }
    }
}
