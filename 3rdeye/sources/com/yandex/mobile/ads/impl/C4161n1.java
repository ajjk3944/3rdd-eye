package com.yandex.mobile.ads.impl;

import android.app.Activity;

/* renamed from: com.yandex.mobile.ads.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4161n1 implements InterfaceC4126i1 {

    /* renamed from: a, reason: collision with root package name */
    private final Activity f30730a;

    /* renamed from: b, reason: collision with root package name */
    private final C4236y0 f30731b;

    /* renamed from: c, reason: collision with root package name */
    private final C4181q0 f30732c;

    public C4161n1(Activity activity, C4236y0 adActivityData, C4181q0 activityResultRegistrar) {
        kotlin.jvm.internal.l.f(activity, "activity");
        kotlin.jvm.internal.l.f(adActivityData, "adActivityData");
        kotlin.jvm.internal.l.f(activityResultRegistrar, "activityResultRegistrar");
        this.f30730a = activity;
        this.f30731b = adActivityData;
        this.f30732c = activityResultRegistrar;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void c() {
        this.f30732c.a(this.f30730a, this.f30731b);
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final boolean e() {
        return true;
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void a() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void b() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void d() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void g() {
    }

    @Override // com.yandex.mobile.ads.impl.InterfaceC4126i1
    public final void onAdClosed() {
    }
}
