package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;

/* loaded from: classes3.dex */
public final class jn {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f29219a;

    /* renamed from: b, reason: collision with root package name */
    private final sd<TextView> f29220b;

    public /* synthetic */ jn(Context context) {
        this(context, new Handler(Looper.getMainLooper()), ln.a(context));
    }

    public final void a() {
        this.f29219a.removeCallbacksAndMessages(null);
        this.f29220b.cancel();
    }

    public final void a(TextView callToActionView) {
        kotlin.jvm.internal.l.f(callToActionView, "callToActionView");
        this.f29219a.postDelayed(new c22(callToActionView, this.f29220b), 2000L);
    }

    public jn(Context context, Handler handler, sd<TextView> callToActionAnimator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(callToActionAnimator, "callToActionAnimator");
        this.f29219a = handler;
        this.f29220b = callToActionAnimator;
    }
}
