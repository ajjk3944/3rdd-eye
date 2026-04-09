package com.applovin.impl;

import android.webkit.WebView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class w9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f5965b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f5966c;

    public /* synthetic */ w9(WebView webView, String str, int i4) {
        this.f5964a = i4;
        this.f5965b = webView;
        this.f5966c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5964a) {
            case 0:
                this.f5965b.loadUrl(this.f5966c);
                break;
            default:
                this.f5965b.evaluateJavascript(this.f5966c, null);
                break;
        }
    }
}
