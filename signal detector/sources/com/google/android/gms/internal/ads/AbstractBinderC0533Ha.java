package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* renamed from: com.google.android.gms.internal.ads.Ha, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractBinderC0533Ha extends B7 implements InterfaceC0550Ia {
    public static InterfaceC0550Ia K3(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.formats.client.IAttributionInfo");
        return iInterfaceQueryLocalInterface instanceof InterfaceC0550Ia ? (InterfaceC0550Ia) iInterfaceQueryLocalInterface : new C0516Ga(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.B7
    public final boolean J3(int i, Parcel parcel, Parcel parcel2) {
        if (i == 2) {
            parcel2.writeNoException();
            parcel2.writeString(((BinderC0431Ba) this).f7357a);
            return true;
        }
        if (i != 3) {
            return false;
        }
        parcel2.writeNoException();
        parcel2.writeList(((BinderC0431Ba) this).f7359c);
        return true;
    }
}
