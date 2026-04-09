package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.AdRevenue;

/* loaded from: classes3.dex */
public final class T0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ AdRevenue f40146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40147b;

    public T0(C4859p1 c4859p1, AdRevenue adRevenue) {
        this.f40147b = c4859p1;
        this.f40146a = adRevenue;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40147b).reportAdRevenue(this.f40146a);
    }
}
