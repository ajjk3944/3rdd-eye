package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class g8 implements k8 {

    /* renamed from: a, reason: collision with root package name */
    private final j8 f27576a;

    /* renamed from: b, reason: collision with root package name */
    private final m8 f27577b;

    /* renamed from: c, reason: collision with root package name */
    private final ab2 f27578c;

    /* renamed from: d, reason: collision with root package name */
    private k8 f27579d;

    public g8(j8 adSectionPlaybackController, m8 adSectionStatusController, ab2 adCreativePlaybackProxyListener) {
        kotlin.jvm.internal.l.f(adSectionPlaybackController, "adSectionPlaybackController");
        kotlin.jvm.internal.l.f(adSectionStatusController, "adSectionStatusController");
        kotlin.jvm.internal.l.f(adCreativePlaybackProxyListener, "adCreativePlaybackProxyListener");
        this.f27576a = adSectionPlaybackController;
        this.f27577b = adSectionStatusController;
        this.f27578c = adCreativePlaybackProxyListener;
        adSectionPlaybackController.a(this);
        adSectionPlaybackController.a(adCreativePlaybackProxyListener);
    }

    @Override // com.yandex.mobile.ads.impl.k8
    public final void a() {
        this.f27577b.a(l8.f29920f);
        k8 k8Var = this.f27579d;
        if (k8Var != null) {
            k8Var.a();
        }
    }

    @Override // com.yandex.mobile.ads.impl.k8
    public final void b() {
        this.f27577b.a(l8.f29917c);
        k8 k8Var = this.f27579d;
        if (k8Var != null) {
            k8Var.b();
        }
    }

    @Override // com.yandex.mobile.ads.impl.k8
    public final void c() {
        this.f27577b.a(l8.f29919e);
        k8 k8Var = this.f27579d;
        if (k8Var != null) {
            k8Var.c();
        }
    }

    public final void d() {
        int iOrdinal = this.f27577b.a().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            this.f27576a.c();
        }
    }

    public final void e() {
        int iOrdinal = this.f27577b.a().ordinal();
        if (iOrdinal == 0 || iOrdinal == 1 || iOrdinal == 2) {
            this.f27576a.f();
        }
    }

    public final void f() {
        k8 k8Var;
        int iOrdinal = this.f27577b.a().ordinal();
        if (iOrdinal == 0) {
            this.f27576a.prepare();
            return;
        }
        if (iOrdinal != 1) {
            if (iOrdinal == 4 && (k8Var = this.f27579d) != null) {
                k8Var.a();
                return;
            }
            return;
        }
        k8 k8Var2 = this.f27579d;
        if (k8Var2 != null) {
            k8Var2.b();
        }
    }

    public final void g() {
        k8 k8Var;
        int iOrdinal = this.f27577b.a().ordinal();
        if (iOrdinal == 0) {
            this.f27576a.prepare();
            return;
        }
        if (iOrdinal == 2) {
            this.f27576a.resume();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4 && (k8Var = this.f27579d) != null) {
                k8Var.a();
                return;
            }
            return;
        }
        k8 k8Var2 = this.f27579d;
        if (k8Var2 != null) {
            k8Var2.c();
        }
    }

    public final void h() {
        k8 k8Var;
        int iOrdinal = this.f27577b.a().ordinal();
        if (iOrdinal == 0) {
            this.f27576a.prepare();
            return;
        }
        if (iOrdinal == 1) {
            this.f27577b.a(l8.f29918d);
            this.f27576a.start();
            return;
        }
        if (iOrdinal == 2) {
            this.f27576a.resume();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4 && (k8Var = this.f27579d) != null) {
                k8Var.a();
                return;
            }
            return;
        }
        k8 k8Var2 = this.f27579d;
        if (k8Var2 != null) {
            k8Var2.c();
        }
    }

    public final void a(yn0 yn0Var) {
        this.f27578c.a(yn0Var);
    }

    public final void a(k8 k8Var) {
        this.f27579d = k8Var;
    }
}
