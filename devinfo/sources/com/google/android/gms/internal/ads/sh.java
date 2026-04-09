package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class sh extends ac.a implements vh {
    @Override // com.google.android.gms.internal.ads.vh
    public final void W(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void p(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.ads.vh
    public final void t2(rh rhVar) {
        Parcel parcelT = T();
        ng.e(parcelT, rhVar);
        g1(parcelT, 1);
    }
}
