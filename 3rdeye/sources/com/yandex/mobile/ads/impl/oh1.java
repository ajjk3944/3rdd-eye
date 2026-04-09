package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class oh1 {

    /* renamed from: a, reason: collision with root package name */
    private final kl f31370a;

    /* renamed from: b, reason: collision with root package name */
    private final C4244z2 f31371b;

    /* renamed from: c, reason: collision with root package name */
    private final C4240y4 f31372c;

    /* renamed from: d, reason: collision with root package name */
    private final C4081b5 f31373d;

    /* renamed from: e, reason: collision with root package name */
    private final C4157m4 f31374e;

    /* renamed from: f, reason: collision with root package name */
    private final pi1 f31375f;

    /* renamed from: g, reason: collision with root package name */
    private final w60 f31376g;

    /* renamed from: h, reason: collision with root package name */
    private final rf2 f31377h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f31378j;

    public oh1(kl bindingControllerHolder, ni1 playerStateController, b9 adStateDataController, zd2 videoCompletedNotifier, e80 fakePositionConfigurator, C4244z2 adCompletionListener, C4240y4 adPlaybackConsistencyManager, C4081b5 adPlaybackStateController, C4157m4 adInfoStorage, pi1 playerStateHolder, w60 playerProvider, rf2 videoStateUpdateController) {
        kotlin.jvm.internal.l.f(bindingControllerHolder, "bindingControllerHolder");
        kotlin.jvm.internal.l.f(playerStateController, "playerStateController");
        kotlin.jvm.internal.l.f(adStateDataController, "adStateDataController");
        kotlin.jvm.internal.l.f(videoCompletedNotifier, "videoCompletedNotifier");
        kotlin.jvm.internal.l.f(fakePositionConfigurator, "fakePositionConfigurator");
        kotlin.jvm.internal.l.f(adCompletionListener, "adCompletionListener");
        kotlin.jvm.internal.l.f(adPlaybackConsistencyManager, "adPlaybackConsistencyManager");
        kotlin.jvm.internal.l.f(adPlaybackStateController, "adPlaybackStateController");
        kotlin.jvm.internal.l.f(adInfoStorage, "adInfoStorage");
        kotlin.jvm.internal.l.f(playerStateHolder, "playerStateHolder");
        kotlin.jvm.internal.l.f(playerProvider, "playerProvider");
        kotlin.jvm.internal.l.f(videoStateUpdateController, "videoStateUpdateController");
        this.f31370a = bindingControllerHolder;
        this.f31371b = adCompletionListener;
        this.f31372c = adPlaybackConsistencyManager;
        this.f31373d = adPlaybackStateController;
        this.f31374e = adInfoStorage;
        this.f31375f = playerStateHolder;
        this.f31376g = playerProvider;
        this.f31377h = videoStateUpdateController;
        this.i = -1;
        this.f31378j = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.w60 r0 = r12.f31376g
            com.google.android.exoplayer2.Player r0 = r0.a()
            com.yandex.mobile.ads.impl.kl r1 = r12.f31370a
            boolean r1 = r1.b()
            if (r1 == 0) goto L79
            if (r0 == 0) goto L79
            com.yandex.mobile.ads.impl.rf2 r1 = r12.f31377h
            r1.a(r0)
            com.yandex.mobile.ads.impl.pi1 r1 = r12.f31375f
            boolean r1 = r1.c()
            boolean r2 = r0.isPlayingAd()
            int r3 = r0.getCurrentAdGroupIndex()
            int r4 = r0.getCurrentAdIndexInAdGroup()
            com.yandex.mobile.ads.impl.pi1 r5 = r12.f31375f
            r5.a(r2)
            if (r2 == 0) goto L30
            r2 = r3
            goto L32
        L30:
            int r2 = r12.i
        L32:
            int r5 = r12.f31378j
            r12.f31378j = r4
            r12.i = r3
            com.yandex.mobile.ads.impl.h4 r3 = new com.yandex.mobile.ads.impl.h4
            r3.<init>(r2, r5)
            com.yandex.mobile.ads.impl.m4 r6 = r12.f31374e
            com.yandex.mobile.ads.impl.tn0 r6 = r6.a(r3)
            if (r1 == 0) goto L6a
            com.yandex.mobile.ads.impl.b5 r7 = r12.f31373d
            com.google.android.exoplayer2.source.ads.AdPlaybackState r7 = r7.a()
            int r8 = r7.adGroupCount
            r9 = -1
            if (r8 <= r2) goto L64
            if (r2 == r9) goto L64
            com.google.android.exoplayer2.source.ads.AdPlaybackState$AdGroup r2 = r7.getAdGroup(r2)
            long r7 = r2.timeUs
            r10 = -9223372036854775808
            int r2 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r2 != 0) goto L64
            boolean r2 = r0.isPlaying()
            if (r2 == 0) goto L6a
        L64:
            if (r4 == r9) goto L68
            if (r5 >= r4) goto L6a
        L68:
            r2 = 1
            goto L6b
        L6a:
            r2 = 0
        L6b:
            if (r6 == 0) goto L74
            if (r2 == 0) goto L74
            com.yandex.mobile.ads.impl.z2 r2 = r12.f31371b
            r2.a(r3, r6)
        L74:
            com.yandex.mobile.ads.impl.y4 r2 = r12.f31372c
            r2.a(r0, r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.oh1.a():void");
    }
}
