package com.yandex.mobile.ads.impl;

import java.lang.ref.WeakReference;
import java.util.Map;

/* loaded from: classes3.dex */
public class n21 extends fk {

    /* renamed from: b, reason: collision with root package name */
    private final c21 f30743b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n21(sf1 parentHtmlWebView, og0 htmlWebViewListener, a htmlWebViewMraidListener, c21 mraidController) {
        super(parentHtmlWebView);
        kotlin.jvm.internal.l.f(parentHtmlWebView, "parentHtmlWebView");
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        kotlin.jvm.internal.l.f(htmlWebViewMraidListener, "htmlWebViewMraidListener");
        kotlin.jvm.internal.l.f(mraidController, "mraidController");
        this.f30743b = mraidController;
        mraidController.a(htmlWebViewMraidListener);
    }

    @Override // com.yandex.mobile.ads.impl.fk, com.yandex.mobile.ads.impl.ig0
    public final void a(String htmlResponse) {
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        this.f30743b.a(htmlResponse);
    }

    public final c21 b() {
        return this.f30743b;
    }

    @Override // com.yandex.mobile.ads.impl.fk, com.yandex.mobile.ads.impl.ig0
    public final void invalidate() {
        super.invalidate();
        this.f30743b.a();
    }

    public static final class a implements k21 {

        /* renamed from: a, reason: collision with root package name */
        private final WeakReference<og0> f30744a;

        public /* synthetic */ a(og0 og0Var) {
            this(og0Var, new WeakReference(og0Var));
        }

        @Override // com.yandex.mobile.ads.impl.k21
        public final void a(sf1 webView, Map trackingParameters) {
            kotlin.jvm.internal.l.f(webView, "webView");
            kotlin.jvm.internal.l.f(trackingParameters, "trackingParameters");
            og0 og0Var = this.f30744a.get();
            if (og0Var != null) {
                og0Var.a(webView, trackingParameters);
            }
        }

        public a(og0 htmlWebViewListener, WeakReference<og0> htmlWebViewListenerRef) {
            kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
            kotlin.jvm.internal.l.f(htmlWebViewListenerRef, "htmlWebViewListenerRef");
            this.f30744a = htmlWebViewListenerRef;
        }

        @Override // com.yandex.mobile.ads.impl.k21
        public final void a(String url) {
            kotlin.jvm.internal.l.f(url, "url");
            og0 og0Var = this.f30744a.get();
            if (og0Var != null) {
                og0Var.a(url);
            }
        }

        @Override // com.yandex.mobile.ads.impl.k21
        public final void a() {
            og0 og0Var = this.f30744a.get();
            if (og0Var != null) {
                og0Var.a();
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.fk
    public final void a(og0 htmlWebViewListener) {
        kotlin.jvm.internal.l.f(htmlWebViewListener, "htmlWebViewListener");
        super.a(new h21(this.f30743b, htmlWebViewListener));
    }
}
