package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Yc, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0824Yc implements w2.j, w2.n, w2.q, w2.h {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0688Qc f12643a;

    public C0824Yc(InterfaceC0688Qc interfaceC0688Qc) {
        this.f12643a = interfaceC0688Qc;
    }

    @Override // w2.InterfaceC2971c
    public final void b() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdOpened.");
        try {
            this.f12643a.j();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void c() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdClosed.");
        try {
            this.f12643a.d();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void d() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called reportAdImpression.");
        try {
            this.f12643a.k();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void e() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called reportAdClicked.");
        try {
            this.f12643a.b();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
