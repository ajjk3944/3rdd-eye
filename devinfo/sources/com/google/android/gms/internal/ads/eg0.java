package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class eg0 extends hg0 {
    public final Context g;

    /* renamed from: h, reason: collision with root package name */
    public final za.a f10783h;

    /* renamed from: i, reason: collision with root package name */
    public final ne0 f10784i;

    public eg0(Context context, za.a aVar, ne0 ne0Var) {
        this.g = context;
        this.f10783h = aVar;
        this.f10784i = ne0Var;
    }

    @Override // com.google.android.gms.internal.ads.hg0, pb.c
    public final void O(nb.b bVar) {
        super.O(bVar);
        this.f10784i.u(new RemoteException("Connection failed: ".concat(String.valueOf(bVar.f29887d))));
    }

    @Override // com.google.android.gms.internal.ads.hg0, pb.b
    public final void S(int i4) {
        za.i.c("Cannot connect to remote service, fallback to local instance.");
        this.f10784i.u(new RemoteException(d.h.q(i4, "Connection suspended with cause: ", new StringBuilder(String.valueOf(i4).length() + 33))));
    }

    @Override // pb.b
    public final void T() {
        synchronized (this.f11859b) {
            if (!this.f11861d) {
                this.f11861d = true;
                try {
                    ((bu) this.f11863f.t()).c0(this.f10783h.f38129a);
                    this.f10784i.mo167b();
                } catch (RemoteException e2) {
                    this.f10784i.u(e2);
                }
            }
        }
    }
}
