package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Vh implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4927ri f40290a;

    public Vh(C4927ri c4927ri) {
        this.f40290a = c4927ri;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f40290a;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).resumeSession();
    }
}
