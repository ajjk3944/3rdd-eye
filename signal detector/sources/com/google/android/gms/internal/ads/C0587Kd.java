package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.Kd, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0587Kd extends W2.a implements InterfaceC0621Md {
    public final InterfaceC0570Jd n1(S2.b bVar, BinderC0569Jc binderC0569Jc) {
        InterfaceC0570Jd c0553Id;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        C7.e(parcelH0, binderC0569Jc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 1);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c0553Id = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            c0553Id = iInterfaceQueryLocalInterface instanceof InterfaceC0570Jd ? (InterfaceC0570Jd) iInterfaceQueryLocalInterface : new C0553Id(strongBinder);
        }
        parcelK0.recycle();
        return c0553Id;
    }
}
