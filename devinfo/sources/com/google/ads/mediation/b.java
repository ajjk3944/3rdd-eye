package com.google.ads.mediation;

import android.os.RemoteException;
import bb.n;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.pq0;
import pa.l;
import pb.y;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class b extends pa.c implements qa.d, va.a {

    /* renamed from: a, reason: collision with root package name */
    public final n f8999a;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, n nVar) {
        this.f8999a = nVar;
    }

    @Override // pa.c
    public final void a() {
        pq0 pq0Var = (pq0) this.f8999a;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClosed.");
        try {
            ((fr) pq0Var.f15073b).d();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // pa.c
    public final void b(l lVar) {
        ((pq0) this.f8999a).j(lVar);
    }

    @Override // pa.c
    public final void d() {
        pq0 pq0Var = (pq0) this.f8999a;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdLoaded.");
        try {
            ((fr) pq0Var.f15073b).A1();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // pa.c
    public final void e() {
        pq0 pq0Var = (pq0) this.f8999a;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdOpened.");
        try {
            ((fr) pq0Var.f15073b).C1();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // qa.d
    public final void g(String str, String str2) {
        pq0 pq0Var = (pq0) this.f8999a;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAppEvent.");
        try {
            ((fr) pq0Var.f15073b).B3(str, str2);
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // pa.c, va.a
    public final void onAdClicked() {
        pq0 pq0Var = (pq0) this.f8999a;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClicked.");
        try {
            ((fr) pq0Var.f15073b).c();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }
}
