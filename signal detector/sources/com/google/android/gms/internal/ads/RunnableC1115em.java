package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.em, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC1115em implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13969a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1278hm f13970b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B7 f13971c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ RunnableC1115em(C1278hm c1278hm, InterfaceViewOnClickListenerC0528Gm interfaceViewOnClickListenerC0528Gm, int i) {
        this.f13969a = i;
        switch (i) {
            case 1:
                this.f13970b = c1278hm;
                this.f13971c = (B7) interfaceViewOnClickListenerC0528Gm;
                break;
            default:
                this.f13970b = c1278hm;
                this.f13971c = (B7) interfaceViewOnClickListenerC0528Gm;
                break;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.B7, com.google.android.gms.internal.ads.Gm] */
    @Override // java.lang.Runnable
    public final /* synthetic */ void run() {
        switch (this.f13969a) {
            case 0:
                this.f13970b.j(this.f13971c);
                break;
            default:
                this.f13970b.k(this.f13971c);
                break;
        }
    }
}
