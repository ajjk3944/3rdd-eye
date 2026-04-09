package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.li, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4772li implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ U f41205a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41206b;

    public RunnableC4772li(C4927ri c4927ri, U u8) {
        this.f41206b = c4927ri;
        this.f41205a = u8;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41206b;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).a(this.f41205a);
    }
}
