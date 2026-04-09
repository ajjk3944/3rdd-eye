package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.ni, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4824ni implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41312a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41313b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41314c;

    public RunnableC4824ni(C4927ri c4927ri, String str, String str2) {
        this.f41314c = c4927ri;
        this.f41312a = str;
        this.f41313b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41314c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).putAppEnvironmentValue(this.f41312a, this.f41313b);
    }
}
