package com.yandex.mobile.ads.impl;

import android.os.Handler;
import android.os.SystemClock;
import androidx.media3.common.AdPlaybackState;
import androidx.media3.common.Player;
import java.io.IOException;

/* loaded from: classes3.dex */
public final class j60 {

    /* renamed from: a, reason: collision with root package name */
    private final jl f28980a;

    /* renamed from: b, reason: collision with root package name */
    private final C4144k5 f28981b;

    /* renamed from: c, reason: collision with root package name */
    private final v60 f28982c;

    /* renamed from: d, reason: collision with root package name */
    private final mp1 f28983d;

    /* renamed from: e, reason: collision with root package name */
    private final c9 f28984e;

    /* renamed from: f, reason: collision with root package name */
    private final C4150l4 f28985f;

    /* renamed from: g, reason: collision with root package name */
    private final C4074a5 f28986g;

    /* renamed from: h, reason: collision with root package name */
    private final wa f28987h;
    private final Handler i;

    public j60(jl bindingControllerHolder, a9 adStateDataController, C4144k5 adPlayerEventsController, v60 playerProvider, mp1 reporter, c9 adStateHolder, C4150l4 adInfoStorage, C4074a5 adPlaybackStateController, wa adsLoaderPlaybackErrorConverter, Handler prepareCompleteHandler) {
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
        this.f28980a = bindingControllerHolder;
        this.f28981b = adPlayerEventsController;
        this.f28982c = playerProvider;
        this.f28983d = reporter;
        this.f28984e = adStateHolder;
        this.f28985f = adInfoStorage;
        this.f28986g = adPlaybackStateController;
        this.f28987h = adsLoaderPlaybackErrorConverter;
        this.i = prepareCompleteHandler;
    }

    private final void a(int i, int i10, IOException iOException) {
        AdPlaybackState adPlaybackStateWithAdLoadError = this.f28986g.a().withAdLoadError(i, i10);
        kotlin.jvm.internal.l.e(adPlaybackStateWithAdLoadError, "withAdLoadError(...)");
        this.f28986g.a(adPlaybackStateWithAdLoadError);
        tn0 tn0VarA = this.f28985f.a(new C4115g4(i, i10));
        if (tn0VarA == null) {
            fp0.b(new Object[0]);
            return;
        }
        this.f28984e.a(tn0VarA, im0.f28747g);
        this.f28987h.getClass();
        this.f28981b.a(tn0VarA, wa.c(iOException));
    }

    public final void b(int i, int i10, IOException exception) {
        kotlin.jvm.internal.l.f(exception, "exception");
        if (!this.f28982c.b() || !this.f28980a.b()) {
            fp0.f(new Object[0]);
            return;
        }
        try {
            a(i, i10, exception);
        } catch (RuntimeException e4) {
            fp0.b(e4);
            this.f28983d.reportError("Unexpected exception while handling prepare error", e4);
        }
    }

    public final void a(int i, int i10) {
        a(i, i10, SystemClock.elapsedRealtime());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(j60 this$0, int i, int i10, long j4) {
        kotlin.jvm.internal.l.f(this$0, "this$0");
        this$0.a(i, i10, j4);
    }

    private final void a(int i, int i10, long j4) {
        if (SystemClock.elapsedRealtime() - j4 < 200) {
            Player playerA = this.f28982c.a();
            if (playerA != null && playerA.getDuration() != -9223372036854775807L) {
                tn0 tn0VarA = this.f28985f.a(new C4115g4(i, i10));
                if (tn0VarA != null) {
                    this.f28984e.a(tn0VarA, im0.f28743c);
                    this.f28981b.b(tn0VarA);
                    return;
                } else {
                    fp0.b(new Object[0]);
                    return;
                }
            }
            this.i.postDelayed(new C1(this, i, i10, j4, 0), 20L);
            return;
        }
        tn0 tn0VarA2 = this.f28985f.a(new C4115g4(i, i10));
        if (tn0VarA2 != null) {
            this.f28984e.a(tn0VarA2, im0.f28743c);
            this.f28981b.b(tn0VarA2);
        } else {
            fp0.b(new Object[0]);
        }
    }
}
