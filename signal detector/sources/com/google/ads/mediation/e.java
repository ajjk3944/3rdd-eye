package com.google.ads.mediation;

import M2.u;
import a.AbstractC0241a;
import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.C1338iu;
import com.google.android.gms.internal.ads.InterfaceC0688Qc;
import com.google.android.gms.internal.ads.Rx;
import com.lefan.signal.MyApplication;
import j2.AbstractC2547c;
import j2.C2556l;
import s4.C2898a;
import u2.k;
import w2.s;

/* loaded from: classes.dex */
public final class e extends AbstractC2547c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f6841a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f6842b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f6843c;

    public /* synthetic */ e(Object obj, int i, Object obj2) {
        this.f6841a = i;
        this.f6842b = obj;
        this.f6843c = obj2;
    }

    @Override // j2.AbstractC2547c
    public void a() {
        switch (this.f6841a) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((s) this.f6843c);
                c1338iu.getClass();
                u.c("#008 Must be called on the main UI thread.");
                k.c("Adapter called onAdClosed.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).d();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
        }
    }

    @Override // j2.AbstractC2547c
    public final void b(C2556l c2556l) {
        switch (this.f6841a) {
            case 0:
                ((C1338iu) ((s) this.f6843c)).n(c2556l);
                break;
            default:
                ((C2898a) this.f6843c).f23501c = false;
                break;
        }
    }

    @Override // j2.AbstractC2547c
    public final void c() {
        switch (this.f6841a) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((s) this.f6843c);
                c1338iu.getClass();
                u.c("#008 Must be called on the main UI thread.");
                a aVar = (a) c1338iu.f14823c;
                if (((Rx) c1338iu.f14824d) == null) {
                    if (aVar != null) {
                        if (!aVar.f23966o) {
                            k.c("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        k.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                k.c("Adapter called onAdImpression.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).k();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                AbstractC0241a.n((Context) this.f6842b, "Native_ad_pair");
                break;
        }
    }

    @Override // j2.AbstractC2547c
    public void d() {
        int i = this.f6841a;
    }

    @Override // j2.AbstractC2547c
    public void e() {
        switch (this.f6841a) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((s) this.f6843c);
                c1338iu.getClass();
                u.c("#008 Must be called on the main UI thread.");
                k.c("Adapter called onAdOpened.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).j();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
        }
    }

    @Override // j2.AbstractC2547c, q2.InterfaceC2806a
    public final void onAdClicked() {
        switch (this.f6841a) {
            case 0:
                C1338iu c1338iu = (C1338iu) ((s) this.f6843c);
                c1338iu.getClass();
                u.c("#008 Must be called on the main UI thread.");
                a aVar = (a) c1338iu.f14823c;
                if (((Rx) c1338iu.f14824d) == null) {
                    if (aVar != null) {
                        if (!aVar.f23967p) {
                            k.c("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        k.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                k.c("Adapter called onAdClicked.");
                try {
                    ((InterfaceC0688Qc) c1338iu.f14822b).b();
                    break;
                } catch (RemoteException e6) {
                    k.k("#007 Could not call remote method.", e6);
                    return;
                }
            default:
                MyApplication.f18812d = true;
                AbstractC0241a.m((Context) this.f6842b, "Native_ad_pair");
                break;
        }
    }

    private final void f() {
    }
}
