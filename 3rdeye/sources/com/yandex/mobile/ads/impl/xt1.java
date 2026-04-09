package com.yandex.mobile.ads.impl;

import android.view.ViewTreeObserver;

/* loaded from: classes3.dex */
public final class xt1 implements ViewTreeObserver.OnPreDrawListener {

    /* renamed from: a, reason: collision with root package name */
    private final qi f35423a;

    /* renamed from: b, reason: collision with root package name */
    private final ws0 f35424b;

    /* renamed from: c, reason: collision with root package name */
    private final a f35425c;

    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        private final ap0 f35426b;

        public a(ap0 adView) {
            kotlin.jvm.internal.l.f(adView, "adView");
            this.f35426b = adView;
        }

        @Override // java.lang.Runnable
        public final void run() {
            mg2.a(this.f35426b, false);
        }
    }

    public xt1(ap0 adView, qi contentController, ws0 mainThreadHandler, a removePreviousBannerRunnable) {
        kotlin.jvm.internal.l.f(adView, "adView");
        kotlin.jvm.internal.l.f(contentController, "contentController");
        kotlin.jvm.internal.l.f(mainThreadHandler, "mainThreadHandler");
        kotlin.jvm.internal.l.f(removePreviousBannerRunnable, "removePreviousBannerRunnable");
        this.f35423a = contentController;
        this.f35424b = mainThreadHandler;
        this.f35425c = removePreviousBannerRunnable;
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public final boolean onPreDraw() {
        fp0.d(new Object[0]);
        this.f35423a.m();
        this.f35424b.a(this.f35425c);
        return true;
    }
}
