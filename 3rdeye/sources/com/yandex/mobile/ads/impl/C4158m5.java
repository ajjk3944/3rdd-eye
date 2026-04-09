package com.yandex.mobile.ads.impl;

import androidx.media3.common.util.Assertions;
import com.yandex.mobile.ads.impl.C4137j5;

/* renamed from: com.yandex.mobile.ads.impl.m5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4158m5 {

    /* renamed from: a, reason: collision with root package name */
    private final C4144k5 f30207a;

    /* renamed from: b, reason: collision with root package name */
    private final c9 f30208b;

    /* renamed from: c, reason: collision with root package name */
    private final C4150l4 f30209c;

    /* renamed from: d, reason: collision with root package name */
    private final oi1 f30210d;

    /* renamed from: e, reason: collision with root package name */
    private final ci1 f30211e;

    /* renamed from: f, reason: collision with root package name */
    private final C4137j5 f30212f;

    /* renamed from: g, reason: collision with root package name */
    private final nn0 f30213g;

    public C4158m5(a9 adStateDataController, mi1 playerStateController, C4144k5 adPlayerEventsController, c9 adStateHolder, C4150l4 adInfoStorage, oi1 playerStateHolder, ci1 playerAdPlaybackController, C4137j5 adPlayerDiscardController, nn0 instreamSettings) {
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerAdPlaybackController, "playerAdPlaybackController");
        kotlin.jvm.internal.l.f(adPlayerDiscardController, "adPlayerDiscardController");
        kotlin.jvm.internal.l.f(instreamSettings, "instreamSettings");
        this.f30207a = adPlayerEventsController;
        this.f30208b = adStateHolder;
        this.f30209c = adInfoStorage;
        this.f30210d = playerStateHolder;
        this.f30211e = playerAdPlaybackController;
        this.f30212f = adPlayerDiscardController;
        this.f30213g = instreamSettings;
    }

    public final void a(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        if (im0.f28744d == this.f30208b.a(videoAd)) {
            this.f30208b.a(videoAd, im0.f28745e);
            vi1 vi1VarC = this.f30208b.c();
            Assertions.checkState(videoAd.equals(vi1VarC != null ? vi1VarC.d() : null));
            this.f30210d.a(false);
            this.f30211e.a();
            this.f30207a.c(videoAd);
        }
    }

    public final void b(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        im0 im0VarA = this.f30208b.a(videoAd);
        if (im0.f28742b == im0VarA || im0.f28743c == im0VarA) {
            this.f30208b.a(videoAd, im0.f28744d);
            Object objCheckNotNull = Assertions.checkNotNull(this.f30209c.a(videoAd));
            kotlin.jvm.internal.l.e(objCheckNotNull, "checkNotNull(...)");
            this.f30208b.a(new vi1((C4115g4) objCheckNotNull, videoAd));
            this.f30207a.d(videoAd);
            return;
        }
        if (im0.f28745e == im0VarA) {
            vi1 vi1VarC = this.f30208b.c();
            Assertions.checkState(videoAd.equals(vi1VarC != null ? vi1VarC.d() : null));
            this.f30208b.a(videoAd, im0.f28744d);
            this.f30207a.e(videoAd);
        }
    }

    public final void e(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        C4137j5.b bVar = C4137j5.b.f28959b;
        K1 k12 = new K1(0, this, videoAd);
        im0 im0VarA = this.f30208b.a(videoAd);
        im0 im0Var = im0.f28742b;
        if (im0Var == im0VarA) {
            C4115g4 c4115g4A = this.f30209c.a(videoAd);
            if (c4115g4A != null) {
                this.f30212f.a(c4115g4A, bVar, k12);
                return;
            }
            return;
        }
        this.f30208b.a(videoAd, im0Var);
        vi1 vi1VarC = this.f30208b.c();
        if (vi1VarC == null) {
            fp0.b(new Object[0]);
        } else {
            this.f30212f.a(vi1VarC.c(), bVar, k12);
        }
    }

    public final void c(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        if (im0.f28745e == this.f30208b.a(videoAd)) {
            this.f30208b.a(videoAd, im0.f28744d);
            vi1 vi1VarC = this.f30208b.c();
            Assertions.checkState(videoAd.equals(vi1VarC != null ? vi1VarC.d() : null));
            this.f30210d.a(true);
            this.f30211e.b();
            this.f30207a.e(videoAd);
        }
    }

    public final void d(tn0 videoAd) {
        kotlin.jvm.internal.l.f(videoAd, "videoAd");
        C4137j5.b bVar = this.f30213g.f() ? C4137j5.b.f28960c : C4137j5.b.f28959b;
        C.f0 f0Var = new C.f0(7, this, videoAd);
        im0 im0VarA = this.f30208b.a(videoAd);
        im0 im0Var = im0.f28742b;
        if (im0Var == im0VarA) {
            C4115g4 c4115g4A = this.f30209c.a(videoAd);
            if (c4115g4A != null) {
                this.f30212f.a(c4115g4A, bVar, f0Var);
                return;
            }
            return;
        }
        this.f30208b.a(videoAd, im0Var);
        vi1 vi1VarC = this.f30208b.c();
        if (vi1VarC != null) {
            this.f30212f.a(vi1VarC.c(), bVar, f0Var);
        } else {
            fp0.b(new Object[0]);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(C4158m5 this$0, tn0 videoAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        this$0.f30207a.a(videoAd);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(C4158m5 this$0, tn0 videoAd) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        kotlin.jvm.internal.l.f(videoAd, "$videoAd");
        this$0.f30207a.f(videoAd);
    }
}
