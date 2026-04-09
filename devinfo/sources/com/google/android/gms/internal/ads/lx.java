package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lx implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f13676a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ nx f13677b;

    public /* synthetic */ lx(nx nxVar, int i4) {
        this.f13676a = i4;
        this.f13677b = nxVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f13676a) {
            case 0:
                sx sxVar = this.f13677b.f14473q;
                if (sxVar != null) {
                    sxVar.h();
                    break;
                }
                break;
            case 1:
                sx sxVar2 = this.f13677b.f14473q;
                if (sxVar2 != null) {
                    rx rxVar = sxVar2.f16571e;
                    rxVar.f15781c = false;
                    ya.b0 b0Var = ya.f0.f37440l;
                    b0Var.removeCallbacks(rxVar);
                    b0Var.postDelayed(rxVar, 250L);
                    b0Var.post(new qx(sxVar2, 0));
                    break;
                }
                break;
            case 2:
                nx nxVar = this.f13677b;
                sx sxVar3 = nxVar.f14473q;
                if (sxVar3 != null) {
                    sxVar3.g();
                    nxVar.f14473q.i();
                    break;
                }
                break;
            case 3:
                nx nxVar2 = this.f13677b;
                sx sxVar4 = nxVar2.f14473q;
                if (sxVar4 != null) {
                    if (!nxVar2.f14474r) {
                        sxVar4.k();
                        nxVar2.f14474r = true;
                    }
                    nxVar2.f14473q.f();
                    break;
                }
                break;
            default:
                sx sxVar5 = this.f13677b.f14473q;
                if (sxVar5 != null) {
                    sxVar5.g();
                    break;
                }
                break;
        }
    }
}
