package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Sh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40117a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Throwable f40118b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40119c;

    public Sh(C4927ri c4927ri, String str, Throwable th) {
        this.f40119c = c4927ri;
        this.f40117a = str;
        this.f40118b = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40119c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportError(this.f40117a, this.f40118b);
    }
}
