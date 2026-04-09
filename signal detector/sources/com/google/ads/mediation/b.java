package com.google.ads.mediation;

import M2.u;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.InterfaceC0688Qc;
import j2.AbstractC2547c;
import j2.C2556l;
import k2.InterfaceC2625d;
import q2.InterfaceC2806a;
import u2.k;
import w2.l;

/* loaded from: classes.dex */
public final class b extends AbstractC2547c implements InterfaceC2625d, InterfaceC2806a {

    /* renamed from: a, reason: collision with root package name */
    public final l f6836a;

    public b(AbstractAdViewAdapter abstractAdViewAdapter, l lVar) {
        this.f6836a = lVar;
    }

    @Override // j2.AbstractC2547c
    public final void a() {
        C1338iu c1338iu = (C1338iu) this.f6836a;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAdClosed.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).d();
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // j2.AbstractC2547c
    public final void b(C2556l c2556l) {
        ((C1338iu) this.f6836a).g(c2556l);
    }

    @Override // j2.AbstractC2547c
    public final void d() {
        C1338iu c1338iu = (C1338iu) this.f6836a;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAdLoaded.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).h();
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // j2.AbstractC2547c
    public final void e() {
        C1338iu c1338iu = (C1338iu) this.f6836a;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAdOpened.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).j();
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // j2.AbstractC2547c, q2.InterfaceC2806a
    public final void onAdClicked() {
        C1338iu c1338iu = (C1338iu) this.f6836a;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAdClicked.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).b();
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }

    @Override // k2.InterfaceC2625d
    public final void s(String str, String str2) {
        C1338iu c1338iu = (C1338iu) this.f6836a;
        c1338iu.getClass();
        u.c("#008 Must be called on the main UI thread.");
        k.c("Adapter called onAppEvent.");
        try {
            ((InterfaceC0688Qc) c1338iu.f14822b).f3(str, str2);
        } catch (RemoteException e6) {
            k.k("#007 Could not call remote method.", e6);
        }
    }
}
