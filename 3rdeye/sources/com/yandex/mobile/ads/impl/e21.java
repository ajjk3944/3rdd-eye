package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n21;

/* loaded from: classes3.dex */
public final class e21 extends n21 implements ad0 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e21(jd0 parentHtmlWebView, bd0 htmlWebViewListener, fd0 mobileAdsSchemeRewardListener, rc0 onCloseButtonListener, fd0 impressionListener, n21.a htmlWebViewMraidListener, c21 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(mobileAdsSchemeRewardListener, "mobileAdsSchemeRewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        kotlin.jvm.internal.l.f(mraidController, "mraidController");
        mraidController.a(onCloseButtonListener);
        mraidController.a((i11) mobileAdsSchemeRewardListener);
        mraidController.a((h11) impressionListener);
    }

    @Override // com.yandex.mobile.ads.impl.ad0
    public final void a() {
        b().b();
    }
}
