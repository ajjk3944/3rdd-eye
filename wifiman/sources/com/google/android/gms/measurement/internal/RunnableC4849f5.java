package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4849f5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4839e4 f36450a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f36451b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f36452c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36453d;

    RunnableC4849f5(C4945r4 c4945r4, C4839e4 c4839e4, long j10, boolean z10) {
        this.f36450a = c4839e4;
        this.f36451b = j10;
        this.f36452c = z10;
        this.f36453d = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36453d.N(this.f36450a);
        C4945r4.V(this.f36453d, this.f36450a, this.f36451b, false, this.f36452c);
    }
}
