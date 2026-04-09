package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.view.View;

/* loaded from: classes3.dex */
public final class oa0 implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    private final ak f31322a;

    /* renamed from: b, reason: collision with root package name */
    private final rb f31323b;

    /* renamed from: c, reason: collision with root package name */
    private final m20 f31324c;

    /* renamed from: d, reason: collision with root package name */
    private final zf2 f31325d;

    /* renamed from: e, reason: collision with root package name */
    private final ee2 f31326e;

    public oa0(ak action, rb adtuneRenderer, m20 divKitAdtuneRenderer, zf2 videoTracker, ee2 videoEventUrlsTracker) {
        kotlin.jvm.internal.l.f(action, "action");
        kotlin.jvm.internal.l.f(adtuneRenderer, "adtuneRenderer");
        kotlin.jvm.internal.l.f(divKitAdtuneRenderer, "divKitAdtuneRenderer");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(videoEventUrlsTracker, "videoEventUrlsTracker");
        this.f31322a = action;
        this.f31323b = adtuneRenderer;
        this.f31324c = divKitAdtuneRenderer;
        this.f31325d = videoTracker;
        this.f31326e = videoEventUrlsTracker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View adtune) {
        kotlin.jvm.internal.l.f(adtune, "adtune");
        this.f31325d.a("feedback");
        this.f31326e.a(this.f31322a.b(), null);
        ak akVar = this.f31322a;
        if (akVar instanceof cb) {
            this.f31323b.a(adtune, (cb) akVar);
        } else if (akVar instanceof i20) {
            m20 m20Var = this.f31324c;
            Context context = adtune.getContext();
            kotlin.jvm.internal.l.e(context, "getContext(...)");
            m20Var.a(context, (i20) akVar);
        }
    }
}
