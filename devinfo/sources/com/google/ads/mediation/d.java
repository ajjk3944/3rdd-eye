package com.google.ads.mediation;

import android.os.RemoteException;
import bb.s;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.pq0;
import pa.u;
import pb.y;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class d extends u {

    /* renamed from: d, reason: collision with root package name */
    public final s f9002d;

    public d(AbstractAdViewAdapter abstractAdViewAdapter, s sVar) {
        this.f9002d = sVar;
    }

    @Override // pa.u
    public final void b() {
        pq0 pq0Var = (pq0) this.f9002d;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdClosed.");
        try {
            ((fr) pq0Var.f15073b).d();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // pa.u
    public final void g() {
        pq0 pq0Var = (pq0) this.f9002d;
        pq0Var.getClass();
        y.d("#008 Must be called on the main UI thread.");
        i.c("Adapter called onAdOpened.");
        try {
            ((fr) pq0Var.f15073b).C1();
        } catch (RemoteException e2) {
            i.k("#007 Could not call remote method.", e2);
        }
    }
}
