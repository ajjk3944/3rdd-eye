package io.appmetrica.analytics.impl;

/* renamed from: io.appmetrica.analytics.impl.k1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class RunnableC4729k1 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f41126a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f41127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f41128c;

    public RunnableC4729k1(C4859p1 c4859p1, String str, String str2) {
        this.f41128c = c4859p1;
        this.f41126a = str;
        this.f41127b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f41128c).reportEvent(this.f41126a, this.f41127b);
    }
}
