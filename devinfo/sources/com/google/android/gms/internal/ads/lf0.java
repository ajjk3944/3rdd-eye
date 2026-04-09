package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lf0 extends ab.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13484d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13485e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13486f;

    public lf0(pf0 pf0Var, String str) {
        this.f13485e = str;
        Objects.requireNonNull(pf0Var);
        this.f13486f = pf0Var;
    }

    @Override // pa.u
    public final void c(pa.l lVar) {
        switch (this.f13484d) {
            case 0:
                ((pf0) this.f13486f).j4(pf0.m4(lVar));
                break;
            default:
                ((pi.g) this.f13485e).B(lVar.toString());
                break;
        }
    }

    @Override // pa.u
    public final void f(Object obj) {
        switch (this.f13484d) {
            case 0:
                ((pf0) this.f13486f).i4((lv) obj, (String) this.f13485e);
                break;
            default:
                lv lvVar = (lv) obj;
                pi.g gVar = (pi.g) this.f13485e;
                nk.k.e(lvVar, "rewardedAd");
                km.n nVar = new km.n(13, (pi.a) this.f13486f, gVar);
                try {
                    cv cvVar = lvVar.f13639a;
                    if (cvVar != null) {
                        cvVar.M2(new va.s2(nVar));
                    }
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                }
                gVar.E(new km.o(false, lvVar, gVar));
                break;
        }
    }

    public lf0(pi.g gVar, pi.a aVar) {
        this.f13485e = gVar;
        this.f13486f = aVar;
    }
}
