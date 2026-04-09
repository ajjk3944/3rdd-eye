package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class my1 implements jb0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14070a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l90 f14071b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cy1 f14072c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ a0.c0 f14073d;

    public /* synthetic */ my1(l90 l90Var, cy1 cy1Var, a0.c0 c0Var, int i4) {
        this.f14070a = i4;
        this.f14071b = l90Var;
        this.f14072c = cy1Var;
        this.f14073d = c0Var;
    }

    @Override // com.google.android.gms.internal.ads.jb0, com.google.android.gms.internal.ads.rd0
    /* renamed from: c */
    public final /* synthetic */ void mo160c(Object obj) {
        switch (this.f14070a) {
            case 0:
                ((oy1) obj).j(0, (jy1) this.f14071b.f13426b, this.f14072c, this.f14073d);
                break;
            default:
                ((oy1) obj).h(0, (jy1) this.f14071b.f13426b, this.f14072c, this.f14073d);
                break;
        }
    }
}
