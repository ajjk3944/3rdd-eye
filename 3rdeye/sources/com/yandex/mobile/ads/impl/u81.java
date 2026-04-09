package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class u81 implements sc0 {

    /* renamed from: a, reason: collision with root package name */
    private final sl1 f33969a;

    /* renamed from: b, reason: collision with root package name */
    private final gg1 f33970b;

    /* renamed from: c, reason: collision with root package name */
    private final rl1 f33971c;

    /* renamed from: d, reason: collision with root package name */
    private final InterfaceC4216v1 f33972d;

    /* renamed from: e, reason: collision with root package name */
    private final hz f33973e;

    public final class a implements ig1, z42 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            u81.this.f33969a.a();
        }

        @Override // com.yandex.mobile.ads.impl.z42
        public final void a(long j4, long j10) {
            long jA = u81.this.f33971c.a() + (u81.this.f33973e.a() - j4);
            u81.this.f33969a.a(u81.this.f33972d.a(), jA);
        }
    }

    public u81(sl1 progressListener, s42 timeProviderContainer, gg1 pausableTimer, rl1 progressIncrementer, InterfaceC4216v1 adBlockDurationProvider, hz defaultContentDelayProvider) {
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        kotlin.jvm.internal.l.f(progressIncrementer, "progressIncrementer");
        kotlin.jvm.internal.l.f(adBlockDurationProvider, "adBlockDurationProvider");
        kotlin.jvm.internal.l.f(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f33969a = progressListener;
        this.f33970b = pausableTimer;
        this.f33971c = progressIncrementer;
        this.f33972d = adBlockDurationProvider;
        this.f33973e = defaultContentDelayProvider;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f33970b.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
        this.f33970b.pause();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
        this.f33970b.resume();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        a aVar = new a();
        this.f33970b.a(this.f33973e.a(), aVar);
        this.f33970b.a(aVar);
    }
}
