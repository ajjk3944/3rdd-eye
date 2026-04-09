package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.me, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1538me extends W2.a implements InterfaceC1646oe {
    public C1538me(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener", 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void G2(ParcelFileDescriptor parcelFileDescriptor) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, parcelFileDescriptor);
        I0(parcelH0, 1);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void J2(ParcelFileDescriptor parcelFileDescriptor, C1807re c1807re) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, parcelFileDescriptor);
        C7.c(parcelH0, c1807re);
        I0(parcelH0, 3);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1646oe
    public final void L0(t2.o oVar) {
        Parcel parcelH0 = h0();
        C7.c(parcelH0, oVar);
        I0(parcelH0, 2);
    }
}
