package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.pi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4876pi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41431a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41432b;

    public RunnableC4876pi(C4927ri c4927ri, String str) {
        this.f41432b = c4927ri;
        this.f41431a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41432b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportEvent(this.f41431a);
    }
}
