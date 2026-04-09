package com.applovin.impl;

import android.webkit.WebView;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final /* synthetic */ class u9 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5839a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ WebView f5840b;

    public /* synthetic */ u9(WebView webView, int i4) {
        this.f5839a = i4;
        this.f5840b = webView;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f5839a) {
            case 0:
                this.f5840b.destroy();
                break;
            default:
                o8.a(this.f5840b);
                break;
        }
    }
}
