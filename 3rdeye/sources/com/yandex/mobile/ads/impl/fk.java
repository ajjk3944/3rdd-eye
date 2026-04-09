package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public class fk implements ig0 {

    /* renamed from: a, reason: collision with root package name */
    private final sf1 f27355a;

    public fk(sf1 parentHtmlWebView) {
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        this.f27355a = parentHtmlWebView;
        parentHtmlWebView.setId(2);
    }

    @Override // com.yandex.mobile.ads.impl.ig0
    public void a(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        this.f27355a.b(htmlResponse);
    }

    @Override // com.yandex.mobile.ads.impl.ig0
    public void invalidate() {
        this.f27355a.d();
    }

    public void a(og0 htmlWebViewListener) {
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        this.f27355a.setHtmlWebViewListener(htmlWebViewListener);
    }
}
