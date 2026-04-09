package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class U3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ L f36222a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ t7 f36223b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ A3 f36224c;

    U3(A3 a32, L l10, t7 t7Var) {
        this.f36222a = l10;
        this.f36223b = t7Var;
        this.f36224c = a32;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36224c.x0(this.f36224c.t0(this.f36222a, this.f36223b), this.f36223b);
    }
}
