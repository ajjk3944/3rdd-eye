package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class av extends ac.a implements cv {
    public av(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAd", 1);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final va.x1 F1() {
        Parcel parcelR0 = r0(T(), 12);
        va.x1 x1VarH4 = c60.h4(parcelR0.readStrongBinder());
        parcelR0.recycle();
        return x1VarH4;
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void I2(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 5);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void M2(va.r1 r1Var) {
        Parcel parcelT = T();
        ng.e(parcelT, r1Var);
        g1(parcelT, 13);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void V2(va.z2 z2Var, jv jvVar) {
        Parcel parcelT = T();
        ng.c(parcelT, z2Var);
        ng.e(parcelT, jvVar);
        g1(parcelT, 14);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void Y2(fv fvVar) {
        Parcel parcelT = T();
        ng.e(parcelT, fvVar);
        g1(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.ads.cv
    public final void v2(va.z2 z2Var, jv jvVar) {
        Parcel parcelT = T();
        ng.c(parcelT, z2Var);
        ng.e(parcelT, jvVar);
        g1(parcelT, 1);
    }
}
