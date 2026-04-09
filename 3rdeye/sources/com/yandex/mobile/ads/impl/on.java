package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class on implements sm0 {
    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        View viewC = uiElements.c();
        TextView textViewF = uiElements.f();
        ImageView imageViewG = uiElements.g();
        if (textViewF == null || textViewF.getVisibility() != 8 || imageViewG == null || imageViewG.getVisibility() != 8 || viewC == null) {
            return;
        }
        viewC.setBackground(null);
    }
}
