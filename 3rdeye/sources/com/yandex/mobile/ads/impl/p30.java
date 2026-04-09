package com.yandex.mobile.ads.impl;

import android.widget.TextView;

/* loaded from: classes3.dex */
public final class p30 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f31579a;

    /* renamed from: b, reason: collision with root package name */
    private final eg f31580b;

    public p30(ag<?> agVar, eg clickConfigurator) {
        kotlin.jvm.internal.l.f(clickConfigurator, "clickConfigurator");
        this.f31579a = agVar;
        this.f31580b = clickConfigurator;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewF = uiElements.f();
        ag<?> agVar = this.f31579a;
        Object objD = agVar != null ? agVar.d() : null;
        if (textViewF != null) {
            if (!(objD instanceof String)) {
                textViewF.setVisibility(8);
                return;
            }
            textViewF.setText((CharSequence) objD);
            textViewF.setVisibility(0);
            this.f31580b.a(textViewF, this.f31579a);
        }
    }
}
