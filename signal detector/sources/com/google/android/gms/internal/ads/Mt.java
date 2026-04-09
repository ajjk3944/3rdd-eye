package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import q2.C2839q0;

/* loaded from: classes.dex */
public final class Mt implements E2.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9919a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ W2.a f9920b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ B7 f9921c;

    public /* synthetic */ Mt(B7 b7, W2.a aVar, int i) {
        this.f9919a = i;
        this.f9920b = aVar;
        this.f9921c = b7;
    }

    @Override // E2.a
    public final void c() {
        switch (this.f9919a) {
            case 0:
                if (((Nt) this.f9921c).f10097j != null) {
                    try {
                        C2839q0 c2839q0 = (C2839q0) this.f9920b;
                        c2839q0.I0(c2839q0.h0(), 1);
                        break;
                    } catch (RemoteException e6) {
                        u2.k.k("#007 Could not call remote method.", e6);
                        return;
                    }
                }
                break;
            default:
                if (((Ot) this.f9921c).f10267d != null) {
                    try {
                        q2.N n6 = (q2.N) this.f9920b;
                        n6.I0(n6.h0(), 1);
                        break;
                    } catch (RemoteException e7) {
                        u2.k.k("#007 Could not call remote method.", e7);
                    }
                }
                break;
        }
    }
}
