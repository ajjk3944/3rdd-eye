package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: r8-map-id-c2d6645a5534910d782496a2f1fbb8d7e389c4692d5500a02d24b9efa19c0cfc */
/* loaded from: classes3.dex */
public final class gv extends ac.a {
    public final IBinder k2(vb.b bVar, String str, yq yqVar) {
        Parcel parcelT = T();
        ng.e(parcelT, bVar);
        parcelT.writeString(str);
        ng.e(parcelT, yqVar);
        parcelT.writeInt(ModuleDescriptor.MODULE_VERSION);
        Parcel parcelR0 = r0(parcelT, 1);
        IBinder strongBinder = parcelR0.readStrongBinder();
        parcelR0.recycle();
        return strongBinder;
    }
}
