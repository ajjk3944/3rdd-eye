package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class jj2 implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    private final int f29170b;

    /* renamed from: c, reason: collision with root package name */
    private final String f29171c;

    /* renamed from: d, reason: collision with root package name */
    private final pg0 f29172d;

    public jj2(int i, String str, pg0 htmlWebViewRenderer) {
        kotlin.jvm.internal.l.f(htmlWebViewRenderer, "htmlWebViewRenderer");
        this.f29170b = i;
        this.f29171c = str;
        this.f29172d = htmlWebViewRenderer;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f29172d.a(this.f29170b, this.f29171c);
    }
}
