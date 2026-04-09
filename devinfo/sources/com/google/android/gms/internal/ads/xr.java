package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class xr extends ac.a implements yr {
    @Override // com.google.android.gms.internal.ads.yr
    public final void b(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 4);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void c() {
        g1(T(), 2);
    }

    @Override // com.google.android.gms.internal.ads.yr
    public final void g(String str) {
        Parcel parcelT = T();
        parcelT.writeString("Adapter returned null.");
        g1(parcelT, 3);
    }
}
