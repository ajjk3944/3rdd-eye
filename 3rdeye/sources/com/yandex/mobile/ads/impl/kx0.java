package com.yandex.mobile.ads.impl;

import java.util.Iterator;
import java.util.WeakHashMap;

/* loaded from: classes3.dex */
public final class kx0 {

    /* renamed from: a, reason: collision with root package name */
    private final WeakHashMap<g51, Object> f29806a = new WeakHashMap<>();

    public final void a(g51 nativeAdEventController) {
        kotlin.jvm.internal.l.f(nativeAdEventController, "nativeAdEventController");
        this.f29806a.put(nativeAdEventController, null);
    }

    public final void b() {
        for (g51 g51Var : this.f29806a.keySet()) {
            g51Var.c();
            g51Var.a();
        }
    }

    public final void c() {
        Iterator<g51> it = this.f29806a.keySet().iterator();
        while (it.hasNext()) {
            it.next().d();
        }
    }

    public final void d() {
        Iterator<g51> it = this.f29806a.keySet().iterator();
        while (it.hasNext()) {
            it.next().e();
        }
    }

    public final void a() {
        Iterator<g51> it = this.f29806a.keySet().iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    public final void a(C4108f4 c4108f4) {
        Iterator<g51> it = this.f29806a.keySet().iterator();
        while (it.hasNext()) {
            it.next().a(c4108f4);
        }
    }
}
