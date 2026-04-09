package com.google.android.gms.measurement.internal;

/* renamed from: com.google.android.gms.measurement.internal.g5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class RunnableC4858g5 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ C4839e4 f36462a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ long f36463b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ boolean f36464c;

    /* renamed from: d, reason: collision with root package name */
    private final /* synthetic */ C4945r4 f36465d;

    RunnableC4858g5(C4945r4 c4945r4, C4839e4 c4839e4, long j10, boolean z10) {
        this.f36462a = c4839e4;
        this.f36463b = j10;
        this.f36464c = z10;
        this.f36465d = c4945r4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f36465d.N(this.f36462a);
        C4945r4.V(this.f36465d, this.f36462a, this.f36463b, true, this.f36464c);
    }
}
