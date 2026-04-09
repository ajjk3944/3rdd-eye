package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class P0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39950a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39951b;

    public P0(C4859p1 c4859p1, String str) {
        this.f39951b = c4859p1;
        this.f39950a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f39951b.f41402a;
        String str = this.f39950a;
        c4986u0.getClass();
        C4961t0.c().setUserProfileID(str);
    }
}
