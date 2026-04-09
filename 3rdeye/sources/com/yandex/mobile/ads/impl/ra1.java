package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class ra1 implements sc0, za1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f32570a;

    /* renamed from: b, reason: collision with root package name */
    private final tp f32571b;

    /* renamed from: c, reason: collision with root package name */
    private final Long f32572c;

    /* renamed from: d, reason: collision with root package name */
    private final up f32573d;

    /* renamed from: e, reason: collision with root package name */
    private final ep f32574e;

    public ra1(a8<?> adResponse, ta1 nativeVideoController, tp closeShowListener, s42 timeProviderContainer, Long l5, up closeTimerProgressIncrementer, ep closableAdChecker) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeVideoController, "nativeVideoController");
        kotlin.jvm.internal.l.f(closeShowListener, "closeShowListener");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        kotlin.jvm.internal.l.f(closableAdChecker, "closableAdChecker");
        this.f32570a = nativeVideoController;
        this.f32571b = closeShowListener;
        this.f32572c = l5;
        this.f32573d = closeTimerProgressIncrementer;
        this.f32574e = closableAdChecker;
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a(long j4, long j10) {
        if (this.f32574e.a()) {
            this.f32573d.a(j4 - j10, j10);
            long jA = this.f32573d.a() + j10;
            Long l5 = this.f32572c;
            if (l5 == null || jA < l5.longValue()) {
                return;
            }
            this.f32571b.a();
            this.f32570a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void b() {
        if (this.f32574e.a()) {
            this.f32571b.a();
            this.f32570a.b(this);
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f32570a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        this.f32570a.a(this);
        if (!this.f32574e.a() || this.f32572c == null || this.f32573d.a() < this.f32572c.longValue()) {
            return;
        }
        this.f32571b.a();
        this.f32570a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a() {
        this.f32571b.a();
        this.f32570a.b(this);
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
    }
}
