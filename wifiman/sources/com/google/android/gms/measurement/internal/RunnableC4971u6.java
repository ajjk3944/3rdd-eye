package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.u6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4971u6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36786a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ Runnable f36787b;

    RunnableC4971u6(C4940q6 c4940q6, C4833d7 c4833d7, Runnable runnable) {
        this.f36786a = c4833d7;
        this.f36787b = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36786a.K0();
        this.f36786a.B(this.f36787b);
        this.f36786a.P0();
    }
}
