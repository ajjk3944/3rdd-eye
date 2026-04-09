package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Th implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40180a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40181b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Throwable f40182c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40183d;

    public Th(C4927ri c4927ri, String str, String str2, Throwable th) {
        this.f40183d = c4927ri;
        this.f40180a = str;
        this.f40181b = str2;
        this.f40182c = th;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40183d;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportError(this.f40180a, this.f40181b, this.f40182c);
    }
}
