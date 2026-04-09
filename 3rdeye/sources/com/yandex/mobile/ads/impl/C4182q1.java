package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.k50;
import java.lang.ref.WeakReference;

/* renamed from: com.yandex.mobile.ads.impl.q1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4182q1 implements t32 {

    /* renamed from: a, reason: collision with root package name */
    private final a8<String> f31967a;

    /* renamed from: b, reason: collision with root package name */
    private final C4072a3 f31968b;

    /* renamed from: c, reason: collision with root package name */
    private final f8 f31969c;

    /* renamed from: d, reason: collision with root package name */
    private final C4175p1 f31970d;

    /* renamed from: e, reason: collision with root package name */
    private final k50 f31971e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<Context> f31972f;

    public C4182q1(Context context, C4175p1 adActivityShowManager, a8 adResponse, f8 resultReceiver, vu1 sdkEnvironmentModule, k50 environmentController, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(resultReceiver, "resultReceiver");
        kotlin.jvm.internal.l.f(adActivityShowManager, "adActivityShowManager");
        kotlin.jvm.internal.l.f(environmentController, "environmentController");
        this.f31967a = adResponse;
        this.f31968b = adConfiguration;
        this.f31969c = resultReceiver;
        this.f31970d = adActivityShowManager;
        this.f31971e = environmentController;
        this.f31972f = new WeakReference<>(context);
    }

    @Override // com.yandex.mobile.ads.impl.t32
    public final void a(np1 reporter, String targetUrl) {
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(targetUrl, "targetUrl");
        this.f31971e.c().getClass();
        this.f31970d.a(this.f31972f.get(), this.f31968b, this.f31967a, reporter, targetUrl, this.f31969c, this.f31967a.G());
    }

    public /* synthetic */ C4182q1(Context context, a8 a8Var, f8 f8Var, vu1 vu1Var, C4072a3 c4072a3) {
        this(context, new C4175p1(vu1Var), a8Var, f8Var, vu1Var, k50.a.a(context), c4072a3);
    }
}
