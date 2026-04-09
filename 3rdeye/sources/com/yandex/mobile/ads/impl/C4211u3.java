package com.yandex.mobile.ads.impl;

/* renamed from: com.yandex.mobile.ads.impl.u3, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4211u3 implements cc2<tn0> {

    /* renamed from: a, reason: collision with root package name */
    private final yn0 f33894a;

    /* renamed from: b, reason: collision with root package name */
    private final dv f33895b;

    /* renamed from: c, reason: collision with root package name */
    private C4163n3 f33896c;

    public C4211u3(ab2 adCreativePlaybackListener, dv currentAdCreativePlaybackEventListener) {
        kotlin.jvm.internal.l.f(adCreativePlaybackListener, "adCreativePlaybackListener");
        kotlin.jvm.internal.l.f(currentAdCreativePlaybackEventListener, "currentAdCreativePlaybackEventListener");
        this.f33894a = adCreativePlaybackListener;
        this.f33895b = currentAdCreativePlaybackEventListener;
    }

    private final boolean h(mb2<tn0> mb2Var) {
        C4163n3 c4163n3 = this.f33896c;
        return kotlin.jvm.internal.l.b(c4163n3 != null ? c4163n3.b() : null, mb2Var);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo, kc2 videoAdPlayerError) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
        this.f33894a.h(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.a(videoAdInfo, videoAdPlayerError);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void b(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.c(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.b(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void c(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.d(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.c(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void d(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.b(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.d(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void e(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.f(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.e(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void f(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.e(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.f(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void g(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.g(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.g(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void i(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.j(videoAdInfo.d());
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void j(mb2<tn0> videoAdInfo) {
        C4225w3 c4225w3A;
        qn0 qn0VarA;
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        C4163n3 c4163n3 = this.f33896c;
        if (c4163n3 == null || (c4225w3A = c4163n3.a(videoAdInfo)) == null || (qn0VarA = c4225w3A.a()) == null) {
            return;
        }
        qn0VarA.e();
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void k(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void l(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.a(videoAdInfo.d());
        if (h(videoAdInfo)) {
            this.f33895b.a(videoAdInfo);
        }
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo, float f10) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f33894a.a(videoAdInfo.d(), f10);
    }

    public final void a(C4163n3 c4163n3) {
        this.f33896c = c4163n3;
    }
}
