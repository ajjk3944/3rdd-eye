package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class au extends ac.a implements bu {
    @Override // com.google.android.gms.internal.ads.bu
    public final void T3(String str, fu fuVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        ng.e(parcelT, fuVar);
        g1(parcelT, 7);
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void c0(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 9);
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void c2(iu iuVar, fu fuVar) {
        Parcel parcelT = T();
        ng.c(parcelT, iuVar);
        ng.e(parcelT, fuVar);
        g1(parcelT, 5);
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void j0(iu iuVar, fu fuVar) {
        Parcel parcelT = T();
        ng.c(parcelT, iuVar);
        ng.e(parcelT, fuVar);
        g1(parcelT, 4);
    }

    @Override // com.google.android.gms.internal.ads.bu
    public final void o1(iu iuVar, fu fuVar) {
        Parcel parcelT = T();
        ng.c(parcelT, iuVar);
        ng.e(parcelT, fuVar);
        g1(parcelT, 6);
    }
}
