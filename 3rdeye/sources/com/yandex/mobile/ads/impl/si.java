package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;

/* loaded from: classes3.dex */
public final class si implements InterfaceC4107f3 {

    /* renamed from: a, reason: collision with root package name */
    private final Handler f33072a;

    /* renamed from: b, reason: collision with root package name */
    private final C4212u4 f33073b;

    /* renamed from: c, reason: collision with root package name */
    private ss f33074c;

    public /* synthetic */ si(Context context, C4072a3 c4072a3, C4198s4 c4198s4) {
        this(context, c4072a3, c4198s4, new Handler(Looper.getMainLooper()), new C4212u4(context, c4072a3, c4198s4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(si this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.onAdLoaded();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void c(si this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.onAdClicked();
            ssVar.onLeftApplication();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void d(si this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.onReturnedToApplication();
        }
    }

    public final void a() {
        this.f33072a.post(new P0(this, 10));
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4107f3
    public final void onAdLoaded() {
        this.f33073b.a();
        this.f33072a.post(new Z(this, 11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(si this$0) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.closeBannerAd();
        }
    }

    public final void b() {
        this.f33072a.post(new N(this, 7));
    }

    public si(Context context, C4072a3 adConfiguration, C4198s4 adLoadingPhasesManager, Handler handler, C4212u4 adLoadingResultReporter) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adLoadingPhasesManager, "adLoadingPhasesManager");
        kotlin.jvm.internal.l.f(handler, "handler");
        kotlin.jvm.internal.l.f(adLoadingResultReporter, "adLoadingResultReporter");
        this.f33072a = handler;
        this.f33073b = adLoadingResultReporter;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4107f3
    public final void a(C4128i3 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f33073b.a(error.c());
        this.f33072a.post(new L(13, this, error));
    }

    public final void c() {
        this.f33072a.post(new I1(this, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(si this$0, C4128i3 error) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(error, "$error");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.a(error);
        }
    }

    public final void a(C4108f4 c4108f4) {
        this.f33072a.post(new A3(1, this, c4108f4));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(si this$0, C4108f4 c4108f4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        ss ssVar = this$0.f33074c;
        if (ssVar != null) {
            ssVar.a(c4108f4);
        }
    }

    public final void a(C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f33073b.a(new k7(adConfiguration));
    }

    public final void a(ss ssVar) {
        this.f33074c = ssVar;
        this.f33073b.a(ssVar);
    }

    public final void a(dg0 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f33073b.a(reportParameterManager);
    }
}
