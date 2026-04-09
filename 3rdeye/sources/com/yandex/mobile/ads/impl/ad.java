package com.yandex.mobile.ads.impl;

import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class ad implements ce {

    /* renamed from: b, reason: collision with root package name */
    private static final Object f24619b = new Object();

    /* renamed from: a, reason: collision with root package name */
    private final Executor f24620a;

    public ad(Executor executor) {
        kotlin.jvm.internal.l.f(executor, "executor");
        this.f24620a = executor;
    }

    @Override // com.yandex.mobile.ads.impl.ce
    public final void a(ae report) {
        kotlin.jvm.internal.l.f(report, "report");
        this.f24620a.execute(new I2(2, this, report));
    }

    private static void b(ae aeVar) {
        aeVar.a();
        aeVar.b();
        fp0.a(new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ad this$0, ae report) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(report, "$report");
        b(report);
        yc.f35705a.getClass();
        yc.a(report);
    }
}
