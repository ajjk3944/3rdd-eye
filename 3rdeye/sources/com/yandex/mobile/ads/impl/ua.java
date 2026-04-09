package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.nn0;

/* loaded from: classes3.dex */
public final class ua {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f33984a;

    /* renamed from: b, reason: collision with root package name */
    private final bi2 f33985b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f33986c;

    /* renamed from: d, reason: collision with root package name */
    private final C4116g5 f33987d;

    /* renamed from: e, reason: collision with root package name */
    private final ue2 f33988e;

    /* renamed from: f, reason: collision with root package name */
    private final s60 f33989f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ua(Context context, rm2 rm2Var, xl2 xl2Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, rm2Var, xl2Var, applicationContext, new C4116g5(), new ue2(), new s60());
    }

    public final rm0 a() {
        Context context = this.f33986c;
        vu1 vu1Var = this.f33984a;
        yr0 yr0Var = new yr0(context, vu1Var, this.f33985b, new sl0(context, vu1Var));
        a9 a9Var = new a9(new c9(null), new C4074a5(null), new C4150l4());
        oi1 oi1Var = new oi1();
        be2 be2Var = new be2(-9223372036854775807L);
        v60 v60Var = new v60();
        mi1 mi1Var = new mi1(oi1Var, be2Var, v60Var, new si1(v60Var), new ci1(v60Var));
        be2 be2VarA = mi1Var.a();
        v60 v60VarC = mi1Var.c();
        nj1 nj1Var = new nj1(null, null);
        C4144k5 c4144k5 = new C4144k5(new y8(new d80(nj1Var, be2VarA)));
        xe2 xe2Var = new xe2();
        jl jlVar = new jl(null);
        this.f33989f.getClass();
        c9 c9VarB = a9Var.b();
        C4074a5 c4074a5C = a9Var.c();
        v60 v60VarC2 = mi1Var.c();
        be2 be2VarA2 = mi1Var.a();
        C4238y2 c4238y2 = new C4238y2(jlVar, a9Var, mi1Var, c4144k5, a9Var.b(), a9Var.c(), mi1Var.c(), mi1Var.e(), mi1Var.d(), new C4102e5());
        yd2 yd2Var = new yd2(c4074a5C, be2VarA2, nj1Var, xe2Var, new wd2(nj1Var, be2VarA2));
        ki1 ki1Var = new ki1(c9VarB, c4238y2, yd2Var, c4144k5);
        zh1 zh1Var = new zh1(c4074a5C, nj1Var, be2VarA2, ki1Var, new vr0(nj1Var, be2VarA2));
        ei1 ei1Var = new ei1(c9VarB, c4144k5, new wa());
        d80 d80Var = new d80(nj1Var, be2VarA2);
        C4233x4 c4233x4 = new C4233x4(a9Var, d80Var, yd2Var, a9Var.b(), a9Var.c());
        C4074a5 c4074a5C2 = a9Var.c();
        C4150l4 c4150l4A = a9Var.a();
        oi1 oi1VarD = mi1Var.d();
        nh1 nh1Var = new nh1(jlVar, mi1Var, a9Var, yd2Var, d80Var, c4238y2, c4233x4, c4074a5C2, c4150l4A, oi1VarD, mi1Var.c(), new qf2(oi1VarD, yd2Var));
        q60 q60Var = new q60(jlVar, v60VarC2, zh1Var, ki1Var, ei1Var, new w42(c4074a5C, mi1Var, new ya(jlVar, c4074a5C, be2VarA2, nj1Var), nh1Var, mi1Var.d(), mi1Var.a(), new z72()), nh1Var);
        C4088c5 c4088c5 = new C4088c5(be2VarA, new C4162n2(be2VarA));
        this.f33987d.getClass();
        c9 c9VarB2 = a9Var.b();
        C4074a5 c4074a5C3 = a9Var.c();
        be2 be2VarA3 = mi1Var.a();
        v60 v60VarC3 = mi1Var.c();
        ll1 ll1Var = new ll1(new e6(c9VarB2, mi1Var, mi1Var.d(), mi1Var.c()));
        v60VarC3.a(ll1Var);
        d60 d60Var = new d60(c9VarB2, mi1Var, ll1Var, new C4172o5(a9Var, new C4177p3(be2VarA3, c4074a5C3, new C4162n2(be2VarA3)), new on0()), new C4158m5(a9Var, mi1Var, c4144k5, a9Var.b(), a9Var.a(), mi1Var.d(), mi1Var.b(), new C4137j5(a9Var, mi1Var), nn0.a.a()), c4144k5, mi1Var.d(), mi1Var.e());
        this.f33988e.getClass();
        c9 c9VarB3 = a9Var.b();
        v60 v60VarC4 = mi1Var.c();
        ll1 ll1Var2 = new ll1(new ff2(c9VarB3, mi1Var, nj1Var, mi1Var.a(), mi1Var.d()));
        v60VarC4.a(ll1Var2);
        ow1 ow1Var = new ow1(ll1Var2, mi1Var.e(), xe2Var);
        Context context2 = this.f33986c;
        vu1 vu1Var2 = this.f33984a;
        Context applicationContext = context2.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        return new rm0(a9Var, c4088c5, new hl(context2, vu1Var2, d60Var, ow1Var, applicationContext), jlVar, yr0Var, mi1Var, new j60(jlVar, a9Var, c4144k5, v60VarC, this.f33984a.c(), a9Var.b(), a9Var.a(), a9Var.c(), new wa(), new Handler(Looper.getMainLooper())), nj1Var, q60Var, new ab2(), a9Var.b(), a9Var.c(), mi1Var.c(), mi1Var.d());
    }

    public ua(Context context, rm2 sdkEnvironmentModule, xl2 vmapRequestConfig, Context applicationContext, C4116g5 adPlayerCreator, ue2 videoPlayerCreator, s60 exoPlayerListenerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(vmapRequestConfig, "vmapRequestConfig");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(adPlayerCreator, "adPlayerCreator");
        kotlin.jvm.internal.l.f(videoPlayerCreator, "videoPlayerCreator");
        kotlin.jvm.internal.l.f(exoPlayerListenerCreator, "exoPlayerListenerCreator");
        this.f33984a = sdkEnvironmentModule;
        this.f33985b = vmapRequestConfig;
        this.f33986c = applicationContext;
        this.f33987d = adPlayerCreator;
        this.f33988e = videoPlayerCreator;
        this.f33989f = exoPlayerListenerCreator;
    }
}
