package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class mv extends iv {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f14025a;

    /* renamed from: b, reason: collision with root package name */
    public final pa.u f14026b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f14027c;

    public /* synthetic */ mv(pa.u uVar, Object obj, int i4) {
        this.f14025a = i4;
        this.f14026b = uVar;
        this.f14027c = obj;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void K1(int i4) {
        int i10 = this.f14025a;
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void b(va.w1 w1Var) {
        switch (this.f14025a) {
            case 0:
                ab.b bVar = (ab.b) this.f14026b;
                if (bVar != null) {
                    bVar.c(w1Var.c());
                    break;
                }
                break;
            default:
                mf0 mf0Var = (mf0) this.f14026b;
                if (mf0Var != null) {
                    mf0Var.c(w1Var.c());
                    break;
                }
                break;
        }
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void c() {
        rv rvVar;
        switch (this.f14025a) {
            case 0:
                ab.b bVar = (ab.b) this.f14026b;
                if (bVar != null) {
                    bVar.f((lv) this.f14027c);
                    break;
                }
                break;
            default:
                mf0 mf0Var = (mf0) this.f14026b;
                if (mf0Var != null && (rvVar = (rv) this.f14027c) != null) {
                    mf0Var.f(rvVar);
                    break;
                }
                break;
        }
    }

    private final void h4(int i4) {
    }

    private final void i4(int i4) {
    }
}
