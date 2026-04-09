package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.j1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4703j1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41099a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41100b;

    public RunnableC4703j1(C4859p1 c4859p1, String str) {
        this.f41100b = c4859p1;
        this.f41099a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41100b).reportEvent(this.f41099a);
    }
}
