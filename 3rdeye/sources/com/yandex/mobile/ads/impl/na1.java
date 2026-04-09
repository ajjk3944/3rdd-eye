package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class na1 {

    /* renamed from: a, reason: collision with root package name */
    private final uh1 f30821a;

    /* renamed from: b, reason: collision with root package name */
    private final df2 f30822b;

    /* renamed from: c, reason: collision with root package name */
    private final th2 f30823c;

    public na1(eg2 viewAdapter, ia1 nativeVideoAdPlayer, sb1 videoViewProvider, za1 listener) {
        kotlin.jvm.internal.l.f(viewAdapter, "viewAdapter");
        kotlin.jvm.internal.l.f(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        kotlin.jvm.internal.l.f(videoViewProvider, "videoViewProvider");
        kotlin.jvm.internal.l.f(listener, "listener");
        ka1 ka1Var = new ka1(nativeVideoAdPlayer);
        this.f30821a = new uh1(listener);
        this.f30822b = new df2(viewAdapter);
        this.f30823c = new th2(ka1Var, videoViewProvider);
    }

    public final void a(qc2 progressEventsObservable) {
        kotlin.jvm.internal.l.f(progressEventsObservable, "progressEventsObservable");
        progressEventsObservable.a(this.f30821a, this.f30822b, this.f30823c);
    }
}
