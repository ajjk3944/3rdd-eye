package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Uh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Throwable f40242a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40243b;

    public Uh(C4927ri c4927ri, Throwable th) {
        this.f40243b = c4927ri;
        this.f40242a = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40243b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportUnhandledException(this.f40242a);
    }
}
