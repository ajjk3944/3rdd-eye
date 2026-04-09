package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class iw extends ac.a implements kw {
    @Override // com.google.android.gms.internal.ads.kw
    public final void Q0(String str, String str2, Bundle bundle) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        parcelT.writeString(str2);
        ng.c(parcelT, bundle);
        g1(parcelT, 3);
    }

    @Override // com.google.android.gms.internal.ads.kw
    public final void j(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 2);
    }
}
