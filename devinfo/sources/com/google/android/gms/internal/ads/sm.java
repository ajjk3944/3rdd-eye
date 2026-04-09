package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class sm extends mg implements tm {
    public static tm h4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof tm ? (tm) iInterfaceQueryLocalInterface : new rm(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        if (i4 == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((mm) this).f13945a);
            return true;
        }
        if (i4 != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((mm) this).f13947c);
        return true;
    }
}
