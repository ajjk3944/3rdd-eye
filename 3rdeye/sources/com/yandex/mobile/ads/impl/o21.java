package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class o21 extends ig2<m21, ku0> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o21(m21 mraidWebView) {
        super(mraidWebView);
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void a(ag asset, lg2 viewConfigurator, ku0 ku0Var) {
        kotlin.jvm.internal.l.f(asset, "asset");
        kotlin.jvm.internal.l.f(viewConfigurator, "viewConfigurator");
        m21 m21VarB = b();
        if (m21VarB == null) {
            return;
        }
        viewConfigurator.a(m21VarB, asset);
        viewConfigurator.a((ag<?>) asset, new y11(m21VarB));
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final void b(View view, ku0 ku0Var) {
        m21 mraidWebView = (m21) view;
        ku0 media = ku0Var;
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        kotlin.jvm.internal.l.f(media, "media");
        String strB = media.b();
        if (strB != null && strB.length() > 0) {
            mraidWebView.setAspectRatio(media.a());
            mraidWebView.c(strB);
        }
    }

    @Override // com.yandex.mobile.ads.impl.ig2
    public final boolean a(View view, ku0 ku0Var) {
        m21 mraidWebView = (m21) view;
        ku0 media = ku0Var;
        kotlin.jvm.internal.l.f(mraidWebView, "mraidWebView");
        kotlin.jvm.internal.l.f(media, "media");
        return true;
    }
}
