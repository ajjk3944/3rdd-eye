package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class kf0 extends ab.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f13151d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f13152e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f13153f;

    public kf0(pf0 pf0Var, String str) {
        this.f13152e = str;
        Objects.requireNonNull(pf0Var);
        this.f13153f = pf0Var;
    }

    @Override // pa.u
    public final void c(pa.l lVar) {
        switch (this.f13151d) {
            case 0:
                ((pf0) this.f13153f).j4(pf0.m4(lVar));
                break;
            default:
                ((pi.g) this.f13152e).B("AdmobInter:" + lVar.f31511a);
                break;
        }
    }

    @Override // pa.u
    public final void f(Object obj) {
        switch (this.f13151d) {
            case 0:
                ((pf0) this.f13153f).i4((ab.a) obj, (String) this.f13152e);
                break;
            default:
                ab.a aVar = (ab.a) obj;
                pi.g gVar = (pi.g) this.f13152e;
                pi.a aVar2 = (pi.a) this.f13153f;
                nk.k.e(aVar, "interstitialAd");
                qi.c cVar = new qi.c(aVar2, gVar, 2);
                up upVar = (up) aVar;
                try {
                    va.l0 l0Var = upVar.f17283c;
                    if (l0Var != null) {
                        l0Var.d1(new va.s2(cVar));
                    }
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                }
                gVar.C(new i0.f(upVar, aVar2, gVar, 18));
                break;
        }
    }

    public kf0(pi.g gVar, pi.a aVar) {
        this.f13152e = gVar;
        this.f13153f = aVar;
    }
}
