package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class tr1 {

    /* renamed from: a, reason: collision with root package name */
    private final a52 f33766a;

    /* renamed from: b, reason: collision with root package name */
    private final d42 f33767b;

    public /* synthetic */ tr1(b52 b52Var) {
        this(b52Var, new d42());
    }

    public final void a(View timerView, long j4, long j10) {
        kotlin.jvm.internal.l.f(timerView, "timerView");
        timerView.setVisibility(0);
        TextView textViewA = this.f33766a.a(timerView);
        if (textViewA != null) {
            this.f33767b.getClass();
            d42.a(textViewA, j4, j10);
        }
    }

    public tr1(b52 timerViewProvider, d42 textDelayViewController) {
        kotlin.jvm.internal.l.f(timerViewProvider, "timerViewProvider");
        kotlin.jvm.internal.l.f(textDelayViewController, "textDelayViewController");
        this.f33766a = timerViewProvider;
        this.f33767b = textDelayViewController;
    }
}
