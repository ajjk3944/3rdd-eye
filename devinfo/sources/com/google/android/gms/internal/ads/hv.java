package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class hv extends ac.a implements jv {
    public hv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdLoadCallback", 1);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void K1(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void b(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.jv
    public final void c() {
        g1(T(), 1);
    }
}
