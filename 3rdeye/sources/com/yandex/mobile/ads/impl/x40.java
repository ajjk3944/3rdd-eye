package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class x40 implements zb {
    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewP = uiElements.p();
        if (textViewP != null) {
            textViewP.setVisibility(8);
        }
        ImageView imageViewO = uiElements.o();
        if (imageViewO == null) {
            return;
        }
        imageViewO.setVisibility(8);
    }
}
