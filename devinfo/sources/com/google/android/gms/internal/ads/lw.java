package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class lw extends ac.a implements nw {
    public lw(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator", 1);
    }

    @Override // com.google.android.gms.internal.ads.nw
    public final void v3(vb.a aVar, rw rwVar, kw kwVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, rwVar);
        ng.e(parcelT, kwVar);
        g1(parcelT, 1);
    }
}
