package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class mm1 implements ed0<vr1> {

    /* renamed from: a, reason: collision with root package name */
    private final cs1 f30444a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f30445b;

    /* renamed from: c, reason: collision with root package name */
    private final C4212u4 f30446c;

    /* renamed from: d, reason: collision with root package name */
    private String f30447d;

    /* renamed from: e, reason: collision with root package name */
    private bu f30448e;

    /* renamed from: f, reason: collision with root package name */
    private InterfaceC4178p4 f30449f;

    public /* synthetic */ mm1(Context context, C4072a3 c4072a3, C4198s4 c4198s4, cs1 cs1Var) {
        this(context, c4072a3, c4198s4, cs1Var, new Handler(Looper.getMainLooper()), new C4212u4(context, c4072a3, c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f30446c.a(error.c());
        this.f30445b.post(new L4(14, error, this));
    }

    public mm1(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, cs1 rewardedAdShowApiControllerFactoryFactory, Handler handler, C4212u4 adLoadingResultReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(rewardedAdShowApiControllerFactoryFactory, "rewardedAdShowApiControllerFactoryFactory");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adLoadingResultReporter, "adLoadingResultReporter");
        this.f30444a = rewardedAdShowApiControllerFactoryFactory;
        this.f30445b = handler;
        this.f30446c = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4128i3 error, mm1 this$0) {
        kotlin.jvm.internal.l.f(error, "$error");
        kotlin.jvm.internal.l.f(this$0, "this$0");
        C4128i3 c4128i3 = new C4128i3(error.b(), error.c(), error.d(), this$0.f30447d);
        bu buVar = this$0.f30448e;
        if (buVar != null) {
            buVar.a(c4128i3);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f30449f;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(vr1 ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        this.f30446c.a();
        this.f30445b.post(new L(8, this, this.f30444a.a(ad)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(mm1 this$0, bs1 interstitial) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(interstitial, "$interstitial");
        bu buVar = this$0.f30448e;
        if (buVar != null) {
            buVar.a(interstitial);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f30449f;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f30446c.a(new k7(adConfiguration));
    }

    public final void a(String str) {
        this.f30447d = str;
    }

    public final void a(InterfaceC4178p4 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f30449f = listener;
    }

    public final void a(bu buVar) {
        this.f30448e = buVar;
        this.f30446c.a(buVar);
    }

    public final void a(dg0 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f30446c.a(reportParameterManager);
    }
}
