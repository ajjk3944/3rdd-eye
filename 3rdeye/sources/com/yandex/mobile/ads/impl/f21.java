package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n21;
import com.yandex.mobile.ads.impl.vt1;

/* loaded from: classes3.dex */
public final class f21 extends n21 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f21(jj parentHtmlWebView, vt1.b htmlWebViewListener, ie2 videoLifecycleListener, ck0 impressionListener, n21.a htmlWebViewMraidListener, c21 mraidController) {
        super(parentHtmlWebView, htmlWebViewListener, htmlWebViewMraidListener, mraidController);
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        kotlin.jvm.internal.l.f(mraidController, "mraidController");
        mraidController.a(videoLifecycleListener);
        mraidController.a(impressionListener);
    }
}
