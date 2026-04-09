package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* renamed from: com.google.android.gms.internal.ads.yf, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2186yf extends W2.a implements InterfaceC0419Af {
    public final InterfaceC2132xf n1(S2.b bVar, BinderC0569Jc binderC0569Jc) {
        InterfaceC2132xf c2024vf;
        Parcel parcelH0 = h0();
        C7.e(parcelH0, bVar);
        C7.e(parcelH0, binderC0569Jc);
        parcelH0.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelK0 = k0(parcelH0, 2);
        IBinder strongBinder = parcelK0.readStrongBinder();
        if (strongBinder == null) {
            c2024vf = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            c2024vf = iInterfaceQueryLocalInterface instanceof InterfaceC2132xf ? (InterfaceC2132xf) iInterfaceQueryLocalInterface : new C2024vf(strongBinder);
        }
        parcelK0.recycle();
        return c2024vf;
    }
}
