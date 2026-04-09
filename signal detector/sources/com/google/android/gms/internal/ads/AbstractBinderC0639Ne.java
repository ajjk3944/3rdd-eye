package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import q2.C2852x0;

/* renamed from: com.google.android.gms.internal.ads.Ne, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0639Ne extends B7 implements InterfaceC0656Oe {
    public AbstractBinderC0639Ne() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        InterfaceC0554Ie c0537He;
        switch (i) {
            case 1:
                b();
                break;
            case 2:
                d();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    c0537He = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    c0537He = iInterfaceQueryLocalInterface instanceof InterfaceC0554Ie ? (InterfaceC0554Ie) iInterfaceQueryLocalInterface : new C0537He(strongBinder);
                }
                C7.f(parcel);
                H2(c0537He);
                break;
            case 4:
                int i3 = parcel.readInt();
                C7.f(parcel);
                B(i3);
                break;
            case 5:
                C2852x0 c2852x0 = (C2852x0) C7.b(parcel, C2852x0.CREATOR);
                C7.f(parcel);
                G0(c2852x0);
                break;
            case 6:
                h();
                break;
            case 7:
                k();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
