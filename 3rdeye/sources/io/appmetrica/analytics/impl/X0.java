package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class X0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40366a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40367b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40368c;

    public X0(C4859p1 c4859p1, String str, String str2) {
        this.f40368c = c4859p1;
        this.f40366a = str;
        this.f40367b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f40368c.f41402a;
        String str = this.f40366a;
        String str2 = this.f40367b;
        c4986u0.getClass();
        C4961t0.c().a(str, str2);
    }
}
