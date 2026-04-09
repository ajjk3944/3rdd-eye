package com.yandex.mobile.ads.impl;

import android.os.SystemClock;
import b9.C1992A;

/* loaded from: classes3.dex */
public final class oh2<T> implements pc2, rc2 {

    /* renamed from: a, reason: collision with root package name */
    private final mb2<T> f31379a;

    /* renamed from: b, reason: collision with root package name */
    private final dd2 f31380b;

    /* renamed from: c, reason: collision with root package name */
    private final zf2 f31381c;

    /* renamed from: d, reason: collision with root package name */
    private final cc2<T> f31382d;

    /* renamed from: e, reason: collision with root package name */
    private final gd2 f31383e;

    /* renamed from: f, reason: collision with root package name */
    private Long f31384f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f31385g;

    public /* synthetic */ oh2(mb2 mb2Var, fg2 fg2Var, dd2 dd2Var, ag2 ag2Var, cc2 cc2Var) {
        this(mb2Var, fg2Var, dd2Var, ag2Var, cc2Var, new hg2(fg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        if (this.f31385g) {
            return;
        }
        C1992A c1992a = null;
        if (!this.f31383e.a() || this.f31380b.a() != cd2.f25604e) {
            this.f31384f = null;
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        Long l5 = this.f31384f;
        if (l5 != null) {
            if (jElapsedRealtime - l5.longValue() >= 2000) {
                this.f31385g = true;
                this.f31382d.k(this.f31379a);
                this.f31381c.n();
            }
            c1992a = C1992A.f18074a;
        }
        if (c1992a == null) {
            this.f31384f = Long.valueOf(jElapsedRealtime);
            this.f31382d.l(this.f31379a);
        }
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void b() {
        this.f31384f = null;
    }

    public oh2(mb2 videoAdInfo, fg2 videoViewProvider, dd2 videoAdStatusController, ag2 videoTracker, cc2 videoAdPlaybackEventsListener, gd2 videoAdVisibilityValidator) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoAdStatusController, "videoAdStatusController");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(videoAdPlaybackEventsListener, "videoAdPlaybackEventsListener");
        kotlin.jvm.internal.l.f(videoAdVisibilityValidator, "videoAdVisibilityValidator");
        this.f31379a = videoAdInfo;
        this.f31380b = videoAdStatusController;
        this.f31381c = videoTracker;
        this.f31382d = videoAdPlaybackEventsListener;
        this.f31383e = videoAdVisibilityValidator;
    }

    @Override // com.yandex.mobile.ads.impl.rc2
    public final void a() {
        this.f31384f = null;
    }
}
