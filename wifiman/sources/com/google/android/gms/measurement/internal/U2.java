package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class U2 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ boolean f36220a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V2 f36221b;

    U2(V2 v22, boolean z10) {
        this.f36220a = z10;
        this.f36221b = v22;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36221b.f36230a.N(this.f36220a);
    }
}
