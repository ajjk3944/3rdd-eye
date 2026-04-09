package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class K0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39704a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39705b;

    public K0(C4859p1 c4859p1, String str) {
        this.f39705b = c4859p1;
        this.f39704a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f39705b).b(this.f39704a);
    }
}
