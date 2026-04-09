package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class hb1 implements sc0, za1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f28161a;

    /* renamed from: b, reason: collision with root package name */
    private final sl1 f28162b;

    /* renamed from: c, reason: collision with root package name */
    private final rl1 f28163c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4216v1 f28164d;

    public hb1(ta1 nativeVideoController, sl1 progressListener, s42 timeProviderContainer, rl1 progressIncrementer, InterfaceC4216v1 adBlockDurationProvider) {
        kotlin.jvm.internal.l.f(nativeVideoController, "nativeVideoController");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        kotlin.jvm.internal.l.f(adBlockDurationProvider, "adBlockDurationProvider");
        this.f28161a = nativeVideoController;
        this.f28162b = progressListener;
        this.f28163c = progressIncrementer;
        this.f28164d = adBlockDurationProvider;
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a(long j4, long j10) {
        long jA = this.f28163c.a() + j10;
        long jA2 = this.f28164d.a(j4);
        if (jA < jA2) {
            this.f28162b.a(jA2, jA);
        } else {
            this.f28161a.b(this);
            this.f28162b.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void b() {
        this.f28162b.a();
        this.f28161a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f28161a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        this.f28161a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a() {
        this.f28162b.a();
        this.f28161a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
    }
}
