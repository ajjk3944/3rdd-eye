package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class sa1 implements sc0, za1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f32919a;

    /* renamed from: b, reason: collision with root package name */
    private final Long f32920b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4224w2 f32921c;

    /* renamed from: d, reason: collision with root package name */
    private sl1 f32922d;

    public sa1(a8<?> adResponse, ta1 nativeVideoController, InterfaceC4224w2 adCompleteListener, sl1 progressListener, Long l5) {
        kotlin.jvm.internal.l.f(adResponse, "adResponse");
        kotlin.jvm.internal.l.f(nativeVideoController, "nativeVideoController");
        kotlin.jvm.internal.l.f(adCompleteListener, "adCompleteListener");
        kotlin.jvm.internal.l.f(progressListener, "progressListener");
        this.f32919a = nativeVideoController;
        this.f32920b = l5;
        this.f32921c = adCompleteListener;
        this.f32922d = progressListener;
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a(long j4, long j10) {
        sl1 sl1Var = this.f32922d;
        if (sl1Var != null) {
            sl1Var.a(j4, j10);
        }
        Long l5 = this.f32920b;
        if (l5 == null || j10 <= l5.longValue()) {
            return;
        }
        sl1 sl1Var2 = this.f32922d;
        if (sl1Var2 != null) {
            sl1Var2.a();
        }
        InterfaceC4224w2 interfaceC4224w2 = this.f32921c;
        if (interfaceC4224w2 != null) {
            interfaceC4224w2.b();
        }
        this.f32919a.b(this);
        this.f32921c = null;
        this.f32922d = null;
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void b() {
        sl1 sl1Var = this.f32922d;
        if (sl1Var != null) {
            sl1Var.a();
        }
        InterfaceC4224w2 interfaceC4224w2 = this.f32921c;
        if (interfaceC4224w2 != null) {
            interfaceC4224w2.b();
        }
        this.f32919a.b(this);
        this.f32921c = null;
        this.f32922d = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void invalidate() {
        this.f32919a.b(this);
        this.f32921c = null;
        this.f32922d = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void start() {
        this.f32919a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a() {
        InterfaceC4224w2 interfaceC4224w2 = this.f32921c;
        if (interfaceC4224w2 != null) {
            interfaceC4224w2.a();
        }
        this.f32921c = null;
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void pause() {
    }

    @Override // com.yandex.mobile.ads.impl.sc0
    public final void resume() {
    }
}
