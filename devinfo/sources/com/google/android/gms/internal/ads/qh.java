package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class qh extends ac.a implements rh {
    @Override // com.google.android.gms.internal.ads.rh
    public final void J0(va.r1 r1Var) {
        Parcel parcelT = T();
        ng.e(parcelT, r1Var);
        g1(parcelT, 7);
    }

    @Override // com.google.android.gms.internal.ads.rh
    public final void L0(vb.a aVar, yh yhVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.e(parcelT, yhVar);
        g1(parcelT, 4);
    }

    @Override // com.google.android.gms.internal.ads.rh
    public final va.x1 e() {
        Parcel parcelR0 = r0(T(), 5);
        va.x1 x1VarH4 = c60.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return x1VarH4;
    }
}
