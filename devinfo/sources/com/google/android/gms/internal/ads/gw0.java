package com.google.android.gms.internal.ads;

import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gw0 extends ac.a implements hw0 {
    @Override // com.google.android.gms.internal.ads.hw0
    public final void R1(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 7);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void b2(vb.b bVar, String str) {
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        parcelT.writeString(str);
        parcelT.writeString(null);
        g1(parcelT, 8);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void c() {
        g1(T(), 3);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void n(int i4) {
        Parcel parcelT = T();
        parcelT.writeInt(i4);
        g1(parcelT, 6);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void u2(byte[] bArr) {
        Parcel parcelT = T();
        parcelT.writeByteArray(bArr);
        g1(parcelT, 5);
    }

    @Override // com.google.android.gms.internal.ads.hw0
    public final void y3() {
        Parcel parcelT = T();
        parcelT.writeIntArray(null);
        g1(parcelT, 4);
    }
}
