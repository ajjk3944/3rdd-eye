package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* renamed from: com.google.android.gms.internal.ads.Xe, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0809Xe implements w2.t {

    /* renamed from: a, reason: collision with root package name */
    public final InterfaceC0688Qc f12433a;

    public C0809Xe(InterfaceC0688Qc interfaceC0688Qc) {
        this.f12433a = interfaceC0688Qc;
    }

    @Override // w2.t
    public final void a() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onUserEarnedReward.");
        try {
            this.f12433a.T();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void b() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdOpened.");
        try {
            this.f12433a.j();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void c() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called onAdClosed.");
        try {
            this.f12433a.d();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void d() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called reportAdImpression.");
        try {
            this.f12433a.k();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // w2.InterfaceC2971c
    public final void e() {
        M2.u.c("#008 Must be called on the main UI thread.");
        u2.k.c("Adapter called reportAdClicked.");
        try {
            this.f12433a.b();
        } catch (RemoteException e6) {
            u2.k.k("#007 Could not call remote method.", e6);
        }
    }
}
