package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import com.google.android.exoplayer2.Player;
import com.google.android.exoplayer2.source.ads.AdPlaybackState;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class k60 {

    /* renamed from: a, reason: collision with root package name */
    private final kl f29536a;

    /* renamed from: b, reason: collision with root package name */
    private final C4151l5 f29537b;

    /* renamed from: c, reason: collision with root package name */
    private final w60 f29538c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f29539d;

    /* renamed from: e, reason: collision with root package name */
    private final d9 f29540e;

    /* renamed from: f, reason: collision with root package name */
    private final C4157m4 f29541f;

    /* renamed from: g, reason: collision with root package name */
    private final C4081b5 f29542g;

    /* renamed from: h, reason: collision with root package name */
    private final xa f29543h;
    private final Handler i;

    public k60(kl bindingControllerHolder, b9 adStateDataController, C4151l5 adPlayerEventsController, w60 playerProvider, mp1 reporter, d9 adStateHolder, C4157m4 adInfoStorage, C4081b5 adPlaybackStateController, xa adsLoaderPlaybackErrorConverter, Handler prepareCompleteHandler) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        kotlin.jvm.internal.l.f(reporter, "reporter");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(adsLoaderPlaybackErrorConverter, "adsLoaderPlaybackErrorConverter");
        kotlin.jvm.internal.l.f(prepareCompleteHandler, "prepareCompleteHandler");
        this.f29536a = bindingControllerHolder;
        this.f29537b = adPlayerEventsController;
        this.f29538c = playerProvider;
        this.f29539d = reporter;
        this.f29540e = adStateHolder;
        this.f29541f = adInfoStorage;
        this.f29542g = adPlaybackStateController;
        this.f29543h = adsLoaderPlaybackErrorConverter;
        this.i = prepareCompleteHandler;
    }

    private final void a(int i, int i10, IOException iOException) {
        AdPlaybackState adPlaybackStateWithAdLoadError = this.f29542g.a().withAdLoadError(i, i10);
        kotlin.jvm.internal.l.e(adPlaybackStateWithAdLoadError, "withAdLoadError(...)");
        this.f29542g.a(adPlaybackStateWithAdLoadError);
        tn0 tn0VarA = this.f29541f.a(new C4122h4(i, i10));
        if (tn0VarA == null) {
            fp0.b(new Object[0]);
            return;
        }
        this.f29540e.a(tn0VarA, jm0.f29214g);
        this.f29543h.getClass();
        this.f29537b.a(tn0VarA, xa.c(iOException));
    }

    public final void b(int i, int i10, IOException exception) {
        kotlin.jvm.internal.l.f(exception, "exception");
        if (!this.f29538c.b() || !this.f29536a.b()) {
            fp0.f(new Object[0]);
            return;
        }
        try {
            a(i, i10, exception);
        } catch (RuntimeException e4) {
            fp0.b(e4);
            this.f29539d.reportError("Unexpected exception while handling prepare error", e4);
        }
    }

    public final void a(int i, int i10) {
        a(i, i10, SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(k60 this$0, int i, int i10, long j4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.a(i, i10, j4);
    }

    private final void a(int i, int i10, long j4) {
        if (SystemClock.elapsedRealtime() - j4 < 200) {
            Player playerA = this.f29538c.a();
            if (playerA != null && playerA.getDuration() != -9223372036854775807L) {
                tn0 tn0VarA = this.f29541f.a(new C4122h4(i, i10));
                if (tn0VarA != null) {
                    this.f29540e.a(tn0VarA, jm0.f29210c);
                    this.f29537b.b(tn0VarA);
                    return;
                } else {
                    fp0.b(new Object[0]);
                    return;
                }
            }
            this.i.postDelayed(new C1(this, i, i10, j4, 1), 20L);
            return;
        }
        tn0 tn0VarA2 = this.f29541f.a(new C4122h4(i, i10));
        if (tn0VarA2 != null) {
            this.f29540e.a(tn0VarA2, jm0.f29210c);
            this.f29537b.b(tn0VarA2);
        } else {
            fp0.b(new Object[0]);
        }
    }
}
