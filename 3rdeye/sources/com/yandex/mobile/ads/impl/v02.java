package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;
import com.yandex.mobile.ads.R;
import z0.C5848a;

/* loaded from: classes3.dex */
public final class v02 implements zb {

    /* renamed from: a, reason: collision with root package name */
    private final w02 f34269a;

    public v02(w02 socialAdInfo) {
        kotlin.jvm.internal.l.f(socialAdInfo, "socialAdInfo");
        this.f34269a = socialAdInfo;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewP = uiElements.p();
        if (textViewP != null) {
            textViewP.setText(R.string.monetization_ads_internal_instream_sponsored_social);
            textViewP.setVisibility(0);
            textViewP.setOnClickListener(new u02(this.f34269a, new l82(new k82())));
        }
        ImageView imageViewO = uiElements.o();
        if (imageViewO != null) {
            imageViewO.setImageDrawable(C5848a.getDrawable(imageViewO.getContext(), R.drawable.monetization_ads_instream_internal_advertiser_social));
            imageViewO.setVisibility(0);
            imageViewO.setOnClickListener(new u02(this.f34269a, new l82(new k82())));
        }
    }
}
