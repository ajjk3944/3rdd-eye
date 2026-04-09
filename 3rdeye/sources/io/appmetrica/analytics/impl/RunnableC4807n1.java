package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.n1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4807n1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41285a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41286b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f41287c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41288d;

    public RunnableC4807n1(C4859p1 c4859p1, String str, String str2, Throwable th) {
        this.f41288d = c4859p1;
        this.f41285a = str;
        this.f41286b = str2;
        this.f41287c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41288d).reportError(this.f41285a, this.f41286b, this.f41287c);
    }
}
