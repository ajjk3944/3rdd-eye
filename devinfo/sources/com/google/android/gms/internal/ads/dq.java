package com.google.android.gms.internal.ads;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class dq implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10541a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zp f10542b;

    public /* synthetic */ dq(zp zpVar, int i4) {
        this.f10541a = i4;
        this.f10542b = zpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f10541a) {
            case 0:
                zp zpVar = this.f10542b;
                qz qzVar = zpVar.f19142a;
                if (qzVar != null) {
                    qzVar.destroy();
                    zpVar.f19142a = null;
                    break;
                }
                break;
            case 1:
                zp zpVar2 = this.f10542b;
                qz qzVar2 = zpVar2.f19142a;
                if (qzVar2 != null) {
                    qzVar2.destroy();
                    zpVar2.f19142a = null;
                    break;
                }
                break;
            default:
                ya.a0.m("maybeDestroy > Destroying engine.");
                lo loVar = no.j;
                zp zpVar3 = this.f10542b;
                zpVar3.b("/result", loVar);
                qz qzVar3 = zpVar3.f19142a;
                if (qzVar3 != null) {
                    qzVar3.destroy();
                    zpVar3.f19142a = null;
                    break;
                }
                break;
        }
    }
}
