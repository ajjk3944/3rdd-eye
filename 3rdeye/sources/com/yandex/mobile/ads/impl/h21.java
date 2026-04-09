package com.yandex.mobile.ads.impl;

import java.util.Map;

/* loaded from: classes3.dex */
public final class h21 implements og0 {

    /* renamed from: a, reason: collision with root package name */
    private final c21 f28083a;

    /* renamed from: b, reason: collision with root package name */
    private final og0 f28084b;

    public h21(c21 mraidController, og0 htmlWebViewListener) {
        kotlin.jvm.internal.l.f(mraidController, "mraidController");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        this.f28083a = mraidController;
        this.f28084b = htmlWebViewListener;
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(C4128i3 adFetchRequestError) {
        kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
        this.f28084b.a(adFetchRequestError);
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(sf1 webView, Map trackingParameters) {
        kotlin.jvm.internal.l.f(webView, "webView");
        kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
        this.f28083a.a(webView, trackingParameters);
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(String url) throws a21 {
        kotlin.jvm.internal.l.f(url, "url");
        this.f28083a.b(url);
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a() {
        this.f28083a.c();
    }

    @Override // com.yandex.mobile.ads.impl.og0
    public final void a(boolean z10) {
        this.f28083a.a(z10);
    }
}
