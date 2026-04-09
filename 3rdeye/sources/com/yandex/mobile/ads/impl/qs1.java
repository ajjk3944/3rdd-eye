package com.yandex.mobile.ads.impl;

import java.util.LinkedHashSet;

/* loaded from: classes3.dex */
public final class qs1 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f32333a = new LinkedHashSet();

    public final synchronized void a(ps1 route) {
        kotlin.jvm.internal.l.f(route, "route");
        this.f32333a.remove(route);
    }

    public final synchronized void b(ps1 failedRoute) {
        kotlin.jvm.internal.l.f(failedRoute, "failedRoute");
        this.f32333a.add(failedRoute);
    }

    public final synchronized boolean c(ps1 route) {
        kotlin.jvm.internal.l.f(route, "route");
        return this.f32333a.contains(route);
    }
}
