package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.lang.ref.WeakReference;

/* loaded from: classes3.dex */
public final class uy implements t32 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f34245a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f34246b;

    /* renamed from: c, reason: collision with root package name */
    private final f8 f34247c;

    /* renamed from: d, reason: collision with root package name */
    private final C4175p1 f34248d;

    /* renamed from: e, reason: collision with root package name */
    private final k50 f34249e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<Context> f34250f;

    public uy(Context context, C4175p1 adActivityShowManager, a8 adResponse, f8 receiver, vu1 sdkEnvironmentModule, k50 environmentController, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(receiver, "receiver");
        kotlin.jvm.internal.l.f(adActivityShowManager, "adActivityShowManager");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        this.f34245a = adConfiguration;
        this.f34246b = adResponse;
        this.f34247c = receiver;
        this.f34248d = adActivityShowManager;
        this.f34249e = environmentController;
        this.f34250f = new WeakReference<>(context);
    }

    @Override // com.yandex.mobile.ads.impl.t32
    public final void a(np1 reporter, String targetUrl) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(targetUrl, "targetUrl");
        this.f34249e.c().getClass();
        this.f34248d.a(this.f34250f.get(), this.f34245a, this.f34246b, reporter, targetUrl, this.f34247c, this.f34246b.G());
    }
}
