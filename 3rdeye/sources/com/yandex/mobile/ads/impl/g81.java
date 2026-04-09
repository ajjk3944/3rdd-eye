package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gg1;

/* loaded from: classes3.dex */
public final class g81 implements sc0 {

    /* renamed from: a, reason: collision with root package name */
    private final gg1 f27581a;

    /* renamed from: b, reason: collision with root package name */
    private final hz f27582b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4224w2 f27583c;

    /* renamed from: d, reason: collision with root package name */
    private sl1 f27584d;

    public final class a implements ig1 {
        public a() {
        }

        @Override // com.yandex.mobile.ads.impl.ig1
        public final void a() {
            g81.b(g81.this);
        }
    }

    public final class b implements z42 {

        /* renamed from: a, reason: collision with root package name */
        private final long f27586a;

        public b(long j4) {
            this.f27586a = j4;
        }

        @Override // com.yandex.mobile.ads.impl.z42
        public final void a(long j4, long j10) {
            sl1 sl1Var = g81.this.f27584d;
            if (sl1Var != null) {
                long j11 = this.f27586a;
                sl1Var.a(j11, j11 - j4);
            }
        }
    }

    public /* synthetic */ g81(InterfaceC4224w2 interfaceC4224w2, s42 s42Var, sl1 sl1Var) {
        this(interfaceC4224w2, s42Var, sl1Var, gg1.a.a(false), s42Var.d());
    }

    public static final void b(g81 g81Var) {
        sl1 sl1Var = g81Var.f27584d;
        if (sl1Var != null) {
            sl1Var.a();
        }
        InterfaceC4224w2 interfaceC4224w2 = g81Var.f27583c;
        if (interfaceC4224w2 != null) {
            interfaceC4224w2.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f27581a.invalidate();
        this.f27581a.a(null);
        this.f27583c = null;
        this.f27584d = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
        this.f27581a.pause();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
        this.f27581a.resume();
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        a aVar = new a();
        long jA = this.f27582b.a();
        this.f27581a.a(new b(jA));
        this.f27581a.a(jA, aVar);
    }

    public g81(InterfaceC4224w2 adCompleteListener, s42 timeProviderContainer, sl1 progressListener, gg1 pausableTimer, hz defaultContentDelayProvider) {
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(timeProviderContainer, "timeProviderContainer");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        kotlin.jvm.internal.l.f(pausableTimer, "pausableTimer");
        kotlin.jvm.internal.l.f(defaultContentDelayProvider, "defaultContentDelayProvider");
        this.f27581a = pausableTimer;
        this.f27582b = defaultContentDelayProvider;
        this.f27583c = adCompleteListener;
        this.f27584d = progressListener;
    }
}
