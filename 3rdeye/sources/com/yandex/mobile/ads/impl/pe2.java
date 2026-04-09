package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class pe2 implements gu {

    /* renamed from: a, reason: collision with root package name */
    private final te2 f31720a;

    /* renamed from: b, reason: collision with root package name */
    private final eo0 f31721b;

    /* renamed from: c, reason: collision with root package name */
    private final tf2 f31722c;

    /* renamed from: d, reason: collision with root package name */
    private re2 f31723d;

    public pe2(te2 videoPlayerController, eo0 instreamVideoPresenter) {
        kotlin.jvm.internal.l.f(videoPlayerController, "videoPlayerController");
        kotlin.jvm.internal.l.f(instreamVideoPresenter, "instreamVideoPresenter");
        this.f31720a = videoPlayerController;
        this.f31721b = instreamVideoPresenter;
        this.f31722c = videoPlayerController.a();
    }

    public final void a() {
        int iOrdinal = this.f31722c.a().ordinal();
        if (iOrdinal == 0) {
            this.f31721b.g();
            return;
        }
        if (iOrdinal == 7) {
            this.f31721b.e();
            return;
        }
        if (iOrdinal == 4) {
            this.f31720a.d();
            this.f31721b.i();
        } else {
            if (iOrdinal != 5) {
                return;
            }
            this.f31721b.b();
        }
    }

    public final void b() {
        int iOrdinal = this.f31722c.a().ordinal();
        if (iOrdinal == 1 || iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4 || iOrdinal == 6 || iOrdinal == 7) {
            this.f31722c.a(sf2.f32968b);
            re2 re2Var = this.f31723d;
            if (re2Var != null) {
                re2Var.a();
            }
        }
    }

    public final void c() {
        int iOrdinal = this.f31722c.a().ordinal();
        if (iOrdinal == 2 || iOrdinal == 3) {
            this.f31720a.d();
        }
    }

    public final void d() {
        this.f31722c.a(sf2.f32969c);
        this.f31720a.e();
    }

    public final void e() {
        int iOrdinal = this.f31722c.a().ordinal();
        if (iOrdinal == 2 || iOrdinal == 6) {
            this.f31720a.f();
        }
    }

    public final void f() {
        int iOrdinal = this.f31722c.a().ordinal();
        if (iOrdinal == 1) {
            this.f31722c.a(sf2.f32968b);
        } else if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 6) {
            this.f31722c.a(sf2.f32972f);
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoCompleted() {
        this.f31722c.a(sf2.f32973g);
        re2 re2Var = this.f31723d;
        if (re2Var != null) {
            re2Var.onVideoCompleted();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoError() {
        this.f31722c.a(sf2.i);
        re2 re2Var = this.f31723d;
        if (re2Var != null) {
            re2Var.onVideoError();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPaused() {
        this.f31722c.a(sf2.f32974h);
        re2 re2Var = this.f31723d;
        if (re2Var != null) {
            re2Var.onVideoPaused();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoPrepared() {
        if (sf2.f32969c == this.f31722c.a()) {
            this.f31722c.a(sf2.f32970d);
            this.f31721b.f();
        }
    }

    @Override // com.yandex.mobile.ads.impl.gu
    public final void onVideoResumed() {
        this.f31722c.a(sf2.f32971e);
        re2 re2Var = this.f31723d;
        if (re2Var != null) {
            re2Var.onVideoResumed();
        }
    }

    public final void a(re2 re2Var) {
        this.f31723d = re2Var;
    }
}
