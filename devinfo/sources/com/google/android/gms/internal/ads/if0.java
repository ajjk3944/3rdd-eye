package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import j$.util.Objects;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class if0 extends ab.b {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f12320d = 0;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f12321e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f12322f;

    public if0(pf0 pf0Var, String str) {
        this.f12321e = str;
        Objects.requireNonNull(pf0Var);
        this.f12322f = pf0Var;
    }

    @Override // pa.u
    public final void c(pa.l lVar) {
        switch (this.f12320d) {
            case 0:
                ((pf0) this.f12322f).j4(pf0.m4(lVar));
                break;
            default:
                ((pi.g) this.f12321e).B(lVar.f31512b);
                break;
        }
    }

    @Override // pa.u
    public final void f(Object obj) {
        switch (this.f12320d) {
            case 0:
                ((pf0) this.f12322f).i4((oh) obj, (String) this.f12321e);
                break;
            default:
                oh ohVar = (oh) obj;
                pi.g gVar = (pi.g) this.f12321e;
                pi.a aVar = (pi.a) this.f12322f;
                nk.k.e(ohVar, "appOpenAd");
                try {
                    ohVar.f14699a.J0(new va.s2(new qi.c(aVar, gVar, 0)));
                } catch (RemoteException e2) {
                    za.i.k("#007 Could not call remote method.", e2);
                }
                gVar.z(new km.o(false, ohVar, aVar));
                break;
        }
    }

    public if0(pi.g gVar, pi.a aVar) {
        this.f12321e = gVar;
        this.f12322f = aVar;
    }
}
