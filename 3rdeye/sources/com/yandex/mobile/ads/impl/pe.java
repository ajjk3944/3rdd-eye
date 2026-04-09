package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.zr0;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class pe {

    /* renamed from: a, reason: collision with root package name */
    private final Executor f31718a;

    /* renamed from: b, reason: collision with root package name */
    private final le f31719b;

    public /* synthetic */ pe() {
        this(zr0.a.a().c(), me.a());
    }

    public final void a(oe listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f31718a.execute(new L(12, this, listener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(pe this$0, oe listener) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(listener, "$listener");
        try {
            this$0.f31719b.a(listener);
        } catch (Throwable th) {
            listener.a(th.getMessage());
        }
    }

    public pe(Executor executor, le appMetricaAdapter) {
        kotlin.jvm.internal.l.f(executor, "executor");
        kotlin.jvm.internal.l.f(appMetricaAdapter, "appMetricaAdapter");
        this.f31718a = executor;
        this.f31719b = appMetricaAdapter;
    }
}
