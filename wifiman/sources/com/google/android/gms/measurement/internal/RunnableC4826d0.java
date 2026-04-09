package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4826d0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f36372a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ B f36373b;

    RunnableC4826d0(B b10, long j10) {
        this.f36372a = j10;
        this.f36373b = b10;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36373b.y(this.f36372a);
    }
}
