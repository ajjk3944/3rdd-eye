package com.yandex.mobile.ads.impl;

import android.view.View;

/* loaded from: classes3.dex */
public final class kp implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final rc0 f29749a;

    /* renamed from: b, reason: collision with root package name */
    private final ad0 f29750b;

    /* renamed from: c, reason: collision with root package name */
    private final yv f29751c;

    public kp(rc0 fullScreenCloseButtonListener, ad0 fullScreenHtmlWebViewAdapter, yv debugEventsReporter) {
        kotlin.jvm.internal.l.f(fullScreenCloseButtonListener, "fullScreenCloseButtonListener");
        kotlin.jvm.internal.l.f(fullScreenHtmlWebViewAdapter, "fullScreenHtmlWebViewAdapter");
        kotlin.jvm.internal.l.f(debugEventsReporter, "debugEventsReporter");
        this.f29749a = fullScreenCloseButtonListener;
        this.f29750b = fullScreenHtmlWebViewAdapter;
        this.f29751c = debugEventsReporter;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        this.f29750b.a();
        this.f29749a.c();
        this.f29751c.a(xv.f35431c);
    }
}
