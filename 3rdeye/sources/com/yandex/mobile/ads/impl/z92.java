package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class z92<T> implements pc2 {

    /* renamed from: a, reason: collision with root package name */
    private final zf2 f36255a;

    /* renamed from: b, reason: collision with root package name */
    private final jc2<T> f36256b;

    /* renamed from: c, reason: collision with root package name */
    private final gg2 f36257c;

    /* renamed from: d, reason: collision with root package name */
    private boolean f36258d;

    public /* synthetic */ z92(fg2 fg2Var, ag2 ag2Var, jc2 jc2Var) {
        this(fg2Var, ag2Var, jc2Var, new gg2(fg2Var));
    }

    @Override // com.yandex.mobile.ads.impl.pc2
    public final void a(long j4, long j10) {
        if (this.f36258d || j10 <= 0 || !this.f36257c.a()) {
            return;
        }
        this.f36258d = true;
        this.f36255a.a(this.f36256b.getVolume(), j4);
    }

    public z92(fg2 videoViewProvider, ag2 videoTracker, jc2 videoAdPlayer, gg2 singlePercentAreaValidator) {
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        kotlin.jvm.internal.l.f(videoAdPlayer, "videoAdPlayer");
        kotlin.jvm.internal.l.f(singlePercentAreaValidator, "singlePercentAreaValidator");
        this.f36255a = videoTracker;
        this.f36256b = videoAdPlayer;
        this.f36257c = singlePercentAreaValidator;
    }
}
