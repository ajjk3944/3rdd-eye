package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dy implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10604a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ gy f10605b;

    public /* synthetic */ dy(gy gyVar, int i4) {
        this.f10604a = i4;
        this.f10605b = gyVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10604a) {
            case 0:
                sx sxVar = this.f10605b.g;
                if (sxVar != null) {
                    sxVar.e();
                    break;
                }
                break;
            case 1:
                sx sxVar2 = this.f10605b.g;
                if (sxVar2 != null) {
                    sxVar2.k();
                    break;
                }
                break;
            case 2:
                sx sxVar3 = this.f10605b.g;
                if (sxVar3 != null) {
                    sxVar3.h();
                    break;
                }
                break;
            case 3:
                sx sxVar4 = this.f10605b.g;
                if (sxVar4 != null) {
                    sxVar4.f();
                    break;
                }
                break;
            case 4:
                sx sxVar5 = this.f10605b.g;
                if (sxVar5 != null) {
                    sxVar5.g();
                    break;
                }
                break;
            case 5:
                sx sxVar6 = this.f10605b.g;
                if (sxVar6 != null) {
                    rx rxVar = sxVar6.f16571e;
                    rxVar.f15781c = false;
                    ya.b0 b0Var = ya.f0.f37440l;
                    b0Var.removeCallbacks(rxVar);
                    b0Var.postDelayed(rxVar, 250L);
                    b0Var.post(new qx(sxVar6, 0));
                    break;
                }
                break;
            case 6:
                sx sxVar7 = this.f10605b.g;
                if (sxVar7 != null) {
                    sxVar7.i();
                    break;
                }
                break;
            default:
                gy gyVar = this.f10605b;
                cy cyVar = gyVar.f15133b;
                float f10 = cyVar.f10255c ? cyVar.f10257e ? 0.0f : cyVar.f10258f : 0.0f;
                fz fzVar = gyVar.f11639i;
                if (fzVar == null) {
                    za.i.h("Trying to set volume before player is initialized.");
                    break;
                } else {
                    try {
                        ou1 ou1Var = fzVar.g;
                        if (ou1Var != null) {
                            ou1Var.f14807d.d();
                            ou1Var.f14806c.v1(f10);
                            break;
                        }
                    } catch (IOException e2) {
                        za.i.i("", e2);
                        return;
                    }
                }
                break;
        }
    }
}
