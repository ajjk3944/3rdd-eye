package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ys extends ac.a implements zs {
    public ys(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtils", 1);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void E(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 4);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void d0(Intent intent) {
        Parcel parcelT = T();
        ng.c(parcelT, intent);
        g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void d4(vb.a aVar, wa.a aVar2) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        ng.c(parcelT, aVar2);
        g1(parcelT, 6);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void e() {
        g1(T(), 3);
    }

    @Override // com.google.android.gms.internal.ads.zs
    public final void v1(String[] strArr, int[] iArr, vb.a aVar) {
        Parcel parcelT = T();
        parcelT.writeStringArray(strArr);
        parcelT.writeIntArray(iArr);
        ng.e(parcelT, aVar);
        g1(parcelT, 5);
    }
}
