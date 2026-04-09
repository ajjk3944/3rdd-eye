package com.yandex.mobile.ads.impl;

import android.content.Context;

/* loaded from: classes3.dex */
public final class pt {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f31911a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f31912b;

    /* renamed from: c, reason: collision with root package name */
    private final z51 f31913c;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ pt(Context context, rm2 rm2Var) {
        ns nsVar = ns.f30991g;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, rm2Var, nsVar, applicationContext, new z51(applicationContext, rm2Var, nsVar));
    }

    public final void a() {
        this.f31913c.a();
    }

    public final void b(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        m61 m61Var = new m61(this.f31912b, this.f31911a.c());
        z51 z51Var = this.f31913c;
        r91 r91Var = r91.f32561c;
        u91 u91Var = u91.f33976c;
        z51Var.b(adRequestData, m61Var);
    }

    public final void a(h7 adRequestData) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        m61 m61Var = new m61(this.f31912b, this.f31911a.c());
        z51 z51Var = this.f31913c;
        r91 r91Var = r91.f32561c;
        u91 u91Var = u91.f33976c;
        z51Var.a(adRequestData, m61Var);
    }

    public pt(Context context, rm2 sdkEnvironmentModule, ns adType, Context appContext, z51 adLoadingController) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(adType, "adType");
        kotlin.jvm.internal.l.f(appContext, "appContext");
        kotlin.jvm.internal.l.f(adLoadingController, "adLoadingController");
        this.f31911a = sdkEnvironmentModule;
        this.f31912b = appContext;
        this.f31913c = adLoadingController;
    }

    public final void a(h7 adRequestData, int i) {
        kotlin.jvm.internal.l.f(adRequestData, "adRequestData");
        m61 m61Var = new m61(this.f31912b, this.f31911a.c());
        z51 z51Var = this.f31913c;
        r91 r91Var = r91.f32561c;
        u91 u91Var = u91.f33976c;
        z51Var.a(adRequestData, m61Var, i);
    }

    public final void a(ot otVar) {
        this.f31913c.a(otVar);
    }

    public final void a(lm2 lm2Var) {
        this.f31913c.a(lm2Var);
    }

    public final void a(um2 um2Var) {
        this.f31913c.a(um2Var);
    }
}
