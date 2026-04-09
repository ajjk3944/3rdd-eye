package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class jp extends ac.a implements kp {
    @Override // com.google.android.gms.internal.ads.kp
    public final void c() {
        g1(T(), 2);
    }

    @Override // com.google.android.gms.internal.ads.kp
    public final void g(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        g1(parcelT, 3);
    }
}
