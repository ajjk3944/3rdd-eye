package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.i8, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC1301i8 extends B7 implements InterfaceC1407k8 {
    public AbstractBinderC1301i8() {
        super("com.google.android.gms.ads.internal.appopen.client.IAppOpenAdLoadCallback");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC1193g8 c1138f8;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder == null) {
                c1138f8 = null;
            } else {
                IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.appopen.client.IAppOpenAd");
                c1138f8 = iInterfaceQueryLocalInterface instanceof InterfaceC1193g8 ? (InterfaceC1193g8) iInterfaceQueryLocalInterface : new C1138f8(strongBinder, "com.google.android.gms.ads.internal.appopen.client.IAppOpenAd", 2);
            }
            C7.f(parcel);
            c2(c1138f8);
        } else if (i == 2) {
            parcel.readInt();
            C7.f(parcel);
        } else {
            if (i != 3) {
                return false;
            }
            C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
            C7.f(parcel);
            j0(c2852x0);
        }
        parcel2.writeNoException();
        return true;
    }
}
