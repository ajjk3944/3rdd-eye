package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.y6, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC5003y6 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ long f36886a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4987w6 f36887b;

    RunnableC5003y6(C4987w6 c4987w6, long j10) {
        this.f36886a = j10;
        this.f36887b = c4987w6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4987w6.z(this.f36887b, this.f36886a);
    }
}
