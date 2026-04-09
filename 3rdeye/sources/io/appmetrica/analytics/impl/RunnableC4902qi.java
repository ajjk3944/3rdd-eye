package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.qi, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4902qi implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41486a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41487b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4927ri f41488c;

    public RunnableC4902qi(C4927ri c4927ri, String str, String str2) {
        this.f41488c = c4927ri;
        this.f41486a = str;
        this.f41487b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4927ri c4927ri = this.f41488c;
        C4927ri.a(c4927ri.f41581a, c4927ri.f41584d, c4927ri.f41585e).reportEvent(this.f41486a, this.f41487b);
    }
}
