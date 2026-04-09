package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ps implements xa.l {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbwl f15098a;

    public ps(zzbwl zzbwlVar) {
        this.f15098a = zzbwlVar;
    }

    @Override // xa.l
    public final void D2() {
        za.i.c("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // xa.l
    public final void T() {
        za.i.c("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // xa.l
    public final void U0() {
        za.i.c("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // xa.l
    public final void a2() {
        za.i.c("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // xa.l
    public final void e0(int i4) {
        za.i.c("AdMobCustomTabsAdapter overlay is closed.");
        pq0 pq0Var = (pq0) this.f15098a.f19249b;
        pq0Var.getClass();
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdClosed.");
        try {
            ((fr) pq0Var.f15073b).d();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // xa.l
    public final void g1() {
        za.i.c("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // xa.l
    public final void k2() {
        za.i.c("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // xa.l
    public final void r0() {
        za.i.c("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // xa.l
    public final void u1() {
        za.i.c("AdMobCustomTabsAdapter overlay is paused.");
    }

    @Override // xa.l
    public final void z1() {
        za.i.c("Opening AdMobCustomTabsAdapter overlay.");
        pq0 pq0Var = (pq0) this.f15098a.f19249b;
        pq0Var.getClass();
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdOpened.");
        try {
            ((fr) pq0Var.f15073b).C1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // xa.l
    public final void h3() {
    }
}
