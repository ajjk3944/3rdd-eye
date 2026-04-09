package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class at extends ac.a implements ct {
    public final zs k2(vb.b bVar, yq yqVar) {
        zs ysVar;
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        ng.e(parcelT, yqVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        if (strongBinder == null) {
            ysVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            ysVar = iInterfaceQueryLocalInterface instanceof zs ? (zs) iInterfaceQueryLocalInterface : new ys(strongBinder);
        }
        parcelR0.recycle();
        return ysVar;
    }
}
