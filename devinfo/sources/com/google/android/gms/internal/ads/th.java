package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class th extends mg implements vh {
    public th() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        rh qhVar;
        if (i4 == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                qhVar = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                qhVar = iInterfaceQueryLocalInterface instanceof rh ? (rh) iInterfaceQueryLocalInterface : new qh(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 1);
            }
            ng.f(parcel);
            t2(qhVar);
        } else if (i4 == 2) {
            parcel.readInt();
            ng.f(parcel);
        } else {
            if (i4 != 3) {
                return false;
            }
            va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
            ng.f(parcel);
            W(w1Var);
        }
        parcel2.writeNoException();
        return true;
    }
}
