package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n21;

/* loaded from: classes3.dex */
public final class l21 extends n21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l21(m21 parentHtmlWebView, og0 htmlWebViewListener, de2 videoLifecycleListener, d21 impressionListener, d21 rewardListener, d21 onCloseButtonListener, n21.a htmlWebViewMraidListener, c21 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(rewardListener, "rewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        kotlin.jvm.internal.l.f(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        kotlin.jvm.internal.l.f(mraidController, "mraidController");
        mraidController.a(videoLifecycleListener);
        mraidController.a((h11) impressionListener);
        mraidController.a((i11) rewardListener);
        mraidController.a((te1) onCloseButtonListener);
    }
}
