package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.v6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4979v6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f36836a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4987w6 f36837b;

    RunnableC4979v6(C4987w6 c4987w6, long j10) {
        this.f36836a = j10;
        this.f36837b = c4987w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4987w6.F(this.f36837b, this.f36836a);
    }
}
