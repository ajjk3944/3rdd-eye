package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class nr implements bb.l, bb.q, bb.t, bb.i {

    /* renamed from: a, reason: collision with root package name */
    public final fr f14398a;

    public nr(fr frVar) {
        this.f14398a = frVar;
    }

    @Override // bb.l, bb.q, bb.t
    public final void a() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdLeftApplication.");
        try {
            this.f14398a.z1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.q, bb.i
    public final void b(pa.a aVar) {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdFailedToShow.");
        int i4 = aVar.f31511a;
        String str = aVar.f31512b;
        String str2 = aVar.f31513c;
        int length = String.valueOf(i4).length();
        StringBuilder sb2 = new StringBuilder(length + 60 + String.valueOf(str).length() + 16 + String.valueOf(str2).length());
        sb2.append("Mediation ad failed to show: Error Code = ");
        sb2.append(i4);
        sb2.append(". Error Message = ");
        sb2.append(str);
        sb2.append(" Error Domain = ");
        sb2.append(str2);
        za.i.h(sb2.toString());
        try {
            this.f14398a.c1(aVar.a());
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.t
    public final void c() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onVideoComplete.");
        try {
            this.f14398a.E2();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.c
    public final void e() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdOpened.");
        try {
            this.f14398a.C1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.c
    public final void g() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called reportAdImpression.");
        try {
            this.f14398a.D1();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.c
    public final void h() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called reportAdClicked.");
        try {
            this.f14398a.c();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }

    @Override // bb.c
    public final void onAdClosed() {
        pb.y.d("#008 Must be called on the main UI thread.");
        za.i.c("Adapter called onAdClosed.");
        try {
            this.f14398a.d();
        } catch (RemoteException e2) {
            za.i.k("#007 Could not call remote method.", e2);
        }
    }
}
