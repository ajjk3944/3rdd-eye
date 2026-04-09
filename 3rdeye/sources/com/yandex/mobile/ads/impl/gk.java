package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.vt1;

/* loaded from: classes3.dex */
public final class gk implements jg0 {
    @Override // com.yandex.mobile.ads.impl.jg0
    public final ig0 a(jj parentHtmlWebView, vt1.b htmlWebViewListener, ie2 videoLifecycleListener, ck0 impressionListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        fk fkVar = new fk(parentHtmlWebView);
        fkVar.a(htmlWebViewListener);
        return fkVar;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final ad0 a(jd0 parentHtmlWebView, bd0 htmlWebViewListener, fd0 rewardListener, rc0 onCloseButtonListener, fd0 impressionListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(rewardListener, "rewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        ek ekVar = new ek(parentHtmlWebView);
        ekVar.a(htmlWebViewListener);
        return ekVar;
    }

    @Override // com.yandex.mobile.ads.impl.jg0
    public final ig0 a(m21 parentHtmlWebView, og0 htmlWebViewListener, de2 videoLifecycleListener, d21 impressionListener, d21 rewardListener, d21 onCloseButtonListener) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        kotlin.jvm.internal.l.f(impressionListener, "impressionListener");
        kotlin.jvm.internal.l.f(rewardListener, "rewardListener");
        kotlin.jvm.internal.l.f(onCloseButtonListener, "onCloseButtonListener");
        fk fkVar = new fk(parentHtmlWebView);
        fkVar.a(htmlWebViewListener);
        return fkVar;
    }
}
