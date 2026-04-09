package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n21;
import com.yandex.mobile.ads.impl.vt1;

/* loaded from: classes3.dex */
public final class g21 implements jg0 {
    @Override // com.yandex.mobile.ads.impl.jg0
    public final ig0 a(jj parentHtmlWebView, vt1.b htmlWebViewListener, ie2 videoLifecycleListener, ck0 impressionListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        f21 f21Var = new f21(parentHtmlWebView, htmlWebViewListener, videoLifecycleListener, impressionListener, new n21.a(htmlWebViewListener), new c21(parentHtmlWebView));
        f21Var.a(htmlWebViewListener);
        return f21Var;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final ad0 a(jd0 parentHtmlWebView, bd0 htmlWebViewListener, fd0 rewardListener, rc0 onCloseButtonListener, fd0 impressionListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(rewardListener, "rewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        e21 e21Var = new e21(parentHtmlWebView, htmlWebViewListener, rewardListener, onCloseButtonListener, impressionListener, new n21.a(htmlWebViewListener), new c21(parentHtmlWebView));
        e21Var.a(htmlWebViewListener);
        return e21Var;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final ig0 a(m21 parentHtmlWebView, og0 htmlWebViewListener, de2 videoLifecycleListener, d21 impressionListener, d21 rewardListener, d21 onCloseButtonListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(rewardListener, "rewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        l21 l21Var = new l21(parentHtmlWebView, htmlWebViewListener, videoLifecycleListener, impressionListener, rewardListener, onCloseButtonListener, new n21.a(htmlWebViewListener), new c21(parentHtmlWebView));
        l21Var.a(htmlWebViewListener);
        return l21Var;
    }
}
