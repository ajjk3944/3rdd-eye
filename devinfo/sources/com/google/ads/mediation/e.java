package com.google.ads.mediation;

import android.os.RemoteException;
import bb.v;
import com.google.android.gms.internal.ads.fk0;
import com.google.android.gms.internal.ads.fr;
import com.google.android.gms.internal.ads.pq0;
import pa.l;
import pb.y;
import pi.g;
import za.i;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes.dex */
public final class e extends pa.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9003a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f9004b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f9005c;

    public /* synthetic */ e(int i4, Object obj, Object obj2) {
        this.f9003a = i4;
        this.f9004b = obj;
        this.f9005c = obj2;
    }

    @Override // pa.c
    public final void a() {
        switch (this.f9003a) {
            case 0:
                pq0 pq0Var = (pq0) ((v) this.f9005c);
                pq0Var.getClass();
                y.d("#008 Must be called on the main UI thread.");
                i.c("Adapter called onAdClosed.");
                try {
                    ((fr) pq0Var.f15073b).d();
                    break;
                } catch (RemoteException e2) {
                    i.k("#007 Could not call remote method.", e2);
                    return;
                }
        }
    }

    @Override // pa.c
    public final void b(l lVar) {
        switch (this.f9003a) {
            case 0:
                ((pq0) ((v) this.f9005c)).n(lVar);
                break;
            default:
                ((g) this.f9005c).B("admob-native:" + lVar.f31511a);
                break;
        }
    }

    @Override // pa.c
    public final void c() {
        switch (this.f9003a) {
            case 0:
                pq0 pq0Var = (pq0) ((v) this.f9005c);
                pq0Var.getClass();
                y.d("#008 Must be called on the main UI thread.");
                a aVar = (a) pq0Var.f15074c;
                if (((fk0) pq0Var.f15075d) == null) {
                    if (aVar != null) {
                        if (!aVar.f2107p) {
                            i.c("Could not call onAdImpression since setOverrideImpressionRecording is not set to true");
                            break;
                        }
                    } else {
                        i.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.c("Adapter called onAdImpression.");
                try {
                    ((fr) pq0Var.f15073b).D1();
                    break;
                } catch (RemoteException e2) {
                    i.k("#007 Could not call remote method.", e2);
                    return;
                }
            default:
                ((g) this.f9005c).y();
                if (ci.b.j != null) {
                    j6.i.q((pi.a) this.f9004b);
                    break;
                }
                break;
        }
    }

    @Override // pa.c
    public final void d() {
        int i4 = this.f9003a;
    }

    @Override // pa.c
    public final void e() {
        switch (this.f9003a) {
            case 0:
                pq0 pq0Var = (pq0) ((v) this.f9005c);
                pq0Var.getClass();
                y.d("#008 Must be called on the main UI thread.");
                i.c("Adapter called onAdOpened.");
                try {
                    ((fr) pq0Var.f15073b).C1();
                    break;
                } catch (RemoteException e2) {
                    i.k("#007 Could not call remote method.", e2);
                    return;
                }
        }
    }

    @Override // pa.c
    public void f() {
        int i4 = this.f9003a;
    }

    @Override // pa.c, va.a
    public final void onAdClicked() {
        switch (this.f9003a) {
            case 0:
                pq0 pq0Var = (pq0) ((v) this.f9005c);
                pq0Var.getClass();
                y.d("#008 Must be called on the main UI thread.");
                a aVar = (a) pq0Var.f15074c;
                if (((fk0) pq0Var.f15075d) == null) {
                    if (aVar != null) {
                        if (!aVar.f2108q) {
                            i.c("Could not call onAdClicked since setOverrideClickHandling is not set to true");
                            break;
                        }
                    } else {
                        i.k("#007 Could not call remote method.", null);
                        break;
                    }
                }
                i.c("Adapter called onAdClicked.");
                try {
                    ((fr) pq0Var.f15073b).c();
                    break;
                } catch (RemoteException e2) {
                    i.k("#007 Could not call remote method.", e2);
                    return;
                }
            default:
                if (ci.b.j != null) {
                    j6.i.o((pi.a) this.f9004b);
                }
                ((g) this.f9005c).w();
                break;
        }
    }

    private final void h() {
    }

    private final void j() {
    }

    private final void k() {
    }

    private final void l() {
    }

    private final void m() {
    }
}
