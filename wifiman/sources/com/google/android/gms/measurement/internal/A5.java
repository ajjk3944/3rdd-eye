package com.google.android.gms.measurement.internal;

/* loaded from: classes.dex */
final class A5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4970u5 f35777a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f35778b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ C4994x5 f35779c;

    A5(C4994x5 c4994x5, C4970u5 c4970u5, long j10) {
        this.f35777a = c4970u5;
        this.f35778b = j10;
        this.f35779c = c4994x5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f35779c.F(this.f35777a, false, this.f35778b);
        C4994x5 c4994x5 = this.f35779c;
        c4994x5.f36863e = null;
        c4994x5.q().J(null);
    }
}
