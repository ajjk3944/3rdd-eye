package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.ParcelFileDescriptor;

/* renamed from: com.google.android.gms.internal.ads.ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1592ne extends B7 implements InterfaceC1646oe {
    public AbstractBinderC1592ne() {
        super("com.google.android.gms.ads.internal.request.INonagonStreamingResponseListener");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            ParcelFileDescriptor parcelFileDescriptor = (ParcelFileDescriptor) C7.b(parcel, ParcelFileDescriptor.CREATOR);
            C7.f(parcel);
            G2(parcelFileDescriptor);
        } else if (i == 2) {
            t2.o oVar = (t2.o) C7.b(parcel, t2.o.CREATOR);
            C7.f(parcel);
            L0(oVar);
        } else {
            if (i != 3) {
                return false;
            }
            ParcelFileDescriptor parcelFileDescriptor2 = (ParcelFileDescriptor) C7.b(parcel, ParcelFileDescriptor.CREATOR);
            C1807re c1807re = (C1807re) C7.b(parcel, C1807re.CREATOR);
            C7.f(parcel);
            J2(parcelFileDescriptor2, c1807re);
        }
        parcel2.writeNoException();
        return true;
    }
}
