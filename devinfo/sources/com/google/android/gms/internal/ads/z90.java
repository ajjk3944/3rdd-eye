package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final /* synthetic */ class z90 implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ca0 f19048b;

    public /* synthetic */ z90(ca0 ca0Var, int i4) {
        this.f19047a = i4;
        this.f19048b = ca0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f19047a) {
            case 0:
                ca0 ca0Var = this.f19048b;
                ca0Var.f10024n.u();
                ga0 ga0Var = ca0Var.f10023m;
                synchronized (ga0Var) {
                    try {
                        qz qzVar = ga0Var.f11420i;
                        if (qzVar != null) {
                            qzVar.destroy();
                            ga0Var.f11420i = null;
                        }
                        qz qzVar2 = ga0Var.j;
                        if (qzVar2 != null) {
                            qzVar2.destroy();
                            ga0Var.j = null;
                        }
                        qz qzVar3 = ga0Var.f11421k;
                        if (qzVar3 != null) {
                            qzVar3.destroy();
                            ga0Var.f11421k = null;
                        }
                        vd.b bVar = ga0Var.f11423m;
                        if (bVar != null) {
                            bVar.cancel(false);
                            ga0Var.f11423m = null;
                        }
                        gx gxVar = ga0Var.f11424n;
                        if (gxVar != null) {
                            gxVar.cancel(false);
                            ga0Var.f11424n = null;
                        }
                        ga0Var.f11422l = null;
                        ga0Var.f11432v.clear();
                        ga0Var.f11433w.clear();
                        ga0Var.f11414b = null;
                        ga0Var.f11415c = null;
                        ga0Var.f11416d = null;
                        ga0Var.f11417e = null;
                        ga0Var.f11419h = null;
                        ga0Var.f11425o = null;
                        ga0Var.f11426p = null;
                        ga0Var.f11427q = null;
                        ga0Var.f11429s = null;
                        ga0Var.f11430t = null;
                        ga0Var.f11431u = null;
                    } finally {
                    }
                }
                return;
            default:
                ca0 ca0Var2 = this.f19048b;
                ka0 ka0Var = ca0Var2.f10027q;
                try {
                    ga0 ga0Var2 = ca0Var2.f10023m;
                    int iW = ga0Var2.W();
                    if (iW == 1) {
                        ln lnVar = ka0Var.f13091a;
                        if (lnVar != null) {
                            ca0Var2.p();
                            hn hnVar = (hn) ca0Var2.f10028r.a();
                            Parcel parcelT = lnVar.T();
                            ng.e(parcelT, hnVar);
                            lnVar.g1(parcelT, 1);
                            return;
                        }
                        return;
                    }
                    if (iW == 2) {
                        kn knVar = ka0Var.f13092b;
                        if (knVar != null) {
                            ca0Var2.p();
                            gn gnVar = (gn) ca0Var2.f10029s.a();
                            Parcel parcelT2 = knVar.T();
                            ng.e(parcelT2, gnVar);
                            knVar.g1(parcelT2, 1);
                            return;
                        }
                        return;
                    }
                    if (iW == 3) {
                        String strQ = ga0Var2.q();
                        pn pnVar = strQ == null ? null : (pn) ka0Var.f13096f.get(strQ);
                        if (pnVar != null) {
                            if (ga0Var2.r() != null) {
                                ca0Var2.g("Google", true);
                            }
                            pnVar.W3((jn) ca0Var2.f10032v.a());
                            return;
                        }
                        return;
                    }
                    if (iW == 6) {
                        un unVar = ka0Var.f13093c;
                        if (unVar != null) {
                            ca0Var2.p();
                            unVar.y1((xn) ca0Var2.f10030t.a());
                            return;
                        }
                        return;
                    }
                    if (iW != 7) {
                        za.i.e("Wrong native template id!");
                        return;
                    }
                    sp spVar = ka0Var.f13095e;
                    if (spVar != null) {
                        pp ppVar = (pp) ca0Var2.f10031u.a();
                        Parcel parcelT3 = spVar.T();
                        ng.e(parcelT3, ppVar);
                        spVar.g1(parcelT3, 1);
                        return;
                    }
                    return;
                } catch (RemoteException e2) {
                    za.i.f("RemoteException when notifyAdLoad is called", e2);
                    return;
                }
        }
    }
}
