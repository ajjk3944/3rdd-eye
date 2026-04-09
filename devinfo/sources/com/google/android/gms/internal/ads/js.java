package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class js extends ac.a implements ks {
    @Override // com.google.android.gms.internal.ads.ks
    public final void b(va.w1 w1Var) {
        Parcel parcelT = T();
        ng.c(parcelT, w1Var);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.ks
    public final void k(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 1);
    }
}
