package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.oi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4850oi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41378a;

    public RunnableC4850oi(C4927ri c4927ri) {
        this.f41378a = c4927ri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41378a;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).clearAppEnvironment();
    }
}
