package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class V1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ InterfaceC4820ne f40262a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ R7 f40263b;

    public V1(X1 x12, R7 r72) {
        this.f40262a = x12;
        this.f40263b = r72;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f40262a.consume(this.f40263b);
    }
}
