package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.zd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2238zd implements s2.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zzbwl f17886a;

    public C2238zd(zzbwl zzbwlVar) {
        this.f17886a = zzbwlVar;
    }

    @Override // s2.k
    public final void I0() {
        u2.k.c("AdMobCustomTabsAdapter overlay is stopped.");
    }

    @Override // s2.k
    public final void K1() {
        u2.k.c("AdMobCustomTabsAdapter overlay is started.");
    }

    @Override // s2.k
    public final void N2() {
    }

    @Override // s2.k
    public final void R1() {
        u2.k.c("AdMobCustomTabsAdapter overlay is resumed.");
    }

    @Override // s2.k
    public final void d1() {
        u2.k.c("AdMobCustomTabsAdapter overlay is destroyed.");
    }

    @Override // s2.k
    public final void g() {
        u2.k.c("Opening AdMobCustomTabsAdapter overlay.");
        C1338iu c1338iu = (C1338iu) this.f17886a.f18002b;
        c1338iu.getClass();
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdOpened.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).j();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // s2.k
    public final void h0() {
        u2.k.c("AdMobCustomTabsAdapter overlay is restarted.");
    }

    @Override // s2.k
    public final void j2() {
        u2.k.c("Delay close AdMobCustomTabsAdapter overlay.");
    }

    @Override // s2.k
    public final void k0(int i) {
        u2.k.c("AdMobCustomTabsAdapter overlay is closed.");
        C1338iu c1338iu = (C1338iu) this.f17886a.f18002b;
        c1338iu.getClass();
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdClosed.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).d();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // s2.k
    public final void n1() {
        u2.k.c("AdMobCustomTabsAdapter overlay is created.");
    }

    @Override // s2.k
    public final void x1() {
        u2.k.c("AdMobCustomTabsAdapter overlay is paused.");
    }
}
