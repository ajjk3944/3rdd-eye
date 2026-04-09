package com.yandex.mobile.ads.impl;

import android.content.Context;

/* renamed from: com.yandex.mobile.ads.impl.w, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4221w {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f34759a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f34760b;

    /* renamed from: c, reason: collision with root package name */
    private final np1 f34761c;

    /* renamed from: d, reason: collision with root package name */
    private final h91 f34762d;

    /* renamed from: e, reason: collision with root package name */
    private final x61 f34763e;

    /* renamed from: f, reason: collision with root package name */
    private final g51 f34764f;

    /* renamed from: g, reason: collision with root package name */
    private final o71 f34765g;

    public C4221w(C4072a3 adConfiguration, a8 adResponse, yo reporter, h91 nativeOpenUrlHandlerCreator, x61 nativeAdViewAdapter, g51 nativeAdEventController, o71 o71Var) {
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(nativeOpenUrlHandlerCreator, "nativeOpenUrlHandlerCreator");
        kotlin.jvm.internal.l.f(nativeAdViewAdapter, "nativeAdViewAdapter");
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        this.f34759a = adConfiguration;
        this.f34760b = adResponse;
        this.f34761c = reporter;
        this.f34762d = nativeOpenUrlHandlerCreator;
        this.f34763e = nativeAdViewAdapter;
        this.f34764f = nativeAdEventController;
        this.f34765g = o71Var;
    }

    public final InterfaceC4214v<? extends InterfaceC4200t> a(Context context, InterfaceC4200t action) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(action, "action");
        g91 g91VarA = this.f34762d.a(this.f34761c);
        String strA = action.a();
        switch (strA.hashCode()) {
            case -1895850168:
                if (!strA.equals("social_action")) {
                    return null;
                }
                a8<?> a8Var = this.f34760b;
                C4072a3 c4072a3 = this.f34759a;
                o71 o71Var = this.f34765g;
                c4072a3.q().f();
                wx1 wx1Var = new wx1(context, a8Var, c4072a3, o71Var, gd.a(context, wm2.f35021a, c4072a3.q().b()));
                C4072a3 c4072a32 = this.f34759a;
                a8<?> a8Var2 = this.f34760b;
                Context applicationContext = context.getApplicationContext();
                kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
                p41 p41Var = new p41(context, c4072a32, a8Var2, applicationContext);
                C4072a3 c4072a33 = this.f34759a;
                a8<?> a8Var3 = this.f34760b;
                g51 g51Var = this.f34764f;
                x61 x61Var = this.f34763e;
                return new l02(wx1Var, new t02(context, c4072a33, a8Var3, p41Var, g51Var, x61Var, this.f34762d, new y02(new vi0(context, new t81(a8Var3), x61Var.d(), yc1.f35708c.a(context).b()), new fj1())));
            case -1422015845:
                if (strA.equals("adtune")) {
                    return new db(new rb(this.f34764f, g91VarA), new h9(context, this.f34759a), this.f34761c);
                }
                return null;
            case -191501435:
                if (strA.equals("feedback")) {
                    return new ka0(new ta0(this.f34759a, this.f34761c, this.f34763e, this.f34764f, new sa0()));
                }
                return null;
            case 94756344:
                if (strA.equals(com.vungle.ads.internal.presenter.g.CLOSE)) {
                    return new gp(this.f34761c, this.f34764f);
                }
                return null;
            case 629233382:
                if (!strA.equals("deeplink")) {
                    return null;
                }
                C4072a3 c4072a34 = this.f34759a;
                a8<?> a8Var4 = this.f34760b;
                return new qy(new ty(c4072a34, a8Var4, this.f34761c, g91VarA, this.f34764f, new xj1(c4072a34, a8Var4)));
            default:
                return null;
        }
    }
}
