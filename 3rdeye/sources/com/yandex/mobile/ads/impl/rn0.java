package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.gn0;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes3.dex */
public final class rn0 implements cc2<tn0>, gn0.a {

    /* renamed from: a, reason: collision with root package name */
    private final cc2<tn0> f32720a;

    /* renamed from: b, reason: collision with root package name */
    private final AtomicInteger f32721b;

    public rn0(cc2<tn0> listener) {
        kotlin.jvm.internal.l.f(listener, "listener");
        this.f32720a = listener;
        this.f32721b = new AtomicInteger(2);
    }

    private final void m(mb2<tn0> mb2Var) {
        if (this.f32721b.decrementAndGet() == 0) {
            this.f32720a.d(mb2Var);
        }
    }

    public final void a() {
        this.f32721b.set(2);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void b(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.b(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void c(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.c(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void d(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void e(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.e(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void f(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.f(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void g(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.g(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.gn0.a
    public final void h(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        m(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void i(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.i(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void j(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.j(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void k(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.k(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void l(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.l(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo, kc2 videoAdPlayerError) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        kotlin.jvm.internal.l.f(videoAdPlayerError, "videoAdPlayerError");
        this.f32720a.a(videoAdInfo, videoAdPlayerError);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.a(videoAdInfo);
    }

    @Override // com.yandex.mobile.ads.impl.cc2
    public final void a(mb2<tn0> videoAdInfo, float f10) {
        kotlin.jvm.internal.l.f(videoAdInfo, "videoAdInfo");
        this.f32720a.a(videoAdInfo, f10);
    }
}
