package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ds extends ac.a implements es {
    public ds(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.mediation.client.rtb.INativeCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void b(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void g(String str) {
        Parcel parcelT = T();
        parcelT.writeString("Adapter returned null.");
        g1(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.ads.es
    public final void m3(lr lrVar) {
        Parcel parcelT = T();
        ng.e(parcelT, lrVar);
        g1(parcelT, 1);
    }
}
