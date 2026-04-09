package com.yandex.mobile.ads.impl;

/* loaded from: classes3.dex */
public final class u71 implements za1 {

    /* renamed from: a, reason: collision with root package name */
    private final ta1 f33965a;

    /* renamed from: b, reason: collision with root package name */
    private ie2 f33966b;

    public u71(ta1 nativeVideoController, de2 videoLifecycleListener, ie2 ie2Var) {
        kotlin.jvm.internal.l.f(nativeVideoController, "nativeVideoController");
        kotlin.jvm.internal.l.f(videoLifecycleListener, "videoLifecycleListener");
        this.f33965a = nativeVideoController;
        this.f33966b = ie2Var;
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void b() {
        ie2 ie2Var = this.f33966b;
        if (ie2Var != null) {
            ie2Var.onVideoComplete();
        }
    }

    public final void c() {
        this.f33965a.b(this);
        this.f33966b = null;
    }

    public final void d() {
        this.f33965a.a(this);
    }

    @Override // com.yandex.mobile.ads.impl.za1
    public final void a(long j4, long j10) {
    }
}
