package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.i60;

/* loaded from: classes3.dex */
public final class l60 {

    /* renamed from: a, reason: collision with root package name */
    private final C4072a3 f29900a;

    /* renamed from: b, reason: collision with root package name */
    private final a8<?> f29901b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f29902c;

    public l60(Context context, a8 adResponse, C4072a3 adConfiguration) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(adConfiguration, "adConfiguration");
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        this.f29900a = adConfiguration;
        this.f29901b = adResponse;
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this.f29902c = applicationContext;
    }

    public final d70 a() {
        i60 i60VarA = new i60.b(this.f29902c).a();
        ow0 ow0Var = new ow0(this.f29902c, new nw0());
        Context context = this.f29902c;
        C4072a3 c4072a3 = this.f29900a;
        a8<?> a8Var = this.f29901b;
        c4072a3.q().f();
        ze2 ze2Var = new ze2(context, c4072a3, a8Var, gd.a(context, wm2.f35021a, c4072a3.q().b()), new hc2(c4072a3, a8Var));
        kotlin.jvm.internal.l.c(i60VarA);
        return new d70(i60VarA, ow0Var, ze2Var, new ha1(), new jf2());
    }
}
