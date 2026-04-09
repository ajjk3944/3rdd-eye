package com.yandex.mobile.ads.impl;

import android.view.View;
import com.yandex.mobile.ads.impl.zf2;
import java.util.List;

/* loaded from: classes3.dex */
public final class ag2 implements zf2 {

    /* renamed from: a, reason: collision with root package name */
    private final zf2 f24649a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f24650b;

    /* renamed from: c, reason: collision with root package name */
    private boolean f24651c;

    public ag2(ar videoTracker) {
        kotlin.jvm.internal.l.f(videoTracker, "videoTracker");
        this.f24649a = videoTracker;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(View view, List<kb2> friendlyOverlays) {
        kotlin.jvm.internal.l.f(view, "view");
        kotlin.jvm.internal.l.f(friendlyOverlays, "friendlyOverlays");
        this.f24649a.a(view, friendlyOverlays);
        this.f24650b = false;
        this.f24651c = false;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void b() {
        this.f24649a.b();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void c() {
        this.f24649a.c();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void d() {
        this.f24649a.d();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void e() {
        this.f24649a.e();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void f() {
        this.f24649a.f();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void g() {
        this.f24649a.g();
        k();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void h() {
        if (this.f24650b) {
            return;
        }
        this.f24650b = true;
        this.f24649a.h();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void i() {
        this.f24649a.i();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void j() {
        this.f24649a.j();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void k() {
        this.f24649a.k();
        this.f24650b = false;
        this.f24651c = false;
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void l() {
        this.f24649a.l();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void m() {
        this.f24649a.m();
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void n() {
        if (this.f24651c) {
            return;
        }
        this.f24651c = true;
        this.f24649a.n();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(String assetName) {
        kotlin.jvm.internal.l.f(assetName, "assetName");
        this.f24649a.a(assetName);
        h();
        n();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(kc2 error) {
        kotlin.jvm.internal.l.f(error, "error");
        this.f24649a.a(error);
        k();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(zf2.a quartile) {
        kotlin.jvm.internal.l.f(quartile, "quartile");
        this.f24649a.a(quartile);
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10, long j4) {
        this.f24649a.a(f10, j4);
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a() {
        this.f24649a.a();
    }

    @Override // com.yandex.mobile.ads.impl.zf2
    public final void a(float f10) {
        this.f24649a.a(f10);
    }
}
