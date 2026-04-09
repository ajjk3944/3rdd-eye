package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.a1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4471a1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40504a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40505b;

    public RunnableC4471a1(C4859p1 c4859p1, String str) {
        this.f40505b = c4859p1;
        this.f40504a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40505b).a(this.f40504a);
    }
}
