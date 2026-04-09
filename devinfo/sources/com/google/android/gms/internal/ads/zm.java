package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class zm extends ac.a implements bn {
    public zm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate", 1);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void D3(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 9);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void U3(vm vmVar) {
        Parcel parcelT = T();
        ClassLoader classLoader = ng.f14287a;
        parcelT.writeStrongBinder(null);
        g1(parcelT, 8);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void Z2(String str, vb.a aVar) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        ng.e(parcelT, aVar);
        g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void b0(vb.a aVar, int i4) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        parcelT.writeInt(i4);
        g1(parcelT, 5);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void b4(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 7);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void c() {
        g1(T(), 4);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void o(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 6);
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final vb.a x(String str) {
        Parcel parcelT = T();
        parcelT.writeString(str);
        return r5.c.p(r0(parcelT, 2));
    }

    @Override // com.google.android.gms.internal.ads.bn
    public final void z3(vb.a aVar) {
        Parcel parcelT = T();
        ng.e(parcelT, aVar);
        g1(parcelT, 3);
    }
}
