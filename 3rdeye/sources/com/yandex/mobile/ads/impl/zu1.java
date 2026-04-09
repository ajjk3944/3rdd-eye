package com.yandex.mobile.ads.impl;

import android.app.Activity;
import android.content.Context;
import b9.m;
import com.yandex.mobile.ads.impl.td0;

/* loaded from: classes3.dex */
public final class zu1<T extends td0<T>> implements wc0<T> {

    /* renamed from: a, reason: collision with root package name */
    private final dd0<T> f36749a;

    /* renamed from: b, reason: collision with root package name */
    private final rt1 f36750b;

    /* renamed from: c, reason: collision with root package name */
    private final dv1<av1> f36751c;

    /* renamed from: d, reason: collision with root package name */
    private av1 f36752d;

    public /* synthetic */ zu1(dd0 dd0Var, vu1 vu1Var) {
        C4072a3 c4072a3F = dd0Var.f();
        od0 od0Var = new od0();
        bv1 bv1Var = new bv1(dd0Var.l(), vu1Var, c4072a3F);
        this(dd0Var, vu1Var, c4072a3F, od0Var, bv1Var, new rt1(c4072a3F), new dv1(c4072a3F, od0Var, bv1Var));
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final String getAdInfo() {
        av1 av1Var = this.f36752d;
        if (av1Var != null) {
            return av1Var.e();
        }
        return null;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context) {
        kotlin.jvm.internal.l.f(context, "context");
        fp0.d(new Object[0]);
        this.f36751c.a();
        av1 av1Var = this.f36752d;
        if (av1Var != null) {
            av1Var.d();
        }
        this.f36752d = null;
    }

    public final class a implements ev1<av1> {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(av1 av1Var) {
            av1 ad = av1Var;
            kotlin.jvm.internal.l.f(ad, "ad");
            ((zu1) zu1.this).f36752d = ad;
            ((zu1) zu1.this).f36749a.u();
        }

        @Override // com.yandex.mobile.ads.impl.ev1
        public final void a(C4128i3 adFetchRequestError) {
            kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
            ((zu1) zu1.this).f36749a.b(adFetchRequestError);
        }
    }

    public zu1(dd0<T> loadController, vu1 sdkEnvironmentModule, C4072a3 adConfiguration, od0 fullscreenAdSizeValidator, bv1 fullscreenHtmlAdCreateController, rt1 sdkAdapterReporter, dv1<av1> htmlAdCreationHandler) {
        kotlin.jvm.internal.l.f(loadController, "loadController");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(fullscreenAdSizeValidator, "fullscreenAdSizeValidator");
        kotlin.jvm.internal.l.f(fullscreenHtmlAdCreateController, "fullscreenHtmlAdCreateController");
        kotlin.jvm.internal.l.f(sdkAdapterReporter, "sdkAdapterReporter");
        kotlin.jvm.internal.l.f(htmlAdCreationHandler, "htmlAdCreationHandler");
        this.f36749a = loadController;
        this.f36750b = sdkAdapterReporter;
        this.f36751c = htmlAdCreationHandler;
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final void a(Context context, a8<String> adResponse) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        C4198s4 c4198s4I = this.f36749a.i();
        EnumC4191r4 enumC4191r4 = EnumC4191r4.f32454c;
        uj.a(c4198s4I, enumC4191r4, "adLoadingPhaseType", enumC4191r4, null);
        this.f36750b.a(context, adResponse, (k71) null);
        this.f36750b.a(context, adResponse);
        this.f36751c.a(context, adResponse, new a());
    }

    @Override // com.yandex.mobile.ads.impl.wc0
    public final Object a(T contentController, Activity activity) {
        kotlin.jvm.internal.l.f(contentController, "contentController");
        kotlin.jvm.internal.l.f(activity, "activity");
        m.a aVarA = b9.n.a(d6.a());
        av1 av1Var = this.f36752d;
        if (av1Var == null) {
            return aVarA;
        }
        Object objA = av1Var.a(activity, contentController.i());
        this.f36752d = null;
        return objA;
    }
}
