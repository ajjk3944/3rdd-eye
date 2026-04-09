package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kc2;

/* loaded from: classes3.dex */
public final class fi1 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f27343a;

    /* renamed from: b, reason: collision with root package name */
    private final C4151l5 f27344b;

    /* renamed from: c, reason: collision with root package name */
    private final xa f27345c;

    public fi1(d9 adStateHolder, C4151l5 adPlayerEventsController, xa adsLoaderPlaybackErrorConverter) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        this.f27343a = adStateHolder;
        this.f27344b = adPlayerEventsController;
        this.f27345c = adsLoaderPlaybackErrorConverter;
    }

    public final void a(Exception exc) {
        kc2 kc2Var;
        wi1 wi1VarC = this.f27343a.c();
        tn0 tn0VarD = wi1VarC != null ? wi1VarC.d() : null;
        jm0 jm0VarA = tn0VarD != null ? this.f27343a.a(tn0VarD) : null;
        if (jm0VarA == null || jm0.f29209b == jm0VarA) {
            return;
        }
        if (exc != null) {
            this.f27345c.getClass();
            kc2Var = xa.c(exc);
        } else {
            kc2Var = new kc2(kc2.a.f29603D, new q00());
        }
        this.f27344b.a(tn0VarD, kc2Var);
    }
}
