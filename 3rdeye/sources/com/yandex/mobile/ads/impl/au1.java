package com.yandex.mobile.ads.impl;

import A9.C0575f;
import android.content.Context;

/* loaded from: classes3.dex */
public final class au1 {

    /* renamed from: a, reason: collision with root package name */
    private final A9.E f24810a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f24811b;

    /* renamed from: c, reason: collision with root package name */
    private final C4198s4 f24812c;

    /* renamed from: d, reason: collision with root package name */
    private final k50 f24813d;

    /* renamed from: e, reason: collision with root package name */
    private final cc f24814e;

    /* renamed from: f, reason: collision with root package name */
    private final jv1 f24815f;

    /* renamed from: g, reason: collision with root package name */
    private final x22 f24816g;

    /* renamed from: h, reason: collision with root package name */
    private final yt1 f24817h;
    private final ye1 i;

    public au1(Context context, rm2 sdkEnvironmentModule, A9.E coroutineScope, Context appContext, C4198s4 adLoadingPhasesManager, k50 environmentController, cc advertisingConfiguration, jv1 sdkInitializer, x22 strongReferenceKeepingManager, yt1 bidderTokenGenerator, ye1 resultReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(coroutineScope, "coroutineScope");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        kotlin.jvm.internal.l.f(advertisingConfiguration, "advertisingConfiguration");
        kotlin.jvm.internal.l.f(sdkInitializer, "sdkInitializer");
        kotlin.jvm.internal.l.f(strongReferenceKeepingManager, "strongReferenceKeepingManager");
        kotlin.jvm.internal.l.f(bidderTokenGenerator, "bidderTokenGenerator");
        kotlin.jvm.internal.l.f(resultReporter, "resultReporter");
        this.f24810a = coroutineScope;
        this.f24811b = appContext;
        this.f24812c = adLoadingPhasesManager;
        this.f24813d = environmentController;
        this.f24814e = advertisingConfiguration;
        this.f24815f = sdkInitializer;
        this.f24816g = strongReferenceKeepingManager;
        this.f24817h = bidderTokenGenerator;
        this.i = resultReporter;
    }

    public final void a(xk xkVar, hl2 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        C0575f.e(this.f24810a, null, null, new zt1(this, xkVar, listener, null), 3);
    }
}
