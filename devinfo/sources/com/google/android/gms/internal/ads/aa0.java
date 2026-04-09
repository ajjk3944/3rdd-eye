package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class aa0 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9290a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca0 f9291b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ mg f9292c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ aa0(ca0 ca0Var, bb0 bb0Var, int i4) {
        this.f9290a = i4;
        switch (i4) {
            case 1:
                this.f9291b = ca0Var;
                this.f9292c = (mg) bb0Var;
                break;
            default:
                this.f9291b = ca0Var;
                this.f9292c = (mg) bb0Var;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.bb0, com.google.android.gms.internal.ads.mg] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f9290a) {
            case 0:
                this.f9291b.j(this.f9292c);
                break;
            default:
                this.f9291b.k(this.f9292c);
                break;
        }
    }
}
