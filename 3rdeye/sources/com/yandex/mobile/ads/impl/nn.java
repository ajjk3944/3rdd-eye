package com.yandex.mobile.ads.impl;

import android.widget.ImageView;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class nn implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f30941a;

    /* renamed from: b, reason: collision with root package name */
    private final qo f30942b;

    public nn(ag<?> agVar, qo clickControlConfigurator) {
        kotlin.jvm.internal.l.f(clickControlConfigurator, "clickControlConfigurator");
        this.f30941a = agVar;
        this.f30942b = clickControlConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewE = uiElements.e();
        ImageView imageViewD = uiElements.d();
        if (textViewE != null) {
            ag<?> agVar = this.f30941a;
            Object objD = agVar != null ? agVar.d() : null;
            if (objD instanceof String) {
                textViewE.setVisibility(0);
                textViewE.setText((CharSequence) objD);
            } else {
                textViewE.setVisibility(8);
            }
            this.f30942b.a(textViewE);
        }
        if (imageViewD != null) {
            this.f30942b.a(imageViewD);
        }
    }
}
