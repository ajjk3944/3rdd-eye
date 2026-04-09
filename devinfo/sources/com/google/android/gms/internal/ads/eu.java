package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class eu extends mg implements fu {
    public eu() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) ng.b(parcel, ParcelFileDescriptor.CREATOR);
            ng.f(parcel);
            a3(parcelFileDescriptor);
        } else if (i4 == 2) {
            ya.l lVar = (ya.l) ng.b(parcel, ya.l.CREATOR);
            ng.f(parcel);
            N2(lVar);
        } else {
            if (i4 != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) ng.b(parcel, ParcelFileDescriptor.CREATOR);
            iu iuVar = (iu) ng.b(parcel, iu.CREATOR);
            ng.f(parcel);
            d3(parcelFileDescriptor2, iuVar);
        }
        parcel2.writeNoException();
        return true;
    }
}
