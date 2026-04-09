package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gg1;

/* loaded from: classes3.dex */
public final class e81 implements sc0 {

    /* renamed from: a, reason: collision with root package name */
    private final tp f26727a;

    /* renamed from: b, reason: collision with root package name */
    private final up f26728b;

    /* renamed from: c, reason: collision with root package name */
    private final long f26729c;

    /* renamed from: d, reason: collision with root package name */
    private final gg1 f26730d;

    /* renamed from: e, reason: collision with root package name */
    private final a f26731e;

    public final class a implements ig1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            e81.a(e81.this);
        }
    }

    public /* synthetic */ e81(a8 a8Var, tp tpVar, s42 s42Var) {
        this(a8Var, tpVar, s42Var, s42Var.c(), f81.a(a8Var), gg1.a.a(false));
    }

    public static final void a(e81 e81Var) {
        e81Var.f26727a.a();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f26730d.invalidate();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
        this.f26730d.pause();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
        this.f26730d.resume();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        long jMax = Math.max(0L, this.f26729c - this.f26728b.a());
        this.f26730d.a(this.f26728b);
        this.f26730d.a(jMax, this.f26731e);
    }

    public e81(a8<?> adResponse, tp closeShowListener, s42 timeProviderContainer, up closeTimerProgressIncrementer, long j4, gg1 pausableTimer) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(closeShowListener, "closeShowListener");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(closeTimerProgressIncrementer, "closeTimerProgressIncrementer");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        this.f26727a = closeShowListener;
        this.f26728b = closeTimerProgressIncrementer;
        this.f26729c = j4;
        this.f26730d = pausableTimer;
        this.f26731e = new a();
    }
}
