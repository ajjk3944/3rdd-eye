package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.z2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4244z2 {

    /* renamed from: a, reason: collision with root package name */
    private final kl f36141a;

    /* renamed from: b, reason: collision with root package name */
    private final C4151l5 f36142b;

    /* renamed from: c, reason: collision with root package name */
    private final d9 f36143c;

    /* renamed from: d, reason: collision with root package name */
    private final C4081b5 f36144d;

    /* renamed from: e, reason: collision with root package name */
    private final w60 f36145e;

    /* renamed from: f, reason: collision with root package name */
    private final ti1 f36146f;

    /* renamed from: g, reason: collision with root package name */
    private final pi1 f36147g;

    /* renamed from: h, reason: collision with root package name */
    private final C4109f5 f36148h;

    public C4244z2(kl bindingControllerHolder, b9 adStateDataController, ni1 playerStateController, C4151l5 adPlayerEventsController, d9 adStateHolder, C4081b5 adPlaybackStateController, w60 exoPlayerProvider, ti1 playerVolumeController, pi1 playerStateHolder, C4109f5 adPlaybackStateSkipValidator) {
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
        this.f36141a = bindingControllerHolder;
        this.f36142b = adPlayerEventsController;
        this.f36143c = adStateHolder;
        this.f36144d = adPlaybackStateController;
        this.f36145e = exoPlayerProvider;
        this.f36146f = playerVolumeController;
        this.f36147g = playerStateHolder;
        this.f36148h = adPlaybackStateSkipValidator;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0091  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(com.yandex.mobile.ads.impl.C4122h4 r8, com.yandex.mobile.ads.impl.tn0 r9) {
        /*
            r7 = this;
            java.lang.String r0 = "videoAd"
            kotlin.jvm.internal.l.f(r9, r0)
            java.lang.String r0 = "adInfo"
            kotlin.jvm.internal.l.f(r8, r0)
            com.yandex.mobile.ads.impl.kl r0 = r7.f36141a
            boolean r0 = r0.b()
            r1 = 0
            if (r0 == 0) goto Ld6
            com.yandex.mobile.ads.impl.d9 r0 = r7.f36143c
            com.yandex.mobile.ads.impl.jm0 r0 = r0.a(r9)
            com.yandex.mobile.ads.impl.jm0 r2 = com.yandex.mobile.ads.impl.jm0.f29209b
            if (r2 != r0) goto L55
            com.yandex.mobile.ads.impl.b5 r0 = r7.f36144d
            com.google.android.exoplayer2.source.ads.AdPlaybackState r0 = r0.a()
            int r2 = r8.a()
            int r3 = r8.b()
            boolean r2 = r0.isAdInErrorState(r2, r3)
            if (r2 != 0) goto L4f
            com.yandex.mobile.ads.impl.d9 r1 = r7.f36143c
            com.yandex.mobile.ads.impl.jm0 r2 = com.yandex.mobile.ads.impl.jm0.f29213f
            r1.a(r9, r2)
            int r9 = r8.a()
            int r8 = r8.b()
            com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = r0.withSkippedAd(r9, r8)
            java.lang.String r9 = "withSkippedAd(...)"
            kotlin.jvm.internal.l.e(r8, r9)
            com.yandex.mobile.ads.impl.b5 r9 = r7.f36144d
            r9.a(r8)
            return
        L4f:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.b(r8)
            return
        L55:
            com.yandex.mobile.ads.impl.w60 r0 = r7.f36145e
            boolean r0 = r0.b()
            if (r0 == 0) goto Ld0
            int r0 = r8.a()
            int r8 = r8.b()
            com.yandex.mobile.ads.impl.b5 r2 = r7.f36144d
            com.google.android.exoplayer2.source.ads.AdPlaybackState r2 = r2.a()
            boolean r3 = r2.isAdInErrorState(r0, r8)
            com.yandex.mobile.ads.impl.f5 r4 = r7.f36148h
            r4.getClass()
            int r4 = r2.adGroupCount
            if (r0 >= r4) goto L91
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r4 = r2.getAdGroup(r0)
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
            com.yandex.mobile.ads.impl.d9 r1 = r7.f36143c
            com.yandex.mobile.ads.impl.jm0 r3 = com.yandex.mobile.ads.impl.jm0.f29215h
            r1.a(r9, r3)
            com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = r2.withPlayedAd(r0, r8)
            r0 = 0
            com.google.android.exoplayer2.source.ads.AdPlaybackState r8 = r8.withAdResumePositionUs(r0)
            java.lang.String r0 = "withAdResumePositionUs(...)"
            kotlin.jvm.internal.l.e(r8, r0)
            com.yandex.mobile.ads.impl.b5 r0 = r7.f36144d
            r0.a(r8)
            com.yandex.mobile.ads.impl.pi1 r8 = r7.f36147g
            boolean r8 = r8.c()
            if (r8 != 0) goto Lc5
            com.yandex.mobile.ads.impl.d9 r8 = r7.f36143c
            r0 = 0
            r8.a(r0)
            goto Lc5
        Lc0:
            java.lang.Object[] r8 = new java.lang.Object[r1]
            com.yandex.mobile.ads.impl.fp0.b(r8)
        Lc5:
            com.yandex.mobile.ads.impl.ti1 r8 = r7.f36146f
            r8.b()
            com.yandex.mobile.ads.impl.l5 r8 = r7.f36142b
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
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.C4244z2.a(com.yandex.mobile.ads.impl.h4, com.yandex.mobile.ads.impl.tn0):void");
    }
}
