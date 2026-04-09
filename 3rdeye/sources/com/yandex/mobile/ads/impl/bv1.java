package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class bv1 implements cv1<av1> {

    /* renamed from: a, reason: collision with root package name */
    private final Context f25400a;

    /* renamed from: b, reason: collision with root package name */
    private final vu1 f25401b;

    /* renamed from: c, reason: collision with root package name */
    private final C4072a3 f25402c;

    /* renamed from: d, reason: collision with root package name */
    private av1 f25403d;

    public bv1(Context context, vu1 sdkEnvironmentModule, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        this.f25400a = context;
        this.f25401b = sdkEnvironmentModule;
        this.f25402c = adConfiguration;
    }

    public static final void a(bv1 bv1Var) {
        av1 av1Var = bv1Var.f25403d;
        if (av1Var != null) {
            av1Var.a((zr) null);
        }
        bv1Var.f25403d = null;
    }

    public final class a implements zr {

        /* renamed from: a, reason: collision with root package name */
        private final av1 f25404a;

        /* renamed from: b, reason: collision with root package name */
        private final ev1<av1> f25405b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ bv1 f25406c;

        public a(bv1 bv1Var, av1 fullscreenHtmlAd, ev1<av1> creationListener) {
            kotlin.jvm.internal.l.f(fullscreenHtmlAd, "fullscreenHtmlAd");
            kotlin.jvm.internal.l.f(creationListener, "creationListener");
            this.f25406c = bv1Var;
            this.f25404a = fullscreenHtmlAd;
            this.f25405b = creationListener;
        }

        @Override // com.yandex.mobile.ads.impl.zr
        public final void a(C4128i3 adFetchRequestError) {
            kotlin.jvm.internal.l.f(adFetchRequestError, "adFetchRequestError");
            bv1.a(this.f25406c);
            this.f25405b.a(adFetchRequestError);
        }

        @Override // com.yandex.mobile.ads.impl.zr
        public final void a() {
            bv1.a(this.f25406c);
            this.f25405b.a((ev1<av1>) this.f25404a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a() {
        av1 av1Var = this.f25403d;
        if (av1Var != null) {
            av1Var.d();
        }
        av1 av1Var2 = this.f25403d;
        if (av1Var2 != null) {
            av1Var2.a((zr) null);
        }
        this.f25403d = null;
    }

    @Override // com.yandex.mobile.ads.impl.cv1
    public final void a(a8<String> adResponse, vy1 sizeInfo, String htmlResponse, ev1<av1> creationListener) throws gj2 {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(sizeInfo, "sizeInfo");
        kotlin.jvm.internal.l.f(htmlResponse, "htmlResponse");
        kotlin.jvm.internal.l.f(creationListener, "creationListener");
        Context context = this.f25400a;
        vu1 vu1Var = this.f25401b;
        C4072a3 c4072a3 = this.f25402c;
        f8 f8Var = new f8();
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        bd0 bd0Var = new bd0(applicationContext, vu1Var, c4072a3, adResponse, f8Var);
        Context applicationContext2 = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext2, "getApplicationContext(...)");
        av1 av1Var = new av1(context, vu1Var, c4072a3, adResponse, htmlResponse, f8Var, bd0Var, new fd0(applicationContext2, c4072a3, adResponse, f8Var), new rc0(), new kg0(), new md0(vu1Var));
        this.f25403d = av1Var;
        av1Var.a(new a(this, av1Var, creationListener));
        av1Var.h();
    }
}
