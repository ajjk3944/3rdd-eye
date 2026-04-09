package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import u2.C2951a;

/* renamed from: com.google.android.gms.internal.ads.hp, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281hp extends AbstractC1441kp {

    /* renamed from: g, reason: collision with root package name */
    public final Context f14587g;

    /* renamed from: h, reason: collision with root package name */
    public final C2951a f14588h;
    public final Nx i;

    public C1281hp(Context context, C2951a c2951a, Nx nx) {
        this.f14587g = context;
        this.f14588h = c2951a;
        this.i = nx;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441kp, M2.InterfaceC0162b
    public final void g0(int i) {
        u2.k.c("Cannot connect to remote service, fallback to local instance.");
        this.i.B(new RemoteException(A.f.i(i, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i).length() + 33))));
    }

    @Override // M2.InterfaceC0162b
    public final void h0() {
        synchronized (this.f15280b) {
            if (!this.f15282d) {
                this.f15282d = true;
                try {
                    ((InterfaceC1430ke) this.f15284f.t()).s0(this.f14588h.f23784a);
                    this.i.mo6a();
                } catch (RemoteException e6) {
                    this.i.B(e6);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.AbstractC1441kp, M2.InterfaceC0163c
    public final void k0(J2.b bVar) {
        super.k0(bVar);
        this.i.B(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f2047d))));
    }
}
