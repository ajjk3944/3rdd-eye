package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.C2841s;

/* renamed from: com.google.android.gms.internal.ads.mp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1549mp extends AbstractC1441kp {

    /* renamed from: g, reason: collision with root package name */
    public String f15672g;

    /* renamed from: h, reason: collision with root package name */
    public int f15673h;

    @Override // M2.InterfaceC0162b
    public final void h0() {
        synchronized (this.f15280b) {
            try {
                if (!this.f15282d) {
                    this.f15282d = true;
                    try {
                        try {
                            int i = this.f15673h;
                            if (i == 2) {
                                ((InterfaceC1430ke) this.f15284f.t()).r1(this.f15283e, ((Boolean) C2841s.f23267e.f23270c.a(H9.ie)).booleanValue() ? new BinderC1387jp(this.f15279a, this.f15283e) : new BinderC1334ip(this));
                            } else if (i == 3) {
                                ((InterfaceC1430ke) this.f15284f.t()).v3(this.f15672g, ((Boolean) C2841s.f23267e.f23270c.a(H9.ie)).booleanValue() ? new BinderC1387jp(this.f15279a, this.f15283e) : new BinderC1334ip(this));
                            } else {
                                this.f15279a.c(new C1765qp(1));
                            }
                        } catch (RemoteException | IllegalArgumentException unused) {
                            this.f15279a.c(new C1765qp(1));
                        }
                    } catch (Throwable th) {
                        p2.j.f22785C.f22795h.f("RemoteUrlAndCacheKeyClientTask.onConnected", th);
                        this.f15279a.c(new C1765qp(1));
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441kp, M2.InterfaceC0163c
    public final void k0(J2.b bVar) {
        u2.k.c("Cannot connect to remote service, fallback to local instance.");
        this.f15279a.c(new C1765qp(1));
    }
}
