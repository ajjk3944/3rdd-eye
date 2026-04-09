package com.yandex.mobile.ads.impl;

import android.webkit.WebView;

/* loaded from: classes3.dex */
final class io2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ WebView f28768b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f28769c;

    public io2(WebView webView, String str) {
        this.f28768b = webView;
        this.f28769c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f28768b.loadUrl(this.f28769c);
    }
}
