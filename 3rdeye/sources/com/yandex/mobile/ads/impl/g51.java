package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.dk0;

/* loaded from: classes3.dex */
public final class g51 implements s50, dk0.a {

    /* renamed from: a, reason: collision with root package name */
    private final i51 f27543a;

    /* renamed from: b, reason: collision with root package name */
    private final C4125i0 f27544b;

    public /* synthetic */ g51(Context context, C4072a3 c4072a3, a8 a8Var) {
        i51 i51Var = new i51();
        this(context, c4072a3, a8Var, i51Var, new C4125i0(context, c4072a3, a8Var, i51Var));
    }

    @Override // com.yandex.mobile.ads.impl.s50
    public final void a() {
        this.f27543a.a();
    }

    public final void b() {
        fp0.a(new Object[0]);
        this.f27544b.a();
    }

    public final void c() {
        this.f27544b.e();
    }

    public final void d() {
        this.f27543a.onLeftApplication();
        this.f27544b.d();
    }

    public final void e() {
        this.f27543a.onLeftApplication();
        this.f27544b.f();
    }

    public final void f() {
        this.f27544b.b();
    }

    public final void g() {
        this.f27543a.onLeftApplication();
        this.f27544b.c();
    }

    @Override // com.yandex.mobile.ads.impl.dk0.a
    public final void a(C4108f4 c4108f4) {
        this.f27543a.a(c4108f4);
    }

    public final void a(lt ltVar) {
        this.f27543a.a(ltVar);
    }

    public g51(Context context, C4072a3 adConfiguration, a8<?> adResponse, i51 nativeAdEventListenerController, C4125i0 activityInteractionControllerWrapper) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeAdEventListenerController, "nativeAdEventListenerController");
        kotlin.jvm.internal.l.f(activityInteractionControllerWrapper, "activityInteractionControllerWrapper");
        this.f27543a = nativeAdEventListenerController;
        this.f27544b = activityInteractionControllerWrapper;
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f27544b.a(reportParameterManager);
    }

    public final void a(ir0 link) {
        kotlin.jvm.internal.l.f(link, "link");
        this.f27544b.a(link.c());
    }
}
