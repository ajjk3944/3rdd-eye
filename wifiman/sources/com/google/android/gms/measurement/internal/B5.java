package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class B5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f35797a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4994x5 f35798b;

    B5(C4994x5 c4994x5, long j10) {
        this.f35797a = j10;
        this.f35798b = c4994x5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35798b.k().s(this.f35797a);
        this.f35798b.f36863e = null;
    }
}
