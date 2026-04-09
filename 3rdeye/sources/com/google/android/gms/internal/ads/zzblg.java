package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.ads.dynamite.ModuleDescriptor;

/* compiled from: com.google.android.gms:play-services-ads-api@@24.4.0 */
/* loaded from: classes2.dex */
public final class zzblg extends zzayr implements zzbli {
    public zzblg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.zzbli
    public final zzblf zze(IObjectWrapper iObjectWrapper, zzbpo zzbpoVar, int i, zzblc zzblcVar) throws RemoteException {
        zzblf zzbldVar;
        Parcel parcelZza = zza();
        zzayt.zzf(parcelZza, iObjectWrapper);
        zzayt.zzf(parcelZza, zzbpoVar);
        parcelZza.writeInt(ModuleDescriptor.MODULE_VERSION);
        zzayt.zzf(parcelZza, zzblcVar);
        Parcel parcelZzda = zzda(1, parcelZza);
        IBinder strongBinder = parcelZzda.readStrongBinder();
        if (strongBinder == null) {
            zzbldVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            zzbldVar = iInterfaceQueryLocalInterface instanceof zzblf ? (zzblf) iInterfaceQueryLocalInterface : new zzbld(strongBinder);
        }
        parcelZzda.recycle();
        return zzbldVar;
    }
}
