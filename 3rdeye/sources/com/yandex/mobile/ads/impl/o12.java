package com.yandex.mobile.ads.impl;

import android.text.TextUtils;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class o12 implements sm0 {

    /* renamed from: a, reason: collision with root package name */
    private final ag<?> f31134a;

    /* renamed from: b, reason: collision with root package name */
    private final i9 f31135b;

    /* renamed from: c, reason: collision with root package name */
    private final eg f31136c;

    /* renamed from: d, reason: collision with root package name */
    private final p12 f31137d;

    public o12(ag<?> agVar, i9 i9Var, eg clickConfigurator, p12 sponsoredTextFormatter) {
        kotlin.jvm.internal.l.f(clickConfigurator, "clickConfigurator");
        kotlin.jvm.internal.l.f(sponsoredTextFormatter, "sponsoredTextFormatter");
        this.f31134a = agVar;
        this.f31135b = i9Var;
        this.f31136c = clickConfigurator;
        this.f31137d = sponsoredTextFormatter;
    }

    @Override // com.yandex.mobile.ads.impl.sm0
    public final void a(bb2 uiElements) {
        kotlin.jvm.internal.l.f(uiElements, "uiElements");
        TextView textViewP = uiElements.p();
        if (textViewP != null) {
            ag<?> agVar = this.f31134a;
            Object objD = agVar != null ? agVar.d() : null;
            if (objD instanceof String) {
                textViewP.setText((CharSequence) objD);
                textViewP.setVisibility(0);
            }
            i9 i9Var = this.f31135b;
            if (i9Var != null && i9Var.b()) {
                textViewP.setText(this.f31137d.a(textViewP.getText().toString(), this.f31135b));
                textViewP.setVisibility(0);
                textViewP.setSelected(true);
                textViewP.setEllipsize(TextUtils.TruncateAt.MARQUEE);
                textViewP.setMarqueeRepeatLimit(-1);
            }
            this.f31136c.a(textViewP, this.f31134a);
        }
    }
}
