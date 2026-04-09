package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.i0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4125i0 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f28421a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f28422b;

    /* renamed from: c, reason: collision with root package name */
    private final InterfaceC4132j0 f28423c;

    /* renamed from: d, reason: collision with root package name */
    private final Context f28424d;

    /* renamed from: e, reason: collision with root package name */
    private C4118h0 f28425e;

    /* renamed from: f, reason: collision with root package name */
    private o71 f28426f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C4125i0(Context context, C4072a3 c4072a3, a8 a8Var, i51 i51Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, c4072a3, a8Var, i51Var, applicationContext, new C4118h0(applicationContext, c4072a3, a8Var, i51Var, null));
    }

    public final void a() {
        this.f28425e.a();
    }

    public final void b() {
        this.f28425e.b();
    }

    public final void c() {
        this.f28425e.c();
    }

    public final void d() {
        this.f28425e.e();
    }

    public final void e() {
        this.f28425e.f();
    }

    public final void f() {
        this.f28425e.g();
    }

    public final void a(o71 reportParameterManager) {
        kotlin.jvm.internal.l.f(reportParameterManager, "reportParameterManager");
        this.f28426f = reportParameterManager;
        this.f28425e.a(reportParameterManager);
    }

    public C4125i0(Context context, C4072a3 adConfiguration, a8 adResponse, i51 activityInteractionEventListener, Context applicationContext, C4118h0 activityInteractionController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(activityInteractionEventListener, "activityInteractionEventListener");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(activityInteractionController, "activityInteractionController");
        this.f28421a = adConfiguration;
        this.f28422b = adResponse;
        this.f28423c = activityInteractionEventListener;
        this.f28424d = applicationContext;
        this.f28425e = activityInteractionController;
    }

    public final void a(h80 h80Var) {
        C4118h0 c4118h0 = new C4118h0(this.f28424d, this.f28421a, this.f28422b, this.f28423c, h80Var);
        this.f28425e = c4118h0;
        o71 o71Var = this.f28426f;
        if (o71Var != null) {
            this.f28426f = o71Var;
            c4118h0.a(o71Var);
        }
    }
}
