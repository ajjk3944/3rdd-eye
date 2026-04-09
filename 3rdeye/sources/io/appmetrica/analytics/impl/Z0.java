package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Z0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ String f40450a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ String f40451b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C4859p1 f40452c;

    public Z0(C4859p1 c4859p1, String str, String str2) {
        this.f40452c = c4859p1;
        this.f40450a = str;
        this.f40451b = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4859p1.a(this.f40452c).b(this.f40450a, this.f40451b);
    }
}
