package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class im1 implements ed0<lf> {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f28749a;

    /* renamed from: b, reason: collision with root package name */
    private final C4212u4 f28750b;

    /* renamed from: c, reason: collision with root package name */
    private final tf f28751c;

    /* renamed from: d, reason: collision with root package name */
    private qs f28752d;

    /* renamed from: e, reason: collision with root package name */
    private InterfaceC4178p4 f28753e;

    public im1(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, Handler handler, C4212u4 adLoadingResultReporter, tf appOpenAdShowApiControllerFactory) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adLoadingResultReporter, "adLoadingResultReporter");
        kotlin.jvm.internal.l.f(appOpenAdShowApiControllerFactory, "appOpenAdShowApiControllerFactory");
        this.f28749a = handler;
        this.f28750b = adLoadingResultReporter;
        this.f28751c = appOpenAdShowApiControllerFactory;
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f28750b.a(error.c());
        this.f28749a.post(new L4(11, this, error));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(im1 this$0, C4128i3 error) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(error, "$error");
        qs qsVar = this$0.f28752d;
        if (qsVar != null) {
            qsVar.a(error);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f28753e;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    public /* synthetic */ im1(Context context, C4072a3 c4072a3, C4198s4 c4198s4, gd0 gd0Var) {
        this(context, c4072a3, c4198s4, new Handler(Looper.getMainLooper()), new C4212u4(context, c4072a3, c4198s4), new tf(context, gd0Var));
    }

    @Override // com.yandex.mobile.ads.impl.ed0
    public final void a(lf ad) {
        kotlin.jvm.internal.l.f(ad, "ad");
        this.f28750b.a();
        this.f28749a.post(new L(7, this, this.f28751c.a(ad)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(im1 this$0, sf appOpenAdApiController) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(appOpenAdApiController, "$appOpenAdApiController");
        qs qsVar = this$0.f28752d;
        if (qsVar != null) {
            qsVar.a(appOpenAdApiController);
        }
        InterfaceC4178p4 interfaceC4178p4 = this$0.f28753e;
        if (interfaceC4178p4 != null) {
            interfaceC4178p4.a();
        }
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f28750b.a(new k7(adConfiguration));
    }

    public final void a(qs qsVar) {
        this.f28752d = qsVar;
        this.f28750b.a(qsVar);
    }

    public final void a(InterfaceC4178p4 listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f28753e = listener;
    }

    public final void a(dg0 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28750b.a(reportParameterManager);
    }
}
