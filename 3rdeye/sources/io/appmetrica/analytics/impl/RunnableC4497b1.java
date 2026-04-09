package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.b1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4497b1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40559a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40560b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40561c;

    public RunnableC4497b1(C4859p1 c4859p1, String str, String str2) {
        this.f40561c = c4859p1;
        this.f40559a = str;
        this.f40560b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4986u0 c4986u0 = this.f40561c.f41402a;
        String str = this.f40559a;
        String str2 = this.f40560b;
        c4986u0.getClass();
        C4961t0.c().putAppEnvironmentValue(str, str2);
    }
}
