package io.appmetrica.analytics.impl;

import android.location.Location;

/* loaded from: classes3.dex */
public final class L0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Location f39738a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39739b;

    public L0(C4859p1 c4859p1, Location location) {
        this.f39739b = c4859p1;
        this.f39738a = location;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f39739b.f41402a;
        Location location = this.f39738a;
        c4986u0.getClass();
        C4961t0.c().a(location);
    }
}
