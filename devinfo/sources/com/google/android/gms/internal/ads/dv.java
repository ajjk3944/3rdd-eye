package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class dv extends ac.a implements fv {
    @Override // com.google.android.gms.internal.ads.fv
    public final void A1() {
        g1(T(), 6);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void D1() {
        g1(T(), 7);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void b3(zu zuVar) {
        Parcel parcelT = T();
        ng.e(parcelT, zuVar);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void c() {
        g1(T(), 1);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void d() {
        g1(T(), 2);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void n(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 4);
    }

    @Override // com.google.android.gms.internal.ads.fv
    public final void u0(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 5);
    }
}
