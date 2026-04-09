package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.m1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4781m1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41231a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f41232b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41233c;

    public RunnableC4781m1(C4859p1 c4859p1, String str, Throwable th) {
        this.f41233c = c4859p1;
        this.f41231a = str;
        this.f41232b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41233c).reportError(this.f41231a, this.f41232b);
    }
}
