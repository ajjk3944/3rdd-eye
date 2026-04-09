package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import com.yandex.mobile.ads.impl.nn0;

/* loaded from: classes3.dex */
public final class va {

    /* renamed from: a, reason: collision with root package name */
    private final vu1 f34422a;

    /* renamed from: b, reason: collision with root package name */
    private final bi2 f34423b;

    /* renamed from: c, reason: collision with root package name */
    private final Context f34424c;

    /* renamed from: d, reason: collision with root package name */
    private final C4123h5 f34425d;

    /* renamed from: e, reason: collision with root package name */
    private final ve2 f34426e;

    /* renamed from: f, reason: collision with root package name */
    private final t60 f34427f;

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ va(Context context, rm2 rm2Var, xl2 xl2Var) {
        Context applicationContext = context.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        this(context, rm2Var, xl2Var, applicationContext, new C4123h5(), new ve2(), new t60());
    }

    public final qm0 a() {
        Context context = this.f34424c;
        vu1 vu1Var = this.f34422a;
        xr0 xr0Var = new xr0(context, vu1Var, this.f34423b, new sl0(context, vu1Var));
        b9 b9Var = new b9(new d9(null), new C4081b5(null), new C4157m4());
        pi1 pi1Var = new pi1();
        ce2 ce2Var = new ce2(-9223372036854775807L);
        w60 w60Var = new w60();
        ni1 ni1Var = new ni1(pi1Var, ce2Var, w60Var, new ti1(w60Var), new di1(w60Var));
        ce2 ce2VarA = ni1Var.a();
        w60 w60VarC = ni1Var.c();
        oj1 oj1Var = new oj1(null, null);
        C4151l5 c4151l5 = new C4151l5(new z8(new e80(oj1Var, ce2VarA)));
        we2 we2Var = new we2();
        kl klVar = new kl(null);
        this.f34427f.getClass();
        d9 d9VarB = b9Var.b();
        C4081b5 c4081b5C = b9Var.c();
        w60 w60VarC2 = ni1Var.c();
        ce2 ce2VarA2 = ni1Var.a();
        C4244z2 c4244z2 = new C4244z2(klVar, b9Var, ni1Var, c4151l5, b9Var.b(), b9Var.c(), ni1Var.c(), ni1Var.e(), ni1Var.d(), new C4109f5());
        zd2 zd2Var = new zd2(c4081b5C, ce2VarA2, oj1Var, we2Var, new xd2(oj1Var, ce2VarA2));
        li1 li1Var = new li1(d9VarB, c4244z2, zd2Var, c4151l5);
        ai1 ai1Var = new ai1(c4081b5C, oj1Var, ce2VarA2, li1Var, new wr0(oj1Var, ce2VarA2));
        fi1 fi1Var = new fi1(d9VarB, c4151l5, new xa());
        e80 e80Var = new e80(oj1Var, ce2VarA2);
        C4240y4 c4240y4 = new C4240y4(b9Var, e80Var, zd2Var, b9Var.b(), b9Var.c());
        C4081b5 c4081b5C2 = b9Var.c();
        C4157m4 c4157m4A = b9Var.a();
        pi1 pi1VarD = ni1Var.d();
        oh1 oh1Var = new oh1(klVar, ni1Var, b9Var, zd2Var, e80Var, c4244z2, c4240y4, c4081b5C2, c4157m4A, pi1VarD, ni1Var.c(), new rf2(pi1VarD, zd2Var));
        r60 r60Var = new r60(klVar, w60VarC2, ai1Var, li1Var, fi1Var, new x42(c4081b5C, ni1Var, new za(klVar, c4081b5C, ce2VarA2, oj1Var), oh1Var, ni1Var.d(), ni1Var.a(), new a82()), oh1Var);
        C4095d5 c4095d5 = new C4095d5(ce2VarA, new C4169o2(ce2VarA));
        this.f34425d.getClass();
        d9 d9VarB2 = b9Var.b();
        C4081b5 c4081b5C3 = b9Var.c();
        ce2 ce2VarA3 = ni1Var.a();
        w60 w60VarC3 = ni1Var.c();
        ml1 ml1Var = new ml1(new f6(d9VarB2, ni1Var, ni1Var.d(), ni1Var.c()));
        w60VarC3.a(ml1Var);
        e60 e60Var = new e60(d9VarB2, ni1Var, ml1Var, new C4179p5(b9Var, new C4184q3(ce2VarA3, c4081b5C3, new C4169o2(ce2VarA3)), new on0()), new C4165n5(b9Var, ni1Var, c4151l5, b9Var.b(), b9Var.a(), ni1Var.d(), ni1Var.b(), new C4130i5(b9Var, ni1Var), nn0.a.a()), c4151l5, ni1Var.d(), ni1Var.e());
        this.f34426e.getClass();
        d9 d9VarB3 = b9Var.b();
        w60 w60VarC4 = ni1Var.c();
        ml1 ml1Var2 = new ml1(new gf2(d9VarB3, ni1Var, oj1Var, ni1Var.a(), ni1Var.d()));
        w60VarC4.a(ml1Var2);
        pw1 pw1Var = new pw1(ml1Var2, ni1Var.e(), we2Var);
        Context context2 = this.f34424c;
        vu1 vu1Var2 = this.f34422a;
        Context applicationContext = context2.getApplicationContext();
        kotlin.jvm.internal.l.e(applicationContext, "getApplicationContext(...)");
        return new qm0(b9Var, c4095d5, new il(context2, vu1Var2, e60Var, pw1Var, applicationContext), klVar, xr0Var, ni1Var, new k60(klVar, b9Var, c4151l5, w60VarC, this.f34422a.c(), b9Var.b(), b9Var.a(), b9Var.c(), new xa(), new Handler(Looper.getMainLooper())), oj1Var, r60Var, new ab2(), b9Var.b(), b9Var.c(), ni1Var.c(), ni1Var.d());
    }

    public va(Context context, rm2 sdkEnvironmentModule, xl2 vmapRequestConfig, Context applicationContext, C4123h5 adPlayerCreator, ve2 videoPlayerCreator, t60 exoPlayerListenerCreator) {
        kotlin.jvm.internal.l.f(context, "context");
        kotlin.jvm.internal.l.f(sdkEnvironmentModule, "sdkEnvironmentModule");
        kotlin.jvm.internal.l.f(vmapRequestConfig, "vmapRequestConfig");
        kotlin.jvm.internal.l.f(applicationContext, "applicationContext");
        kotlin.jvm.internal.l.f(adPlayerCreator, "adPlayerCreator");
        kotlin.jvm.internal.l.f(videoPlayerCreator, "videoPlayerCreator");
        kotlin.jvm.internal.l.f(exoPlayerListenerCreator, "exoPlayerListenerCreator");
        this.f34422a = sdkEnvironmentModule;
        this.f34423b = vmapRequestConfig;
        this.f34424c = applicationContext;
        this.f34425d = adPlayerCreator;
        this.f34426e = videoPlayerCreator;
        this.f34427f = exoPlayerListenerCreator;
    }
}
