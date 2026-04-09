package com.google.ads.mediation;

import android.os.RemoteException;
import bb.s;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.pq0;
import com.google.android.gms.internal.ads.up;
import pa.l;
import pb.y;
import va.l0;
import va.t;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class c extends ab.b {

    /* renamed from: d, reason: collision with root package name */
    public final AbstractAdViewAdapter f9000d;

    /* renamed from: e, reason: collision with root package name */
    public final s f9001e;

    public c(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f9000d = abstractAdViewAdapter;
        this.f9001e = sVar;
    }

    @Override // pa.u
    public final void c(l lVar) {
        ((pq0) this.f9001e).m(lVar);
    }

    @Override // pa.u
    public final void f(Object obj) {
        ab.a aVar = (ab.a) obj;
        AbstractAdViewAdapter abstractAdViewAdapter = this.f9000d;
        abstractAdViewAdapter.mInterstitialAd = aVar;
        s sVar = this.f9001e;
        d dVar = new d(abstractAdViewAdapter, sVar);
        up upVar = (up) aVar;
        upVar.getClass();
        try {
            l0 l0Var = upVar.f17283c;
            if (l0Var != null) {
                l0Var.F0(new t(dVar));
            }
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
        pq0 pq0Var = (pq0) sVar;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdLoaded.");
        try {
            ((fr) pq0Var.f15073b).A1();
        } catch (RemoteException e10) {
            i.k("#007 Could not call remote method.", e10);
        }
    }
}
