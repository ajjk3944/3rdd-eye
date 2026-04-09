package com.yandex.mobile.ads.impl;

import C.RunnableC0615b;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class km1 implements ed0<hp0> {

    /* renamed from: a, reason: collision with root package name */
    private final op0 f29724a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f29725b;

    /* renamed from: c, reason: collision with root package name */
    private final C4212u4 f29726c;

    /* renamed from: d, reason: collision with root package name */
    private ht f29727d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4178p4 f29728e;

    /* renamed from: f, reason: collision with root package name */
    private String f29729f;

    public /* synthetic */ km1(Context context, C4072a3 c4072a3, C4198s4 c4198s4, op0 op0Var) {
        this(context, c4072a3, c4198s4, op0Var, new Handler(Looper.getMainLooper()), new C4212u4(context, c4072a3, c4198s4));
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f29726c.a(error.c());
        this.f29725b.post(new V1(8, this, new C4128i3(error.b(), error.c(), error.d(), this.f29729f)));
    }

    public km1(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, op0 adShowApiControllerFactory, Handler handler, C4212u4 adLoadingResultReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(adShowApiControllerFactory, "adShowApiControllerFactory");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adLoadingResultReporter, "adLoadingResultReporter");
        this.f29724a = adShowApiControllerFactory;
        this.f29725b = handler;
        this.f29726c = adLoadingResultReporter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(km1 this$0, C4128i3 requestError) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(requestError, "$requestError");
        ht htVar = this$0.f29727d;
        if (htVar != null) {
            htVar.a(requestError);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f29728e;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(hp0 ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        this.f29726c.a();
        this.f29725b.post(new RunnableC0615b(27, this, this.f29724a.a(ad)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(km1 this$0, np0 interstitial) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(interstitial, "$interstitial");
        ht htVar = this$0.f29727d;
        if (htVar != null) {
            htVar.a(interstitial);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f29728e;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f29726c.a(new k7(adConfiguration));
    }

    public final void a(String str) {
        this.f29729f = str;
    }

    public final void a(InterfaceC4178p4 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f29728e = listener;
    }

    public final void a(ht htVar) {
        this.f29727d = htVar;
        this.f29726c.a(htVar);
    }

    public final void a(dg0 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f29726c.a(reportParameterManager);
    }
}
