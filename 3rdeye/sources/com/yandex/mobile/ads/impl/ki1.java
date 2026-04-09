package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ki1 {

    /* renamed from: a, reason: collision with root package name */
    private final c9 f29673a;

    /* renamed from: b, reason: collision with root package name */
    private final C4238y2 f29674b;

    /* renamed from: c, reason: collision with root package name */
    private final yd2 f29675c;

    /* renamed from: d, reason: collision with root package name */
    private final C4144k5 f29676d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f29677e;

    public ki1(c9 adStateHolder, C4238y2 adCompletionListener, yd2 videoCompletedNotifier, C4144k5 adPlayerEventsController) {
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adCompletionListener, "adCompletionListener");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        this.f29673a = adStateHolder;
        this.f29674b = adCompletionListener;
        this.f29675c = videoCompletedNotifier;
        this.f29676d = adPlayerEventsController;
    }

    public final void a(boolean z10, int i) {
        vi1 vi1VarC = this.f29673a.c();
        if (vi1VarC == null) {
            return;
        }
        C4115g4 c4115g4A = vi1VarC.a();
        tn0 tn0VarB = vi1VarC.b();
        if (im0.f28742b == this.f29673a.a(tn0VarB)) {
            if (z10 && i == 2) {
                this.f29675c.c();
                return;
            }
            return;
        }
        if (i == 2) {
            this.f29677e = true;
            this.f29676d.i(tn0VarB);
        } else if (i == 3 && this.f29677e) {
            this.f29677e = false;
            this.f29676d.h(tn0VarB);
        } else if (i == 4) {
            this.f29674b.a(c4115g4A, tn0VarB);
        }
    }
}
