package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class li1 {

    /* renamed from: a, reason: collision with root package name */
    private final d9 f30010a;

    /* renamed from: b, reason: collision with root package name */
    private final C4244z2 f30011b;

    /* renamed from: c, reason: collision with root package name */
    private final zd2 f30012c;

    /* renamed from: d, reason: collision with root package name */
    private final C4151l5 f30013d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f30014e;

    public li1(d9 adStateHolder, C4244z2 adCompletionListener, zd2 videoCompletedNotifier, C4151l5 adPlayerEventsController) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adCompletionListener, "adCompletionListener");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        this.f30010a = adStateHolder;
        this.f30011b = adCompletionListener;
        this.f30012c = videoCompletedNotifier;
        this.f30013d = adPlayerEventsController;
    }

    public final void a(boolean z10, int i) {
        wi1 wi1VarC = this.f30010a.c();
        if (wi1VarC == null) {
            return;
        }
        C4122h4 c4122h4A = wi1VarC.a();
        tn0 tn0VarB = wi1VarC.b();
        if (jm0.f29209b == this.f30010a.a(tn0VarB)) {
            if (z10 && i == 2) {
                this.f30012c.c();
                return;
            }
            return;
        }
        if (i == 2) {
            this.f30014e = true;
            this.f30013d.i(tn0VarB);
        } else if (i == 3 && this.f30014e) {
            this.f30014e = false;
            this.f30013d.h(tn0VarB);
        } else if (i == 4) {
            this.f30011b.a(c4122h4A, tn0VarB);
        }
    }
}
