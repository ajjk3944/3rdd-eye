package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class R0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40033a;

    public R0(C4859p1 c4859p1) {
        this.f40033a = c4859p1;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40033a).sendEventsBuffer();
    }
}
