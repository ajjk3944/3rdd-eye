package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f7, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4851f7 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ o7 f36459a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4833d7 f36460b;

    RunnableC4851f7(C4833d7 c4833d7, o7 o7Var) {
        this.f36459a = o7Var;
        this.f36460b = c4833d7;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4833d7.y(this.f36460b, this.f36459a);
        this.f36460b.O0();
    }
}
