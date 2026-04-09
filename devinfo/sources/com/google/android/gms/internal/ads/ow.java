package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class ow extends ac.a implements qw {
    public final nw k2(vb.b bVar, yq yqVar) {
        nw lwVar;
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        ng.e(parcelT, yqVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 2);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            lwVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            lwVar = iInterfaceQueryLocalInterface instanceof nw ? (nw) iInterfaceQueryLocalInterface : new lw(strongBinder);
        }
        parcelR0.recycle();
        return lwVar;
    }
}
