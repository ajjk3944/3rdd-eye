package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.y2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4238y2 {

    /* renamed from: a, reason: collision with root package name */
    private final jl f35591a;

    /* renamed from: b, reason: collision with root package name */
    private final C4144k5 f35592b;

    /* renamed from: c, reason: collision with root package name */
    private final c9 f35593c;

    /* renamed from: d, reason: collision with root package name */
    private final C4074a5 f35594d;

    /* renamed from: e, reason: collision with root package name */
    private final v60 f35595e;

    /* renamed from: f, reason: collision with root package name */
    private final si1 f35596f;

    /* renamed from: g, reason: collision with root package name */
    private final oi1 f35597g;

    /* renamed from: h, reason: collision with root package name */
    private final C4102e5 f35598h;

    public C4238y2(jl bindingControllerHolder, a9 adStateDataController, mi1 playerStateController, C4144k5 adPlayerEventsController, c9 adStateHolder, C4074a5 adPlaybackStateController, v60 exoPlayerProvider, si1 playerVolumeController, oi1 playerStateHolder, C4102e5 adPlaybackStateSkipValidator) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adPlayerEventsController, "adPlayerEventsController");
        kotlin.jvm.internal.l.f(adStateHolder, "adStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(exoPlayerProvider, "exoPlayerProvider");
        kotlin.jvm.internal.l.f(playerVolumeController, "playerVolumeController");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(adPlaybackStateSkipValidator, "adPlaybackStateSkipValidator");
        this.f35591a = bindingControllerHolder;
        this.f35592b = adPlayerEventsController;
        this.f35593c = adStateHolder;
        this.f35594d = adPlaybackStateController;
        this.f35595e = exoPlayerProvider;
        this.f35596f = playerVolumeController;
        this.f35597g = playerStateHolder;
        this.f35598h = adPlaybackStateSkipValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.C4115g4 r8, com.yandex.mobile.ads.impl.tn0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "videoAd"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "adInfo"
            kotlin.jvm.internal.l.f(r8, r0)
            com.yandex.mobile.ads.impl.jl r0 = r7.f35591a
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto Ld6
            com.yandex.mobile.ads.impl.c9 r0 = r7.f35593c
            com.yandex.mobile.ads.impl.im0 r0 = r0.a(r9)
            com.yandex.mobile.ads.impl.im0 r2 = com.yandex.mobile.ads.impl.im0.f28742b
            if (r2 != r0) goto L55
            com.yandex.mobile.ads.impl.a5 r0 = r7.f35594d
            androidx.media3.common.AdPlaybackState r0 = r0.a()
            int r2 = r8.a()
            int r3 = r8.b()
            boolean r2 = r0.isAdInErrorState(r2, r3)
            if (r2 != 0) goto L4f
            com.yandex.mobile.ads.impl.c9 r1 = r7.f35593c
            com.yandex.mobile.ads.impl.im0 r2 = com.yandex.mobile.ads.impl.im0.f28746f
            r1.a(r9, r2)
            int r9 = r8.a()
            int r8 = r8.b()
            androidx.media3.common.AdPlaybackState r8 = r0.withSkippedAd(r9, r8)
            java.lang.String r9 = "withSkippedAd(...)"
            kotlin.jvm.internal.l.e(r8, r9)
            com.yandex.mobile.ads.impl.a5 r9 = r7.f35594d
            r9.a(r8)
            return
        L4f:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.b(r8)
            return
        L55:
            com.yandex.mobile.ads.impl.v60 r0 = r7.f35595e
            boolean r0 = r0.b()
            if (r0 == 0) goto Ld0
            int r0 = r8.a()
            int r8 = r8.b()
            com.yandex.mobile.ads.impl.a5 r2 = r7.f35594d
            androidx.media3.common.AdPlaybackState r2 = r2.a()
            boolean r3 = r2.isAdInErrorState(r0, r8)
            com.yandex.mobile.ads.impl.e5 r4 = r7.f35598h
            r4.getClass()
            int r4 = r2.adGroupCount
            if (r0 >= r4) goto L91
            androidx.media3.common.AdPlaybackState$AdGroup r4 = r2.getAdGroup(r0)
            java.lang.String r5 = "getAdGroup(...)"
            kotlin.jvm.internal.l.e(r4, r5)
            int r5 = r4.count
            r6 = -1
            if (r5 == r6) goto L91
            if (r8 >= r5) goto L91
            int[] r4 = r4.states
            r4 = r4[r8]
            r5 = 2
            if (r4 != r5) goto L91
            r4 = 1
            goto L92
        L91:
            r4 = r1
        L92:
            if (r3 != 0) goto Lc0
            if (r4 != 0) goto Lc0
            com.yandex.mobile.ads.impl.c9 r1 = r7.f35593c
            com.yandex.mobile.ads.impl.im0 r3 = com.yandex.mobile.ads.impl.im0.f28748h
            r1.a(r9, r3)
            androidx.media3.common.AdPlaybackState r8 = r2.withPlayedAd(r0, r8)
            r0 = 0
            androidx.media3.common.AdPlaybackState r8 = r8.withAdResumePositionUs(r0)
            java.lang.String r0 = "withAdResumePositionUs(...)"
            kotlin.jvm.internal.l.e(r8, r0)
            com.yandex.mobile.ads.impl.a5 r0 = r7.f35594d
            r0.a(r8)
            com.yandex.mobile.ads.impl.oi1 r8 = r7.f35597g
            boolean r8 = r8.c()
            if (r8 != 0) goto Lc5
            com.yandex.mobile.ads.impl.c9 r8 = r7.f35593c
            r0 = 0
            r8.a(r0)
            goto Lc5
        Lc0:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.b(r8)
        Lc5:
            com.yandex.mobile.ads.impl.si1 r8 = r7.f35596f
            r8.b()
            com.yandex.mobile.ads.impl.k5 r8 = r7.f35592b
            r8.g(r9)
            return
        Ld0:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.b(r8)
            return
        Ld6:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.f(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4238y2.a(com.yandex.mobile.ads.impl.g4, com.yandex.mobile.ads.impl.tn0):void");
    }
}
