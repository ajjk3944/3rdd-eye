package com.yandex.mobile.ads.impl;

import android.app.Dialog;

/* loaded from: classes3.dex */
public final class lb {

    /* renamed from: a, reason: collision with root package name */
    private final Dialog f29960a;

    /* renamed from: b, reason: collision with root package name */
    private final ob f29961b;

    public final class a implements qb {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.qb
        public final void a() {
            i10.a(lb.this.f29960a);
        }
    }

    public lb(Dialog dialog, ob adtuneOptOutWebView) {
        kotlin.jvm.internal.l.f(dialog, "dialog");
        kotlin.jvm.internal.l.f(adtuneOptOutWebView, "adtuneOptOutWebView");
        this.f29960a = dialog;
        this.f29961b = adtuneOptOutWebView;
    }

    public final void a(String url) {
        kotlin.jvm.internal.l.f(url, "url");
        this.f29961b.setAdtuneWebViewListener(new a());
        this.f29961b.loadUrl(url);
        this.f29960a.show();
    }
}
