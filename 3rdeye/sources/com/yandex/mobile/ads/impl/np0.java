package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class np0 implements ft {

    /* renamed from: a, reason: collision with root package name */
    private final hp0 f30967a;

    /* renamed from: b, reason: collision with root package name */
    private final lm1 f30968b;

    /* renamed from: c, reason: collision with root package name */
    private final zs0 f30969c;

    /* renamed from: d, reason: collision with root package name */
    private final vs0 f30970d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f30971e;

    public np0(Context context, hp0 interstitialAdContentController, lm1 proxyInterstitialAdShowListener, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(interstitialAdContentController, "interstitialAdContentController");
        kotlin.jvm.internal.l.f(proxyInterstitialAdShowListener, "proxyInterstitialAdShowListener");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f30967a = interstitialAdContentController;
        this.f30968b = proxyInterstitialAdShowListener;
        this.f30969c = mainThreadUsageValidator;
        this.f30970d = mainThreadExecutor;
        this.f30971e = new AtomicBoolean(false);
        interstitialAdContentController.a(proxyInterstitialAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.ft
    public final void a(am2 am2Var) {
        this.f30969c.a();
        this.f30968b.a(am2Var);
    }

    @Override // com.yandex.mobile.ads.impl.ft
    public final ms getInfo() {
        return this.f30967a.n();
    }

    @Override // com.yandex.mobile.ads.impl.ft
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f30969c.a();
        this.f30970d.a(new L(9, this, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(np0 this$0, Activity activity) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(activity, "$activity");
        if (!this$0.f30971e.getAndSet(true)) {
            Throwable thA = b9.m.a(this$0.f30967a.a(activity));
            if (thA != null) {
                this$0.f30968b.a(new c6(String.valueOf(thA.getMessage())));
                return;
            }
            return;
        }
        this$0.f30968b.a(d6.b());
    }
}
