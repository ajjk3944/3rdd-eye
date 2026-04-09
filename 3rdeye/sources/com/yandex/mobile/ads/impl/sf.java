package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes3.dex */
public final class sf implements os {

    /* renamed from: a, reason: collision with root package name */
    private final lf f32954a;

    /* renamed from: b, reason: collision with root package name */
    private final jm1 f32955b;

    /* renamed from: c, reason: collision with root package name */
    private final zs0 f32956c;

    /* renamed from: d, reason: collision with root package name */
    private final vs0 f32957d;

    /* renamed from: e, reason: collision with root package name */
    private final AtomicBoolean f32958e;

    /* renamed from: f, reason: collision with root package name */
    private final ms f32959f;

    public sf(Context context, lf appOpenAdContentController, jm1 proxyAppOpenAdShowListener, zs0 mainThreadUsageValidator, vs0 mainThreadExecutor) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(appOpenAdContentController, "appOpenAdContentController");
        kotlin.jvm.internal.l.f(proxyAppOpenAdShowListener, "proxyAppOpenAdShowListener");
        kotlin.jvm.internal.l.f(mainThreadUsageValidator, "mainThreadUsageValidator");
        kotlin.jvm.internal.l.f(mainThreadExecutor, "mainThreadExecutor");
        this.f32954a = appOpenAdContentController;
        this.f32955b = proxyAppOpenAdShowListener;
        this.f32956c = mainThreadUsageValidator;
        this.f32957d = mainThreadExecutor;
        this.f32958e = new AtomicBoolean(false);
        this.f32959f = appOpenAdContentController.n();
        appOpenAdContentController.a(proxyAppOpenAdShowListener);
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final void a(dl2 dl2Var) {
        this.f32956c.a();
        this.f32955b.a(dl2Var);
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final ms getInfo() {
        return this.f32959f;
    }

    @Override // com.yandex.mobile.ads.impl.os
    public final void show(Activity activity) {
        kotlin.jvm.internal.l.f(activity, "activity");
        this.f32956c.a();
        this.f32957d.a(new V1(14, this, activity));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(sf this$0, Activity activity) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(activity, "$activity");
        if (!this$0.f32958e.getAndSet(true)) {
            Throwable thA = b9.m.a(this$0.f32954a.a(activity));
            if (thA != null) {
                this$0.f32955b.a(new c6(String.valueOf(thA.getMessage())));
                return;
            }
            return;
        }
        this$0.f32955b.a(d6.b());
    }
}
