package com.yandex.mobile.ads.impl;

import android.widget.TextView;
import com.monetization.ads.fullscreen.template.view.ExtendedTextView;

/* loaded from: classes3.dex */
public final class xi2 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f35323a;

    /* renamed from: b, reason: collision with root package name */
    private final eg f35324b;

    public xi2(ag<?> agVar, eg assetClickConfigurator) {
        kotlin.jvm.internal.l.f(assetClickConfigurator, "assetClickConfigurator");
        this.f35323a = agVar;
        this.f35324b = assetClickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewS = uiElements.s();
        ag<?> agVar = this.f35323a;
        Object objD = agVar != null ? agVar.d() : null;
        if (!(textViewS instanceof ExtendedTextView) || !(objD instanceof String)) {
            if (textViewS == null) {
                return;
            }
            textViewS.setVisibility(8);
            return;
        }
        eb0 eb0Var = new eb0(uiElements.a());
        ExtendedTextView extendedTextView = (ExtendedTextView) textViewS;
        extendedTextView.setText((CharSequence) objD);
        extendedTextView.setVisibility(0);
        extendedTextView.setAutoSizeTextType(1);
        extendedTextView.setMeasureSpecProvider(eb0Var);
        this.f35324b.a(textViewS, this.f35323a);
    }
}
