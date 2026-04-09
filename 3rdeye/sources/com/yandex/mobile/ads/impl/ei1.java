package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.kc2;

/* loaded from: classes3.dex */
public final class ei1 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f26870a;

    /* renamed from: b, reason: collision with root package name */
    private final C4144k5 f26871b;

    /* renamed from: c, reason: collision with root package name */
    private final wa f26872c;

    public ei1(c9 adStateHolder, C4144k5 adPlayerEventsController, wa adsLoaderPlaybackErrorConverter) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        this.f26870a = adStateHolder;
        this.f26871b = adPlayerEventsController;
        this.f26872c = adsLoaderPlaybackErrorConverter;
    }

    public final void a(Exception exc) {
        kc2 kc2Var;
        vi1 vi1VarC = this.f26870a.c();
        tn0 tn0VarD = vi1VarC != null ? vi1VarC.d() : null;
        im0 im0VarA = tn0VarD != null ? this.f26870a.a(tn0VarD) : null;
        if (im0VarA == null || im0.f28742b == im0VarA) {
            return;
        }
        if (exc != null) {
            this.f26872c.getClass();
            kc2Var = wa.c(exc);
        } else {
            kc2Var = new kc2(kc2.a.f29603D, new q00());
        }
        this.f26871b.a(tn0VarD, kc2Var);
    }
}
