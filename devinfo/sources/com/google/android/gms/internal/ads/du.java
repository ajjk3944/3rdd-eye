package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class du extends ac.a implements fu {
    public du(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 1);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void N2(ya.l lVar) {
        Parcel parcelT = T();
        ng.c(parcelT, lVar);
        g1(parcelT, 2);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void a3(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelT = T();
        ng.c(parcelT, parcelFileDescriptor);
        g1(parcelT, 1);
    }

    @Override // com.google.android.gms.internal.ads.fu
    public final void d3(ParcelFileDescriptor parcelFileDescriptor, iu iuVar) {
        Parcel parcelT = T();
        ng.c(parcelT, parcelFileDescriptor);
        ng.c(parcelT, iuVar);
        g1(parcelT, 3);
    }
}
