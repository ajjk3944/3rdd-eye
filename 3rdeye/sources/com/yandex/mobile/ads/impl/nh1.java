package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class nh1 {

    /* renamed from: a, reason: collision with root package name */
    private final jl f30871a;

    /* renamed from: b, reason: collision with root package name */
    private final C4238y2 f30872b;

    /* renamed from: c, reason: collision with root package name */
    private final C4233x4 f30873c;

    /* renamed from: d, reason: collision with root package name */
    private final C4074a5 f30874d;

    /* renamed from: e, reason: collision with root package name */
    private final C4150l4 f30875e;

    /* renamed from: f, reason: collision with root package name */
    private final oi1 f30876f;

    /* renamed from: g, reason: collision with root package name */
    private final v60 f30877g;

    /* renamed from: h, reason: collision with root package name */
    private final qf2 f30878h;
    private int i;

    /* renamed from: j, reason: collision with root package name */
    private int f30879j;

    public nh1(jl bindingControllerHolder, mi1 playerStateController, a9 adStateDataController, yd2 videoCompletedNotifier, d80 fakePositionConfigurator, C4238y2 adCompletionListener, C4233x4 adPlaybackConsistencyManager, C4074a5 adPlaybackStateController, C4150l4 adInfoStorage, oi1 playerStateHolder, v60 playerProvider, qf2 videoStateUpdateController) {
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
        this.f30871a = bindingControllerHolder;
        this.f30872b = adCompletionListener;
        this.f30873c = adPlaybackConsistencyManager;
        this.f30874d = adPlaybackStateController;
        this.f30875e = adInfoStorage;
        this.f30876f = playerStateHolder;
        this.f30877g = playerProvider;
        this.f30878h = videoStateUpdateController;
        this.i = -1;
        this.f30879j = -1;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a() {
        /*
            r12 = this;
            com.yandex.mobile.ads.impl.v60 r0 = r12.f30877g
            androidx.media3.common.Player r0 = r0.a()
            com.yandex.mobile.ads.impl.jl r1 = r12.f30871a
            boolean r1 = r1.b()
            if (r1 == 0) goto L79
            if (r0 == 0) goto L79
            com.yandex.mobile.ads.impl.qf2 r1 = r12.f30878h
            r1.a(r0)
            com.yandex.mobile.ads.impl.oi1 r1 = r12.f30876f
            boolean r1 = r1.c()
            boolean r2 = r0.isPlayingAd()
            int r3 = r0.getCurrentAdGroupIndex()
            int r4 = r0.getCurrentAdIndexInAdGroup()
            com.yandex.mobile.ads.impl.oi1 r5 = r12.f30876f
            r5.a(r2)
            if (r2 == 0) goto L30
            r2 = r3
            goto L32
        L30:
            int r2 = r12.i
        L32:
            int r5 = r12.f30879j
            r12.f30879j = r4
            r12.i = r3
            com.yandex.mobile.ads.impl.g4 r3 = new com.yandex.mobile.ads.impl.g4
            r3.<init>(r2, r5)
            com.yandex.mobile.ads.impl.l4 r6 = r12.f30875e
            com.yandex.mobile.ads.impl.tn0 r6 = r6.a(r3)
            if (r1 == 0) goto L6a
            com.yandex.mobile.ads.impl.a5 r7 = r12.f30874d
            androidx.media3.common.AdPlaybackState r7 = r7.a()
            int r8 = r7.adGroupCount
            r9 = -1
            if (r8 <= r2) goto L64
            if (r2 == r9) goto L64
            androidx.media3.common.AdPlaybackState$AdGroup r2 = r7.getAdGroup(r2)
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
            com.yandex.mobile.ads.impl.y2 r2 = r12.f30872b
            r2.a(r3, r6)
        L74:
            com.yandex.mobile.ads.impl.x4 r2 = r12.f30873c
            r2.a(r0, r1)
        L79:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.nh1.a():void");
    }
}
