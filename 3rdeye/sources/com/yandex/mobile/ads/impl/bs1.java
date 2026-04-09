package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class bs1 implements zt {

    /* renamed from: a, reason: collision with root package name */
    private final vr1 f25379a;

    /* renamed from: b, reason: collision with root package name */
    private final nm1 f25380b;

    /* renamed from: c, reason: collision with root package name */
    private final zs0 f25381c;

    /* renamed from: d, reason: collision with root package name */
    private final vs0 f25382d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f25383e;

    /* renamed from: f, reason: collision with root package name */
    private final ms f25384f;

    public bs1(Context context, vr1 rewardedAdContentController, nm1 proxyRewardedAdShowListener, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(rewardedAdContentController, "rewardedAdContentController");
        kotlin.jvm.internal.l.f(proxyRewardedAdShowListener, "proxyRewardedAdShowListener");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f25379a = rewardedAdContentController;
        this.f25380b = proxyRewardedAdShowListener;
        this.f25381c = mainThreadUsageValidator;
        this.f25382d = mainThreadExecutor;
        this.f25383e = new AtomicBoolean(false);
        this.f25384f = rewardedAdContentController.n();
        rewardedAdContentController.a(proxyRewardedAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void a(pm2 pm2Var) {
        this.f25381c.a();
        this.f25380b.a(pm2Var);
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final ms getInfo() {
        return this.f25384f;
    }

    @Override // com.yandex.mobile.ads.impl.zt
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f25381c.a();
        this.f25382d.a(new RunnableC0615b(20, this, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(bs1 this$0, Activity activity) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(activity, "$activity");
        if (!this$0.f25383e.getAndSet(true)) {
            Throwable thA = b9.m.a(this$0.f25379a.a(activity));
            if (thA != null) {
                this$0.f25380b.a(new c6(String.valueOf(thA.getMessage())));
                return;
            }
            return;
        }
        this$0.f25380b.a(d6.b());
    }
}
