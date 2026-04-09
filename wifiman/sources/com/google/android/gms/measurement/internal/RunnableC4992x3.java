package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.x3, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4992x3 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4922o4 f36857a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ C4976v3 f36858b;

    RunnableC4992x3(C4976v3 c4976v3, C4922o4 c4922o4) {
        this.f36857a = c4922o4;
        this.f36858b = c4976v3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        C4976v3.e(this.f36858b, this.f36857a);
        this.f36858b.b(this.f36857a.f36626g);
    }
}
