package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.RemoteException;
import q2.C2852x0;

/* loaded from: classes.dex */
public final /* synthetic */ class Br implements InterfaceC1544mk {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C2090wr f7454a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C1160fc f7455b;

    public /* synthetic */ Br(C2090wr c2090wr, C1160fc c1160fc) {
        this.f7454a = c2090wr;
        this.f7455b = c1160fc;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1544mk
    public final void D(C2852x0 c2852x0) {
        this.f7454a.D(c2852x0);
        C1160fc c1160fc = this.f7455b;
        if (c1160fc != null) {
            try {
                Parcel parcelH0 = c1160fc.h0();
                C7.c(parcelH0, c2852x0);
                c1160fc.I0(parcelH0, 3);
            } catch (RemoteException e6) {
                u2.k.k("#007 Could not call remote method.", e6);
            }
        }
        if (c1160fc != null) {
            try {
                int i = c2852x0.f23273a;
                Parcel parcelH02 = c1160fc.h0();
                parcelH02.writeInt(i);
                c1160fc.I0(parcelH02, 2);
            } catch (RemoteException e7) {
                u2.k.k("#007 Could not call remote method.", e7);
            }
        }
    }
}
