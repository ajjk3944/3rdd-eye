package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class I0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f39598a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f39599b;

    public I0(C4859p1 c4859p1, String str) {
        this.f39599b = c4859p1;
        this.f39598a = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f39599b.d().f39255b.a(this.f39598a, false);
    }
}
