package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public abstract class ev extends mg implements fv {
    public ev() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.mg
    public final boolean g4(int i4, Parcel parcel, Parcel parcel2) {
        zu yuVar;
        switch (i4) {
            case 1:
                c();
                break;
            case 2:
                d();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    yuVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    yuVar = iInterfaceQueryLocalInterface instanceof zu ? (zu) iInterfaceQueryLocalInterface : new yu(strongBinder);
                }
                ng.f(parcel);
                b3(yuVar);
                break;
            case 4:
                int i10 = parcel.readInt();
                ng.f(parcel);
                n(i10);
                break;
            case 5:
                va.w1 w1Var = (va.w1) ng.b(parcel, va.w1.CREATOR);
                ng.f(parcel);
                u0(w1Var);
                break;
            case 6:
                A1();
                break;
            case 7:
                D1();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
