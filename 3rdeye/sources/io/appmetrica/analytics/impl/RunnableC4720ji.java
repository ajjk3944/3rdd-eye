package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ji, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4720ji implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Kn f41118a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41119b;

    public RunnableC4720ji(C4927ri c4927ri, Kn kn) {
        this.f41119b = c4927ri;
        this.f41118a = kn;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41119b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).a(this.f41118a);
    }
}
