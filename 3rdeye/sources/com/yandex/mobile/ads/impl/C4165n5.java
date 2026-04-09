package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.util.Assertions;
import com.yandex.mobile.ads.impl.C4130i5;

/* renamed from: com.yandex.mobile.ads.impl.n5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4165n5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4151l5 f30765a;

    /* renamed from: b, reason: collision with root package name */
    private final d9 f30766b;

    /* renamed from: c, reason: collision with root package name */
    private final C4157m4 f30767c;

    /* renamed from: d, reason: collision with root package name */
    private final pi1 f30768d;

    /* renamed from: e, reason: collision with root package name */
    private final di1 f30769e;

    /* renamed from: f, reason: collision with root package name */
    private final C4130i5 f30770f;

    /* renamed from: g, reason: collision with root package name */
    private final nn0 f30771g;

    public C4165n5(b9 adStateDataController, ni1 playerStateController, C4151l5 adPlayerEventsController, d9 adStateHolder, C4157m4 adInfoStorage, pi1 playerStateHolder, di1 playerAdPlaybackController, C4130i5 adPlayerDiscardController, nn0 instreamSettings) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerAdPlaybackController, "playerAdPlaybackController");
        kotlin.jvm.internal.l.f(adPlayerDiscardController, "adPlayerDiscardController");
        kotlin.jvm.internal.l.f(instreamSettings, "instreamSettings");
        this.f30765a = adPlayerEventsController;
        this.f30766b = adStateHolder;
        this.f30767c = adInfoStorage;
        this.f30768d = playerStateHolder;
        this.f30769e = playerAdPlaybackController;
        this.f30770f = adPlayerDiscardController;
        this.f30771g = instreamSettings;
    }

    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        if (jm0.f29211d == this.f30766b.a(videoAd)) {
            this.f30766b.a(videoAd, jm0.f29212e);
            wi1 wi1VarC = this.f30766b.c();
            Assertions.checkState(videoAd.equals(wi1VarC != null ? wi1VarC.d() : null));
            this.f30768d.a(false);
            this.f30769e.a();
            this.f30765a.c(videoAd);
        }
    }

    public final void b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        jm0 jm0VarA = this.f30766b.a(videoAd);
        if (jm0.f29209b == jm0VarA || jm0.f29210c == jm0VarA) {
            this.f30766b.a(videoAd, jm0.f29211d);
            Object objCheckNotNull = Assertions.checkNotNull(this.f30767c.a(videoAd));
            kotlin.jvm.internal.l.e(objCheckNotNull, "checkNotNull(...)");
            this.f30766b.a(new wi1((C4122h4) objCheckNotNull, videoAd));
            this.f30765a.d(videoAd);
            return;
        }
        if (jm0.f29212e == jm0VarA) {
            wi1 wi1VarC = this.f30766b.c();
            Assertions.checkState(videoAd.equals(wi1VarC != null ? wi1VarC.d() : null));
            this.f30766b.a(videoAd, jm0.f29211d);
            this.f30765a.e(videoAd);
        }
    }

    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        C4130i5.b bVar = C4130i5.b.f28491b;
        K1 k12 = new K1(1, this, videoAd);
        jm0 jm0VarA = this.f30766b.a(videoAd);
        jm0 jm0Var = jm0.f29209b;
        if (jm0Var == jm0VarA) {
            C4122h4 c4122h4A = this.f30767c.a(videoAd);
            if (c4122h4A != null) {
                this.f30770f.a(c4122h4A, bVar, k12);
                return;
            }
            return;
        }
        this.f30766b.a(videoAd, jm0Var);
        wi1 wi1VarC = this.f30766b.c();
        if (wi1VarC == null) {
            fp0.b(new Object[0]);
        } else {
            this.f30770f.a(wi1VarC.c(), bVar, k12);
        }
    }

    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        if (jm0.f29212e == this.f30766b.a(videoAd)) {
            this.f30766b.a(videoAd, jm0.f29211d);
            wi1 wi1VarC = this.f30766b.c();
            Assertions.checkState(videoAd.equals(wi1VarC != null ? wi1VarC.d() : null));
            this.f30768d.a(true);
            this.f30769e.b();
            this.f30765a.e(videoAd);
        }
    }

    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        C4130i5.b bVar = this.f30771g.f() ? C4130i5.b.f28492c : C4130i5.b.f28491b;
        C.e0 e0Var = new C.e0(11, this, videoAd);
        jm0 jm0VarA = this.f30766b.a(videoAd);
        jm0 jm0Var = jm0.f29209b;
        if (jm0Var == jm0VarA) {
            C4122h4 c4122h4A = this.f30767c.a(videoAd);
            if (c4122h4A != null) {
                this.f30770f.a(c4122h4A, bVar, e0Var);
                return;
            }
            return;
        }
        this.f30766b.a(videoAd, jm0Var);
        wi1 wi1VarC = this.f30766b.c();
        if (wi1VarC != null) {
            this.f30770f.a(wi1VarC.c(), bVar, e0Var);
        } else {
            fp0.b(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4165n5 this$0, tn0 videoAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        this$0.f30765a.a(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4165n5 this$0, tn0 videoAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        this$0.f30765a.f(videoAd);
    }
}
